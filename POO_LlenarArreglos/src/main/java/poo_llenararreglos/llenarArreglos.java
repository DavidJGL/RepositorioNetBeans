/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_llenararreglos;

import java.util.Scanner;

/**
 *
 * @author choko
 */
public class llenarArreglos {

    public static void main(String[] args) {
        //Declaramos una variables
        int nElementos;
        //Inicializamos el Scanner para el entrada de datos
        Scanner entrada = new Scanner(System.in);
        //Pedimos al usuario el numero de elementos
        System.out.println("Introduzca el numero de elementos del Arreglo: ");
        nElementos = entrada.nextInt();
        //Creamos un arreglo de tipo char
        char[] datos = new char[nElementos];
        //Pedimos al usuario los elementos del arreglo utilizando un bucle
        System.out.println("Introduzca los elementos del Arreglo");
        for (int i = 0; i < nElementos; i++) {
            //Dentro del bucle pedimos al usuario que introduzca los elementos
            System.out.println((i + 1) + ". Introduzca un caracter");
            datos[i] = entrada.next().charAt(0);

        }
        //Imprimimos por pantalla los caracteres introducidos por el usario
        System.out.println("Los caracteres del arreglo son: ");
        for (int i = 0; i < nElementos; i++) {
            //System.out.println(datos[i]);
            System.out.print(datos[i] + " ");

        }

    }

}
