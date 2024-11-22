package org.ies.vehicles.Model;

import java.util.Arrays;
import java.util.Objects;

public class Garage {
    private String name;
    private String adress;
    private Vehicle[] vehicles;

    public Garage(String name, String adress, Vehicle[] vehicles) {
        this.name = name;
        this.adress = adress;
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return Objects.equals(name, garage.name) && Objects.equals(adress, garage.adress) && Objects.deepEquals(vehicles, garage.vehicles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, adress, Arrays.hashCode(vehicles));
    }

    @Override
    public String toString() {
        return "Garage{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", vehicles=" + Arrays.toString(vehicles) +
                '}';
    }
}
