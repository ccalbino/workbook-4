package com.pluralsight;


//all code in room class effects this one room. It has nothing to do with the hotel(number of rooms)

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = false;
        this.dirty = false;

    }
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    //to know something
    public boolean isAvaliable() {
        return (!this.occupied) && (!this.dirty);
    }

    // to do something, not to know something
    public void checkin()  {
        this.occupied = true;
        this.dirty = true;
    }

    public void checkout() {
        this.occupied = false;
        this.dirty = false;

    }

    public void cleanRoom() {
        this.dirty = false;
    }




}
