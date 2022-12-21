/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.frontend;

import java.io.Serializable;

/**
 *
 * @author Abdullah Maqsood
 */
public class Child extends Patient implements Price {
    private double price;
    private String guardian;
    
    public Child(String a, String b, String c, String d, String e, String f,int g,String guardian){
        super(a,b,c,d,e,f,g);
        this.guardian=guardian;
    }
   public Child(String a, String b, String c, String d, String f,int g, String guardian){
        this(a,b,c,"None",d,f,g,guardian);
        
    }
    
   public String getGname(){
       return guardian;
   }
     public double CalculatePrice(){
         return price=(tax*75)+75;
     };
    
    
    
}
