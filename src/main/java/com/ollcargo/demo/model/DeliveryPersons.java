package com.ollcargo.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class DeliveryPersons {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int userId;

    @NotNull
    private String type;

    @NotNull
    private String transportation;

    private float maxWeight;

    private boolean canDeliverFragile;

    @NotNull
    private String mail;

    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    private Schedule schedule;

    @ManyToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Zone> pickupZones;

    @ManyToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Zone> dropoffZones;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public float getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(float maxWeight) {
        this.maxWeight = maxWeight;
    }

    public boolean isCanDeliverFragile() {
        return canDeliverFragile;
    }

    public void setCanDeliverFragile(boolean canDeliverFragile) {
        this.canDeliverFragile = canDeliverFragile;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public List<Zone> getPickupZones() {
        return pickupZones;
    }

    public void setPickupZones(List<Zone> pickupZones) {
        this.pickupZones = pickupZones;
    }

    public List<Zone> getDropoffZones() {
        return dropoffZones;
    }

    public void setDropoffZones(List<Zone> dropoffZones) {
        this.dropoffZones = dropoffZones;
    }

    @Override
    public String toString() {
        return "DeliveryPersons [id=" + id + ", userId=" + userId + ", type=" + type + ", transportation="
                + transportation + ", maxWeight=" + maxWeight + ", canDeliverFragile=" + canDeliverFragile + ", mail="
                + mail + ", schedule=" + schedule + ", pickupZones=" + pickupZones + ", dropoffZones=" + dropoffZones
                + "]";
    }

}
