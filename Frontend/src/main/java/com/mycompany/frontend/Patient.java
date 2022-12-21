/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.frontend;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Abdullah Maqsood
 */
public class Patient implements Serializable {
    private String name;
    private String age;
    private String phone;
    private String email;
    private String gender;
    private String bgroup;
    private int id;
    private ArrayList<String> record=new ArrayList<>();
    //private String rec="initial";
    private double fees=0.0;
    
    public Patient(String a, String b, String c, String d, String e, String f,int g){
    name=a;
    age=b;
    phone=c;
    email=d;
    gender=e;
    bgroup=f;
    id=g;
    }
    
    //public Patient(String a, String b, String c, String d, String f,int g){
    //this(a,b,c,"Not Entered",d,f,g);
    //}
    
    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }
    public String getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }
    public String getGender(){
        return gender;
    }
    public String getBgroup(){
        return bgroup;
    }
    public int getID(){
        return id;
    }
    public double getFees(){
        return fees;
    }
    public void setFees(double a){
        fees=fees+a;
    }
    
    public void addRecord(String docname,String day){
    record.add(docname+","+day+",");
    //System.out.println("record added");
    //rec="record adeeed";
}
    public String getRecord(){
        String z="";
        for(int i=0;i<record.size();i++){
           z+=record.get(i);
        }
        //System.out.println(rec);
         //JFrame f=new JFrame();  
         //JOptionPane.showMessageDialog(f,z);
        return z;
    }
   // public ArrayList<String> getList(){
   //     return record;
   // }
    
    
    
    public String toString(){
        return "ID: "+ id +"\n"+"Name: "+ name +"\n"+"Age: "+ age +"\n"+"Phone: "+ phone +"\n"+"Email: "+ email +"\n"+"Gender: "+ gender +"\n"+"Blood Group: "+ bgroup;
    }
    
    
    
    
    
    
    
    
    
    
}
