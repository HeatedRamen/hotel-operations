package com.pluralsight;

public class Room {
    private boolean dirty;
    private boolean occupied;
    String roomType;

    Room(){
        this.dirty = false;
        this.occupied = false;
        this.roomType = "";
    }

    Room(boolean dirty, boolean occupied, String roomType){
        this.dirty = dirty;
        this.occupied = occupied;
        this.roomType = roomType;
    }

    public int getNumberOfBeds(){
        return (roomType.equalsIgnoreCase("King")) ? 1 : 2;
    }
    public double getPrice(){
        return (roomType.equalsIgnoreCase("King")) ? 139.00 : 124.00;
    }

    public boolean isOccupied() {return occupied;}
    public boolean isDirty() {return  dirty;}
    public boolean isAvailable() { return (!occupied && !dirty);}

    @Override
    public String toString() {
        return  "Type: " + roomType +
                "\nDirty: " + dirty +
                "\nOccupied: " + occupied +
                "\nAvailable: " + isAvailable();
    }
}
