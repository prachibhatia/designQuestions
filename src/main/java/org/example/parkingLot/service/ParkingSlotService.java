package org.example.parkingLot.service;

import org.example.parkingLot.model.Slot;
import org.example.parkingLot.model.enums.VehicleType;
import org.example.parkingLot.repository.ParkingSlotRepository;

import java.util.List;

public class ParkingSlotService {
    private ParkingSlotRepository parkingSlotRepository;
    public Slot findEmptySlot(Long parkingLotId, VehicleType vehicleType){
        return parkingSlotRepository.findSlotByParkingLotIdAndVehicleType(parkingLotId,vehicleType);
    }
    public Slot createSlot(long SlotId,VehicleType vehicleType,long floorId,long parkingLotId){
        Slot slot = new Slot(SlotId,VehicleType.CAR,floorId);
        return parkingSlotRepository.save(parkingLotId,slot);
    }
    public List<Slot> getSlots(long parkingLotId){
        return parkingSlotRepository.findAllByParkingLotId(parkingLotId);
    }
}
