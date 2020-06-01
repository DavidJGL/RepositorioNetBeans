
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author choko
 */
public class Lista {

    // declaracion de atrubutos
    int[] arrayEnteros = new int[5];
    // estsblecemos el numero de elementos del arreglo.
    int[] arrayNElementos = {6,7,8,9,10};
    // Pedimos nummero al ususario
    Scanner entrada = new Scanner(System.in);

    public void pedirElementos() {
        for (int i = 0; i < arrayEnteros.length; i++) {
            System.out.println("Introduzca el elemento " + (i+1) + " :");
            arrayEnteros[i] = entrada.nextInt();
        }

    }

    public void obtenerElementos() {
        System.out.println("La lista tiene " + arrayEnteros.length + " elementos.");
    }

    public void mostrarDatos() {
            System.out.println("Los datos del arreglo son: ");
        for (int i = 0; i < arrayEnteros.length; i++) {
            System.out.println(arrayEnteros[i]);

        }
    }

    public void sumarDatosArreglo() {
        int[] suma = new int[arrayEnteros.length];

        for (int i = 0; i < arrayEnteros.length; i++) {
            suma[i] = arrayEnteros[i] + arrayNElementos[i];
            System.out.println("La suma de los datos de la posicion" + (i+1) + " es: " + suma [i]);
        }

    }

    public void motrarMedia() {
        int bolsagolosina = 0;
        for (int i = 0; i < arrayEnteros.length; i++) {
            bolsagolosina = bolsagolosina + arrayEnteros[i];

        }
        int media = bolsagolosina / arrayEnteros.length;
        System.out.println("La suma de los datos es: " + bolsagolosina);
        System.out.println("La media es: " + media);
        

    }

    public void buscarValor() {
        System.out.println("Ingrese valor a encontrar");
        int valor = entrada.nextInt();
        for (int i = 0; i < arrayEnteros.length; i++) {
            if (valor == arrayEnteros[i]) {
                System.out.println("El valor introducido coincide");
                System.out.println("El valor introducido se encuentra en la posicion: " + (1 + i));
                break;
            }else{
                System.out.println("El Valor no coincide");
            }

        }
    }

    public void unirDosListas() {
        int[] unionListas = new int[arrayEnteros.length + arrayNElementos.length];
        for (int i = 0; i < arrayEnteros.length; i++) {
            unionListas[i] = arrayEnteros[i];

        }
        for (int i = arrayEnteros.length; i < unionListas.length; i++) {
            unionListas[i] = arrayNElementos[i - arrayNElementos.length];

        }
        System.out.println("La union de las dos listas " );
        for (int i = 0; i < unionListas.length; i++) {
            System.out.println(unionListas[i]);

        }
        

    }

    public void modificarDato() {
        System.out.println("Que dato desea modificar?");
        int dato = entrada.nextInt();
        for (int i = 0; i < arrayEnteros.length; i++) {
            if (arrayEnteros[i] == dato) {
                System.out.println("Introduzca el nuevo dato");
                int dato2 = entrada.nextInt();
                arrayEnteros[i] = dato2;
                mostrarDatos();

            }else{
                System.out.println("No se ha encuntrado el dato en la casilla " + (i+1));
            }

        }
        
    }
}
