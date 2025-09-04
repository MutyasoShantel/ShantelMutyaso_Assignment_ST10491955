/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicalassignment;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
/**
 *
 * @author lab_services_student
 */
public class Series {
private ArrayList<seriesModel> seriesList = new ArrayList<>();
Scanner input = new Scanner(System.in);

    
//menu
public void displayMenu(){
    int option = 0;
    do{
        System.out.println("\nPlease select one of the following menu items:");
            System.out.println("(1) Capture a new series.");
            System.out.println("(2) Search for a series.");
            System.out.println("(3) Update series details.");
            System.out.println("(4) Delete a series.");
            System.out.println("(5) Print series report - 2025");
            System.out.println("(6) Exit Application.");
            System.out.print("Enter your choice: ");
            
            
            option = getValidIntegerInput(); // Use a helper for safe input

            switch (option) {
                case 1:
                    captureSeries();
                    break;
                case 2:
                    searchSeries();
                    break;
                case 3:
                    updateSeries();
                    break;
                case 4:
                    deleteSeries();
                    break;
                case 5:
                    printSeriesReport();
                    break;
                case 6:
                    System.out.println("Exiting application...");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
           
        } while (option !=6);
    }

// 2. This replaces your 'addSeries' method
    public void captureSeries() {
        System.out.println("\nCAPTURE A NEW SERIES");
        System.out.println("********************");

        System.out.print("Enter the series id: ");
        int id = getValidIntegerInput();
        
        System.out.print("Enter the series name: ");
        String name = input.nextLine();

        // **Requirement 1.3: Age validation logic**
        int age;
        while (true) {
            System.out.print("Enter the age restriction: ");
            age = getValidIntegerInput();
            if (age >= 2 && age <= 18) {
                break; // Valid age, exit the loop
            } else {
                System.out.println("You have entered an incorrect series age!!!");
                System.out.println("Please re-enter the series age >>");
            }
        }

        System.out.print("Enter the number of episodes for " + name + ": ");
        int episodes = getValidIntegerInput();

        // Create the object and add it to the list
        seriesModel newSeries = new seriesModel(id, name, age, episodes);
        seriesList.add(newSeries);

        System.out.println("Series processed successfully!!!");
    }

    //  This replaces  searchSeries method
    public void searchSeries() {
        System.out.print("\nEnter the series id to search: ");
        int idToSearch = getValidIntegerInput();

        for (seriesModel series : seriesList) {
            if (series.getSeriesId() == idToSearch) {
                System.out.println("SERIES ID: " + series.getSeriesId());
                System.out.println("SERIES NAME: " + series.getSeriesName());
                System.out.println("SERIES AGE RESTRICTION: " + series.getSeriesAgeRestriction());
                System.out.println("SERIES NUMBER OF EPISODES: " + series.getSeriesNumberOfEpisodes());
                return; // Exit the method once found
            }
        }
        System.out.println("Series with Series Id: " + idToSearch + " was not found!");
    }

    // the missing 'updateSeries' method
    public void updateSeries() {
        
         System.out.println("Update functionality to be implemented.");
    }
    
    // 5. Add the missing 'deleteSeries' method
    public void deleteSeries() {
        System.out.print("\nEnter the series id to delete: ");
        int idToDelete = getValidIntegerInput();
        
        seriesModel seriesToDelete = null;
        for (seriesModel series : seriesList) {
            if (series.getSeriesId() == idToDelete) {
                seriesToDelete = series;
                break;
            }
        }

        if (seriesToDelete != null) {
            System.out.print("Are you sure you want to delete series " + idToDelete + "? Yes (y) to delete: ");
            String confirm = input.nextLine();
            if (confirm.equalsIgnoreCase("y")) {
                seriesList.remove(seriesToDelete);
                System.out.println("Series with Series Id: " + idToDelete + " WAS deleted!");
            } else {
                System.out.println("Deletion cancelled.");
            }
        } else {
            System.out.println("Series with Series Id: " + idToDelete + " was not found!");
        }
    }

    // 6. This replaces your 'viewSeries' method
    public void printSeriesReport() {
        System.out.println("\nLATEST SERIES - 2025");
        System.out.println("********************");
        if (seriesList.isEmpty()) {
            System.out.println("No series captured yet.");
        } else {
            for (seriesModel series : seriesList) {
                System.out.println("SERIES ID: " + series.getSeriesId() + ", NAME: " + series.getSeriesName() + 
                                   ", AGE: " + series.getSeriesAgeRestriction() + ", EPISODES: " + series.getSeriesNumberOfEpisodes());
                System.out.println("---------------------------------");
            }
        }
    }

    // Helper method to prevent crashes from bad input (e.g., typing "abc" for a number)
    private int getValidIntegerInput() {
        int num = 0;
        while (true) {
            try {
                num = input.nextInt();
                input.nextLine(); // Consume the rest of the line
                return num;
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter a number: ");
                input.nextLine(); // Clear the bad input
            }
        }
    }





}
