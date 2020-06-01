/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiposDePersonas;

/**
 *
 * @author choko
 */
public class Direccion extends Persona{
    public String direccion;
    public String provincia;
    public String ciudad;
    public int codPostal;
    public String pais;
    public int nTelefono;
    public String cElectronico;

    public Direccion(String nombre, String apellidos, String nacionalidad, int edad, String casado
            , String numeroDNI, String direccion, String provincia,String ciudad,int codPostal
            , String pais,int nTelefono, String cElectronico) {
        super(nombre, apellidos, nacionalidad, edad, casado, numeroDNI);
        this.direccion = direccion;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.codPostal = codPostal;
        this.pais = pais;
        this.nTelefono = nTelefono;
        this.cElectronico = cElectronico;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setnTelefono(int nTelefono) {
        this.nTelefono = nTelefono;
    }

    public void setcElectronico(String cElectronico) {
        this.cElectronico = cElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public String getPais() {
        return pais;
    }

    public int getnTelefono() {
        return nTelefono;
    }

    public String getcElectronico() {
        return cElectronico;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println("Dirección: " +this.direccion);
        System.out.println("Provincia: " +this.provincia);
        System.out.println("Ciudad: " + this.ciudad);
        System.out.println("CodPostal: " + this.codPostal);
        System.out.println("Pais: " + this.pais);
        System.out.println("Telefono: " + this.nTelefono);
        System.out.println("Correo Electronico: " + this.cElectronico);
        
        
        
        
    }
    
    
}
