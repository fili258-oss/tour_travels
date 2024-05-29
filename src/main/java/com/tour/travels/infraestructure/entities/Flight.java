package com.tour.travels.infraestructure.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "take_off")
    private Date takeOff;

    @Column(name = "touch_down")
    private Date touchDown;

    @Column(name = "origin")
    private String origin;

    @Column(name = "destination")
    private String destination;

    @Column(name = "id_plane")
    private Integer idPlane;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
