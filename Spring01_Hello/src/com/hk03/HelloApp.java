package com.hk03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		//기존방식 1
		//Resource res = new FileSystemResource("src/com/hk03/beans.xml");
		
		//		2
		//Resource res = new ClassPathResource("com/hk03/beans.xml");
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/hk03/beans.xml");
		
									//객체를 주입받는 것(스프링 컨테이너 생성 후 xml파일을 로딩시켜서 객체를 가져다 쓰는 것)
		MessageBean bean = (MessageBean) factory.getBean("msgKo");
		bean.sayHello("스프링");
		
		bean = (MessageBean) factory.getBean("msgEn");
		bean.sayHello("spring");
		
		/*
		beans.xml의 
		<bean id="msgKo" class="com.hk03.MessageBeanImpl_Ko"></bean>
		<bean id="msgEn" class="com.hk03.MessageBeanImpl_En"/>	가 객체를 만들어주는 것
		 */
	}
}
		/*
		ApplicationContext와 ClassPathXmlApplicationContext
		BeanFactory <- ApplicationContext <- ClassPathXmlApplicationContext
		
		스프링의 ApplicationContext 객체는 스프링 컨테이너의 인스턴스이다.
		스프링은 ApplicationContext 인터페이스의 몇 가지 기본 구현을 제공한다.
		(ClassPathXmlApplicationContext : XML 형식의 독립형 Application 에 적합
		지정된 classPath에서 applicationContext.xml 파일을 읽어서 스프링 컨테이너를 생성)
		*/