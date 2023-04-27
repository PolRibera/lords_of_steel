/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.lords_of_steel;


/**
 *
 * @author polri
 */
public class Maia extends Personatge{
    public Maia(int força, int constitucio, int velocitat, int intelligencia, int sort, Arma arma){
        super(força,constitucio,velocitat,intelligencia,sort,arma);
    }
    
    protected void calculDeEstadistiquesDerivades() {
        super.calculDeEstadistiquesDerivades();        
        pe=velocitat+sort+inteligencia+força;

    }
    
    @Override
    public void mostrarNomTipus() {
        System.out.println("Nan");
    }
}
