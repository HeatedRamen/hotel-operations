package com.pluralsight;


public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    Reservation(){
        this.roomType = "";
        this.numberOfNights = 0;
        this.weekend = false;
    }
    Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = isWeekend;
    }

    public String getRoomType(){ return roomType; }
    public void setRoomType(String roomType){
        this.roomType = roomType;
    }

    public int getNumberOfNights() { return numberOfNights; }
    public void setNumberOfNights(int numberOfNights){
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() { return weekend; }
    public void setIsWeekend(boolean isWeekend){
        this.weekend = isWeekend;
    }

    public double getPrice(){
        return (roomType.equalsIgnoreCase("King")) ? 139.00 : 124.00;
    }

    public double getReservationTotal(){
        return getPrice() * numberOfNights;
    }

    @Override
    public String toString() {
        return "Room Type: " + roomType + " Is Weekend: " + weekend +
                "\nCost per night: " + getPrice() + " Number of Nights: " + getNumberOfNights() +
                "\nTotal cost: " + getReservationTotal();
    }
}
