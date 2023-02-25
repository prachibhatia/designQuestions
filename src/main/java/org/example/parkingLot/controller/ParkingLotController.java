package org.example.parkingLot.controller;

import org.example.parkingLot.dto.GenerateParkingLotRequestDto;
import org.example.parkingLot.model.Floor;
import org.example.parkingLot.model.Gate;
import org.example.parkingLot.model.ParkingLot;
import org.example.parkingLot.model.enums.VehicleType;
import org.example.parkingLot.service.ParkingLotService;

import java.util.List;
import java.util.Map;

public class ParkingLotController {
    private ParkingLotService parkingLotService;
    public ParkingLot createParkingLot(GenerateParkingLotRequestDto request){
        return parkingLotService.createParkingLot(request);
    }
}
