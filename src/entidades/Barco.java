package entidades;

public class Barco {

    protected String matricula;
    protected float metrosEslora;
    protected int anioFabricacion;

    public Barco() {
    }
  
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getMetrosEslora() {
        return metrosEslora;
    }

    public void setMetrosEslora(float metrosEslora) {
        this.metrosEslora = metrosEslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public float crearModuloBarco() {
        float modulo = metrosEslora * 10;
        return modulo;
    }

}
