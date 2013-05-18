package com.epam.pdp.rttiproc.app;

import com.epam.pdp.annotcons.app.Sample;
import com.epam.pdp.rttiproc.proc.AnnotationProcessor;
import com.epam.pdp.rttiproc.proc.impl.ASMAnnotationProcessor;
import com.epam.pdp.rttiproc.proc.impl.RTTIAnnotationProcessor;

public class App {

	private static final String PROCESSING_STARTED = "Start processing with rtti:";
	private static final String END_PROCESSING = "End processing with rtti.";
	private static final String START_PROCESSING_ASM = "Start processing with asm:";
	private static final String END_PROCESSING_ASM = "End processing with asm.";

	public static void main(String[] args) {
		System.out.println(PROCESSING_STARTED);
		AnnotationProcessor rttiProcessor = new RTTIAnnotationProcessor();
		rttiProcessor.process(Sample.class);
		System.out.println(END_PROCESSING);

		System.out.println(START_PROCESSING_ASM);
		AnnotationProcessor asmProcessor = new ASMAnnotationProcessor();
		asmProcessor.process(Sample.class);
		System.out.println(END_PROCESSING_ASM);

	}

}
