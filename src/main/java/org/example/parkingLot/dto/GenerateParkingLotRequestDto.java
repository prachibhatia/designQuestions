package org.example.parkingLot.dto;

public class GenerateParkingLotRequestDto {
    private Long parkingLotId;
    private int noOfFloors;
    private String parkingLotName;
    private String parkingLotAddress;
    private int noOfEntryGates;
    private int noOfExitGates;
    private int noOfSlotsPerFloor;

    public GenerateParkingLotRequestDto(Long parkingLotId, int noOfFloors, String parkingLotName, String parkingLotAddress, int noOfEntryGates, int noOfExitGates, int noOfSlotsPerFloor) {
        this.parkingLotId = parkingLotId;
        this.noOfFloors = noOfFloors;
        this.parkingLotName = parkingLotName;
        this.parkingLotAddress = parkingLotAddress;
        this.noOfEntryGates = noOfEntryGates;
        this.noOfExitGates = noOfExitGates;
        this.noOfSlotsPerFloor = noOfSlotsPerFloor;
    }

    public Long getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(Long parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }

    public void setNoOfFloors(int noOfFloors) {
        this.noOfFloors = noOfFloors;
    }

    public String getParkingLotName() {
        return parkingLotName;
    }

    public void setParkingLotName(String parkingLotName) {
        this.parkingLotName = parkingLotName;
    }

    public String getParkingLotAddress() {
        return parkingLotAddress;
    }

    public void setParkingLotAddress(String parkingLotAddress) {
        this.parkingLotAddress = parkingLotAddress;
    }

    public int getNoOfEntryGates() {
        return noOfEntryGates;
    }

    public void setNoOfEntryGates(int noOfEntryGates) {
        this.noOfEntryGates = noOfEntryGates;
    }

    public int getNoOfExitGates() {
        return noOfExitGates;
    }

    public void setNoOfExitGates(int noOfExitGates) {
        this.noOfExitGates = noOfExitGates;
    }

    public int getNoOfSlotsPerFloor() {
        return noOfSlotsPerFloor;
    }

    public void setNoOfSlotsPerFloor(int noOfSlotsPerFloor) {
        this.noOfSlotsPerFloor = noOfSlotsPerFloor;
    }
}
