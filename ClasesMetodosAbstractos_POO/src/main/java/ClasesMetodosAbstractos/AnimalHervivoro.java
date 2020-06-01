/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesMetodosAbstractos;

/**
 *
 * @author choko
 */
//Hay que indicar que la clase AnimalHervovoro hereda de la clase Animal.
//Por lo tanto habrá que añadir la palabla reservada "extends" despues del 
//nombre de la clase hija
public class AnimalHervivoro extends Animal {
    //Como la clase AnimalHervivoro no es abstracta, JAVA nos marca un error 
    //informando que el metodo alimentarse() de la Super Clase o Clase Padre 
    //ha de ser sobreescrito.
    //Tal como nos indica Java podemos agregar la anotacion "@override"
    //Lo cual significa que estamos sobre escribiendo el método abstracto 
    //alimentarse( )
    //Metodo
    @Override
    public void alimentarse() {
        System.out.println("El animal hervivoro se alimenta de vegetales");
    }
    
}
