/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaircentre;

/**
 *
 * @author lab_services_student
 */
public class InventoryManager {
    SaleItem[] saleStock;
    jobStatus[] repairJobs;
    int saleCount = 0;
    int repairCount = 0;
    
    
    //constructor initialising the arrays with maximum capacity
    public InventoryManager(int saleCapacity, int repairCapacity){
    saleStock = new 
        SaleItem[saleCapacity];
    repairJobs = new
        jobStatus[repairCapacity];
}
    
    
    //methods to add the items in the arrays
    
    public void addSaleItem(SaleItem item){
        if(saleCount<saleStock.length) saleStock[saleCount++] = item;
    }
    
    public void addjobStatus(jobStatus job){
        if(repairCount<repairJobs.length)repairJobs[repairCount++] = job;
    }
    
    //method to show report of all items for sale 
    public void displaySalesReport(){
        System.out.print("----ITEMS FOR SALE REPORT----");
        
        //LOOP FOR REPITION
        for (int i=0; i<saleCount; i++){
            SaleItem item = saleStock[i];
            System.out.printf("ID: %-5d| Name: %-20s | Category: %-15s | 5s\n", item.getToolId(),item.getName(), item.getCategory(), item.getStatusDetails());
        }
        System.out.println();
        
    }
    
    //methhod to display a report of all the repai jobs
    public void displayRepairReport(){
        System.out.println("----CURRENT REPAIR JOBS REPORT----");
        
 for(int i = 0; i<repairCount;i++){
     jobStatus job = repairJobs[i];
     System.out.printf("ID:%-5d | Name: %-20s | Category: %-15s | %s\n", job.getToolId(), job.getName(), job.getCategory(), job.getStatusDetails());
 }
 System.out.println();
 }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
