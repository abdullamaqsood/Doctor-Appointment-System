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
public class Adult  extends Patient implements Price{
   
    private double price;
    
    public Adult(String a, String b, String c, String d, String e, String f,int g){
        super(a,b,c,d,e,f,g);
     
    }
    public Adult(String a, String b, String c, String d, String f,int g){
          this(a,b,c,"None",d,f,g);
     
    }
    
     public double CalculatePrice(){
        return price=(tax*150)+150;
     };
    
    
    
}
