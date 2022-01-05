# SwingAnnotation
java swing 注解框架，方便组件的寻找和事件的注入，也用于UI分离

#### 使用
##### 1.初始化
使用`new UIQuick().inject(this)`对当前对象进行注解初始化，注意：一定要在组件初始化完成之后再使用此方法

##### 2.组件注解
使用`@UIAnnotationWidget("{name}")`对字段进行注解，'{name}'填写的是组件`Component.setName('{name}')`的值

##### 3.事件注解
使用`@UIAnnotationWidgetEvent(widget="{name}",event={UIEventConstant.xxx})`对事件进行注解，用于快速实现`点击事件监听、鼠标事件监听等`，`widget`填写的是组件名`setName`的值，event填写的是需要监听的事件，以下为以实现的事件<br>
addActionListener<br>
addMouseListener<br>
addMouseMotionListener<br>
addMouseWheelListener mouse<br>
addKeyListener<br>
addChangeListener<br>
addWindowListener<br>
addFocusListener<br>

##### 4.样例
```java
public class Test extends JFrame{
    @UIAnnotationWidget("bt1")   //对JButton进行注解，通过name="bt1",进行快速寻找组件
    JButton bt1;
	
    public Test() {
      initView();
      new UIQuick().inject(this);  //对当前对象进行注解，当前对象指的是组件，比如JFrame
				
      bt1.setText("button");
    }
	
    @UIAnnotationWidgetEvent(widget="bt1",event=UIEventConstant.EVENT_CLICK)  //对JButton进行注解，通过name="bt1"、event=CLICK,对点击事件进行实现
    public void click() {
      System.out.println("click");
    }

    private void initView() {
      JButton jb = new JButton();
      jb.setName("bt1");
		
      this.add(jb);
      this.setSize(500, 600);
      this.setVisible(true);
    }
}
```
