/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.lords_of_steel;


/**
 *
 * @author polri
 */
public class MitjaOrdre extends Mitja implements Ordre{
    public MitjaOrdre(String nom, int força, int constitucio, int velocitat, int intelligencia, int sort, Arma arma) {
        super(nom, força, constitucio, velocitat, intelligencia, sort, arma);
    }
}