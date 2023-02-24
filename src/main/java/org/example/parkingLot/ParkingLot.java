package org.example.parkingLot;

import org.example.parkingLot.controller.ParkingLotController;
import org.example.parkingLot.model.Floor;
import org.example.parkingLot.model.Gate;
import org.example.parkingLot.model.Slot;
import org.example.parkingLot.model.enums.VehicleType;

import java.util.*;

public class ParkingLot {
    public static void main(String[] args) {

        ParkingLotController parkingLotController = new ParkingLotController();

        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the parking lot!");
        System.out.println("How many floors you need ?");
        int floorsSize = s.nextInt();
        List<Floor> floors = new ArrayList<>();
        System.out.println("Enter the name of the parking lot owner");
        String owner = s.next();
        System.out.println("Enter parking lot's address");
        String address = s.next();

        for(int i=0;i<floorsSize;i++){
            int floor = i+1;
            System.out.println("How many slots you need on "+ floor + "'st floor");
            int slotsSize = s.nextInt();
            List<Slot> slots = new ArrayList<>();
            System.out.println("Enter the "+ floor + "'st floor"+" manager name");
            String floorManagerName = s.next();
            Floor f = new Floor(floor,slots,floorManagerName);
            floors.add(f);
            for(int j=0;j<slotsSize;j++){
                slots.add(new Slot(j+1, VehicleType.CAR,f));
            }
        }

        System.out.println("How many entry gates you want");
        int entryGatesCount = s.nextInt();

        System.out.println("How many exit gates you want");
        int exitGatesCount = s.nextInt();

        List<Gate> gates = new ArrayList<>();

        Map<VehicleType,Integer> basePay = new HashMap<>();
        parkingLotController.createParkingLot(1,floors,gates,owner,"Parking Lot",address,basePay);
        System.out.println("Parking Lot created! Start parking your cars");

        boolean isVehicle = true;

        while(isVehicle){
            System.out.println("Do you want to park any vehicle?(y/n)");
            String input = s.next();
            if (input.equals("y")) {
            } else {
                isVehicle = false;
            }
        }
        System.out.println("Thank you for parking cars");
    }
}
