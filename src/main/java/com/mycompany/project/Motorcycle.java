/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author mhass
 */
public class Motorcycle extends vehicle{

    public Motorcycle() {
        len=2;
        
    }
    @Override
    public double calcMoney(double hours) {
        return hours*5;
    }
     public String toString() {
      return  "Motorcycle{" + " ID=" + ID + " , Occupied Space = "+len+'}';
    }
    
    
}
