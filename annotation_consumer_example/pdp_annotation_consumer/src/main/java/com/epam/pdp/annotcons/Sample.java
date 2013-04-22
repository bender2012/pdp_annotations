package com.epam.pdp.annotcons;

import com.epam.pdp.annotation.MyAnnotation;

@MyAnnotation
public class Sample {

	@MyAnnotation
	public void sayHello() {
		System.out.println("Hello World!!!");
	}

}
