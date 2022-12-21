/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.frontend;

/**
 *
 * @author Abdullah Maqsood
 */
public class CustomException extends Exception {
    private String message;
    public CustomException(){
        this.message="This doctor name is not valid.";
    }
    public String toString(){
        return message;
    }
    
}
