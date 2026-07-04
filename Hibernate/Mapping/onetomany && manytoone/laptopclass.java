package org.example;

import jakarta.persistence.*;

@Entity
public class Laptop {
    @Id
    private int lid;
    private String brand;
    private int ram;

    @ManyToOne
    private Alian alian;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                ", ram=" + ram +
                '}';
    }
}
