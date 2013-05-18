package com.epam.apt;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic.Kind;

@SupportedSourceVersion(SourceVersion.RELEASE_7)
@SupportedAnnotationTypes({ "com.epam.pdp.annotation.MyAnnotation" })
public class AnnotationProcessor extends AbstractProcessor {

	private static final CharSequence FOUND_ANNOTATION = "   >>>> Found annotation: MyAnnotation.";
	private static final CharSequence ANNOTATED_ELEMENT = "   >>>> Annotated element: ";

	@Override
	public boolean process(Set<? extends TypeElement> annotations,
			RoundEnvironment roundEnv) {
		boolean returnValue = true;
		processingEnv.getMessager().printMessage(Kind.ERROR, FOUND_ANNOTATION);
		for (TypeElement typeElement : annotations) {
			String annotatedElement = roundEnv.getElementsAnnotatedWith(
					typeElement).toString();
			processingEnv.getMessager().printMessage(Kind.ERROR,
					ANNOTATED_ELEMENT + annotatedElement);
		}
		return returnValue;
	}

}
