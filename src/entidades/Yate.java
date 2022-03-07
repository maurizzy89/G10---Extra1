package entidades;

public final class Yate extends Barco {

    private float potenciaCV;
    private int numeroCamarotes;

    public Yate() {
    }

    public float getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(float potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    public float crearModuloYate() {
        float modulo = super.crearModuloBarco();
        modulo = modulo + potenciaCV;
        modulo = modulo + numeroCamarotes;

        return modulo;
    }

}
