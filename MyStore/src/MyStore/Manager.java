/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyStore;

import java.util.ArrayList;
import Main.Hmi;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author shaha
 */
public class Manager extends Employees {
    ArrayList<Products> product; 
   ArrayList<Employees> employee; 
   private float Salary_M = 9700f;;
   private String Product_Name;
   private Scanner Scn;
   private String y_n;

       
      
        public ArrayList<Products> getProduct() {
        return product;
        }

    public Manager( String Name) {
   
          setID(++count);
         this.ID= getID();
         this.setName(Name);
         this.setSalary_M(Salary_M);
      
          this.product=new   ArrayList<Products>();
             
        
    }
     public int random_num(){
               Random rnd = new Random();
             int n=100000 + rnd.nextInt(999999-100000);
           return n;
      } 

    public float getSalary_M() {
        return Salary_M;
    }

    public void setSalary_M(float Salary_M) {
        this.Salary_M = Salary_M;
    }
        
        
        
  public void add_product(){
   
       System.out.println(" ");
           System.out.println("------------------------------------------ ");
         System.out.println("new the Manager want to Add new product:");
          System.out.println("------------------------------------------ ");
      do{
        try{
            this.Scn =new Scanner(System.in);
            System.out.println("enter the product name want to add: ");
            
            this.Product_Name=Scn.next();
          }
        catch(InputMismatchException e){
            System.out.println("catch ");
            System.out.println(e.getMessage() );
          }
          finally{
        
          }
           String product= this.Product_Name;
           
           
           
           // استدعينا الداله اللي نرسل لها اسم البرودكت وترجع لنا اذا موجود او لا
           Products x=   Get_products_by_name_M(product);
           if(x== null){
               Products pr = new  Products();
               System.out.println("you can Add ");
               pr.setName(product);
               System.out.print("Price?");
               pr.setPrice(Scn.nextFloat()); 
               pr.setID_p(random_num());
               
               store= Hmi.getStore();
               store.Add_product_to_store(pr);
               System.out.println("added successfully");
               System.out.println("id; "+  pr.getID_p() +" name:" + pr.getName() + " price:" + pr.getPrice());
   
           }else{
            
               System.out.print("the product is Already exists"); 
               
                    
           }
            System.out.print("do you want to add ather product?");
               y_n=Scn.next();
  
            }while(y_n.equalsIgnoreCase("yes") );

    }  
  
  
       public void remove_product(){
   
       System.out.println(" ");
           System.out.println("------------------------------------------ ");
         System.out.println("new the Manager want to remove new product:");
          System.out.println("------------------------------------------ ");
      do{
        try{
            this.Scn =new Scanner(System.in);
            System.out.println("enter the product name want to remove: ");
            
            this.Product_Name=Scn.next();
          }
        catch(InputMismatchException e){
            System.out.println("catch ");
            System.out.println(e.getMessage() );
          }
          finally{
        
          }
           String product= this.Product_Name;
           
           
           
           // استدعينا الداله اللي نرسل لها اسم البرودكت وترجع لنا اذا موجود او لا
           Products x=   Get_products_by_name_M(product);
           if(x== null){
               
                   System.out.print("the product is Already not exists"); 
           }else{
            
           
               this.product.remove(x);
    }

             
                    
           
            System.out.print("do you want to remove ather product?");
               y_n=Scn.next();
  
            }while(y_n.equalsIgnoreCase("yes") );

    }   
        
         public Products Get_products_by_name_M(String name){ 
          for(Products prob: this.getProduct()){

              if (prob.getName().equals(name)){
                  return prob;
              }
          }
          return null;
          
          
      }   
     
        
        
public  void add_user_bonus(){
          
           System.out.println(" ");
          System.out.println("------------------------------------------------------------------- ");
          System.out.println("new the maneger Add bonus 25% to all the emplooyees And managers");
       System.out.println("------------------------------------------------------------------- ");
  
   
 for(Employees emp: Hmi.getStore().employee){
       float x;
       x=  emp.getSalary() * 25 /100;
       float y;
       y=emp.getSalary() +x;
          System.out.println("(Empliyee) name: "+emp.getName() + " ID:  " + emp.getID() +" Salary: " + y +" RS");
                    
 } 
 
  for(Manager emp: Hmi.getStore().manager){
       float x;
       x=  emp.getSalary_M() * 25 /100;
       float y;
       y=emp.getSalary_M() +x;
          System.out.println("(Manager) name: "+emp.getName() + " ID:  " + emp.getID() +" Salary: " + y +" RS");
                    
 } 
}

    public String getProduct_Name() {
        return Product_Name;
    }





    }
        
       
       
    

