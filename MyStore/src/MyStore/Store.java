/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyStore;

import Main.Hmi;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Store {
   private String name;
   private String Product_Name;
   private Scanner Scn;
   private String y_N;
   private String y_N_b;
   private String product_n;
   private Products xx;
   private float total_price;
   private int Buot;
   private Costomers c= new Costomers();
    private int Total_Buot;
      ArrayList<Costomers> costomer; 
      ArrayList<pro> pro; 
      ArrayList<Employees> employee;
      ArrayList<Products> product; 
      ArrayList<Manager> manager; 
      ArrayList<Products> Spishal_products ;
      ArrayList cart = new ArrayList();

    public Store(String name) {
        this.name = name;
        this.initopject();
     
    }

    public Store() {
        this.initopject();    
    }
    
       public Store(Store store) {   
        this.initopject();  
        
    }
    
     private void initopject(){
        this.costomer=new ArrayList<Costomers>();
           this.pro=new ArrayList<pro>();
        this.employee=new ArrayList<Employees>();
        this.product=new  ArrayList<Products>();
        this.Spishal_products=new  ArrayList<Products>();
        this.manager=new  ArrayList<Manager>();
    }
     
     /////////////////          Add        ////////////////
    public void Add_costomer_to_store(Costomers costomer){
        this.costomer.add(costomer);
    }
    
     public void Adda_costomer_to_store(pro costomer){
        this.pro.add(costomer);
    }
    
    public void Add_employee_to_store(Employees employee){
        this.employee.add(employee);
    }  
      
    public void Add_product_to_store(Products product){
        this.product.add(product);
    }  
    
      public void Add_Manager_to_store(Manager manager){
        this.manager.add(manager);
    }  
    
    public void Add_product(Products product){
          this.Spishal_products.add(product);
       
    } 
    
     
        /////////////////          Print       ////////////////
     
     
    public void Print_All_costomers(){
       for(Costomers costomers: Hmi.getStore().getCostomer())
     
       System.out.println("(new user) name: "+costomers.getName() + " ID:  " + costomers.getID() +" Visits: " + costomers.getVisits());
  
    }
     
    public void print_Employee()  {
      for(Employees emp: Hmi.getStore().getEmployee())
      System.out.println("(Employee) name: "+emp.getName() + " ID:  " + emp.getID() +" Salary: " + emp.getSalary() +" RS");   
    }
    
    
    public void print_Products()  {
      System.out.println(" ");
      System.out.println("------------------- ");
      System.out.println("The products Avalible Are: ");
      for(Products pro: Hmi.getStore().getProduct())
      System.out.println("product name: "+pro.getName() + " ID:  " + pro.getID_p() +" Price: " + pro.getPrice()+" RS"); 
    }
    
    
   
    
    
    public void print_Manager()  {
      for(Manager emp: Hmi.getStore().getManager())
      System.out.println("(Manager ) name: "+emp.getName() + " ID:  " + emp.getID() +" Salary: " + emp.getSalary()+" RS");   
    }
    
    ////////////////////////  Serch ////////////////////////////////////
    public void Is_Exist_byname(){
         
    }
    
    public Products Get_name(String name){ 
        for(Products prob: this.getProduct()){
            if (prob.getName().equals(name)){
                  return prob;
            }
        }
     return null;      
    }  
    
    public void Any_Thing_Else(){
    
       System.out.println("do you want any thing else?");
              this.y_N=Scn.next();
            if(y_N.equalsIgnoreCase("No")){
                
                if( total_price==0){
                      System.out.println("thanks for visiting");
                }
                else{
                    System.out.println("whith total price:" + total_price +" RS");
                    total_price=0;
                   
                    System.out.println("thanks for buying");
                     Buot = Buot + 1;
                  
                    
                     System.out.println(this.Buot);
                }
                
            }else if(y_N.equalsIgnoreCase("yes")){
                Is_Exist_byname(); 
            }else{
               doing();
    }
}
    
    
    
  ///////////////////////////////// buy ///////////////////////////////////  
    
    public void buy(){
              cart.add(xx);
              total_price= total_price +  xx.getPrice();
              remove_Product();
             Any_Thing_Else();
    }
  
 
    public void remove_Product(){
    this.product.remove(xx);
    }

    /////////////////          Gitter & Sitter       ////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Costomers> getCostomer() {
        return costomer;
    }

    public ArrayList<Employees> getEmployee() {
        return employee;
    }


    public ArrayList<Products> getProduct() {
        return product;
    }

    public ArrayList<Products> getSpishal_products() {
        return Spishal_products;
    }


  


    public ArrayList<Manager> getManager() {
        return manager;
    }


    public int getBuot() {
        return this.Buot;
    }

    public void setBuot(int Buot) {
        this.Buot = Buot;
    }
    
    public void doing(){
         do{
                   
             this.y_N_b=Scn.next();
           if(y_N_b.equalsIgnoreCase("No")){ 
             System.out.println("whith total price:" + total_price +" RS");
             this.Buot = this.Buot++;   
             total_price=0;
             System.out.println("thanks for buy");
               break;
           }else if(y_N_b.equalsIgnoreCase("yes")){
               Is_Exist_byname();
               break;
           }
          }while( !y_N_b.equalsIgnoreCase("yes")||!y_N_b.equalsIgnoreCase("no"));         
    }

    public int print_bout(){
        int x =getBuot();
        return x;  
    }

    public int getTotal_Buot() {
        return Total_Buot;
    }

    public void setTotal_Buot(int Total_Buot) {
        this.Total_Buot = Total_Buot;
    }
    




