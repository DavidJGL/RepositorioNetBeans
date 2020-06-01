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
public class Triangulo extends Rectangulo {

    //private double trianguloX;

    public Triangulo(double coordenadaX, double coordenadaY, double punto) {
        super(coordenadaX, coordenadaY, punto);
    }

    @Override
    public void calcularArea() {
        double base = super.getCoordenadaX() - super.getPunto();
        double altura = super.getCoordenadaY();
        double area = ((base * altura) / 2);
        System.out.println("El area del triangulo es: " + area);

    }
    @Override
    public void calcularPerimetro(){
        double ladoA = super.getCoordenadaX() - super.getPunto();
        double ladoB = super.getCoordenadaY() - super.getPunto();
        double ladoC = super.getCoordenadaX() - super.getCoordenadaY();
        double perimetro = (ladoA + ladoB * ladoC);
        System.out.println("El perimetro del triangulo es: " + perimetro);
        
    }

}
