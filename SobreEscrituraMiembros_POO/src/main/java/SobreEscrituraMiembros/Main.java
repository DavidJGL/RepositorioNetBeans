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
public class Main {

    public static void main(String[] args) {
        //Se crea un objeto de la clase Persona
        Persona persona = new Persona();
        //Se crea un objeto de la clase Perro
        Perro perro = new Perro();
        //Se crea un objeto de la clase Vaca
        Vaca vaca = new Vaca();
        //Llamamos al objeto persona y llamamos al metodo comer();
        persona.comer();
        //Llamamos al objeto perro y llamamos al metodo comer();
        perro.comer();
        //Llamamos al objeto vaca y llamamos al metodo comer();
        vaca.comer();

    }

}
