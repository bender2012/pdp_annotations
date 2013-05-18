package com.epam.pdp.rttiproc.proc.impl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import com.epam.pdp.rttiproc.proc.AnnotationProcessor;


public class RTTIAnnotationProcessor implements AnnotationProcessor {

	@Override
	public <T> void process(Class<T> clazz) {

		Annotation[] annotationsUnderClass = clazz.getAnnotations();

		System.out.println("Annotations under class: ");
		for (Annotation annotation : annotationsUnderClass) {
			System.out.print(annotation);
		}
		System.out.println();
		System.out.println("Annotations under methods: ");
		Field[] classFields = clazz.getDeclaredFields();
		for (Field field : classFields) {
			Annotation[] annotatios = field.getAnnotations();
			if (annotatios.length > 0) {
				System.out.println("Field: " + field.getName());
				System.out.println("Annotations:");
				for (Annotation annotation : annotatios) {
					System.out.print(annotation);
				}
				System.out.println();
			}
		}
		
		//TODO: Implement other methods

	}

}
