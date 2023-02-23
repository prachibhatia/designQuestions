package org.example.parkingLot.model;

import org.example.parkingLot.model.enums.Status;
import org.example.parkingLot.model.enums.VehicleType;

public class Slot extends BaseModel{
    private int slot_no;
    private Status slot_status;
    private VehicleType vehicleType;
    private Floor floor;

    public Slot(int slot_no, VehicleType vehicleType,Floor floor) {
        super(slot_no);
        this.slot_no = slot_no;
        this.slot_status = Status.EMPTY;
        this.vehicleType = vehicleType;
        this.floor = floor;
    }

    public int getSlot_no() {
        return slot_no;
    }

    public void setSlot_no(int slot_no) {
        this.slot_no = slot_no;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
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
