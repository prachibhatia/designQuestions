package org.example.parkingLot.model;

import org.example.parkingLot.model.enums.BillStatus;

import java.sql.Date;

public class Bill extends BaseModel{
    private Ticket ticket;
    private int amount;
    private Date exitTime;
    private String operatorName;
    private BillStatus billStatus;

    public Bill(int id, Ticket ticket, int amount, Date exitTime, String operatorName, BillStatus billStatus) {
        super(id);
        this.ticket = ticket;
        this.amount = amount;
        this.exitTime = exitTime;
        this.operatorName = operatorName;
        this.billStatus = billStatus;
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

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
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
