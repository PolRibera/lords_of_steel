package com.mycompany.lords_of_steel;
import java.util.Scanner;
import java.util.ArrayList;

public class LordsOfSteel {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Nan n1 = new Nan("Tirion", 8, 6, 13, 16, 16, new Arma("Daga"));
        Huma h1 = new Huma("Luis", 13, 16, 6, 10, 6, new Arma("Espasa"));
        Mitja mi1 = new Mitja("Frodo", 9, 7, 7, 15, 16, new Arma("Martell"));
        Maia ma1 = new Maia("Nil", 7, 9, 12, 15, 17, new Arma("Daga"));
        
        ArrayList<Personatge> personatges = new ArrayList<Personatge>();
        personatges.add(n1);
        personatges.add(h1);
        personatges.add(mi1);
        personatges.add(ma1);
        
        /* Menu principal */
        System.out.println("");
        System.out.println("* Menú principal *");
        System.out.println("1.- Afegir personatge");
        System.out.println("2.- Esborrar personatge");
        System.out.println("3.- Editar personatge");
        System.out.println("4.- Iniciar combat");
        System.out.println("5.- Sortir");
        System.out.println("");
        System.out.print("Tria opció [1-5]: ");
        
        String entrada = sc.nextLine();
        // Comprovar entrada
        int opcio = Integer.parseInt(entrada);
        
        switch (opcio) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                iniciarCombat(personatges);
                break;
            case 5:
                break;
        }
    }
    
    public static void iniciarCombat(ArrayList<Personatge> personatges) {
        boolean[] personatgesActius = new boolean[personatges.size()];
        Personatge[] lluitadors = new Personatge[2];
        for (int i = 1; i <= 2; i++) {
            for (int j = 0; j < personatges.size(); j++) {
                if (!personatgesActius[j]) {
                    String tipus = "";
                    if (personatges.get(j) instanceof Nan) {
                        tipus = "Nan";
                    } else if (personatges.get(j) instanceof Huma) {
                        tipus = "Humà";
                    } else if (personatges.get(j) instanceof Mitja) {
                        tipus = "Mitjà";
                    } else if (personatges.get(j) instanceof Maia) {
                        tipus = "Maia";
                    }

                    System.out.println((j + 1) + ".- " + personatges.get(j).getNom() + "(" + tipus + ")");
                }
            }
            
            System.out.print("Tria un personatge " + i + ": ");
            int opcio = sc.nextInt();
            personatgesActius[opcio - 1] = true;
            
            System.out.println("Personatge triat: " + personatges.get(opcio - 1).getNom());
            lluitadors[i-1]=personatges.get(opcio - 1);
          
        }
        Personatge atacant = lluitadors[0];
        Personatge defensor = lluitadors[1];
        Dau dau1 = new Dau();
        Dau dau2 = new Dau();
        Dau dau3 = new Dau();
        
        do {
            int valor = dau1.llencar()+dau2.llencar()+dau3.llencar();

            System.out.println("Valor dels daus: "+valor);
            
            if (valor<=atacant.getPa()) {
                System.out.println(atacant.getNom()+" pot atacar");
                    int valor2 = dau1.llencar()+dau2.llencar()+dau3.llencar();
                if (valor2 > defensor.getPe()) {
                    System.out.println(defensor.getNom()+" no ha pogut esquivar l'atac");
                    defensor.setPs(defensor.getPs()-atacant.getPd());
                    if (defensor.getPs()>0) {
                       System.out.println(defensor.getNom()+" s'ha quedat amb "+defensor.getPs()+" punts de salut");
                    } else
                        System.out.println(defensor.getNom()+" ha mort!");
                } else
                    System.out.println(defensor.getNom()+" ha pogut esquivar l'atac");

            } else {
                System.out.println(atacant.getNom()+" no pot atacar");
            }
            
        Personatge aux = atacant;
        atacant=defensor;
        defensor=aux;
        } while (defensor.getPs()>0 &&  atacant.getPs()>0);
        

    }    
}