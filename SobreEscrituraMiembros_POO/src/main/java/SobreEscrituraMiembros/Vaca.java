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
//Hay que indicar que la clase Vaca hereda de la clase Animal.
// añadiendo la palabla reservada "extends" despues del nombre de la clase hija.
// de este modo herederá todos los atributos y metodos de la clase padre
public class Vaca extends Animal{
    //Metodo
    //Tal como nos indica Java podemos agragar la anotacion "@override"
    //Lo cual significa que estamos sobre escribiendo el método comer( )
    @Override
    public void comer(){
        System.out.println("Estoy comiendo pasto en la pradera");
    }
    
    
}
