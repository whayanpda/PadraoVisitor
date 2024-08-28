package org.example;

public class CodeGeneratingVisitor extends NodeVisitor {

    @Override
    public void visitAssignment(AssignmentNode n) {
        System.out.println(n.getTypeleftHandVar() + " = " + n.getTyperightHandExp());
    }

    @Override
    public void visitVariableRef(VariableRefNode n) {
        System.out.println(n.getNomeVar());
    }
}
