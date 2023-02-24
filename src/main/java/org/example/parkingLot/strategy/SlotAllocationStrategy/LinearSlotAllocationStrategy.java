package org.example.parkingLot.strategy.SlotAllocationStrategy;

import org.example.parkingLot.exception.EmptySlotNotFoundException;
import org.example.parkingLot.model.Floor;
import org.example.parkingLot.model.Slot;
import org.example.parkingLot.model.enums.Status;
import org.example.parkingLot.model.Vehicle;
import org.example.parkingLot.model.enums.VehicleType;

import java.util.List;

public class LinearSlotAllocationStrategy implements SlotAllocationStrategy{
    @Override
    public Slot findSlot(List<Slot> slots, VehicleType vehicleType) {
        for(int i=0;i<slots.size();i++){
                if(slots.get(i).getSlot_status()== Status.EMPTY && slots.get(i).getVehicleType()==vehicleType){
                    return slots.get(i);
                }
        }
        return null;
    }
}
