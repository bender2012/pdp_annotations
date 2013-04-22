package com.epam.pdp.annotcons.app;

import com.epam.pdp.annotation.MyAnnotation;

public class App {

	public static void main(String[] args) {

		class A {

			@MyAnnotation
			void sayHello() {
				System.out.println("Hello World!");
			}
		}
		
		App app = new App();
		A a = new A();
		a.sayHello();

	}
}
