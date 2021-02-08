package com.company.classes;

public class AVLTree extends BinaryTree{


    public AVLTree () {
        super();
    }

    int height(Node N) {
        if (N == null)
            return 0;

        return N.getHeight();
    }

    void updateHeight(Node n) {
        n.setHeight(1 + Math.max(height(n.getLeftNode()), height(n.getRightNode())));
    }
    int getBalance(Node n) {
        return (n == null) ? 0 : height(n.getRightNode()) - height(n.getLeftNode());
    }


    Node rotateLeft(Node y) {
        Node x = y.getRightNode();
        Node z = x.getLeftNode();
        x.setLeftNode(y);
        y.setRightNode(z);
        updateHeight(y);
        updateHeight(x);
        return x;
    }
    Node rotateRight(Node y) {
        Node x = y.getLeftNode();
        Node z = x.getRightNode();
        x.setRightNode(y);
        y.setLeftNode(z);
        updateHeight(y);
        updateHeight(x);
        return x;
    }

    protected Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key);
        } else if (node.getValue() > key) {
            node.setLeftNode(insert(node.getLeftNode(), key));

        } else if (node.getValue() < key) {
            node.setRightNode(insert(node.getRightNode(), key));
        } else {
            throw new RuntimeException("Valor duplicado!");
        }
        return rebalance(node);
    }

    private Node rebalance(Node z) {
        updateHeight(z);
        int balance = getBalance(z);
        if (balance > 1) {
            if (height(z.getRightNode().getRightNode()) > height(z.getRightNode().getLeftNode())) {
                z = rotateLeft(z);
            } else {
                z.setRightNode(rotateRight(z.getRightNode()));
                z = rotateLeft(z);
            }
        } else if (balance < -1) {
            if (height(z.getLeftNode().getLeftNode()) > height(z.getLeftNode().getRightNode()))
                z = rotateRight(z);
            else {
                z.setLeftNode(rotateLeft(z.getLeftNode()));
                z = rotateRight(z);
            }
        }
        return z;
    }


}
