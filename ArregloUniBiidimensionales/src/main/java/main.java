
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
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);
        Encuesta cuestionario = new Encuesta();
        cuestionario.Preguntar();
        cuestionario.Responder();
        System.out.println("Intente responder a las siguientes preguntas");
        for (int i = 0; i < 3; i++) {
            System.out.println(cuestionario.encuestar(i));
            
        }
        
    }
    
}
