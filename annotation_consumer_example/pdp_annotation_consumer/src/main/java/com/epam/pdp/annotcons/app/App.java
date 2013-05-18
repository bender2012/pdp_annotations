package com.epam.pdp.annotcons.app;

import com.epam.pdp.annotation.MyAnnotation;

@MyAnnotation
public class App {

	@MyAnnotation
	public static void main(String[] args) {

		@MyAnnotation
		String variableInMethod = "";
		
		@MyAnnotation class InnerClassInMainMethod{
			
		}
	}

}
