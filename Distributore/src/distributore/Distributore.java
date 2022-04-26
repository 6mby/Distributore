package Distributore;

import java.util.Scanner;

public class Distributore {
    
    private int capienza;
    private Bevanda coca[];
    private int c = 0;
    private Bevanda fanta[];
    private int f = 0;
    private Bevanda acquam[];
    private int am = 0;
    private Bevanda acquaf[];
    private int af = 0;
    private Bevanda thel[];
    private int tl = 0;
    private Bevanda thep[];
    private int tp = 0;

    // Metodo Costruttore inizializzato con il numero di bibite
    public Distributore(int capienza) {
        this.capienza=capienza;
        coca = new Bevanda[capienza];
        fanta = new Bevanda[capienza];
        acquam = new Bevanda[capienza];
        acquaf = new Bevanda[capienza];
        thel = new Bevanda[capienza];
        thep = new Bevanda[capienza];
    }

    Scanner in = new Scanner(System.in);

    // Metodo che restituisce il totale di lattine nel distributore
    public int () {
        int totale = Coca + Fanta + Acqua;
        return totale;
    }

    // Metodo che stampa il menù di scelta bibite e relative quantità
    public void seleziona() {
        System.out.println("*** ECCO IL DISTRIBUTORE***");
        System.out.println(" 1 - Coca Cola _ quantità : " + Coca);
        System.out.println(" 2 - Fanta _ quantità : " + Fanta);
        System.out.println(" 3 - Acqua _ quantità : " + Acqua);
    }

    // Metodo per l'acquisto di una bibita scelta
    public void compra(int a) {
        System.out.println("Inserisci il gettone : (g)");
        String g = in.nextLine();
        if (g.equalsIgnoreCase("g")) {
            if (a == 1 && Coca > 0) {
                int temp = Coca;
                Coca = temp - 1;
                gettone++;
            }

            if (a == 2 && Fanta > 0) {
                int temp = Fanta;
                Fanta = temp - 1;
                gettone++;
            }

            if (a == 3 && Acqua > 0) {
                int temp = Acqua;
                Acqua = temp - 1;
                gettone++;
            }

            if (a != 1 && a != 2 && a != 3) {
                System.out.println("Bibita non presente");
            }
        } else {
            System.out.println("Gettone non inserito");
        }
    }

    // Metodo per l'aggiunta di nuove bibite nel distributore
    public void inserisci(int a, int q) {
        if (a == 1) {
            int temp = Coca;
            Coca = temp + q;
        }

        if (a == 2) {
            int temp = Fanta;
            Fanta = temp + q;
        }

        if (a == 3) {
            int temp = Acqua;
            Acqua = temp + q;
        }

        if (a != 1 && a != 2 && a != 3) {
            System.out.println("Bibita non presente");
        }
    }

}
