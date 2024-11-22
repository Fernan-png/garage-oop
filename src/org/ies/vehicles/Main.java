package org.ies.vehicles;

import org.ies.vehicles.Model.Garage;
import org.ies.vehicles.components.GarageReader;
import org.ies.vehicles.components.VehicleReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleReader vehicleReader = new VehicleReader(scanner);
        GarageReader garageReader = new GarageReader(scanner, vehicleReader);

        Garage garage = garageReader.read();

        System.out.println(garage);

    }
}