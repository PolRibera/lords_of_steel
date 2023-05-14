/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.lords_of_steel;

/**
 *
 * @author polri
 */
public class Huma extends Personatge{
    public Huma(String nom,int força, int constitucio, int velocitat, int intelligencia, int sort,Arma arma){
        super(nom,força,constitucio,velocitat,intelligencia,sort, arma);
    }
    
    protected void calculDeEstadistiquesDerivades() {
        super.calculDeEstadistiquesDerivades();        
        ps=constitucio+força+inteligencia;

    }
    
    @Override
    public void mostrarNomTipus() {
        System.out.println("Humà");
    }
}