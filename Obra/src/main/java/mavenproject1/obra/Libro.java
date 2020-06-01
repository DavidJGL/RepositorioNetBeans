package mavenproject1.obra;

/**
 *
 * @author choko
 */
public class Libro extends Obra implements Vendible {

    //Atributos adicionales: editorial, cantidad, precio.
    private String editorial;
    private int cantidad;
    private double precio;

    //Constructor
    public Libro(String autor, String titulo, int year, String critica, String editorial, int cantidad, double precio) {
        super(autor, titulo, year, critica);
        this.editorial = editorial;
        this.cantidad = cantidad;
        this.precio = precio;

    }

    //Metodos set
    public void Seteditorial(String editorial) {
        this.editorial = editorial;
    }

    public void Setcantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void Setprecio(double precio) {
        this.precio = precio;
    }
    //Metodos get

    public String Geteditorial() {
        return this.editorial;
    }

    public int Getcantidad() {
        return this.cantidad;
    }

    public double Getprecio() {
        return this.precio;
    }
    
    //Metodo mostrar
    @Override
    public void mostrar() {
        System.out.println("Editorial: " + this.editorial);
        System.out.println("Cantidad: " + this.cantidad);
        System.out.println("Precio: " + this.precio);
    }
    @Override
    public void Valorar(){
        this.critica = critica;
    }

    @Override
    public boolean hayStock() {
         boolean hayStock = false;
        if (this.cantidad > 0) {
            hayStock = true;
        } else {
            hayStock = false;
        }
        return hayStock;
    }

    @Override
    public void vender(int cantidad) throws Excepcion {
        if (this.cantidad > cantidad) {
            this.cantidad = this.cantidad - cantidad;
        } else {
            throw new Excepcion("No hay suficiente stock");
        }
    }

    @Override
    public int verStock() {
        return this.cantidad;
    }

    @Override
    public double verPrecio() {
        return this.precio;
    }

    @Override
    public void cambiarPrecio(double precio) {
         this.precio = precio;
    }

    @Override
    public int recibirPedido(int cantidad) {
       this.cantidad = this.cantidad + cantidad;
        return this.cantidad;
    }
}
    
   
