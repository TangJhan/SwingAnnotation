package com.annotation;

import java.awt.Component;
import java.awt.Container;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashMap;


public class UIQuick {
	private HashMap<String, Component> hashMap = new HashMap<String, Component>();
	
	public  void inject(Container container) {
		if(container == null) return;
		//������������ֶε�ע��
		Class<? extends Object> objClz = container.getClass();
		//�ֶ�ע�⣬Ѱ�ҿؼ�
		parseUIWidget(container);
		Field[] fields = objClz.getDeclaredFields();
		for (Field field : fields) {
			UIAnnotationWidget uiWidget = field.getAnnotation(UIAnnotationWidget.class);
			if (uiWidget != null) {
				String widgetName = uiWidget.value();
				Component targetWidget = hashMap.get(widgetName);
				if(targetWidget != null) {
					try {
						field.setAccessible(true);
						field.set(container, targetWidget);
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				}
			}
		}
		//����ע�⣬��ӻص��¼�
		Method[] methods = objClz.getDeclaredMethods();
		for (Method method : methods) {
			boolean flag = method.isAnnotationPresent(UIAnnotationWidgetEvent.class);
			if (flag) {
				UIAnnotationWidgetEvent uiAnnotationWidgetEvent = method.getAnnotation(UIAnnotationWidgetEvent.class);
				//��̬��������ʵ��
				Component comp = hashMap.get(uiAnnotationWidgetEvent.widget());
				if(comp != null) {
					injectEvent(comp,uiAnnotationWidgetEvent.event(),container,method);
				}
			}
		}
		release();
	}
	
	private void injectEvent(Component comp,String event,Object callbackObject,Method callbackMethod) {
		String[] result = event.split("#");
		if(result.length < 3) {
			//��������
			return;
		}
		try {
			String methodName = result[0];  //addActionListener
			Class param = comp.getClass().forName(result[1]);   //ActionListener.class
			String monitorMethodName = result[2];  //actionPerformed
			injectEventPorxy(comp,methodName,param,monitorMethodName,callbackObject,callbackMethod);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
	/**
	 * 
	 * @param obj  �������
	 * @param method  ���������÷���
	 * @param param   ���������÷����Ĳ���
	 * @param monitorMethodName  ��Ҫ�����ķ���
	 * @param callbackMethod  �����ص�,�ص�����ע��ķ���
	 */
	private void injectEventPorxy(Object obj,String method,Class param,String monitorMethodName,Object callbackObject,Method callbackMethod) {
		Object listener = Proxy.newProxyInstance(obj.getClass().getClassLoader(), new Class[]{param}, new InvocationHandler() {
			
			@Override
			public Object invoke(Object arg0, Method arg1, Object[] arg2)
					throws Throwable {
				if(arg1.getName().equals(monitorMethodName)) {
					//���÷���
					Class<?>[] clazzTypesCallback = callbackMethod.getParameterTypes();	
					Class<?>[] clazzTypes = arg1.getParameterTypes();	
					if(clazzTypes.length == clazzTypesCallback.length && clazzTypes.length > 0) {
						return callbackMethod.invoke(callbackObject, arg2);
					}else {
						return callbackMethod.invoke(callbackObject);
					}
				}else if("ALL_EVENT_METHOD".equals(monitorMethodName)){
					Class<?>[] clazzTypesCallback = callbackMethod.getParameterTypes();	
					Class<?>[] clazzTypes = arg1.getParameterTypes();	
					if(clazzTypes.length == (clazzTypesCallback.length-1) && clazzTypes.length > 0) {
						Object[] objects = new Object[arg2.length+1];
						objects[objects.length-1] = arg1.getName();
						System.arraycopy(arg2, 0, objects, 0, arg2.length);
						return callbackMethod.invoke(callbackObject,objects);
					}else {
						return callbackMethod.invoke(callbackObject,arg1.getName());
					}
				}
				return null;
			}
		});
		try {
			obj.getClass().getMethod(method, param).invoke(obj, listener);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
	
		
	//���沼����Ϣ
	private void parseUIWidget(Container component) {
		Component[] components = component.getComponents();
		for (int i = 0; i < components.length; i++) {
			Container comp = (Container) components[i];
			 if(comp.getComponentCount() > 0) {
				 parseUIWidget((Container) components[i]);
			 }else {
				 hashMap.put(components[i].getName(), components[i]);
			 }
		}
	}
	
	//�ͷ�
	private void release() {
		hashMap.clear();
		hashMap = null;
	}

}
