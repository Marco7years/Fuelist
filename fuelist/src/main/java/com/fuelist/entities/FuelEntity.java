package com.fuelist.entities;

import com.fuelist.util.DateUtil;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class FuelEntity {

    private @Id
    @GeneratedValue Long id;
    private int litres;
    private int distance;
    private int price;
    private String dateOfRefuel;

    FuelEntity() {}

    FuelEntity(int litres, int distance, int price) {
        this.litres = litres;
        this.distance = distance;
        this.price = price;
        this.dateOfRefuel = LocalDateTime.now().format(DateUtil.defaultFormat);
    }

    FuelEntity(int litres, int distance, int price, String dateOfRefuel) {
        this.litres = litres;
        this.distance = distance;
        this.price = price;
        this.dateOfRefuel = dateOfRefuel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getLitres() {
        return litres;
    }

    public void setLitres(int litres) {
        this.litres = litres;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDateOfRefuel() {
        return dateOfRefuel;
    }

    public void setDateOfRefuel(String dateOfRefuel) {
        this.dateOfRefuel = dateOfRefuel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof FuelEntity))
            return false;
        FuelEntity fuel = (FuelEntity) o;
        return Objects.equals(this.id, fuel.id)
                && Objects.equals(this.dateOfRefuel, fuel.dateOfRefuel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.litres, this.distance, this.price, this.dateOfRefuel);
    }

    @Override
    public String toString() {
        return "Fuel Record{id=" + this.id
            + " litres=" + this.litres
            + " distance=" + this.distance
            + " price=" + this.price
            + " date=" + this.dateOfRefuel;
    }
}
