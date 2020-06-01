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
//Hay que indicar que la clase Planta hereda de la clase SerVivo.
//añadiendo la palabla reservada "extends" despues del nombre de la clase hija.
//de este modo herederá todos los atributos y metodos de la clase padre
public class Planta extends SerVivo {

    //Como la clase planta no es abstracta, JAVA nos marca un error informando
    //que el metodo alimentarse() de la Super Clase o Clase Padre ha de ser 
    //sobreescrito.
    //Tal como nos indica Java podemos agregar la anotacion "@override"
    //Lo cual significa que estamos sobre escribiendo el método alimentarse( )
    //Metodo
    @Override
    public void alimentarse() {
        System.out.println("La Planta se alimenta a través de la fotosíntesis");

    }

}
