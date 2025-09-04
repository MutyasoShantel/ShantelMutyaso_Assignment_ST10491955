/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaircentre;
import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class RepairCentre {
Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      InventoryManager manager = new InventoryManager(10, 10);
      
      //what the repair centre sells
      manager.addSaleItem(new SaleItem(101, "Lawnmower", " Garden", 2500.00, 5));
      manager.addSaleItem(new SaleItem(102, "Drill Machine", "Construction", 1200.00,8));
      //tools that come in for repair
      manager.addjobStatus(new jobStatus(502, "Welding Machine", "Construction", "V Van Dijk"));
      manager.addjobStatus(new jobStatus(503, "5kW Generator", "Generator", "J. Bellingham"));

      //Display the initial reports 
      manager.displaySalesReport();
      manager.displayRepairReport();
      
      boolean running = true;
    
    while (running) {
        System.out.println("\n==== Repair Centre Menu ====");
        System.out.println("1. Add a machine for repair");
        System.out.println("2. View Sales Report");
        System.out.println("3. View Repair Report");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        
        switch (choice) {
            case 1:
                System.out.print("Enter Job ID: ");
                int jobId = scanner.nextInt();
                scanner.nextLine(); // consume newline

                System.out.print("Enter Machine Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Category: ");
                String category = scanner.nextLine();

                System.out.print("Enter Customer Name: ");
                String customer = scanner.nextLine();

                manager.addjobStatus(new jobStatus(jobId, name, category, customer));
                System.out.println("Machine added for repair successfully.");
                break;

            case 2:
                manager.displaySalesReport();
                break;

            case 3:
                manager.displayRepairReport();
                break;

            case 4:
                running = false;
                System.out.println("Exiting program. Goodbye!");
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
        }
 
    }
    }  
}
