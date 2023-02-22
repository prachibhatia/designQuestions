package org.example.parkingLot.model;

import java.sql.Time;

public class Bill {
    private int id;
    private Ticket ticket;
    private int amount;
    private Time exitTime;
    private String operatorName;
    private BillStatus billStatus;

    public Bill(int id, Ticket ticket, int amount, Time exitTime, String operatorName, BillStatus billStatus) {
        this.id = id;
        this.ticket = ticket;
        this.amount = amount;
        this.exitTime = exitTime;
        this.operatorName = operatorName;
        this.billStatus = billStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Time getExitTime() {
        return exitTime;
    }

    public void setExitTime(Time exitTime) {
        this.exitTime = exitTime;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }
}
