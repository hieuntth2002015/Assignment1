package com.example.assignment1.entity;

import javax.xml.crypto.Data;
import java.util.Date;

public class Food {
    private int id;
    private String name;
    private int category;
    private String description;
    private String thumbnail;
    private double price;
    private Date startdate;
    private Date updatedate;
    private String status;

    public Food() {
    }

    public Food(int id, String name, int category, String description, String thumbnail, double price, Date startdate, Date updatedate, String status) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.thumbnail = thumbnail;
        this.price = price;
        this.startdate = startdate;
        this.updatedate = updatedate;
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

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
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

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
