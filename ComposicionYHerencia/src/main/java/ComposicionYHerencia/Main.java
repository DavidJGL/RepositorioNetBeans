/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComposicionYHerencia;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author choko
 */
public class Main {

    public static void main(String[] arg) {
        //Atributo del menu
        int menu;
        boolean error = false;
        //Objetos
        Rectangulo rectangulo;
        Triangulo triangulo;
        Circulo circulo;
        Cuadrado cuadrado;
        //Atributos pertenececientes a la clase rectangulo
        double base = 0;
        double altura = 0;

        double rectanguloX = 0;
        double rectanguloY = 0;
        double coordenadaX = 0;
        double coordenadaY = 0;
        double punto = 0;

        do {
            try {
                //Menu para interactuar con el usuario
                Scanner entrada = new Scanner(System.in);
                System.out.println("Elija una figura:");
                System.out.println("1. Rectandulo");
                System.out.println("2. Triangulo");
                System.out.println("3. Circulo");
                System.out.println("4. Cuadrado");
                System.out.println("5. Salir");
                menu = entrada.nextInt();
                error = false;

                switch (menu) {
                    case 1:
                        /*
                        
                        System.out.println("Introduzca el valor de la base: ");
                        base = entrada.nextDouble();
                        System.out.println("Introduzca el valor de la altura: ");
                        altura = entrada.nextDouble();
                         */
                        System.out.println("Rectangulo: ");
                        System.out.println("Introduzca el valor de la coordenada rectanguloX: ");
                        rectanguloX = entrada.nextDouble();
                        System.out.println("Introduzca el valor de la coordenada rectanguloY: ");
                        rectanguloY = entrada.nextDouble();
                        System.out.println("Introduzca el valor de la coordenadaX: ");
                        coordenadaX = entrada.nextDouble();
                        System.out.println("Introduzca el valor de la coordenadaY: ");
                        coordenadaY = entrada.nextDouble();
                        System.out.println("Introduzca el valor del Punto de inicio: ");
                        punto = entrada.nextDouble();
                        rectangulo = new Rectangulo(rectanguloX, rectanguloY, coordenadaX, coordenadaY, punto);
                        rectangulo.calcularArea();
                        rectangulo.calcularPerimetro();
                        error = false;
                        break;
                    case 2:
                        System.out.println("Triangulo: ");
                        System.out.println("Introduzca el valor de la base: ");
                        coordenadaX = entrada.nextDouble();
                        System.out.println("Introduzca el valor de la altura: ");
                        coordenadaY = entrada.nextDouble();
                        System.out.println("Introduzca el valor del Punto de inicio: ");
                        punto = entrada.nextDouble();
                        triangulo = new Triangulo(coordenadaX, coordenadaY, punto);
                        triangulo.calcularArea();
                        triangulo.calcularPerimetro();
                        error = false;
                        break;
                    case 3:
                        System.out.println("Circulo: ");
                        System.out.println("Introduzca la longitud del radio: ");
                        coordenadaX = entrada.nextDouble();
                        circulo = new Circulo(coordenadaX, coordenadaY);
                        circulo.calcularArea();
                        circulo.calcularPerimetro();
                        error = false;
                        break;
                    case 4:
                        System.out.println("Cuadrado: ");
                        System.out.println("Introduzca la longitud de un lado: ");
                        coordenadaX = entrada.nextDouble();
                        cuadrado = new Cuadrado(coordenadaX, coordenadaY);
                        cuadrado.calcularArea();
                        cuadrado.calcularPerimetro();
                        error = false;
                        break;
                }
            } catch (InputMismatchException ex) {
                System.out.println("El dato introducido no es valido. Por favor introduzca el numero de la opcion elegida");
                error = true;

            }

        } while (error);

    }

}
