package org.example.parkingLot.strategy.SlotAllocationStrategy;

import org.example.parkingLot.model.Floor;
import org.example.parkingLot.model.ParkingLot;
import org.example.parkingLot.model.Slot;
import org.example.parkingLot.model.Vehicle;

import java.util.List;

public interface SlotAllocationStrategy {
    public Slot findSlot(List<Floor> floors, Vehicle vehicle);
}
