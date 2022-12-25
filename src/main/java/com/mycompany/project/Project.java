/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project;


import java.util.*;

/**
 *
 * @author cgmoreda
 * @author Elglaly
 *  AUN Software Engineering Project
 * By Mohamed Reda Hassanien and Sherif Ashraf Ali 
 * 
 */
public class Project {

    
 
     public static void main(String[] args) {
       
         Scanner cin= new Scanner(System.in);
     
             ArrayList<vehicle> vehicles = new ArrayList(50);
         System.out.println("Welcome to garage systems 2.0\n");
            int Total_space=100;
      
         while(true){
        
            System.out.println("Enter (1) To add a vehicle");
            System.out.println("Enter (2) To Leave The Garage  ");
            System.out.println("Enter (3) To show Sataus of The Garage");
            System.out.println("Enter (0) End the Program\n");
          
            int a=cin.nextInt();
            String id;
            
            
             if(a == 1)
            {
                System.out.println("Empty space = "+Total_space);
                while(true)
                {
                    
                System.out.println("Please Enter The Vehicle ID\n");
               
                id=cin.next();
                 
                 boolean exist=false;
               
                            for (int i=0; i<vehicles.size() ; i++) {

                               if(vehicles.get(i).getID().equals(id))
                               {

                                   System.out.println("This ID is Already Taken, Try Again  \n");
                                   exist=true;
                                   break;
                               }

                           }
                 
                 if(!exist)break;
                 
                      //break if the id is Availbe(not taken)
               }
                
            
                System.out.println("please Enter The Vehicle Type From This List (Car,Truck,Bus,Motorcycle)\n");
               
                String Type_of_vehicle=cin.next();
                String tov=Type_of_vehicle.toLowerCase();
                
                
                if(tov.equals("car"))
                {
                    if(Total_space<5  )
                    {
                        System.out.println("There is no space try again later\n");
                        
                    }
                    else 
                    {
                    Car temp = new Car();
                    
                    temp.setID(id);
                    
                     Total_space-=temp.len;
                    vehicles.add(temp);
                    }
                    
                    
                }
                else if(tov.equals("truck")) 
                {  
                     if(Total_space<7  )
                    {
                        System.out.println("There is no space try again later\n");
                        
                    }
                  
                    else {
                    Truck temp = new Truck();
                    
                    temp.setID(id);
                    
                    vehicles.add(temp);
                     Total_space-=temp.len;
                    }
                 }
                else if(tov.equals("bus"))
                {  
                     if(Total_space<10 )
                    {
                        System.out.println("There is no space try again later\n");
                        
                    }
                     else {
                    Bus temp = new Bus();
                    
                    temp.setID(id);
                    
                    vehicles.add(temp);
                    
                     Total_space-=temp.len;
                        }
                }
                else if(tov.equals("motorcycle"))
                {
                     if(Total_space<2  )
                    {
                        System.out.println("There is no space try again later\n");
                        
                    }
                     else{
                    Motorcycle temp = new Motorcycle();
                    temp.setID(id);
                    vehicles.add(temp);
                     Total_space-=temp.len;
                     }
                }
                else
                {
                    
                    System.out.println("Failed to add vehicle (vehicle Type is not supported) \n");

                }
                
                
            }
            else if(a==2){
                 
                 while(true)
                 {
                    
                 System.out.println("Enter ID of the Vehicle ");
                 id=cin.next();
               
                 boolean exist=false;
               
                            for (int i=0; i<vehicles.size() ; i++) {

                               if(vehicles.get(i).getID().equals(id))
                               {
                                     System.out.println("Enter Hours");
                                     double Hours=cin.nextDouble();
              
                                   System.out.println("Total Cost is "+vehicles.get(i).calcMoney(Hours));
                                   vehicles.remove(i);
                                   Total_space+=vehicles.get(i).len;
                                   exist=true;
                                   break;
                               }
                           }
                             if(exist)break;
                 }
            }
            
            else if(a==3)
            {
                for(int i=0;i<vehicles.size();i++)
                {
                    System.out.println("Position "+(i+1)+" : "+vehicles.get(i).toString());
                    
                }
                System.out.println("Total Occupied space = "+(100-Total_space)); 
                System.out.println("Total Empty space = "+(Total_space));
                System.out.println();
                
            }
            
            else if (a==0) 
            {
                System.out.println("Thanks for using Garage System 2.0");
                break;
            }
            else 
            {
                System.out.println("Try Again or Type 0 TO EXIT the system\n");
            }
        
    }
    
    
    }
    
}
