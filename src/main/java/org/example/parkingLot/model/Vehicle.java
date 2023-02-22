package org.example.parkingLot.model;

public class Vehicle {
    private String vehicleNo;
    private VehicleType vehicleType;
    private String company;
    private String color;

    public Vehicle(String vehicleNo, VehicleType vehicleType, String company, String color) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
        this.company = company;
        this.color = color;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
