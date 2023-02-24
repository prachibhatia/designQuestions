package org.example.parkingLot.model;

import org.example.parkingLot.model.enums.GateStatus;
import org.example.parkingLot.model.enums.GateType;

public class Gate extends BaseModel{
    private String operatorName;
    private GateStatus gateStatus;
    private GateType gateType;

    public Gate(Long id, String operatorName, GateStatus gateStatus, GateType gateType) {
        super(id);
        this.operatorName = operatorName;
        this.gateStatus = gateStatus;
        this.gateType = gateType;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }
}
