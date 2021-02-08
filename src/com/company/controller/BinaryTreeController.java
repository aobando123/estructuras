package com.company.controller;

import com.company.classes.BinaryTree;



public class BinaryTreeController {

    private BinaryTree tree =  new BinaryTree();

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
