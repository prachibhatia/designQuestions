package org.example.parkingLot.service;

import org.example.parkingLot.model.Gate;
import org.example.parkingLot.repository.GateRepository;

public class GateService {
    private GateRepository gateRepository = new GateRepository();
    public Gate getGate(Long gateId){
        return gateRepository.getGateById(gateId);
    }
}
