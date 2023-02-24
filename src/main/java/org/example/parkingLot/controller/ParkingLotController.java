package org.example.parkingLot.controller;

import org.example.parkingLot.model.Floor;
import org.example.parkingLot.model.Gate;
import org.example.parkingLot.model.ParkingLot;
import org.example.parkingLot.model.enums.VehicleType;

import java.util.List;
import java.util.Map;

public class ParkingLotController {
    public ParkingLot createParkingLot(int id,List<Floor> floors, List<Gate> gate, String owner, String name, String address, Map<VehicleType, Integer> basePay){
        return new ParkingLot(id,floors,gate,owner,name,address,basePay);
    }
}
