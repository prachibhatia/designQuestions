package org.example.parkingLot.model;

import org.example.parkingLot.model.enums.VehicleType;

public class ElectricSlot extends Slot{
    private ElectricMeter electricMeter;
    private Charger charger;
    public ElectricSlot(int id, int slot_no, Floor floor, VehicleType vehicleType, ElectricMeter electricMeter, Charger charger) {
        super(slot_no,vehicleType,floor);
        this.electricMeter = electricMeter;
        this.charger = charger;
    }

    public ElectricMeter getElectricMeter() {
        return electricMeter;
    }

    public void setElectricMeter(ElectricMeter electricMeter) {
        this.electricMeter = electricMeter;
    }

    public Charger getCharger() {
        return charger;
    }

    public void setCharger(Charger charger) {
        this.charger = charger;
    }
}
