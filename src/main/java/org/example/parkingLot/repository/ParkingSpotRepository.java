package org.example.parkingLot.repository;


import org.example.parkingLot.factory.SlotAllocationFactory;
import org.example.parkingLot.model.Slot;
import org.example.parkingLot.model.enums.VehicleType;

import java.util.HashMap;
import java.util.List;

public class ParkingSpotRepository {
    HashMap<Long,List<Slot>> parkingSpots = new HashMap<>();
    public Slot findSlotByParkingLotIdAndVehicleType(long parkingLotId, VehicleType vehicleType){
        List<Slot> parkingSlotsListById = parkingSpots.get(parkingLotId);
        return SlotAllocationFactory.getSlot().findSlot(parkingSlotsListById,vehicleType);
    }
}
