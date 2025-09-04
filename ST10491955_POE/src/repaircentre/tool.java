/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaircentre;

/**
 *
 * @author lab_services_student
 */
public abstract class tool {
    int toolId;
    String name;
    String category; // garden/ construction/ generator
    
   // the constructor for the shared properties
    public tool(int toolId, String name, String category){
        this.toolId = toolId;
        this.name = name;
        this.category = category;
    }
    
    //methods to get the information
    public int getToolId(){
        return toolId;
    }
    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }
    //dont forget the abstract method that the clid must implement
    public abstract String getStatusDetails();
    
    
}
