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
    protected String nome;
    protected String code;
    protected double costo;
    protected String descrizione;

    public Bevanda(String nome, String code, double costo, String descrizione) {
        this.nome = nome;
        this.code = code;
        this.costo = costo;
        this.descrizione = descrizione;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
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

    @Override
    public String toString() {
        return "Bevanda{" + "nome=" + nome + ", code=" + code + ", costo=" + costo + ", descrizione=" + descrizione + '}';
    }
}
