package org.example.parkingLot.controller;

import org.example.parkingLot.dto.GenerateTicketRequestDto;
import org.example.parkingLot.model.Ticket;
import org.example.parkingLot.service.TicketService;

public class TicketController {
    private TicketService ticketService;
    public Ticket createTicket(GenerateTicketRequestDto request) {
        return ticketService.createTicket(request);
    }

}
