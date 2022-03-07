package service;

import entidades.BarcoAMotor;

public final class BarcoAMotorService extends BarcoService {

    public BarcoAMotor crearBarcoAMotor() {
        BarcoAMotor barcoAMotor = new BarcoAMotor();
        super.crearBarco(barcoAMotor);

        System.out.println("Ingrese la potencia en CV del barco a motor");
        barcoAMotor.setPotenciaCV(read.nextFloat());

        return barcoAMotor;
    }
}
