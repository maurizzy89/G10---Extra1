package entidades;

public final class Velero extends Barco {

    private int numeroMastiles;

    public Velero() {
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    public float crearModuloVelero() {
        float modulo = super.crearModuloBarco();
        modulo = modulo + numeroMastiles;;

        return modulo;
    }

}
