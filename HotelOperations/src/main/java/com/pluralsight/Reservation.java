package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, int numberOfNights, int price, double reservationTotal, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }


    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public double getPrice() {
        double baseprice = 0;
        if (roomType.equalsIgnoreCase("king")) {
            baseprice = 139;

        } else if (roomType.equalsIgnoreCase("double")) {
            baseprice = 124;

        }
        if (this.weekend) {
            baseprice *= 1.10;
        }
        return baseprice;
    }


    public double getReservationTotal() {
        return getPrice() * numberOfNights;
    }

    public boolean isWeekend() {
        return false;
    }


}
