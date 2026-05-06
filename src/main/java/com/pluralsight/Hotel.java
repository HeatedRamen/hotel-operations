package com.pluralsight;

public class Hotel {
    String name;
    int numberOfSuites;
    int numberOfRooms;
    int bookedSuites;
    int bookedBasicRoom;

    Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this. numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        bookedSuites = 0;
        bookedBasicRoom = 0;
    }

    Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRoom) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRoom = bookedBasicRoom;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }
    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }
    public int getBookedBasicRoom() {
        return bookedBasicRoom;
    }

    public boolean bookRoom (int numberOfRooms, boolean isSuite){
        if (isSuite){
            if(getAvailableSuites() < numberOfRooms){
                System.out.println("Not enough rooms");
                return false;
            }else {
                numberOfSuites -= numberOfRooms;
                bookedSuites += numberOfRooms;
                return true;
            }
        } else {
            if (getAvailableRooms() < numberOfRooms){
                System.out.println("Not enough rooms");
                return false;
            } else{
                this.numberOfRooms -= numberOfRooms;
                bookedBasicRoom += numberOfRooms;
                return true;
            }
        }
    }
    public int getAvailableSuites(){ return numberOfSuites - bookedSuites; }
    public int getAvailableRooms() {return numberOfRooms - bookedBasicRoom; }
}

