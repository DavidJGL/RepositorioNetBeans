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
public class Rectangulo extends Figura {

    //Atributos
    private double rectanguloX;
    private double rectanguloY;
    private double base;
    private double altura;

    //Metodo consructor
    public Rectangulo(double rectanguloX, double rectanguloY, double coordenadaX, double coordenadaY, double punto) {
        super(coordenadaX, coordenadaY, punto);
        this.rectanguloX = rectanguloX;
        this.rectanguloY = rectanguloY;
    }
    //contructor redifinido
    public Rectangulo(double coordenadaX, double coordenadaY, double punto){
        super(coordenadaX, coordenadaY, punto);
        
    }

    //Metodo Set
    public void setRectanguloX(double rectanguloX) {
        this.rectanguloX = rectanguloX;
    }

    public void setRectanguloY(double rectanguloY) {
        this.rectanguloY = rectanguloY;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Metodo Get
    public double getRectanguloX() {
        return rectanguloX;
    }

    public double getRectanguloY() {
        return rectanguloY;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public void mostrar() {
        System.out.println("Las coordeandas del primer punto rectágunlo son: ");
        System.out.println("Coordenada X: " + super.getCoordenadaX());
        System.out.println("Coordenada Y: " + super.getCoordenadaY());
        System.out.println("Las coordenadas del segundo punto del rectangulo son: ");
        System.out.println("Coordenada  X: " + this.rectanguloX);
        System.out.println("Coordenada  Y: " + this.rectanguloY);

    }

    @Override
    public void mover() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Las coordenadas iniciales son: ");
        mostrar();
        System.out.println("Coordenada X: ");
        double coordenadaX1 = entrada.nextDouble();
        coordenadaX1 = coordenadaX1 - super.getCoordenadaX();// OJO COMPRABAR UNA VEZ REALIZADO EL MAIN
        System.out.println("Coordenada y: ");
        double coordenadaY1 = entrada.nextDouble();
        coordenadaY1 = coordenadaY1 - super.getCoordenadaY();// OJO COMPRABAR UNA VEZ REALIZADO EL MAIN

        //Primer punto
        System.out.println("Las coordanadas del punto ahora son: ");
        System.out.println("Coordenada X: " + coordenadaX1);
        System.out.println("Coordenada Y: " + coordenadaY1);
        //Almacenamos los nuevos valores de las coordenadas
        setCoordenadaX(coordenadaX1);// es lo mismo que this.coordenadaX=coordenadaX1
        setCoordenadaY(coordenadaY1);// es lo mismo que this.coordenadaY=coordenadaY1
        //Segudo Punto
        coordenadaX1 = coordenadaX1 + this.rectanguloX;
        setRectanguloX(coordenadaX1);
        coordenadaY1 = coordenadaY1 + this.rectanguloY;
        setRectanguloY(coordenadaY1);

        //Metodo mostrar
        System.out.println("Las nuevas coordenadas son: ");
        mostrar();
    }
    //Metodo clacular Area
    public void calcularArea() {
        System.out.println("El area del rectangulo es: ");
        this.base = this.rectanguloX - super.getCoordenadaX();
        this.altura = super.getCoordenadaY();
        System.out.println((this.base) * (this.altura));

    }

    //Metodo calcular perimetro
    public void calcularPerimetro() {
        System.out.println("El perimetro del rectangulo es: ");
        this.base = this.rectanguloX - super.getCoordenadaX();
        this.altura = super.getCoordenadaY();
        System.out.println((this.base * 2) + (this.altura * 2));
    }

}
