package org.example.parkingLot.service;

import org.example.parkingLot.model.Slot;
import org.example.parkingLot.model.enums.VehicleType;
import org.example.parkingLot.repository.ParkingSpotRepository;

public class ParkingSpotService {
    private ParkingSpotRepository parkingSpotRepository;
    public Slot findEmptySlot(Long parkingLotId, VehicleType vehicleType){
        return parkingSpotRepository.findSlotByParkingLotIdAndVehicleType(parkingLotId,vehicleType);
    }
}
