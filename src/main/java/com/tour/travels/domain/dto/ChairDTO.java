package com.tour.travels.domain.dto;

public class ChairDTO {

    private Integer id;
    private String name;
    private Boolean firstClass;
    private Boolean available;
    private Double price;
    private Integer idPlane;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getFirstClass() {
        return firstClass;
    }

    public void setFirstClass(Boolean firstClass) {
        this.firstClass = firstClass;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getIdPlane() {
        return idPlane;
    }

    public void setIdPlane(Integer idPlane) {
        this.idPlane = idPlane;
    }

}
