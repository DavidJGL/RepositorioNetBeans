/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
 /**
 * Pedir arreglo de 5 numero e imprimirlos
 */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] numeros = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print((1 + i) + ". Introduzca un numero: ");
            numeros[i] = entrada.nextDouble();

        }
        for (double i : numeros) {
            System.out.println("Los numeros son: " + i--);

        }
 /**
 * Pedir arreglo de 5 numero e imprimirlos a la inversa
 */
        char[] letras = new char[5];
        for (int j = 0; j < 5; j++) {
            System.out.print((1 + j) + ". Introduzca un caracter: ");
            letras[j] = entrada.next().charAt(0);

        }
        for (int i = 4; i >= 0; i--) {
            System.out.println("Los caracteres son: " + letras[i]);

        }

    }

}
