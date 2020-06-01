/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dieta;

/**
RacionPasto: String variedad, int caloriasPorRacion, pesoRacion   

Tanto Persona como Caballo implementan el interfaz Alimentar:

interface Alimentar. Este interfaz incorpora un método comer()  que recibe un parámetro llamado comida que es de tipo genérico ( por ejemplo puede recibir Pasto y puede recibir Menu entre otros ) y que no devuelve nada ( de tipo void )

La clase Caballo debe establecer el tipo Pasto para el interface Alimentar . La clase Persona el tipo Menu para la interface Alimentar

En ambos casos el valor del atributo peso se verá afectado por la acción de comer. Queda a decisión del alumno ese cambio, ( por ejemplo podría decidir que el incremento en peso de Caballo es un 70% del pasto consumido )

También se sobreescribirá toString en todas las clases que se realicen
 */
public class RacionPasto {
    
    //Atributos de la clase
    private String variedad;
    private int caloriasPorRacion;
    private double pesoRacion;
    
    //Metodo constructo
    public RacionPasto(String variedad, int caloriasPorRacion, double pesoRacion) {
        this.variedad = variedad;
        this.caloriasPorRacion = caloriasPorRacion;
        this.pesoRacion = pesoRacion;
    }
    
    //Setter
    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public void setCaloriasPorRacion(int caloriasPorRacion) {
        this.caloriasPorRacion = caloriasPorRacion;
    }

    public void setPesoRacion(double pesoRacion) {
        this.pesoRacion = pesoRacion;
    }
    
    //Getters
    public String getVariedad() {
        return variedad;
    }

    public int getCaloriasPorRacion() {
        return caloriasPorRacion;
    }

    public double getPesoRacion() {
        return pesoRacion;
    }
    
    //Metodo
    public void mostrarDatos(){
        
    }
    
    
}
