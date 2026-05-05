package com.pluralsight;

public class HotelApp {
    public static void main(String[] args) {

        Room twin1 = new Room(false, false, "Double");
        Room twin2 = new Room(true, false, "Double");
        Room king1 = new Room(false, false, "King");
        Room king2 = new Room(true, false, "King");

        Reservation guest1 = new Reservation("King", 10, true);
        Reservation guest2 = new Reservation("Twin", 5, false);

        Employee employee1 = new Employee(10, "Jolie", "Manager", 50, 30);
        Employee employee2 = new Employee(11, "Ezra", "Janitor", 7.5, 70);

        System.out.println(twin1);
        System.out.println();

        System.out.println(twin2);
        System.out.println();

        System.out.println(king1);
        System.out.println();

        System.out.println(king2);
        System.out.println();

        System.out.println(guest1);
        System.out.println();

        System.out.println(guest2);
        System.out.println();

        System.out.println(employee1);
        System.out.println();

        System.out.println(employee2);
        System.out.println();
    }

}
