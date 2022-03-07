package service;

import entidades.Alquiler;
import entidades.BarcoAMotor;
import entidades.Velero;
import entidades.Yate;
import java.util.Date;
import java.util.Scanner;

public class AlquilerService {

    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Alquiler crear() {
        Alquiler alquiler = new Alquiler();
        
        System.out.println("Ingrese su nombre");
        alquiler.setNombre(read.next());

        System.out.println("Ingrese su DNI");
        alquiler.setDocumentoCliente(read.next());

        System.out.println("Ingrese fecha de Alquiler");
        System.out.println("Dia");
        int diaAlquiler = read.nextInt();
        System.out.println("Mes");
        int mesAlquiler = read.nextInt();
        System.out.println("Año");
        int anioAlquiler = read.nextInt();
        Date fechaAlquiler = new Date(anioAlquiler - 1900, mesAlquiler - 1, diaAlquiler);
        alquiler.setFechaAlquiler(fechaAlquiler);

        System.out.println("Ingrese fecha de devolucion");
        System.out.println("Dia");
        int diaDevolucion = read.nextInt();
        System.out.println("Mes");
        int mesDevolucion = read.nextInt();
        System.out.println("Año");
        int anioDevolucion = read.nextInt();
        Date fechaDevolucion = new Date(anioDevolucion - 1900, mesDevolucion - 1, diaDevolucion);
        alquiler.setFechaDevolucion(fechaDevolucion);

        System.out.println("Ingrese posicion del amarre");
        alquiler.setPosicionAmarre(read.next());

        boolean flag = true;
        float precio = 0;
        do {
            System.out.println("¿Qué tipo de barco desea alquilar? (VELERO / BARCO A MOTOR / YATE)");
            String barcoOcupado = read.next();
            if (barcoOcupado.equalsIgnoreCase("Velero") || barcoOcupado.equalsIgnoreCase("Barco a Motor") || barcoOcupado.equalsIgnoreCase("Yate")) {
                if (barcoOcupado.equalsIgnoreCase("Velero")) {
                    VeleroService veleroService = new VeleroService();
                    Velero velero = veleroService.crearVelero();
                    alquiler.setBarcoOcupado(velero);
                    precio = diasOcupacion(alquiler) * velero.crearModuloVelero();
                }
                if (barcoOcupado.equalsIgnoreCase("Barco a motor")) {
                    BarcoAMotorService barcoAMotorService = new BarcoAMotorService();
                    BarcoAMotor barcoAMotor = barcoAMotorService.crearBarcoAMotor();
                    alquiler.setBarcoOcupado(barcoAMotor);
                    precio = diasOcupacion(alquiler) * barcoAMotor.crearModuloBarcoAMotor();
                }
                if (barcoOcupado.equalsIgnoreCase("Yate")) {
                    YateService yateService = new YateService();
                    Yate yate = yateService.crearYate();
                    alquiler.setBarcoOcupado(yate);
                    precio = diasOcupacion(alquiler) * yate.crearModuloYate();
                }
            } else {
                System.out.println("Tipo de barco no encontrado");
                flag = false;
            }
        } while (flag == false);

        System.out.println("El monto a pagar es de: $" + precio);

        return alquiler;
    }

    public float diasOcupacion(Alquiler alquiler) {
        long diasOcupadosMS = (alquiler.getFechaDevolucion().getTime()) - (alquiler.getFechaAlquiler().getTime());
        diasOcupadosMS = diasOcupadosMS / (1000 * 60 * 60 * 24);
        float diasOcupados = (float) diasOcupadosMS;

        return diasOcupados;
    }

}
