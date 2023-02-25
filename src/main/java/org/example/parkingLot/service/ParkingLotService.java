package org.example.parkingLot.service;

import org.example.parkingLot.dto.GenerateParkingLotRequestDto;
import org.example.parkingLot.model.Floor;
import org.example.parkingLot.model.Gate;
import org.example.parkingLot.model.ParkingLot;
import org.example.parkingLot.model.Slot;
import org.example.parkingLot.model.enums.VehicleType;
import org.example.parkingLot.repository.ParkingLotRepository;
import org.example.parkingLot.repository.ParkingSlotRepository;

import java.util.*;

public class ParkingLotService {
    private ParkingLotRepository parkingLotRepository;
    private ParkingSlotService parkingSlotService;
    public ParkingLot createParkingLot(GenerateParkingLotRequestDto request){
        List<Floor> floors = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        for(int i=0;i<request.getNoOfFloors();i++){
            int floorId = i+1;
            System.out.println("Enter the "+ floorId + "'st floor"+" manager name");
            String floorManagerName = s.next();
            for(int j=0;j<request.getNoOfSlotsPerFloor();j++){
                Slot slot = parkingSlotService.createSlot(j+1,VehicleType.CAR,floorId,request.getParkingLotId());
            }
            Floor floor = new Floor(floorId,parkingSlotService.getSlots(request.getParkingLotId()),floorManagerName);
            floors.add(floor);
        }
        List<Gate> gates = new ArrayList<>();
        Map<VehicleType,Integer> basePay = new HashMap<>();
        ParkingLot parkingLot = new ParkingLot(request.getParkingLotId(),floors,gates,request.getParkingLotName(),request.getParkingLotAddress(),basePay);
        return parkingLotRepository.save(parkingLot);
    }
}
