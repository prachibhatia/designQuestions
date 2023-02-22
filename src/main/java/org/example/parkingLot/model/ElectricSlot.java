package org.example.parkingLot.model;

public class ElectricSlot extends Slot{
    private ElectricMeter electricMeter;
    private Charger charger;
    public ElectricSlot(int id, int slot_no, VehicleType vehicleType,ElectricMeter electricMeter,Charger charger) {
        super(id, slot_no, vehicleType);
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
