/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distributore;

import java.util.Arrays;

/**
 *
 * @author fonta
 */
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

    public void riempi() {
        for (int i=0; i<capienza; i++) {
            coca[i] = new Bevanda("Coca Cola", "33 cl", 1);
            fanta[i] = new Bevanda("Fanta", "33 cl", 0.90);
            acquam[i] = new Bevanda("Acqua Minerale", "0,5 l", 0.50);
            acquaf[i] = new Bevanda("Acqua Frizzante", "0,5 l", 0.50);
            thel[i] = new Bevanda("The al limone", "0,5 l", 1.20);
            thep[i] = new Bevanda("The alla pesca", "0,5 l", 1.20);
        }
        c=capienza;
        f=capienza;
        am=capienza;
        af=capienza;
        tl=capienza;
        tp=capienza;
    }

    public Bevanda eroga(int m) {
        switch (m) {
            case 1:
                if (c!=0) {
                    c--;
                    return coca[c];
                } else {
                    return null;
                }
            case 2:
                if (f!=0) {
                    f--;
                    return fanta[f];
                } else {
                    return null;
                }
            case 3:
                if (am!=0) {
                    am--;
                    return acquam[am];
                } else {
                    return null;
                }
            case 4:
                if (af!=0) {
                    af--;
                    return acquaf[af];
                } else {
                    return null;
                }
            case 5:
                if (tl!=0) {
                    tl--;
                    return thel[tl];
                } else {
                    return null;
                }
            case 6:
                if (tp!=0) {
                    tp--;
                    return thep[tp];
                } else {
                    return null;
                }
            default: 
                return null;
        }
    }

    public int[] inventario() {
        int[] i= {c, f, am, af, tl, tp};
        return i;
    }
    
    public Bevanda[] getOp() {
        Bevanda[] a = {new Bevanda("Coca Cola", "33 cl", 1), new Bevanda("Fanta", "33 cl", 0.90),
            new Bevanda("Acqua Minerale", "0,5 l", 0.50), new Bevanda("Acqua Frizzante", "0,5 l", 0.50),
            new Bevanda("The al limone", "0,5 l", 1.20), new Bevanda("The alla pesca", "0,5 l", 1.20)};
        
            return a;
        }

    public int getCapienza() {
        return capienza;
    }
    
}
