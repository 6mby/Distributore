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
    private Bevanda bevande[];
    private int cont=0;

    public Distributore(int m) {
        bevande = new Bevanda[m];
    }
    
    public boolean addBevanda(Bevanda h) {
        if (cont<bevande.length){
            bevande[cont] = h;
            cont ++;
            Arrays.sort(bevande, (a,b) -> a.nome.compareTo(b.nome));
            return true;
            
        } else {
            return false;
        }
    }
    
    public boolean deleteBevanda(String nome) {
        int i=0;
        boolean t=false;
        
        while (i<cont) {
            if (nome.equals(bevande[i].nome)) {
                while (i++<cont){
                    bevande[i]=bevande[i++];
                }
                cont--;
                t=true;
            }
            i++;
        }
        return t;
    }
    
    public Bevanda[] getBevande() {
        return bevande;
    }
}
