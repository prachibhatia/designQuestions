package org.example.parkingLot.model;

public class Gate {
    private int id;
    private int gateNo;
    private String operatorName;
    private GateStatus gateStatus;
    private GateType gateType;

    public Gate(int id, int gateNo, String operatorName, GateStatus gateStatus, GateType gateType) {
        this.id = id;
        this.gateNo = gateNo;
        this.operatorName = operatorName;
        this.gateStatus = gateStatus;
        this.gateType = gateType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGateNo() {
        return gateNo;
    }

    public void setGateNo(int gateNo) {
        this.gateNo = gateNo;
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
