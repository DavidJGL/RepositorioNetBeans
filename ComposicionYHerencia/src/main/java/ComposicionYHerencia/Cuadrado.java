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
public class Cuadrado extends Circulo{

    public Cuadrado(double coordenadaX, double coordenadaY) {
        super(coordenadaX, coordenadaY);
    }
    
    @Override
    public void calcularArea(){
        double lado = super.getCoordenadaX();
        double area = Math.pow(lado, 2);
        System.out.println("El area del cuadrado es: " + area);
        
    }
    @Override
    public void calcularPerimetro(){
        double lado = super.getCoordenadaX();
        double perimetro = lado * 4;
        System.out.println("El perimetro del cuadrado es: " + perimetro);
        
    }
    
}
/*
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
        double rectanguloX = 0;
        double rectanguloY = 0;
        double coordenadaX = 0;
        double coordenadaY = 0;
        double punto;
        //Atributos pertenececientes a la clase triangulo
        double trianguloX = 0;

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

                switch (menu) {
                    case 1:
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
                        break;
                    case 2:
                        System.out.println("Triangulo: ");
                        System.out.println("Introduzca el valor de la coordenada trianguloX: ");
                        coordenadaX = entrada.nextDouble();
                        System.out.println("Introduzca el valor de la coordenadaX: ");
                        coordenadaX = entrada.nextDouble();
                        System.out.println("Introduzca el valor de la coordenadaY: ");
                        coordenadaY = entrada.nextDouble();
                        System.out.println("Introduzca el valor del Punto de inicio: ");
                        punto = entrada.nextDouble();
                        triangulo = new Triangulo(trianguloX, coordenadaX, coordenadaY, punto);
                        triangulo.calcularArea();
                        triangulo.calcularPerimetro();
                        break;
                    case 3:
                        System.out.println("Circulo: ");
                        System.out.println("Introduzca la longitud del radio: ");
                        coordenadaX = entrada.nextDouble();
                        circulo = new Circulo(coordenadaX, coordenadaY);
                        circulo.calcularArea();
                        circulo.calcularPerimetro();
                        break;
                    case 4:
                        System.out.println("Cuadrado: ");
                        System.out.println("Introduzca la longitud de un lado: ");
                        coordenadaX = entrada.nextDouble();
                        cuadrado = new Cuadrado(coordenadaX, coordenadaY);
                        cuadrado.calcularArea();
                        cuadrado.calcularPerimetro();
                        break;
                }
            } catch (InputMismatchException ex) {
                System.out.println("El dato introducido no es valido. Por favor intrduzca el numero de la opcion elegida");
                error = true;

            }

        } while (error);

    }

}
*/