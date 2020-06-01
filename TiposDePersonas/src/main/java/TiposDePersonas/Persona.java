package TiposDePersonas;

/**
 *
 * @author choko
 */
//Clase Padre
public class Persona {

    //Atributos de la Clase
    private String nombre;// Nombre de cada objeto persona
    private String apellidos;// Apellidos de cada objeto persona
    private String nacionalidad;
    private int edad;// Edad de cada objeto persona
    private String casado;// Casado ( verdadero o falso (si/no)) de cada objeto persona
    private String numeroDNI;// DNI de cada objeto persona

    //Metodo Constructor
    public Persona(String nombre, String apellidos, String nacionalidad, int edad, String casado, String numeroDNI) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.casado = casado;
        this.numeroDNI = numeroDNI;
    }

    //Metodos Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCasado(String casado) {
        this.casado = casado;
    }

    public void setNumeroDNI(String numeroDNI) {
        this.numeroDNI = numeroDNI;
    }
    
    //Metodos Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public String getCasado() {
        return casado;
    }

    public String getNumeroDNI() {
        return numeroDNI;
    }
    //Metodos
    public void mostrarDatos(){
        
    }
    
    

}
/*
Para las clases profesor alumno
notas alumnno
faltas alumno
nº Profesor(codigo)
materia(Fisica, quimica, etc
nº Alumno (codigo)
Curso 1Bachiller, 2Bachiller

Resgistro...alumno o profesor
Sus datos han quedado satisfactoriamente grabados.
Su acceso a la plataforma es:
Usuario: dni
contraseña: numero aleatorio 1 al 10000
*/
/*
public class main {
    public static void main(String[] args){
        //Se crea un objeto de la clase estudiante
        Estudiante estudiante = new Estudiante("David", "Garcia", 42,101, 7.33f);
        //Se crea un objeto de la clase estudiante con todos los parametros
        //necesarios para inicializar un objeto estudiante.
        estudiante.mostrarDatos();
        
    }
    
}
*/