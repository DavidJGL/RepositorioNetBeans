/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;


public class Arreglos {

    public static void main(String[] args) {
        //Modo Declaracion del Arreglo
        int[] x = new int[3];
        //Llenado del Arreglos
        x[0] = 3;
        x[1] = 7;
        x[2] = 4;

        //Una manera de Imprimir un Arreglo:
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(" ");

        /*Pero si el arreglo es de miles de datos simplificaria
        el uso de un bucle for.
         */
        for (int i = 0; i < 3; i++) {
            System.out.println(x[i]);

        }
        //Modo Declaracion  y llenado de Arreglo
        int[] y ={4, 7, 3, 4}; 
        System.out.println(" ");
        for (int i = 0; i < 4; i++) {
            System.out.println(y[i]);

        }

    }

}
