/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.lords_of_steel;

/**
 *
 * @author polri
 */
public abstract class Personatge {
    protected int força;
    protected int constitucio;
    protected int velocitat;
    protected int inteligencia;
    protected int sort;
    protected Arma arma;
    
    //Estadistiques derivades
    
    protected int ps; // punts de salut
    protected int pd; // punts de dany
    protected int pa; // prob. d'atacar
    protected int pe; // prob. d'esquivar
    
    public Personatge(int força, int constitucio, int velocitat, int intelligencia, int sort, Arma arma) {
        this.força          =força;
        this.constitucio    =constitucio;
        this.velocitat      =velocitat;
        this.inteligencia   =intelligencia;
        this.sort           =sort;
        this.arma=arma;
        
        calculDeEstadistiquesDerivades();
    }


    protected void calculDeEstadistiquesDerivades() {
        ps=constitucio+força;
        pd=(força+arma.getWpow())/4;
        pa=inteligencia+sort+arma.getWvel();
        pe=velocitat+sort+inteligencia;
    }
    
    public int getForça() {
        return força;
    }

    public int getConstitucio() {
        return constitucio;
    }

    public int getVelocitat() {
        return velocitat;
    }

    public int getIntelligencia() {
        return inteligencia;
    }

    public int getSort() {
        return sort;
    }

    public int getPs() {
        return ps;
    }

    public int getPd() {
        return pd;
    }

    public int getPa() {
        return pa;
    }

    public int getPe() {
        return pe;
    }
    
        public abstract void mostrarNomTipus();
    
}
