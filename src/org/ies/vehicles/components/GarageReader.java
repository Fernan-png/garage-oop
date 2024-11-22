package org.ies.vehicles.components;

import org.ies.vehicles.Model.Garage;
import org.ies.vehicles.Model.Vehicle;

import java.util.Scanner;

public class GarageReader {
    private final Scanner scanner;
    private final VehicleReader vehicleReader;

    public GarageReader(Scanner scanner, VehicleReader vehicleReader) {
        this.scanner = scanner;
        this.vehicleReader = vehicleReader;
    }

    public Garage read() {
        System.out.println("Introduce los datos del garaje");
        System.out.println("Nombre:");
        String name = scanner.nextLine();
        System.out.println("Dirección:");
        String address = scanner.nextLine();
        System.out.println("Cuantos vehiculos hay");
        int size = scanner.nextInt();
        scanner.nextLine();

        Vehicle[] vehicles = new Vehicle[size];
        for (int i = 0; i < vehicles.length ; i++) {
            vehicles[i] = vehicleReader.read();
        }

        Vehicle vehicle1 = vehicleReader.read();
        Vehicle vehicle2 = vehicleReader.read();
        Vehicle vehicle3 = vehicleReader.read();

        Vehicle[] vehicles = {vehicle1, vehicle2, vehicle3};

        return new Garage(
                name,
                address,
                vehicles
        );
    }
}
