package com.study.DItest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SuppressWarnings("unused")

public class TestDI {
	@Test
	public void demo1(){
		String XmlPath="com/study/DItest/beans.xml";
		ApplicationContext applicationcontext=new ClassPathXmlApplicationContext(XmlPath);
		ThisService thisservice=(ThisService) applicationcontext.getBean("thisservice");
		thisservice.addbook();
		
	}

}
