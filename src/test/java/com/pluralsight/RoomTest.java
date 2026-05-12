package com.pluralsight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {


    @Test
    public void checkIn_should_change_state() {
        // Arrange
        Room room = new Room (false, false, "King");

        // Act
        room.checkIn();

        // Assert
        assertTrue(room.isDirty());
        assertTrue(room.isOccupied());
        assertFalse(room.isAvailable());
    }


    @Test
    void checkOut_should_change_false() {
        // Arrange
        Room room = new Room("King");

        // Act
        room.checkIn();
        room.checkOut();

        // Assert
        assertFalse(room.isOccupied());
    }

    @Test
    void cleanRoom_should_change_true() {
        // Arrange
        Room room = new Room(true, false, "King");

        // Act
        room.cleanRoom();

        // Assert
        assertFalse(room.isDirty());
    }

}
