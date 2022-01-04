# SwingAnnotation
java swing 注解框架，方便组件的寻找和事件的注入，也用于UI分离

##### 使用
```java
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
```