//public Costomers Ge_cos(Costomers c){ 
 //       for(Costomers cc: this.costomer){
  //          if (cc.getID()==(c.ID)){
  //                return c;
  //          }
  //      }
  //   return null;      
  //  }  

public void login(Costomers c){


         System.out.println(" ");
      System.out.println("---------------------------------- ");
      System.out.println("thare is a user trying to login");
       System.out.println("---------------------------------- ");
      System.out.println("welcome " +  c.getC_name() );
         if(c.getVisits()<=2){
         System.out.println("( New Costumer ) " +"id: "+ c.getID()+ ", name: "+ c.getC_name() + ", Visits : " +c.getVisits()+" time(s)");  
    }
         else if(c.getVisits()>2) {
          System.out.println("( Spicial Costumer )" +"your id: "+ c.getID()+ ", name : "+ c.getC_name() + ", Visits  : "+c.getVisits()+" time(s)"); 
    }   
           try{
              this.Scn =new Scanner(System.in);
              System.out.println("what the name of product you loking for?");
              this.Product_Name=Scn.next();
            }
          catch(InputMismatchException e){
              System.out.println("catch ");
              System.out.println(e.getMessage() );
            }
          finally{
          }
          
      product_n= this.Product_Name;
      xx=   Get_name(product_n);
      if(xx== null){
           System.out.println("not found");
           Any_Thing_Else();    
      }else{
           System.out.println("the products Avalible:");
           System.out.println("the Data of products :");   
           System.out.println("_____________________________________________________________________");
           System.out.println("");
           System.out.println("ID: " + xx.getID_p() + "    Name of Product: "+ xx.getName() + "      Price: " + xx.getPrice() +" RS");
           System.out.println("_____________________________________________________________________");
           System.out.println("Do you want to buy? (yes,no) ");
           this.y_N=Scn.next();
           if (y_N.equalsIgnoreCase("yes")){
                buy();
            }else if (y_N.equalsIgnoreCase("No")){      
                 System.out.println("do you want any thing else?");
              this.y_N=Scn.next();
            if(y_N.equalsIgnoreCase("No")){
                
                if( total_price==0){
                      System.out.println("thanks for visiting");
                }
                else{
                    System.out.println("whith total price:" + total_price +" RS");
                    total_price=0;
                   
                    System.out.println("thanks for buying");
                     c.setVisits(c.bo++);  
                }
                
            }else if(y_N.equalsIgnoreCase("yes")){
                Is_Exist_byname(); 
            }else{
               doing();
    }
           }         
       }
        
}

    
}
