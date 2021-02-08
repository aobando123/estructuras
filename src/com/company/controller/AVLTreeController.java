package com.company.controller;

import com.company.classes.AVLTree;
import com.company.classes.BinaryTree;

public class AVLTreeController {


    private AVLTree tree =  new AVLTree();

    public void addValue(int value) {
        tree.addValue(value);
    }
    public String preOrden() {
        return  tree.preOrden();
    }
    public  String inOrden() {
        return tree.inOrden();
    }
    public  String postOrden() {
        return tree.postOrden();
    }


}
