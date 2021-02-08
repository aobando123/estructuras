package com.company.classes;

public class BinaryTree {

    protected Node root;
    public BinaryTree() {

    }


    protected Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key);
        } else if (node.getValue() > key) {
            node.setLeftNode(insert(node.getLeftNode(), key));

        } else {
            node.setRightNode(insert(node.getRightNode(), key));
        }
        return node;
    }
    private String preOrdenRecursivo (Node node) {
        if(node == null) {
            return "";
        }
        return node.getValue() + ", " + preOrdenRecursivo(node.getLeftNode()) + preOrdenRecursivo(node.getRightNode());

    }


    public void addValue (int value) {
        this.root = insert( this.root, value);

    }



    public String preOrden () {
        return preOrdenRecursivo(this.root);
    }

    private String inOrdenRecursivo (Node node) {
        if(node == null) {
            return "";
        }
        return inOrdenRecursivo(node.getLeftNode()) + node.getValue() + ", "  + inOrdenRecursivo(node.getRightNode());
    }

    public String inOrden () {
        return  inOrdenRecursivo(this.root);
    }


    private String postOrdenRecursivo(Node node){
        if(node == null) {
            return "";
        }
        return postOrdenRecursivo(node.getLeftNode()) + postOrdenRecursivo(node.getRightNode()) +  node.getValue() + ", "  ;
    }
    public String postOrden () {
      return  postOrdenRecursivo(this.root);
    }


}
