package com.tour.travels.domain.dto;

import java.util.Date;

public class FlightDTO {

    private Integer id;
    private Date takeOff;
    private Date touchDown;
    private String origin;
    private String destination;
    private Integer idPlane;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTakeOff() {
        return takeOff;
    }

    public void setTakeOff(Date takeOff) {
        this.takeOff = takeOff;
    }

    public Date getTouchDown() {
        return touchDown;
    }

    public void setTouchDown(Date touchDown) {
        this.touchDown = touchDown;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getIdPlane() {
        return idPlane;
    }

    public void setIdPlane(Integer idPlane) {
        this.idPlane = idPlane;
    }

}
