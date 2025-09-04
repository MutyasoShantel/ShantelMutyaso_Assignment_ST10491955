/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package practicalassignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 *
 * @author lab_services_student
 */
public class PracticalAssignmentTest {
    
    public PracticalAssignmentTest() {
    }

    @Test
    public void testMain() {
        // Simulate user typing "1"
        String simulatedInput = "1\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        // Capture program output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        PracticalAssignment.main(new String[]{});

        String output = outputStream.toString();

        // Verify program header and prompt are shown
        assertTrue(output.contains("Latest Series - 2025"));
        assertTrue(output.contains("Enter (1) to launch menu"));

        // ✅ If Series.displayMenu() prints something,
        // you can also assert for that output here
    }

    @Test
    public void testMain_ExitProgram() {
        // Simulate user typing "X"
        String simulatedInput = "X\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        // Capture program output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        PracticalAssignment.main(new String[]{});

        String output = outputStream.toString();

        // Verify exit message
        assertTrue(output.contains("Exiting program... Goodbye!"));
    }
    }


