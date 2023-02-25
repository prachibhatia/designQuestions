package org.example.parkingLot.model;

import org.example.parkingLot.model.enums.Status;
import org.example.parkingLot.model.enums.VehicleType;

public class Slot extends BaseModel{
    private Status slot_status;
    private VehicleType vehicleType;
    private long floorId;

    public Slot(long slot_no, VehicleType vehicleType,long floorId){
        super(slot_no);
        this.slot_status = Status.EMPTY;
        this.floorId = floorId;
        this.vehicleType = vehicleType;
    }

    public long getFloorId() {
        return floorId;
    }

    public void setFloorId(long floorId) {
        this.floorId = floorId;
    }

    public Status getSlot_status() {
        return slot_status;
    }

    public void setSlot_status(Status slot_status) {
        this.slot_status = slot_status;
    }


    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
