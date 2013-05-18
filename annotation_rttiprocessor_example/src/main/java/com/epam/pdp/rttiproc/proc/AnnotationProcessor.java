package com.epam.pdp.rttiproc.proc;

public interface AnnotationProcessor {

	<T> void process(Class<T> clazz);
	
}
