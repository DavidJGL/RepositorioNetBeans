/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividadfactorial;

import java.util.Scanner;

/**
 *
 * @author dam1a
 */
public class RecursividadFactorial {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        int result = 0;
        System.out.println("Introduzca un numero entero");
        numero = entrada.nextInt();
        result = FactRecursivo(numero);
        System.out.println("El factorial del numero " + numero + " es: " + result);

    }

    public static int FactRecursivo(int numero) {

        int result;
        if (numero == 1) {
            return 1;
        } else {
            result = numero * FactRecursivo(numero - 1);

        }
        return result;

    }

}
