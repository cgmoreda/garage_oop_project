/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author mhass
 */
public class Bus extends vehicle{

    public Bus() {
        len=10;
    }

    
    @Override
    public double calcMoney(double hours) {
       
        return (hours*15);
    }
    
    
}
