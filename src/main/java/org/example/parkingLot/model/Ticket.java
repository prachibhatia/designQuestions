package org.example.parkingLot.model;

import java.sql.Date;
import java.sql.Time;

public class Ticket extends BaseModel{
    private Vehicle vehicle;
    private Date entryTime;
    private Slot slot;
    private Long gateId;
    private String operatorName;

    public Ticket(int id, Vehicle vehicle, Date entryTime, Slot slot, Long gateId, String operatorName) {
        super(id);
        this.vehicle = vehicle;
        this.entryTime = entryTime;
        this.slot = slot;
        this.gateId = gateId;
        this.operatorName = operatorName;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
}
