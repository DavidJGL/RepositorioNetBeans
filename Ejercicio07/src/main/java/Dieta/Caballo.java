/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dieta;

/**
Caballo: De tipo String: nombre. De tipo entero edad , y de tipo double peso
 */
public class Caballo extends RacionPasto implements Alimentar {
    private String nombre;
    private int edad;
    private double peso;

    public Caballo(String nombre, int edad, double peso, String variedad, int caloriasPorRacion, double pesoRacion) {
        super(variedad, caloriasPorRacion, pesoRacion);
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }
    
    @Override
    public void mostrarDatos(){
        
    }

    @Override
    public String comer() {
        return this.nombre + " " + this.edad + " " + this.peso;
    }
    
}
