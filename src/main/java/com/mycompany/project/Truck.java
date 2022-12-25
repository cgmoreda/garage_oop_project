/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author mhass
 */
public class Truck extends vehicle{


    
    @Override
    public double calcMoney(double hours) {
            return (hours*15);
    }
    
    public Truck() {
        len=7;
        
    }
    
}
