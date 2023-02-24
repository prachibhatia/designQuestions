package org.example.parkingLot.service;

import org.example.parkingLot.model.Vehicle;
import org.example.parkingLot.repository.VehicleRepository;

public class VehicleService {
    private VehicleRepository vehicleRepository;
    public Vehicle getVehicle(String vehicleNo){
        return vehicleRepository.getVehicleById(vehicleNo);
    }
}
