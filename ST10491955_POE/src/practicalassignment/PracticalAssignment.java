/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicalassignment;
import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class PracticalAssignment {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        System.out.println("Latest Series - 2025");
        System.out.println("********************");
        System.out.print("Enter (1) to launch menu or any other key to exit: ");

        String choice = input.nextLine();

        if (choice.equals("1")) {
            Series seriesManager = new Series();
            seriesManager.displayMenu();
        } else {
            System.out.println("Exiting program... Goodbye!");
        }

        input.close();
    }
}

