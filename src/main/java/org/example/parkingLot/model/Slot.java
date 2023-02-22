package org.example.parkingLot.model;

public class Slot {
    private int id;
    private int slot_no;
    private Status slot_status;
    private Vehicle vehicle;
    private VehicleType vehicleType;

    public Slot(int id, int slot_no, VehicleType vehicleType) {
        this.id = id;
        this.slot_no = slot_no;
        this.slot_status = Status.EMPTY;
        this.vehicleType = vehicleType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSlot_no() {
        return slot_no;
    }

    public void setSlot_no(int slot_no) {
        this.slot_no = slot_no;
    }

    public Status getSlot_status() {
        return slot_status;
    }

    public void setSlot_status(Status slot_status) {
        this.slot_status = slot_status;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
