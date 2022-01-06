package com.annotation;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test extends JFrame{
	
	@UIAnnotationWidget("bt1")
	JButton bt1;
	
	public Test() {
		initView();
		new UIQuick().inject(this);
		bt1.setText("button");
	}
	
	@UIAnnotationWidgetEvent(widget="bt1",event=UIEventConstant.EVENT_CLICK)
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

	public static void main(String[] args) {
		new Test();
	}
	
}
