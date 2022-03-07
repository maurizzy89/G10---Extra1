package service;

import entidades.Yate;

public final class YateService extends BarcoService{

    public Yate crearYate() {
        Yate yate = new Yate();
        super.crearBarco(yate);
        
        System.out.println("Ingrese la potencia en CV del yate");
        yate.setPotenciaCV(read.nextFloat());
        System.out.println("Ingrese el numero de camarotes");
        yate.setNumeroCamarotes(read.nextInt());

        return yate;
    }
}
