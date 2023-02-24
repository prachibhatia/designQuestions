package org.example.parkingLot.repository;

import org.example.parkingLot.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepository {
    private List<Vehicle> vehicles = new ArrayList<>();
    public Vehicle getVehicleById(String vehicleNo){
        return vehicles.get(0);
    }
}
