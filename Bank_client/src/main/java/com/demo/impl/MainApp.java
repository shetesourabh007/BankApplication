package com.demo.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext(
					"applicationContext.xml");

			AccountImpl bean = (AccountImpl) context.getBean("account");
			bean.deposite(500);
			System.out.println(bean.displayInfo());
			// System.out.println(bean.displayInfo());
		} catch (Exception e) {

			// System.out.println(bean.displayInfo());
		}

	}

}
