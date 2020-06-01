/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComposicionYHerencia;

/**
 *
 * @author choko
 */
public class Circulo extends Punto {

    public Circulo(double coordenadaX, double coordenadaY) {
        super(coordenadaX, coordenadaY);

    }

    public void calcularArea() {
        double radio = super.getCoordenadaX();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + area);

    }
    public void calcularPerimetro(){
        double radio = super.getCoordenadaX();
        double perimetro = 2* Math.PI * radio;
        System.out.println("El perimetro del circulo es: " + perimetro);
    }
}
