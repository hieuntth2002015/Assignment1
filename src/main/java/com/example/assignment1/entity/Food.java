package com.example.assignment1.entity;

import javax.xml.crypto.Data;
import java.util.Date;

public class Food {
    private int id;
    private String name;
    private int category_id;
    private String description;
    private String thumbnail;
    private double price;
    private Date start_date;
    private Date update_date;
    private String status;

    public Food() {
    }

    public Food(int id, String name, int category_id, String description, String thumbnail, double price, Date start_date, Date update_date, String status) {
        this.id = id;
        this.name = name;
        this.category_id = category_id;
        this.description = description;
        this.thumbnail = thumbnail;
        this.price = price;
        this.start_date = start_date;
        this.update_date = update_date;
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

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
