/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaircentre;

/**
 *
 * @author lab_services_student
 */
public class jobStatus extends tool{
    String customerName;
    String repairStatus; //"Booked In", "In Progress", "Completed" , "unsuccessful"
    
    public jobStatus(int toolId, String name, String category, String customerName){
        super(toolId, name, category);
                this.customerName = customerName;
                this.repairStatus = "Booked in"; //default status for the jobs created
    }
    public void setJobStatus(String repairStatus){
        this.repairStatus = repairStatus; 
               
    }
    @Override
     public String getStatusDetails() {
        return "Repair Job | Customer: " + this.customerName + " | Status: " + this.repairStatus;
     }
    
    
}
