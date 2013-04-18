package com.epam.app;

import com.epam.annotations.MyAnnotation;

@MyAnnotation
public class Sample {

	@MyAnnotation
	public void sayHello() {
		System.out.println("Hello World!!!");
	}

}
