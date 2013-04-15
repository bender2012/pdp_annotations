package com.epam.apt_example.app;

import com.epam.apt_example.annotations.MyAnnotation;

@MyAnnotation
public class Sample {
	
	@MyAnnotation
	public void sayHello(){
		System.out.println("Hello World!!!");
	}
	
}
