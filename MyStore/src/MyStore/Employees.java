/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyStore;
import Main.Hmi;
import MyStore.Store;
import java.util.ArrayList;


public class Employees extends User {
   Store store;
    private static float Salary= 5700f;
  
   ArrayList<Employees> employee;
     
    public Employees(String Name) {
         setID(++count);
         this.ID= getID();
       
         this.setName(Name);
         this.setSalary(Salary);
    
        
    }

    public Employees() {
     
    }

    public float getSalary() {
        return Salary;
          
    }

    public void setSalary(float Salary) {
        this.Salary = Salary;
        
    }



  
    
}
    

