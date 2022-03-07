package main;

import service.AlquilerService;

public class Puerto {

    public static void main(String[] args) {
        System.out.println("--------------------Bienvenido al puerto--------------------");
        AlquilerService alquilerService = new AlquilerService();
        alquilerService.crear();
    }

}
