package org.example.parkingLot.strategy.SlotAllocationStrategy;

import org.example.parkingLot.exception.EmptySlotNotFoundException;
import org.example.parkingLot.model.Floor;
import org.example.parkingLot.model.Slot;
import org.example.parkingLot.model.Status;
import org.example.parkingLot.model.Vehicle;

import java.util.List;

public class LinearSlotAllocationStrategy implements SlotAllocationStrategy{
    @Override
    public Slot findSlot(List<Floor> floors, Vehicle vehicle) {
        for(int i=0;i<floors.size();i++){
            List<Slot> slots = floors.get(i).getSlots();
            for(int j=0;j<slots.size();j++){
                if(slots.get(j).getSlot_status()== Status.EMPTY && slots.get(j).getVehicleType()==vehicle.getVehicleType()){
                    return slots.get(j);
                }
            }
        }
        throw new EmptySlotNotFoundException("No empty slot found");
    }
}
