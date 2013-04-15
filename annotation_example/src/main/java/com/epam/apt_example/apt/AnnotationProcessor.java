package com.epam.apt_example.apt;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic.Kind;

@SupportedSourceVersion(SourceVersion.RELEASE_7)
@SupportedAnnotationTypes({ "com.epam.apt_example.annotations.MyAnnotation" })
public class AnnotationProcessor extends AbstractProcessor {

	public AnnotationProcessor() {
		
	}

	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
		System.out.println("Start processing");
		for (TypeElement typeElement : annotations) {
			String annotatedElement = roundEnv.getElementsAnnotatedWith(typeElement).toString();

			System.out.println("Annotated element" + annotatedElement);
			
//			Set<? extends Element> elements = roundEnv.getElementsAnnotatedWith(typeElement);
//http://deors.wordpress.com/2011/10/08/annotation-processors/
//			for (Element element : elements) {
//				//checkElementType(element);
//				//checkMethodSignature((ExecutableElement) element);
//				System.out.println("Processing");
//			}
			processingEnv.getMessager().printMessage(Kind.NOTE, "processing");
		}

		return false;
	}





}
