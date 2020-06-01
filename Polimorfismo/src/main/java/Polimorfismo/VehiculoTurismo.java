/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;
//Hay que indicar que la clase VehiculoTurismo hereda de la clase Vehículo.
//añadiendo la palabla reservada "extends" despues del nombre de la clase hija.
//de este modo herederá todos los atributos y metodos de la clase padre

public class VehiculoTurismo extends Vehiculo implements Utilidad {

    //Atributos
    private int numeroPuertas;

    //Metodo constructor de la clase
    //Parámetros del constructor: (String matricula, String marca, String modelo)
    //Heredados de la clase padre + los atributos propios de la clase hija.
    public VehiculoTurismo(int numeroPuertas, String matricula, String marca, String modelo) {
        //Con la palabra reservada "super" indicamos a java que dichos atributos
        //ya estan inicializados dentro de la clase Padre(Vehiculo).
        super(matricula, marca, modelo);
        //Por lo tanto solo hara falta inicializar los atributos correspondiestes
        //a la clase hija (VehiculoTurismo).
        this.numeroPuertas = numeroPuertas;
    }

    //Metodo getter
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    //Metodo
    //Tal como nos indica Java podemos agregar la anotacion "@override"
    //Lo cual significa que estamos sobre escribiendo el método mostrarDatos().
    @Override
    public String mostrarDatos() {
        //En este caso, al sobreescribir el metodo, se añade el atributo propio de la sub clase (VehiculoTurismo)
        return "Matricula: " + matricula + "\nMarca: " + marca
                + "\nModelo: " + modelo + "\nNumero de Puertas: " + numeroPuertas;

    }
    @Override
     public String mostrarUtilidad(){
        return "Un turismo es para dar paseos";
    }

}
