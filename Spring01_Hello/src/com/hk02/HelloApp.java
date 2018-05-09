package com.hk02;

public class HelloApp {
	
	public static void main(String[] args) {
		MessageBean bean = new MessageBeanImpl_En();
		bean.sayHello("spring");
		
		bean = new MessageBeanImpl_Ko();
		bean.sayHello("스프링");
		
		//interface를 통해 결합도를 낮춤(약결합)
	}
}