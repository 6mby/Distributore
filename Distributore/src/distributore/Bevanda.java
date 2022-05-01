/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distributore;

/**
 *
 * @author fonta
 */
public class Bevanda {
    private String nome;
    private String capacità;
    private double costo;

    public Bevanda(String nome, String capacità, double costo) {
        this.nome = nome;
        this.capacità = capacità;
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

    public String getCapacità() {
        return capacità;
    }

    public void setCapacità(String capacità) {
        this.capacità = capacità;
    }

    @Override
    public String toString() {
        return nome + " " + capacità + " €" + costo;
    }
    
}
