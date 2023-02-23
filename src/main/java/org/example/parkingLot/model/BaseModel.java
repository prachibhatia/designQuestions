package org.example.parkingLot.model;

//Things which are common in all entities
public class BaseModel {
    private long id;
    //private Date createdAt;
    //private Date updatedAt;
    //private String createdBy;
    //private String updatedBy;

    public BaseModel(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
