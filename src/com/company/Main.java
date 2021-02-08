package com.company;

import com.company.classes.BinaryTree;
import com.company.controller.AVLTreeController;
import com.company.controller.BinaryTreeController;

import java.io.*;

public class Main {
    public static PrintStream out = System.out;
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public  static AVLTreeController gestor = new AVLTreeController();
    public static void main(String[] args) throws IOException {
        int option = 0;


        while (option != 5) {
            try {
                out.println("Que desea hacer?");
                out.println("1. Agregar un nodo");
                out.println("2. Imprimir preOrden");
                out.println("3. Imprimir inOrden");
                out.println("4. Imprimir posOrden");
                out.println("5. Salir");

                option = Integer.parseInt(in.readLine());
                actionSelected(option);
            } catch (Exception ex) {
                out.println(ex.getMessage());
            }

        }

    }

    static void actionSelected (int option) throws IOException {
        switch (option) {
            case 1:
                int numero;
                out.println("Digite un numero");
                numero = Integer.parseInt(in.readLine());
                gestor.addValue(numero);
            break;

            case 2:
                out.println("Preorden: " + gestor.preOrden());
                break;
            case 3:
                out.println("In-orden: " + gestor.inOrden());
                break;
            case 4:
                out.println("Post-orden: " + gestor.postOrden());
                break;
            default:
                break;
        }
    }
}
