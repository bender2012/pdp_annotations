package com.epam.pdp.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(value = { ElementType.METHOD, ElementType.TYPE,
		ElementType.LOCAL_VARIABLE, ElementType.FIELD, ElementType.PACKAGE })
public @interface MyAnnotation {

}
