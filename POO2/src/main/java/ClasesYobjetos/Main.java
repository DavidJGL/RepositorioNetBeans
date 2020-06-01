/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYobjetos;

/**
 *
 * @author choko
 */
public class Main {
    public static void main (String [] args ){
        Operacion Op = new Operacion ();
        
        Op.LeerNumeros();
        Op.Sumar();
        Op.Restar();
        Op.multiplicar();
        Op.dividir();
        Op.mostrarResultados();
        
    }
    
}
