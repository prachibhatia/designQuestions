package org.example.parkingLot.repository;


import org.example.parkingLot.factory.SlotAllocationFactory;
import org.example.parkingLot.model.Slot;
import org.example.parkingLot.model.enums.VehicleType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ParkingSlotRepository {
    HashMap<Long,List<Slot>> parkingSpots = new HashMap<>();
    public Slot findSlotByParkingLotIdAndVehicleType(long parkingLotId, VehicleType vehicleType){
        List<Slot> parkingSlotsListById = parkingSpots.get(parkingLotId);
        return SlotAllocationFactory.getSlot().findSlot(parkingSlotsListById,vehicleType);
    }
    public Slot save(long parkingLotId,Slot slot){
        if(parkingSpots.containsKey(parkingLotId)){
            List<Slot> slots = parkingSpots.get(parkingLotId);
            slots.add(slot);
            parkingSpots.put(parkingLotId,slots);
        }else{
            List<Slot> slots = new ArrayList<>();
            slots.add(slot);
            parkingSpots.put(parkingLotId,slots);
        }
        return slot;
    }

    public void saveAll(Long parkingLotId,List<Slot> listSlots){
        if(parkingSpots.containsKey(parkingLotId)){
            List<Slot> slots = parkingSpots.get(parkingLotId);
            slots.addAll(listSlots);
            parkingSpots.put(parkingLotId,slots);
        }else{
            List<Slot> slots = new ArrayList<>();
            slots.addAll(listSlots);
            parkingSpots.put(parkingLotId,slots);
        }
    }

    public List<Slot> findAllByParkingLotId(Long parkingLotId) {
        return parkingSpots.get(parkingLotId);
    }
}
