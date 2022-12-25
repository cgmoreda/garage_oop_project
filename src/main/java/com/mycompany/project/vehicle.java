/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author mhass
 */
public  class  vehicle {
   
 protected   int len;
  protected   String ID;
  

    
    public vehicle() {
    
    }
    public String getID() {
        return ID;
    }

    public int getLen() {
        return len;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setLen(int len) {
        this.len = len;
    }
    
    public  double calcMoney(double hours){
    return 0;
    }

    
    @Override
    public  String toString() {
        return "vehicle{" + "len=" + len + ", ID=" + ID + '}';
    }

  
}
