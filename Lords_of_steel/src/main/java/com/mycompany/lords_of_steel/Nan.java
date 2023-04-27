/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.lords_of_steel;

/**
 *
 * @author polri
 */
public class Nan extends Personatge{
    public Nan(int força, int constitucio, int velocitat, int intelligencia, int sort, Arma arma){
        super(força,constitucio,velocitat,intelligencia,sort,arma);
    }
    
    @Override
    protected void calculDeEstadistiquesDerivades() {
        super.calculDeEstadistiquesDerivades();
        pd=(força+arma.getWpow()+constitucio)/4;

    }

    @Override
    public void mostrarNomTipus() {
        System.out.println("Nan");
    }
}
