/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project;


import java.util.*;

/**
 *
 * @author mhass
 */
public class Project {

    
 
     public static void main(String[] args) {
       
         Scanner cin= new Scanner(System.in);
     
             ArrayList<vehicle> vehicles = new ArrayList(50);
         System.out.println("Welcome to garage systems 2.0");
            int Total_space=100;
      
         while(true){
        
            System.out.println("Enter The Garage (1)");
            System.out.println("Exit The Garage (2)");
          
            int a=cin.nextInt();
            String id;
            
            
             if(a == 1)
            {
                System.out.println("empty space = "+Total_space);
                while(true)
                {
                    
                System.out.println("Please Enter The Vehicle ID");
               
                id=cin.next();
                 
                 boolean exist=false;
               
                            for (int i=0; i<vehicles.size() ; i++) {

                               if(vehicles.get(i).getID().equals(id))
                               {

                                   System.out.println("This ID is Already Taken, Try Again (^///^) ");
                                   exist=true;
                                   break;
                               }

                           }
                 
                 if(!exist)break;
                 
                      //break if the id is Availbe(not taken)
               }
                
            
                System.out.println("please Enter The Vehicle Type(Car,Truck,Bus,Motorcycle)");
               
                String Type_of_vehicle=cin.next();
                String tov=Type_of_vehicle.toLowerCase();
                
                
                if(tov.equals("car"))
                {
                    if(Total_space<5  )
                    {
                        System.out.println("There is no space try again later");
                        
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
                        System.out.println("There is no space try again later");
                        
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
                        System.out.println("There is no space try again later");
                        
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
                     if(Total_space<5  )
                    {
                        System.out.println("There is no space try again later");
                        
                    }
                     else{
                    Motorcycle temp = new Motorcycle();
                    temp.setID(id);
                    vehicles.add(temp);
                     Total_space-=temp.len;
                     }
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
            else if (a==0) 
            {
                break;
            }
            else 
            {
                System.out.println("Try Again or type 0 TO EXIT the system");
            }
        
    }
    
    
    }
    
}
