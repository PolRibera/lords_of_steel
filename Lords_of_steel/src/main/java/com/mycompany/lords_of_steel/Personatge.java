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
    
    protected double ps; // punts de salut
    protected double pd; // punts de dany
    protected double pa; // prob. d'atacar
    protected double pe; // prob. d'esquivar
    
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
        pd=(força+arma.wpow)/4;
        pa=inteligencia+sort;
        pe=velocitat+sort+inteligencia;
    }
    
    public double getForça() {
        return força;
    }

    public double getConstitucio() {
        return constitucio;
    }

    public double getVelocitat() {
        return velocitat;
    }

    public double getIntelligencia() {
        return inteligencia;
    }

    public double getSort() {
        return sort;
    }

    public double getPs() {
        return ps;
    }

    public double getPd() {
        return pd;
    }

    public double getPa() {
        return pa;
    }

    public double getPe() {
        return pe;
    }
    
        public abstract void mostrarNomTipus();
    
}
