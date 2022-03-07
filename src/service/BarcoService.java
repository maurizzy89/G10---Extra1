package service;

import entidades.Barco;
import java.util.Scanner;

public class BarcoService {

    protected Scanner read = new Scanner(System.in);

    public Barco crearBarco(Barco barco) {
        
        System.out.println("Ingrese matricula");
        barco.setMatricula(read.next());
        System.out.println("Ingrese en metros el largo de la eslora");
        barco.setMetrosEslora(read.nextFloat());
        System.out.println("Ingrese año de fabricacion");
        barco.setAnioFabricacion(read.nextInt());
        return barco;
    }
    
}