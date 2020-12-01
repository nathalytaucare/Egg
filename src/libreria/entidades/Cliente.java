
package libreria.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {
    
   @Id
    private long documento;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String teléfono;
    private String atrib1;
    private String atrib2;

    public Cliente() {
    }

    public Cliente(long documento, String nombre, String apellido, String domicilio, String teléfono) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.teléfono = teléfono;
    }


    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    @Override
    public String toString() {
        return "Cliente{" +  ", documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio + ", tel\u00e9fono=" + teléfono + '}';
    }
    
    
}
