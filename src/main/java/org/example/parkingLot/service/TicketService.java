package org.example.parkingLot.service;

import org.example.parkingLot.dto.GenerateTicketRequestDto;
import org.example.parkingLot.exception.EmptySlotNotFoundException;
import org.example.parkingLot.model.Gate;
import org.example.parkingLot.model.Slot;
import org.example.parkingLot.model.Ticket;
import org.example.parkingLot.model.Vehicle;
import org.example.parkingLot.repository.TicketRepository;

import java.sql.Date;
import java.time.LocalDate;

public class TicketService {
    private TicketRepository ticketRepository;
    private ParkingSlotService parkingSpotService;
    private GateService gateService;
    private VehicleService vehicleService;
    public Ticket createTicket(GenerateTicketRequestDto request){
        Slot slot = parkingSpotService.findEmptySlot(request.getParkingLotId(),request.getVehicleType());
        Gate gate = gateService.getGate(request.getGateId());
        Vehicle vehicle = vehicleService.getVehicle(request.getVehicleNumber());
        if(slot==null){
            throw new EmptySlotNotFoundException("No Empty Slot Found");
        }
        Ticket ticket = new Ticket(1,vehicle, Date.valueOf(LocalDate.now()),slot,request.getGateId(), gate.getOperatorName());
        return ticketRepository.save(ticket);
    }
}
