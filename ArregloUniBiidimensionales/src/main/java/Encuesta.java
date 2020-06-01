
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
public class Encuesta {
    Scanner entrada = new Scanner (System.in);
    int numPreguntas;
    int numRespuestas;
    String [] pregunta= new String [3];
    String [] respuesta = new String [3];
    char [] respuestaUsiario = new char [3];
    
    public void Preguntar(){
        pregunta[0] = "Cual es el primer planeta del sistema solar";
        pregunta[1] = "Como se llama el ultimo planeta del sistema solar";
        pregunta[2] = "Como se llama la estralla en la cual orbitan los planetas del sistema solar";
        
    }
    public void Responder(){
        respuesta[0] = "a: Si";
        respuesta[1] = "b: No";
        respuesta[2] = "c: No sabe, no conesta";
    }
    public void encuestar(){
        for (int j = 0; j < pregunta.length; j++) {
            System.out.println("Pregunta " + (j+1));
            System.out.println(pregunta[j]);
            respuestas();
            System.out.println("Elija");
            respuestaUsiario[j] = entrada.nextLine().charAt(j);
            
            
        }
    }
    public void respuestas(){
        for (int i = 0; i < respuesta.length; i++) {
            System.out.println(respuesta[i]);
            
            
        }
    }
    
    
}
