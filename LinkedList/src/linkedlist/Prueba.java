/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaramos y creamos un linkedlist de enteros
        LinkedList< Integer> lista = new LinkedList< Integer>();
        //Añadimo un elemento al final de la lista
        lista.add(1);
        //Añadimos otro elemento al final de la lista.
        lista.add(3);
        //Añadimos en la posicion 1 el elemento 2.
        lista.add(1, 2);
        //Sumamos los valores de la posicion 1 y 2, y los pasamos al final
        lista.add(lista.get(1) + lista.get(2));
        //Eliminamos el primer elemento de la lista
        lista.remove(0);
        //Mostramos la lista
        for (Integer i : lista) {
            System.out.println("Elemento " + i);
        }

        LinkedList<String> nombre = new LinkedList<String>();
        nombre.add("Manolo");
        nombre.add("Juan");
        nombre.add("David");
        nombre.add("Maria");
        nombre.add("Silvia");
        nombre.add(0, "Estrella");
        nombre.add(3, "Lucia");
        nombre.remove(1);
        for(String i: nombre){
            System.out.println("Nombre " + i);
        }
        ArrayList<Integer> numero = new ArrayList<Integer>();
        numero.add(100);
        numero.add(200);
        /*esta es la manera que expone la teoria para obtener la posicion de un 
        elemento en la lista de un Arraylist
        */
        numero.set(numero.indexOf(100), 200);
        /*esta es la manera que expone la teoria para obtener la posicion de un 
        elemento en la lista de un Linkedlist
        */
        numero.set((0), 200);
        /*MI pregunta es... es igual de valido ambas opciones, dado que el resultado
        no cambia?
        */
        for(Integer i: numero){
            System.out.println("Numeros: " +i);
        }
        
        
        
        

    }

}
