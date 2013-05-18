package com.epam.pdp.annotcons.app;

import com.epam.pdp.annotation.MyAnnotation;

@MyAnnotation
public class Sample {

	@MyAnnotation
	private String helloFiled = "Hello";

	void sayHello() {
		@MyAnnotation
		String localVariable = "";
	}

}
