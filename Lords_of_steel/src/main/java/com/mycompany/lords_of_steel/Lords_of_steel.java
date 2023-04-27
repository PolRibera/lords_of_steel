/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lords_of_steel;

/**
 *
 * @author polri
 */
public class Lords_of_steel {

    public static void main(String[] args) {
        Nan n1 = new Nan(8,6,13,16,16,new Arma("Daga"));
        System.out.println("Els punts de dany del nan es: "+n1.getPd());
        System.out.println("Els punts de salud del nan es: "+n1.getPs());
        
    }
}
