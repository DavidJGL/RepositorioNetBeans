/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrellas;

/* Anotaciones:
Pensar como incluir una subclase que espedifique datos de los ejemplo aportados 
por cada uno de los tipos de estrella.
//añadir atributos como gravedad, Ascensión Recta, Declinación, Distancia(Años luz), 
si giran planetas a su alrededor, cuantos planetas, 

 */
public class Ejemplos extends Estrellas {
    //Atributos
    private double gravedad;
    //constructor

    public Ejemplos(double gravedad, char clasificacion, String ejemplo) {
        super(clasificacion, ejemplo);
        this.gravedad = gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    public double getGravedad() {
        return gravedad;
    }
    
    
    //Metodo
    @Override
    public void mostrarDatos() {
        System.out.println("La gravedad de la estrella es de: " + this.gravedad);

    }
}
