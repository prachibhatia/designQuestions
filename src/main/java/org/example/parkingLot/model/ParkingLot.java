package org.example.parkingLot.model;

import org.example.parkingLot.model.enums.VehicleType;

import java.util.List;
import java.util.Map;

public class ParkingLot extends BaseModel{
    private List<Floor> floors;
    private List<Gate> gate;
    private String ownerName;
    private String parkingLotName;
    private String address;
    private Map<VehicleType,Integer> basePay;

    public ParkingLot(int id,List<Floor> floors, List<Gate> gate, String owner, String name,String address, Map<VehicleType, Integer> basePay) {
        super(id);
        this.floors = floors;
        this.gate = gate;
        this.ownerName = owner;
        this.parkingLotName = name;
        this.address = address;
        this.basePay = basePay;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGate() {
        return gate;
    }

    public void setGate(List<Gate> gate) {
        this.gate = gate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getParkingLotName() {
        return parkingLotName;
    }

    public void setParkingLotName(String parkingLotName) {
        this.parkingLotName = parkingLotName;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Map<VehicleType, Integer> getBasePay() {
        return basePay;
    }

    public void setBasePay(Map<VehicleType, Integer> basePay) {
        this.basePay = basePay;
    }
}
