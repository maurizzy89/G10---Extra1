package entidades;

import java.util.Date;

public class Alquiler {

    private String nombre;
    private String documentoCliente;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private String posicionAmarre;
    private Barco barcoOcupado;

    public Alquiler() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarcoOcupado() {
        return barcoOcupado;
    }

    public void setBarcoOcupado(Barco barcoOcupado) {
        this.barcoOcupado = barcoOcupado;
    }
    
}