/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.lords_of_steel;

/**
 *
 * @author polri
 */
public class Arma {
    protected int wpow;
    protected int wvel;
    protected String nomArma;
    
    public Arma(String tipus){
        this.nomArma=tipus.toLowerCase();
        switch(tipus.toLowerCase()){
            case "daga":
                    this.wpow=5;
                    this.wvel=15;
                    break;
            case "espasa":
                    this.wpow=10;
                    this.wvel=10;
                    break;
            case "martell":
                    this.wpow=15;
                    this.wvel=5;
                    break;

        }

    }

    public int getWpow() {
        return wpow;
    }

    public int getWvel() {
        return wvel;
    }

    public String getNomArma() {
        return nomArma;
    }

    public void setNomArma(String nomArma) {
        this.nomArma = nomArma;
    }
}
