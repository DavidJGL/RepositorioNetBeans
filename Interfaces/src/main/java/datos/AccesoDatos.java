
package datos;

public interface AccesoDatos {
    //Atributos:
    //Cualquier variable que se agregue será constante de manera automatica
    //por lo que es opcional agregar "public static" dado que el compilador
    //automaticamente hara de esta variable una constante.
    //aun asi se reflejara los modificadores de acceso aun sin ser necesarios
    public static int Max_Registros = 10;
    
    //Metodos:
    //los modificadores "public" y "abstract" se agregan a todos los métodos
    //que definamos en una interface.
    public abstract void introducirDatos();
    public abstract void mostrarDatos();
    
    
}
