/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author mhass
 */
public class Car extends vehicle{

    public Car() {
    len=5;
   
    }

    @Override
    public double calcMoney(double hours) {
        return hours*10;
    }

}
