/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaircentre;

/**
 *
 * @author lab_services_student
 */
public class SaleItem extends tool{
   double price;
   int stockQuantity;
   
   public SaleItem(int toolId, String name, String category, double price, int stockQuantity){
       super(toolId, name, category);
        this.price = price;
        this.stockQuantity = stockQuantity;
   }
    
    
  @Override
    public String getStatusDetails() {
        return "For Sale | Price: R" + this.price + " | Stock: " + this.stockQuantity;
    }
    
}
