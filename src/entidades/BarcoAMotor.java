package entidades;

public final class BarcoAMotor extends Barco {

    private float potenciaCV;

    public BarcoAMotor() {
    }

    public float getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(float potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public float crearModuloBarcoAMotor() {
        float modulo = super.crearModuloBarco();
        modulo = modulo + potenciaCV;

        return modulo;
    }
}
