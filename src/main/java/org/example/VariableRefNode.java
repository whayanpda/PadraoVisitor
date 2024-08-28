package org.example;

public class VariableRefNode extends Node {

    private String nomeVar;

    public String getNomeVar() {
        return nomeVar;
    }

    public void setNomeVar(String nomeVar) {
        this.nomeVar = nomeVar;
    }

    @Override
    public void accept(NodeVisitor v) {
        v.visitVariableRef(this);
    }
}
