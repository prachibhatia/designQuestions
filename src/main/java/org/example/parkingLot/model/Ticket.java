package org.example.parkingLot.model;

import java.sql.Time;

public class Ticket {
    private int id;
    private Vehicle vehicle;
    private Time entryTime;
    private Slot slot;
    private Gate gate;
    private String operatorName;

    public Ticket(int id, Vehicle vehicle, Time entryTime, Slot slot, Gate gate, String operatorName) {
        this.id = id;
        this.vehicle = vehicle;
        this.entryTime = entryTime;
        this.slot = slot;
        this.gate = gate;
        this.operatorName = operatorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Time getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Time entryTime) {
        this.entryTime = entryTime;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
}
