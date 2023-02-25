package org.example.parkingLot;

import org.example.parkingLot.controller.ParkingLotController;
import org.example.parkingLot.dto.GenerateParkingLotRequestDto;
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
        System.out.println("Enter the name of the parking lot");
        String parkingLot = s.next();
        System.out.println("Enter parking lot's address");
        String address = s.next();
        System.out.println("How many slots you need on each floor");
        int slotsSize = s.nextInt();

        System.out.println("How many entry gates you want");
        int entryGatesCount = s.nextInt();

        System.out.println("How many exit gates you want");
        int exitGatesCount = s.nextInt();

        GenerateParkingLotRequestDto parkingLotRequestDto = new GenerateParkingLotRequestDto((long)1,floorsSize,parkingLot,address,entryGatesCount,exitGatesCount,slotsSize);
        parkingLotController.createParkingLot(parkingLotRequestDto);
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
