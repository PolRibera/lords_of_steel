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
            lluitadors[i - 1] = personatges.get(opcio - 1);

        }
        Personatge atacant = lluitadors[0];
        Personatge defensor = lluitadors[1];
        Dau dau1 = new Dau();
        Dau dau2 = new Dau();
        Dau dau3 = new Dau();

        do {
            int valor = dau1.llencar() + dau2.llencar() + dau3.llencar();
            System.out.println("Valor dels daus: " + valor);

            if (valor <= atacant.getPa()) {
                System.out.println(  atacant.getNom() + " pot atacar" );
                int valor2 = dau1.llencar() + dau2.llencar() + dau3.llencar();
                if (valor2 > defensor.getPe()) {
                    System.out.println( defensor.getNom() + " no ha pogut esquivar l'atac" );
                    defensor.setPs(defensor.getPs() - atacant.getPd());
                    if (defensor.getPs() > 0) {
                        System.out.println(defensor.getNom() + " s'ha quedat amb " + defensor.getPs() + " punts de salut");
                        sc.nextLine();
                    } else
                        System.out.println( defensor.getNom() + " ha mort!"  );
                } else
                    System.out.println(defensor.getNom() + " ha pogut esquivar l'atac"  );

            } else {
                System.out.println(atacant.getNom() + " no pot atacar");
            }

            Personatge aux = atacant;
            atacant = defensor;
            defensor = aux;
        } while (defensor.getPs() > 0 && atacant.getPs() > 0);

    }

    private static void mostraPersonatges(ArrayList<Personatge> personatges) {
        for (int i = 0; i < personatges.size(); i++) {
            System.out.println((i + 1) + ".-" + personatges.get(i).getNom());
        }
    }



}