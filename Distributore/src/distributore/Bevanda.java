/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package distributore;

/**
 *
 * @author Studente
 */
public class Bevanda {
    private String nome;
    private double costo;
    
    public Bevanda(String nome, double costo) {
        this.nome = nome;
        this.costo = costo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
