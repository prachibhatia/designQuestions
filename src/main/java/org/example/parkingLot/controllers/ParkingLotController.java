package org.example.parkingLot.controllers;

import org.example.parkingLot.model.Floor;
import org.example.parkingLot.model.Gate;
import org.example.parkingLot.model.ParkingLot;
import org.example.parkingLot.model.VehicleType;

import java.util.List;
import java.util.Map;

public class ParkingLotController {
    public ParkingLot createParking(List<Floor> floors, List<Gate> gate, String owner, String name, int id, String address, Map<VehicleType, Integer> basePay){
        return new ParkingLot(floors,gate,owner,name,id,address,basePay);
    }
}
