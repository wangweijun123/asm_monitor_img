package com.darren.optimize.visitor;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class MonitorImageClassVisitor extends ClassVisitor {
    public MonitorImageClassVisitor(ClassVisitor classVisitor) {
        super(Opcodes.ASM5, classVisitor);
    }

    /**
     * 访问类会进入这里
     */
    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        if(superName.equals("android/widget/ImageView")
                && !name.equals("com/darren/optimize/day04/MonitorImageView")){
            superName = "com/darren/optimize/day04/MonitorImageView";
        }
        super.visit(version, access, name, signature, superName, interfaces);
    }
}
