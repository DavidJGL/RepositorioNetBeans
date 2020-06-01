/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/*
Ejercicio 3: Leer 5 números por teclado, almacenarlos en un arreglo 
y a continuación realizar la media de los números positivos, 
la media de los negativos y conteo el número de ceros.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[5];
        double sumaPositivos = 0;
        double sumaNegativos = 0;
        double mediaPositivos = 0;
        double mediaNegativos = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;

        System.out.println("Guardando los numero en el arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ".Introduzca un numero");
            numeros[i] = entrada.nextDouble();
            if (numeros[i] == 0) {
                contadorCeros++;

            } else if (numeros[i] > 0) {
                sumaPositivos = sumaPositivos + numeros[i];
                contadorPositivos++;

            } else {
                sumaNegativos += numeros[i];
                contadorNegativos++;
            }

        }
        //Media numeros positivos
        if (contadorPositivos == 0) {
            System.out.println("No se puede hacer la media de los numeros positivos");

        }
        else{
            mediaPositivos = sumaPositivos/contadorPositivos;
            System.out.println("La media de los numero positivos es: " + mediaPositivos);
        }
        if (contadorNegativos == 0) {
            System.out.println("No se puede hacer la media de los numeros negativos");
            
        }
        else{
            mediaNegativos = sumaNegativos/contadorNegativos;
            System.out.println("La media de los numero negativos es: " + mediaNegativos);
            
        }
        System.out.println("La cantidad de ceros es: " + contadorCeros );

    }
}
