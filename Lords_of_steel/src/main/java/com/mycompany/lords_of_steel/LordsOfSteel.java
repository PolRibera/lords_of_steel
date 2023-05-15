package com.mycompany.lords_of_steel;
import java.util.Scanner;
import java.util.ArrayList;

public class LordsOfSteel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nan Unai = new Nan("Unai", 8, 6, 13, 16, 16, new Arma("Daga"));
        Huma Dimitri = new Huma("Dimitri", 13, 16, 6, 10, 6, new Arma("Espasa"));
        Mitja Manolo = new Mitja("Manolo", 9, 7, 7, 15, 16, new Arma("Martell"));
        Maia Alberto = new Maia("Alberto", 7, 9, 12, 15, 17, new Arma("Daga"));
        Huma Manel = new Huma("Manel",  13, 15, 7, 10, 6, new Arma("Daga"));

        ArrayList<Personatge> personatges = new ArrayList<Personatge>();
        personatges.add(Unai);
        personatges.add(Dimitri);
        personatges.add(Manolo);
        personatges.add(Alberto);
        personatges.add(Manel);


                            System.out.println("");
            System.out.println("* Benvingut a Terralands *");
        int entrada;
        do {
                            System.out.println("");
            System.out.println("1.- Afegir personatge");
            System.out.println("2.- Esborrar personatge");
            System.out.println("3.- Editar personatge");
            System.out.println("4.- Iniciar combat");
            System.out.println("5.- Sortir");
            System.out.println("");
            System.out.print("Tria opció [1-5]: ");
            entrada = sc.nextInt();

            if (entrada != 5) {
                switch (entrada) {
                    case 1:
                        afegirPersonatge(personatges);
                        break;
                    case 2:
                        borrarPersonatge(personatges);
                        break;
                    case 3:
                        editarPersonatge(personatges);
                        break;
                    case 4:
                        iniciarCombat(personatges);
                        break;
                    case 5:
                        System.out.println("¡Gracies per jugar!");
                        break;
                    default:
                        break;
                }
            }
        } while (entrada != 5);
    }

    public static void afegirPersonatge(ArrayList<Personatge> personatges) {
        System.out.println("* Afegir personatge *");
        System.out.println("");
        System.out.println("Has de repartir 60 punts per les habilitats, " +
                "totes les habilitates han de tenir minim 3 punts i maxim 18 punts");
        System.out.println("");

        Scanner sc = new Scanner(System.in);

        System.out.print("Nom: ");
        String nom = sc.next();

        System.out.print("Tipus [Huma, Maia, Mitja, Nan]:");
        String tipus = sc.next();

        System.out.print("Força: ");
        int força = Integer.parseInt(sc.next());

        System.out.print("Consistencia: ");
        int cons = Integer.parseInt(sc.next());

        System.out.print("Velocitat: ");
        int vel = Integer.parseInt(sc.next());

        System.out.print("Inteligencia: ");
        int intel = Integer.parseInt(sc.next());

        System.out.print("Sort: ");
        int sort = Integer.parseInt(sc.next());

        System.out.print("Arma [Daga,Espasa,Martell]:");
        String arma = sc.next();


        Personatge nou = null;
        tipus= tipus.toLowerCase();
            if (força+cons+vel+intel+sort<=60) {
                if (tipus.equals("huma")) {
                nou = new Huma(nom.toLowerCase(), força, cons, vel, intel, sort, new Arma(arma.toLowerCase()));
            } else if (tipus.equals("mitja")) {
                nou = new Mitja(nom.toLowerCase(), força, cons, vel, intel, sort, new Arma(arma.toLowerCase()));
            } else if (tipus.equals("nan")) {
                nou = new Nan(nom.toLowerCase(), força, cons, vel, intel, sort, new Arma(arma.toLowerCase()));
            } else if (tipus.equals("maia")) {
                nou = new Maia(nom.toLowerCase(), força, cons, vel, intel, sort, new Arma(arma.toLowerCase()));
            }

            personatges.add(nou);
            mostraPersonatges(personatges);
            System.out.println("Personatge afegit amb èxit!");
        } else {
                System.out.println("Els punts maxim per el personatge nou son 60 punts");
            }
        
    }

    public static void borrarPersonatge(ArrayList<Personatge> personatges) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Personatges existens");
        mostraPersonatges(personatges);
        System.out.println("Quin personatge vols esborrar?");
        int tria = sc.nextInt();
        personatges.remove(tria - 1);
        mostraPersonatges(personatges);
    }

    public static void editarPersonatge(ArrayList<Personatge> personatges) {
        Scanner sc = new Scanner(System.in);
        System.out.println("* Editar personatge *");
        System.out.println("");
        mostraPersonatges(personatges);
        System.out.print("Tria el numero del personatge que vols editar: ");
        int index = sc.nextInt() - 1;

        Personatge personatge = personatges.get(index);
        System.out.println("");
        System.out.println("Nom: " + personatge.getNom());
        System.out.println("Tipus: " + personatge.getClass().getSimpleName());
        System.out.println("Nivell: "+personatge.getLVL());
        System.out.println("EXP: "+personatge.getEXP());
        System.out.println("Força: " + personatge.getForça());
        System.out.println("Consistencia: " + personatge.getConstitucio());
        System.out.println("Velocitat: " + personatge.getVelocitat());
        System.out.println("Inteligencia: " + personatge.getIntelligencia());
        System.out.println("Sort: " + personatge.getSort());
        System.out.println("Arma: " + personatge.getArma().getNomArma());
        System.out.println("");
        System.out.println("Introdueix els nous valors (o prem enter per deixar els mateixos valors):");

        System.out.print("Nom (" + personatge.getNom() + "): ");
        String nom = sc.next();
        
        System.out.print("Tipus (" + personatge.getClass().getSimpleName() + "): ");
        String tipus = sc.next();
        
        System.out.println("Punts Maxim: "+personatge.getMAXp());
        if (!tipus.isEmpty()) {
            System.out.print("Força: ");
            int força = Integer.parseInt(sc.next());

            System.out.print("Consistencia: ");
            int cons = Integer.parseInt(sc.next());

            System.out.print("Velocitat: ");
            int vel = Integer.parseInt(sc.next());

            System.out.print("Inteligencia: ");
            int intel = Integer.parseInt(sc.next());

            System.out.print("Sort: ");
            int sort = Integer.parseInt(sc.next());

            System.out.print("Arma [Daga,Espasa,Martell]:");
            String arma = sc.next();

          if (força+cons+vel+intel+sort<=personatges.get(index).getMAXp()) {  
            if (tipus.equalsIgnoreCase("huma")) {
                personatges.set(index, new Huma(nom, força, cons, vel, intel, sort,new Arma(arma)));
            } else if (tipus.equalsIgnoreCase("mitja")) {
                personatges.set(index, new Mitja(nom, força, cons, vel, intel, sort,new Arma(arma)));
            } else if (tipus.equalsIgnoreCase("nan")) {
                personatges.set(index, new Nan(nom, força, cons, vel, intel, sort,new Arma(arma)));
            } else if (tipus.equalsIgnoreCase("maia")) {
                personatges.set(index, new Maia(nom, força, cons, vel, intel, sort,new Arma(arma)));
            } else {
                System.out.println("El tipus introduit no és vàlid.");
            } 
           } else {
              System.out.println("Has superat el numero de punts maxim per aquest personatge.");
          }
          personatges.get(index).calculDeEstadistiquesDerivades();
        }

    }


    public static void iniciarCombat(ArrayList<Personatge> personatges) {
        Scanner sc = new Scanner(System.in);
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
            System.out.print("Escull la devocio del personatge [Caos / Ordre]: ");
            String devocio = sc.next();
            if (devocio.toLowerCase().equals("ordre")) {
                switch (personatges.get(opcio - 1).mostrarNomTipus()){
                    case "Nan":
                            NanOrdre NO1 = new NanOrdre(personatges.get(opcio - 1).getNom(), personatges.get(opcio - 1).getForça(), personatges.get(opcio - 1).getConstitucio(), personatges.get(opcio - 1).getVelocitat(), personatges.get(opcio - 1).getInteligencia(), personatges.get(opcio - 1).getSort(),personatges.get(opcio - 1).getArma());
                            lluitadors[i - 1] = NO1;
                            break;
                    case "Humà":
                            HumaOrdre HO1 = new HumaOrdre(personatges.get(opcio - 1).getNom(), personatges.get(opcio - 1).getForça(), personatges.get(opcio - 1).getConstitucio(), personatges.get(opcio - 1).getVelocitat(), personatges.get(opcio - 1).getInteligencia(), personatges.get(opcio - 1).getSort(),personatges.get(opcio - 1).getArma());
                            lluitadors[i - 1] = HO1;
                            break;
                    case "Mitjà":
                            MitjaOrdre MO1 = new MitjaOrdre(personatges.get(opcio - 1).getNom(), personatges.get(opcio - 1).getForça(), personatges.get(opcio - 1).getConstitucio(), personatges.get(opcio - 1).getVelocitat(), personatges.get(opcio - 1).getInteligencia(), personatges.get(opcio - 1).getSort(),personatges.get(opcio - 1).getArma());
                            lluitadors[i - 1] = MO1;
                            break;
                    case "Maia":
                            MaiaOrdre MaO1 = new MaiaOrdre(personatges.get(opcio - 1).getNom(), personatges.get(opcio - 1).getForça(), personatges.get(opcio - 1).getConstitucio(), personatges.get(opcio - 1).getVelocitat(), personatges.get(opcio - 1).getInteligencia(), personatges.get(opcio - 1).getSort(),personatges.get(opcio - 1).getArma());
                            lluitadors[i - 1] = MaO1;                       
                            break;
                    default:
                            break;
                }
            } else if (devocio.toLowerCase().equals("caos")) {
                  switch (personatges.get(opcio - 1).mostrarNomTipus()){
                    case "Nan":
                            NanCaos NC1 = new NanCaos(personatges.get(opcio - 1).getNom(), personatges.get(opcio - 1).getForça(), personatges.get(opcio - 1).getConstitucio(), personatges.get(opcio - 1).getVelocitat(), personatges.get(opcio - 1).getInteligencia(), personatges.get(opcio - 1).getSort(),personatges.get(opcio - 1).getArma());
                            lluitadors[i - 1] = NC1;
                            break;
                    case "Humà":
                            HumaCaos HC1 = new HumaCaos(personatges.get(opcio - 1).getNom(), personatges.get(opcio - 1).getForça(), personatges.get(opcio - 1).getConstitucio(), personatges.get(opcio - 1).getVelocitat(), personatges.get(opcio - 1).getInteligencia(), personatges.get(opcio - 1).getSort(),personatges.get(opcio - 1).getArma());
                            lluitadors[i - 1] = HC1;
                            break;
                    case "Mitjà":
                            MitjaCaos MC1 = new MitjaCaos(personatges.get(opcio - 1).getNom(), personatges.get(opcio - 1).getForça(), personatges.get(opcio - 1).getConstitucio(), personatges.get(opcio - 1).getVelocitat(), personatges.get(opcio - 1).getInteligencia(), personatges.get(opcio - 1).getSort(),personatges.get(opcio - 1).getArma());
                            lluitadors[i - 1] = MC1;
                            break;
                    case "Maia":
                            MaiaCaos MaC1 = new MaiaCaos(personatges.get(opcio - 1).getNom(), personatges.get(opcio - 1).getForça(), personatges.get(opcio - 1).getConstitucio(), personatges.get(opcio - 1).getVelocitat(), personatges.get(opcio - 1).getInteligencia(), personatges.get(opcio - 1).getSort(),personatges.get(opcio - 1).getArma());
                            lluitadors[i - 1] = MaC1;
                            break;
                    default:
                            break;
                }
            }
            

        }
        Personatge atacant = lluitadors[0];
        Personatge defensor = lluitadors[1];
        Dau dau1 = new Dau();
        Dau dau2 = new Dau();
        Dau dau3 = new Dau();
        Personatge guanyador=atacant;
        Personatge perdedor=defensor;
        do {
                        sc.nextLine();
            int valor = dau1.llencar() + dau2.llencar() + dau3.llencar();
            System.out.println("Valor dels daus: " + valor);

            if (valor <= atacant.getPa()) {
                System.out.println(  atacant.getNom() + " pot atacar" );
                int valor2 = dau1.llencar() + dau2.llencar() + dau3.llencar();
                if (valor2 > defensor.getPe()) {
                    System.out.println( defensor.getNom() + " no ha pogut esquivar l'atac" );
                    defensor.setPs(defensor.getPs() - atacant.getPd());
                        if (atacant instanceof Ordre) {
                            atacant.restauraPS();
                            System.out.println(atacant.getNom()+" ha restaurat un 10% de PS ja que te equipada la devocio Ordre");
                            System.out.println(atacant.getNom() + " s'ha quedat amb " + atacant.getPs() + " punts de salut");
                            
                        }
                    if (defensor.getPs() > 0) {
                        System.out.println(defensor.getNom() + " s'ha quedat amb " + defensor.getPs() + " punts de salut");
                    } else
                        System.out.println( defensor.getNom() + " ha mort!");
                        guanyador = atacant;
                        perdedor = defensor;
                } else {
                    System.out.println(defensor.getNom() + " ha pogut esquivar l'atac"  );
                        if (defensor instanceof Caos) {
                               if (defensor.Contraatact(dau1,dau2,dau3)) {
                                System.out.println(defensor.getNom()+" ha pogut contraatacar!");
                                atacant.setPs(atacant.getPs() - (defensor.getPd()/2));
                                if (atacant.getPs() > 0) {
                                    System.out.println(atacant.getNom() + " s'ha quedat amb " + atacant.getPs() + " punts de salut");
                                } else
                                    System.out.println( atacant.getNom() + " ha mort!");
                                    guanyador = defensor;
                                    perdedor = atacant;
                            } else {
                                   System.out.println(defensor.getNom()+" no ha pogut contraatacar!");
                               }
                        }
                }

            } else {
                System.out.println(atacant.getNom() + " no pot atacar");
            }

            Personatge aux = atacant;
            atacant = defensor;
            defensor = aux;

        } while (defensor.getPs() > 0 && atacant.getPs() > 0);
        int MAXPsPerdedor=0;
        for (int i = 0; i < personatges.size(); i++) {
            if (personatges.get(i).getNom().equals(perdedor.getNom())) {
                MAXPsPerdedor=personatges.get(i).getPs();
            }
        }
        for (int i = 0; i < personatges.size(); i++) {
            if (personatges.get(i).getNom().equals(guanyador.getNom())) {
                personatges.get(i).pujarEXP(MAXPsPerdedor*10);
            }
        }
    }

    private static void mostraPersonatges(ArrayList<Personatge> personatges) {
        for (int i = 0; i < personatges.size(); i++) {
            System.out.println((i + 1) + ".-" + personatges.get(i).getNom());
        }
    }



}