package org.example.parkingLot.factory;

import org.example.parkingLot.strategy.SlotAllocationStrategy.LinearSlotAllocationStrategy;
import org.example.parkingLot.strategy.SlotAllocationStrategy.SlotAllocationStrategy;

public class SlotAllocationFactory {
    public static SlotAllocationStrategy getSlot(){
        return new LinearSlotAllocationStrategy();
    }
}
