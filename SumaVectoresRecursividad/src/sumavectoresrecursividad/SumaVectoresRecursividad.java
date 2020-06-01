/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumavectoresrecursividad;

import java.util.Scanner;

/**
 *
 * @author dam1a
 */
public class SumaVectoresRecursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numero = new int[5];
        int result = 0;
        int contador = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el primer valor: ");
        numero[0] = entrada.nextInt();
        System.out.println("Introduzca el segundo valor: ");
        numero[1] = entrada.nextInt();
        System.out.println("Introduzca el tercer valor: ");
        numero[2] = entrada.nextInt();
        System.out.println("Introduzca el cuerto valor: ");
        numero[3] = entrada.nextInt();
        System.out.println("Introduzca el quinto valor: ");
        numero[4] = entrada.nextInt();

        result = SumaVectores(numero, contador);
        System.out.println("La suma del vector es: " + result);

    }

    public static int SumaVectores(int[] numero, int contador) {
        int result;
        int i = numero.length;

        if (contador == i) {
            return 0;

        } else {
            result = numero[contador] + SumaVectores(numero, contador + 1);

        }

        return result;
    }

}
