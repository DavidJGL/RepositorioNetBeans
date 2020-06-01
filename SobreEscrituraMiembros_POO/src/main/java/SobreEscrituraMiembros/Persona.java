/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SobreEscrituraMiembros;

/**
 *
 * @author choko
 */
//Hay que indicar que la clase Persona hereda de la clase Animal.
//añadiendo la palabla reservada "extends" despues del nombre de la clase hija.
//de este modo herederá todos los atributos y metodos de la clase padre
public class Persona extends Animal {
    //Metodo
    //Tal como nos indica Java podemos agregar la anotacion "@override"
    //Lo cual significa que estamos sobre escribiendo el método comer( )
    @Override
    public void comer(){
        System.out.println("Estoy comiendo sentado y con cubiertos");
    }
    
}
