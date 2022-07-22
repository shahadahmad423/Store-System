/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import MyStore.Costomers;
import MyStore.Employees;
import MyStore.Manager;
import MyStore.Products;
import MyStore.Store;
import MyStore.pro;
import java.util.Scanner;

/**
 *
 * @author shaha
 */
public class Hmi {
    
    private static Store store;
    static Costomers costomer1;
    static Costomers costomer2;
    static Costomers costomer3;
    static Employees employee_1;
    static Employees employee_2;
    static Employees employee_3;
    static Manager maneger;
    static Products product1=new Products();
    static Products Product;  
    
   public static void start(){
        store=Hmi.Add_Store();
        Hmi.Products_Are();
        Hmi.Users_Are(); 
        Hmi.store.Print_All_costomers();
        Hmi.store.print_Employee();
        Hmi.store.print_Manager();
          Hmi.maneger.add_user_bonus();
        Hmi.store.login(costomer1);
          Hmi.store.login(costomer2);
            Hmi.store.login(costomer1);
  
       
        Hmi.store.print_Products();
     
        Hmi.store.print_Products();
      
        Hmi.store.print_Products();
        Hmi.maneger.add_product();
 
        Hmi.store.print_Products();
     
        Hmi.product1.special_Products1();
        Hmi.product1.Is_Exist_spesial();
        Hmi.product1.Is_Exist_spesial();
        Hmi.product1.Is_Exist_spesial();
      
        Hmi.maneger.remove_product();
          
        
     } 
     
     
    private static Store Add_Store(){  
               Store store =new Store("  Happy Store ");
               System.out.println("welcome to" + store.getName() );
               Hmi.store=new Store(store);
               return store;
    }
         
    public static void Products_Are(){
          System.out.println(" ");
          System.out.println("------------------- ");
          System.out.println("the Products are: ");
          System.out.println("------------------- ");
           Products A =new Products("Ipad",4500);
           Products B =new Products("Appile_Pinsil",7500);
           Products C =new Products("earpod",8000);
           Products D =new Products("Labtob",7600);
           
           store. Add_product_to_store(A); 
           store. Add_product_to_store(B);
           store. Add_product_to_store(C);
           store. Add_product_to_store(D);
             
             for(Products product: store.getProduct())
             System.out.println("name: "+product.getName() + " ID:  " + product.getID_p() +" price: " + product.getPrice()+" RS");     
           
    }
  
     
    public static void Users_Are(){
        
        System.out.println(" ");
        System.out.println("------------------- ");     
        System.out.println("the users are: ");
        System.out.println("------------------- ");
        costomer1 =new Costomers("reem");
        
        costomer2 =new Costomers("shahad");
               
        store.Add_costomer_to_store(costomer1);
        store.Add_costomer_to_store(costomer2);
               
        employee_1 = new Employees("mohammed");
        employee_2 = new Employees("rashed");
        employee_3 = new Employees("Roba");
               

        store.Add_employee_to_store(employee_1); 
        store.Add_employee_to_store(employee_2);
        store.Add_employee_to_store(employee_3);
               
        maneger=new Manager("Ahmad");
        store.Add_Manager_to_store(maneger);              
    }

    public static Store getStore() {
        return store;
    }

    public static void setStore(Store store) {
        Hmi.store = store;
    }


   
  
}



   //  String Action;
   //  do{
  
       //  System.out.println("Rigister or log in?");
       //  Action=scn.next();
       //  if ( Action.equals("Rigister")){   
        // }
        //     System.out.println("costomer or employee?");
         //    Costomers costomer =new Costomers();
         //    System.out.println("Please enter the name");
         //   costomer.setName(scn.next());
          //   System.out.println("Please enter the age");
          //   costomer.getID();
           //  store.Add_costomer_to_store(costomer);  
          //    } if ( Action.equals("print_all_student")){
          //   for(Costomers student: store.getCostomer())
          //       System.out.println("name: "+student.getName() + " Age: " + student.getID());
    
      //   }
  //   }while(!Action.equals("Exit"));
