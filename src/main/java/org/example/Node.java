package org.example;


public abstract class Node {
    protected abstract void accept(NodeVisitor v);
}
