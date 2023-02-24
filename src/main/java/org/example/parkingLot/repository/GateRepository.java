package org.example.parkingLot.repository;

import org.example.parkingLot.model.Gate;

import java.util.ArrayList;
import java.util.List;

public class GateRepository {
    private List<Gate> gates = new ArrayList<>();
    public Gate getGateById(Long gateId){
        return gates.stream().filter(gate -> gate.getId()==gateId).findFirst().orElse(null);
    }
}
