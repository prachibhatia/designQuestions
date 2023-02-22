package org.example.parkingLot.model;

import java.util.List;

public class Floor {
    private int floorNo;                                                                                                                                                                        
    private List<Slot> slots;
    private String floorManager;

    public Floor(int floorNo, List<Slot> slots, String floorManager) {
        this.floorNo = floorNo;
        this.slots = slots;
        this.floorManager = floorManager;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
    }

    public String getFloorManager() {
        return floorManager;
    }

    public void setFloorManager(String floorManager) {
        this.floorManager = floorManager;
    }
}
