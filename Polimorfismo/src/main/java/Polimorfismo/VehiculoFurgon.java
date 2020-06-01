/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

public class VehiculoFurgon extends Vehiculo implements Utilidad {

    //Atributos de la clase
    private int carga;

    //Metodo constructor de la clase
    //Parámetros del constructor: (String matricula, String marca, String modelo)
    //Heredados de la clase padre + los atributos propios de la clase hija.
    public VehiculoFurgon(int carga, String matricula, String marca, String modelo) {
        //Con la palabra reservada "super" indicamos a java que dichos atributos
        //ya estan inicializados dentro de la clase Padre(Vehiculo).
        super(matricula, marca, modelo);
        //Por lo tanto solo hara falta inicializar los atributos correspondiestes
        //a la clase hija (VehiculoFurgon).
        this.carga = carga;
    }

    //Metodo getter
    public int getCarga() {
        return carga;
    }

    //Metodo
    //Tal como nos indica Java podemos agregar la anotacion "@override"
    //Lo cual significa que estamos sobre escribiendo el método mostrarDatos().
    @Override
    public String mostrarDatos() {
        //En este caso, al sobreescribir el metodo, se añade el atributo propio de la sub clase (VehiculoFurgon)
        return "Matricula: " + matricula + "\nMarca: " + marca
                + "\nModelo: " + modelo + "\nCarga: " + carga;

    }
    @Override
     public String mostrarUtilidad(){
        return "Un furgón es para hacer repartos";
    }

}
