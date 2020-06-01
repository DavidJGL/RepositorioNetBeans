/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

public class VehiculoDeportivo extends Vehiculo implements Utilidad{

    //Atributos de la clase
    private int cilindrada;

    //Metodo constructor de la clase
    //Parámetros del constructor: (String matricula, String marca, String modelo)
    //Heredados de la clase padre + los atributos propios de la clase hija.
    public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
        //Con la palabra reservada "super" indicamos a java que dichos atributos
        //ya estan inicializados dentro de la clase Padre(Vehiculo).
        super(matricula, marca, modelo);
        //Por lo tanto solo hara falta inicializar los atributos correspondiestes
        //a la clase hija (VehiculoDeportivo).
        this.cilindrada = cilindrada;

    }

    //Metodo getter
    public int getCilindrada() {
        return cilindrada;
    }

    //Metodo
    //Tal como nos indica Java podemos agregar la anotacion "@override"
    //Lo cual significa que estamos sobre escribiendo el método mostrarDatos().
    @Override
    public String mostrarDatos() {
        //En este caso, al sobreescribir el metodo, se añade el atributo propio de la sub clase (VehiculoDeportivo)
        return "Matricula: " + matricula + "\nMarca: " + marca
                + "\nModelo: " + modelo + "\nCilindrada: " + cilindrada;
    }
    
    @Override
    public String mostrarUtilidad(){
        return "El coche de doportivo es para hacer carreras";
    }

}
