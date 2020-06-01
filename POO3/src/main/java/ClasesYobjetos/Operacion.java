/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYobjetos;

/**
 *
 * @author choko
 */
public class Operacion {

    // Crear programa que lea varios numeros y opere con ellos.
    // Atributos.
    // Variables fuera del metodo: Globales.
    int suma;
    int resta;
    int multiplicacion;
    double division;

    // Metodos
    // Los parametros iran en la declaración del método.
    // Le introduciremos dos paramatros int numero1, int numero2
    // Variables dentro del metodo: Locales
    // Por lo tanto tendremos dos varibles locales de tipo entero.
    public void Sumar(int numero1, int numero2) {
        suma = numero1 + numero2;

    }

    public void Restar(int numero1, int numero2) {
        resta = numero1 - numero2;

    }

    public void multiplicar(int numero1, int numero2) {
        multiplicacion = numero1 * numero2;

    }

    public void dividir(int numero1, int numero2) {
        division = numero1 / numero2;

    }

    public void mostrarResultados() {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }

}
