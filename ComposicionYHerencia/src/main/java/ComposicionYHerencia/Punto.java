/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComposicionYHerencia;

import java.util.Scanner;

/**
 *
 * @author choko
 */
public class Punto {

    //Atrubutos
    private double coordenadaX;
    private double coordenadaY;
    //Metodo Constructor

    public Punto(double coordenadaX, double coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }
    //Metodos Setter

    public void setCoordenadaX(double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public void setCoordenadaY(double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public double getCoordenadaX() {
        return this.coordenadaX;

    }

    //Metodos Getter
    public double getCoordenadaY() {
        return this.coordenadaY;
    }

    //Metodo Mostrar
    public void mostrar() {
        System.out.println("La coordenda X: " + this.coordenadaX + " y la coordenada Y es: " + this.coordenadaY);
    }

    public void mover() {
        Scanner entrada = new Scanner(System.in);
        //Mostramos las coordenadas inciales
        System.out.println("Las coordenadas iniciales son: ");
        mostrar();
        //Damos la opcion de modificar dichas coordenadas inciales
        System.out.println("Coordenada X: ");
        double coordenadaX1 = entrada.nextDouble();
        coordenadaX1 = coordenadaX1 - this.coordenadaX;
        System.out.println("Coordenada y: ");
        double coordenadaY1 = entrada.nextDouble();
        coordenadaY1 = coordenadaY1 - this.coordenadaY;
        
        System.out.println("las coordanadas del punto ahora son: ");
        System.out.println("Coordenada X: " + coordenadaX1);
        System.out.println("Coordenada Y: " + coordenadaY1);
        //Almacenamos los nuevos valores de las coordenadas
        setCoordenadaX(coordenadaX1);// es lo mismo que this.coordenadaX=coordenadaX1
        setCoordenadaY(coordenadaY1);// es lo mismo que this.coordenadaY=coordenadaY1
        

    }

}
