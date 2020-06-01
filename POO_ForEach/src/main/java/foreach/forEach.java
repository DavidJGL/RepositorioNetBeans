/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreach;

/**
 *
 * @author choko
 */
public class forEach {
    public static void main (String [] args){
        String [] nombres = {"David", "Maria", "Lucia", "Mario", "kela", "Mercedes", "Elisa"};
        //buble for convencional
        for (int i = 0; i < 7; i++) {
            System.out.println("Nombre: " + nombres [i]);
            
        }
        System.out.println(" ");
        //Si no conocemos la longitud del arreglo podemos usar .length
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre: " + nombres[i]);
            
        }
        System.out.println(" ");
        //bucle for each o for mejorado(tipo de variable/iterador/:/nombre de la variable)
        for (String i:nombres) {
            //System.out.println(i);
            System.out.println("Nombre: " + i);
            
        }
    }
    
}
