package org.ies.vehicles.components;

import org.ies.vehicles.Model.Vehicle;
import org.ies.vehicles.Model.VehicleType;

import java.util.Scanner;

public class VehicleReader {

    private final Scanner scanner;

    public VehicleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Vehicle read() {
        System.out.println("Introduce los datos del vehiculo");
        int option;

        do {
            System.out.println("Elige el tipo de vehiculo: ");
            System.out.println("1. Coche");
            System.out.println("2. Moto");
            System.out.println("3. Camión");
            option = scanner.nextInt();
            scanner.nextLine();
        } while (option != 1 && option != 2 && option != 3);

        VehicleType vehicleType;
        if (option == 1) {
            vehicleType = VehicleType.Car;
        } else if (option == 2) {
            vehicleType = VehicleType.Motorbike;
        } else {
            vehicleType = VehicleType.Truck;
        }

        System.out.println("Velocidad maxima");
        int maxSpeed = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Color del vehiculo");
        String color = scanner.nextLine();

        System.out.println("Matricula del vehiculo");
        String plate = scanner.nextLine();

        return new Vehicle(
                vehicleType,
                maxSpeed,
                color,
                plate
        );
    }
}
