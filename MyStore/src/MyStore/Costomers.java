/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyStore;
import Main.Hmi;
import java.util.ArrayList;
/**
/**
 *
 * @author shaha
 */
public class Costomers extends User{
private String C_name;
private int visits;
public int  bo;
private static Store store;
private int T;
    
  

public Costomers() {
   setID(++count);
   this.ID= getID(); 
  
}
    

public Costomers(String c_Name) {
   this.C_name=c_Name;
   setID(++count);
   this.ID= getID();
   store=Hmi.getStore();
 
  
   
}

public int getVisits() {
    return visits;
}


public void setVisits(int visits) {
    this.visits = visits;
}

public Costomers(String Name, int ID) {
    super(Name, ID);
}

    public String getC_name() {
        return C_name;
    }

    public void setC_name(String C_name) {
        this.C_name = C_name;
    }


    public static Store getStore() {
        return store;
    }

  
    public static Store getBuot() {
        return store;
    }

    public int getBo() {
        return bo;
    }

    public void setBo(int bo) {
        this.bo = bo;
    }
    
    
}
