package org.example;

public class TypeCheckingVisitor extends NodeVisitor {

    @Override
    public void visitAssignment(AssignmentNode n) {
        if (n.getTypeleftHandVar().equals(n.getTyperightHandExp())) {
            System.out.println("tipos compativeis");
        } else {
            System.out.println("tipos incompativeis");
        }
    }

    @Override
    public void visitVariableRef(VariableRefNode n) {
        System.out.println("type checking da variavelref não faz nada");
    }
}
