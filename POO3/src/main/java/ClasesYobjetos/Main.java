/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYobjetos;

import java.util.Scanner;

/**
 *
 * @author choko
 */
public class Main {
    public static void main (String [] args ){
       Scanner entrada = new Scanner (System.in);
       int n1, n2;
        System.out.println("Introduzca el primer numero entero");
        n1 = entrada.nextInt();
        System.out.println("Introduzca el segundo numero entero");
        n2 = entrada.nextInt();
        
        Operacion Op = new Operacion();
        Op.Sumar(n1, n2);
        Op.Restar(n1, n2);
        Op.multiplicar(n1, n2);
        Op.dividir(n1, n2);
        
        Op.mostrarResultados();
       
       
        
    }
    
}
