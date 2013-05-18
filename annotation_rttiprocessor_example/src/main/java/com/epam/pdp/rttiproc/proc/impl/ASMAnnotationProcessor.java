package com.epam.pdp.rttiproc.proc.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;

import com.epam.pdp.rttiproc.proc.AnnotationProcessor;

public class ASMAnnotationProcessor implements AnnotationProcessor {

	@Override
	public <T> void process(Class<T> clazz) {

		try {
			ClassReader classReader = new ClassReader(clazz.getName());
			ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS);
			classReader.accept(new ClassVisitor(Opcodes.ASM4, classWriter) {

				@Override
				public MethodVisitor visitMethod(final int access,
						final String name, final String desc,
						final String signature, final String[] exceptions) {
					final Type[] args = Type.getArgumentTypes(desc);
					MethodVisitor methodVisitor = cv.visitMethod(access, name,
							desc, signature, exceptions);

					return new MethodVisitor(Opcodes.ASM5, methodVisitor) {
						private final List<Integer> params = new ArrayList<Integer>();

						@Override
						public AnnotationVisitor visitParameterAnnotation(
								final int parameter, final String desc,
								final boolean visible) {
							AnnotationVisitor av;
							av = mv.visitParameterAnnotation(parameter, desc,
									visible);

							return av;
						}

						@Override
						public void visitCode() {
							int var = (access & Opcodes.ACC_STATIC) == 0 ? 1
									: 0;
							System.out.println("visit code");

						}

						@Override
						public AnnotationVisitor visitLocalVariableAnnotation(
								int arg0, TypePath arg1, Label[] arg2,
								Label[] arg3, int[] arg4, String arg5,
								boolean arg6) {
							System.out
									.println("visited local variable procedure");
							return mv.visitLocalVariableAnnotation(arg0, arg1,
									arg2, arg3, arg4, arg5, arg6);
						}

					};
				}

			}, 0);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
