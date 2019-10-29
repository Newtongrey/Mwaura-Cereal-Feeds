package com.example.mwauracerealsfeeds.models;

public class Products
{
    private String name,description,price,location,image,pid, date, time;
    public Products()
    {

    }

    public Products(String name, String description, String price, String location,String image,String time,String pid, String date) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.location = location;
        this.image = image;
        this.pid = pid;
        this.date = date;
        this.time = time;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
