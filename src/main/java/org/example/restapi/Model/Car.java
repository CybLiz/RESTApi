package org.example.restapi.Model;


import java.time.LocalDateTime;
import java.util.UUID;

public class Car {

    private UUID id;
    private String brand;
    private int fabricationYear;
    private String color;

    public Car() {
    }
    public Car(UUID id, String brand, int fabricationYear, String color) {
        this.id = id;
        this.brand = brand;
        this.fabricationYear = fabricationYear;
        this.color = color;

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(int fabricationYear) {
        this.fabricationYear = fabricationYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
