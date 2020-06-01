/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYobjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author choko
 */
public class Operacion {
    // Crear programa que lea varios numeros y opere con ellos.
    // Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    double division;

    // Metodos
    public void LeerNumeros() {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero entero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero entero"));

    }

    public void Sumar() {
        suma = numero1 + numero2;

    }

    public void Restar() {
        resta = numero1 - numero2;

    }

    public void multiplicar() {
        multiplicacion = numero1 * numero2;

    }

    public void dividir() {
        division = numero1 / numero2;
    }
    public void mostrarResultados(){
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        System.out.println("La resta de " + numero1 + " y " + numero2 + " es: " + resta);
        System.out.println("La multiplicacion de " + numero1 + " y " + numero2 + " es: " + multiplicacion);
        System.out.println("La division de " + numero1 + " y " + numero2 + " es: " + division);
    }
    
}
