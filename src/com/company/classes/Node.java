package com.company.classes;

public class Node {

    private int value;
    private int height;
    private Node leftNode;
    private Node rightNode;

    public Node() {
        this.leftNode = null;
        this.rightNode = null;
    }
    public  Node(int value) {
        this.value = value;
        height = 1;
    }



    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
