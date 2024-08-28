package org.example;

public class AssignmentNode extends Node {

    private String typeleftHandVar;
    private String typerightHandExp;

    @Override
    public void accept(NodeVisitor v) {
        v.visitAssignment(this);
    }

    public String getTypeleftHandVar() {
        return typeleftHandVar;
    }

    public String getTyperightHandExp() {
        return typerightHandExp;
    }

    public void setTyperightHandExp(String typerightHandExp) {
        this.typerightHandExp = typerightHandExp;
    }

    public void setTypeleftHandVar(String typeleftHandVar) {
        this.typeleftHandVar = typeleftHandVar;
    }
}
