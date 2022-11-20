package com.ollcargo.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String timezone;

    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<TimePeriod> monday;

    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<TimePeriod> tuesday;

    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<TimePeriod> wednesday;

    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<TimePeriod> thursday;

    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<TimePeriod> friday;

    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<TimePeriod> saturday;

    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<TimePeriod> sunday;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public List<TimePeriod> getMonday() {
        return monday;
    }

    public void setMonday(List<TimePeriod> monday) {
        this.monday = monday;
    }

    public List<TimePeriod> getTuesday() {
        return tuesday;
    }

    public void setTuesday(List<TimePeriod> tuesday) {
        this.tuesday = tuesday;
    }

    public List<TimePeriod> getWednesday() {
        return wednesday;
    }

    public void setWednesday(List<TimePeriod> wednesday) {
        this.wednesday = wednesday;
    }

    public List<TimePeriod> getThursday() {
        return thursday;
    }

    public void setThursday(List<TimePeriod> thursday) {
        this.thursday = thursday;
    }

    public List<TimePeriod> getFriday() {
        return friday;
    }

    public void setFriday(List<TimePeriod> friday) {
        this.friday = friday;
    }

    public List<TimePeriod> getSaturday() {
        return saturday;
    }

    public void setSaturday(List<TimePeriod> saturday) {
        this.saturday = saturday;
    }

    public List<TimePeriod> getSunday() {
        return sunday;
    }

    public void setSunday(List<TimePeriod> sunday) {
        this.sunday = sunday;
    }

    @Override
    public String toString() {
        return "Schedule [id=" + id + ", timezone=" + timezone + ", monday=" + monday + ", tuesday=" + tuesday
                + ", wedneday=" + wednesday + ", thursday=" + thursday + ", friday=" + friday + ", saturday=" + saturday
                + "]";
    }

}
