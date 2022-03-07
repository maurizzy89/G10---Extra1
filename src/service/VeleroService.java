package service;

import entidades.Velero;

public final class VeleroService extends BarcoService {

    public Velero crearVelero() {
        Velero velero = new Velero();
        super.crearBarco(velero);
        
        System.out.println("Ingrese numero de mastiles");
        velero.setNumeroMastiles(read.nextInt());

        return velero;
    }

}
