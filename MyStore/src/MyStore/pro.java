/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyStore;

import Main.Hmi;
import static MyStore.User.count;

/**
 *
 * @author shaha
 */
public class pro  {
    
    private String name;
private int visits, v;
private static Store store;
private int T;



   
public pro() {

   
}

   
public pro(String Name) {
 this.name=Name;
   
}

public int getVisits() {
    return visits;
}


public void setVisits(int visits) {
    this.visits = visits;
}



public String getName() {
    return name;
}


public void setName(String name) {
    this.name = name;
}  
   
public void login2(){
      store= Hmi.getStore();
      T= store.getBuot();
      System.out.println(" ");
      System.out.println("------------------- ");
      System.out.println("thare is a user trying to login");
     
     
      System.out.println("welcome " + this.name );
         if(this.T<=2){
         System.out.println("( New Costumer ) ");
    }
    
}






    public static Store getStore() {
        return store;
    }

  
    public static Store getBuot() {
        return store;
    }
}
