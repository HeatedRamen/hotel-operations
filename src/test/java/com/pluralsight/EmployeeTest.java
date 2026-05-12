package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testPunchIn() {
        // Arrange
        Employee employee = new Employee(1, "Kevin", "Manager", 45, 30);

        // Act
        employee.punchIn(10);

        // Assert
        assertEquals(10, employee.getShiftStart());
    }

    @Test
    void punchOut_increases_hours_worked() {
        // Arrange
        Employee employee = new Employee(1, "Kevin", "Janitor", 100, 0);

        // Act
        employee.punchIn(10);
        employee.punchOut(1);

        // Assert
        assertEquals(15, employee.getHoursWorked());
    }

}