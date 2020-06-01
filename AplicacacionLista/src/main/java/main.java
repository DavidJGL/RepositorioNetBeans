
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
public class main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Lista lista = new Lista();
        lista.obtenerElementos();
        lista.pedirElementos();
        lista.mostrarDatos();
        lista.sumarDatosArreglo();
        lista.motrarMedia();
        lista.buscarValor();
        lista.unirDosListas();
        lista.modificarDato();
        
        
        
        
      
    }

}
