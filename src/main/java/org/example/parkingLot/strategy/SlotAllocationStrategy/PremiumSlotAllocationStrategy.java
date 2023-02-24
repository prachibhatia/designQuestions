package org.example.parkingLot.strategy.SlotAllocationStrategy;

import org.example.parkingLot.model.Floor;
import org.example.parkingLot.model.Slot;
import org.example.parkingLot.model.Vehicle;
import org.example.parkingLot.model.enums.VehicleType;

import java.util.List;

public class PremiumSlotAllocationStrategy implements SlotAllocationStrategy{
    @Override
    public Slot findSlot(List<Slot> slots, VehicleType vehicleType) {
        return null;
    }
}
