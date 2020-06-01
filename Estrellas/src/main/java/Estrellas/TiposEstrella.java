/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrellas;

/**
 *
 * @author choko
 */
public class TiposEstrella extends Ejemplos {

    //Atributos
    private String color;
    private int tMedia;
    private int tMaxima;
    private double masa;
    private double radio;

    //Constructor
    public TiposEstrella(String color, int tMedia, int tMaxima, double masa, double radio, double gravedad, char clasificacion, String ejemplo) {
        super(gravedad, clasificacion, ejemplo);
        this.color = color;
        this.tMedia = tMedia;
        this.tMaxima = tMaxima;
        this.masa = masa;
        this.radio = radio;

    }

    //Metodo
    @Override
    public void mostrarDatos() {
        System.out.println("\nCaracteristicas de Estrella tipo: " + super.getClasificacion());
        System.out.println("El color de la estrela es: " + this.color);
        System.out.println("Su Temperatura media es: " + this.tMedia + " ºC ");
        System.out.println("Su Temperatura máxima es: " + this.tMaxima + " ºC ");
        System.out.println("Su masa expresada en Soles (Tantas veces la masa de nuestra estrella) es: " + this.masa + " soles ");
        System.out.println("Su radio expresado en Soles (Tantas veces el radio de nuestra estrella) es: " + this.radio + " soles ");
        System.out.println("La gravedad media de este tipo de estrellas es: " + super.getGravedad());
        System.out.println("Un ejemplo de estrella tipo " + super.getClasificacion() + " es: " + super.getEjemplo());
    }

}
