/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyStore;

import Main.Hmi;
import java.util.ArrayList;
import java.util.Random;
import MyStore.Store;
import java.util.Scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author shaha
 */
public class Products {
    private String name;
    private String P_N;
       private String y_N;
    private Products xx;
    private static Store store;
    private String Product_n;
    private float price;
    private long ID_p;
   private Scanner Scn;
     ArrayList<Costomers> costomer;
      ArrayList<Manager> manager;
        ArrayList<Products> Spishal_products ;
           static Products product1=new Products();

    public Products(String name, float price) {
        this.name = name;
        this.price = price;
        this.ID_p=random_num();
        
        this.Spishal_products=new  ArrayList<Products>();
        Hmi.getStore();
        
    }
    

    
    
    
     public int random_num(){
               Random rnd = new Random();
             int n=100000 + rnd.nextInt(999999-100000);
           return n;
      } 

    public Products() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public long getID_p() {
        return ID_p;
    }

    public void setID_p(long ID) {
        this.ID_p = ID;
    }

    public ArrayList<Costomers> getCostomer() {
        return costomer;
    }

  

    public ArrayList<Manager> getManager() {
        return manager;
    }

  public void Is_Exist_spesial(){
  
                try{
              this.Scn =new Scanner(System.in);
              System.out.println("what the name of product you loking for?");
              this.Product_n=Scn.next();
            }
          catch(InputMismatchException e){
              System.out.println("catch ");
              System.out.println(e.getMessage() );
            }
          finally{
          }
          
      P_N= this.Product_n;
      xx=   Get_name(P_N);
      if(xx== null){
           System.out.println("not found");
          
      }else{
       
           System.out.println("("+ P_N +")"+"the releated");
           Print_special_Products1();    
           
            
          System.out.println("------------------------------------- ");
             System.out.println(" ");
             
      }
  }
    
    public Products Get_name(String name){
        store= Hmi.getStore();
        for(Products prob: store.getSpishal_products()){
            if (prob.getName().equals(name)){
                  return prob;
            }
        }
     return null;      
    
}
    

    
     public void special_Products1()  {

          System.out.println(" ");
          System.out.println("---------------------------- ");
           System.out.println("the special Products are: ");
             System.out.println("----------------------------");
             Products A_S =new Products("Disk",4600);
        Products B_S =new Products("chair",1200);
        Products C_S =new Products("Bord",300);
           
          Hmi.getStore().Add_product(A_S); 
          Hmi.getStore().Add_product(B_S);
          Hmi.getStore().Add_product(C_S);
       
      Print_special_Products1();
    }
     
      public static Store getStore() {
        return store;
    }
      
      
        public void Print_special_Products1(){
          for(Products pro: Hmi.getStore().Spishal_products)
          System.out.println("product name: "+pro.getName() + " ID:  " + pro.getID_p() +" Price: " + pro.getPrice()+" RS"); 
        }
        
        
        
}
