package com.example.assignment1.entity;

import javax.xml.crypto.Data;

public class Food {
    private int id;
    private String name;
    private int category_id;
    private String description;
    private String thumbnail;
    private double price;
//    private Data start_date;
//    private Data update_date;
    private String status;

    public Food(int id, String name, int category_id, String description, String thumbnail, double price, String status) {
        this.id = id;
        this.name = name;
        this.category_id = category_id;
        this.description = description;
        this.thumbnail = thumbnail;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
