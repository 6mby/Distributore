/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package distributore;

import javax.swing.JOptionPane;

/**
 *
 * @author fonta
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] i;
        String scelta = null, user, pass = "aaa", p;
        Bevanda b = null;
        Distributore d = new Distributore(7);
        d.riempi();
        Bevanda[] o = d.getOp();

        String[] usermode = {"Cliente", "Amministratore", "Spegnimento"};
        String[] administratorOptions = {"Rifornisci", "Visualizza inventario", "Esci"};
        String[] optionsToChoose = {o[0].toString(), o[1].toString(),
            o[2].toString(), o[1].toString(), o[3].toString(),
            o[4].toString(), o[5].toString(), "Esci"
        };

        JOptionPane.showMessageDialog(null, "Benvenuto nel distributore di bevande",
                "Distributore", JOptionPane.INFORMATION_MESSAGE);
        do {
            user = (String) JOptionPane.showInputDialog(
                    null,
                    "Scegliere la modalità",
                    " ",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    usermode,
                    usermode[0]);

            if (user.equals("Amministratore")) {
                p = JOptionPane.showInputDialog(null, "Inserire la password",
                        "Admin mode", JOptionPane.INFORMATION_MESSAGE);
                if (p.equals(pass)) {
                    do {
                        scelta = (String) JOptionPane.showInputDialog(
                                null,
                                "Che azione si vuole eseguire?",
                                "Admin mode",
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                administratorOptions,
                                administratorOptions[0]);
                        switch (scelta) {
                            case "Rifornisci":
                                d.riempi();
                                JOptionPane.showMessageDialog(null, "Distributore rifornito",
                                        "Admin mode", JOptionPane.INFORMATION_MESSAGE);
                                break;

                            case "Visualizza inventario":
                                i = d.inventario();
                                JOptionPane.showMessageDialog(null, i[0] + " Coca Cola \n" + i[1] + " Fanta \n"
                                        + i[2] + " Acqua minerale \n" + i[3] + " Acqua Frizzante \n"
                                        + i[4] + " The al limone \n" + i[5] + " The alla pesca \n",
                                        "Inventario", JOptionPane.INFORMATION_MESSAGE);
                            default:
                                break;
                        }
                    } while (!scelta.equals("Esci"));
                } else {
                    JOptionPane.showMessageDialog(null, "password errata!",
                            "Admin mode", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                if (user.equals("Cliente")) {
                    scelta = (String) JOptionPane.showInputDialog(
                            null,
                            "Scegliere il prodotto?",
                            "User mode",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            optionsToChoose,
                            optionsToChoose[0]);

                    switch (scelta) {
                        case "Coca Cola 33 cl €1.0":
                            b = d.eroga(1);
                            if (b == null) {
                                JOptionPane.showMessageDialog(null, "Prodotto esaurito! \n" + "Scegliere un'altro prodotto o aspettare"
                                        + " che il distributore sia rifornito", "Errore",
                                        JOptionPane.ERROR_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Inserire l'importo",
                                        "Pagamento", JOptionPane.INFORMATION_MESSAGE);
                            }
                            break;

                        case "Fanta 33 cl €0.9":
                            b = d.eroga(2);
                            if (b == null) {
                                JOptionPane.showMessageDialog(null, "Prodotto esaurito! \n" + "Scegliere un'altro prodotto o aspettare"
                                        + " che il distributore sia rifornito", "Errore",
                                        JOptionPane.ERROR_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Inserire l'importo",
                                        "Pagamento", JOptionPane.INFORMATION_MESSAGE);
                            }
                            break;

                        case "Acqua Minerale 0,5 l €0.5":
                            b = d.eroga(3);
                            if (b == null) {
                                JOptionPane.showMessageDialog(null, "Prodotto esaurito! \n" + "Scegliere un'altro prodotto o aspettare"
                                        + " che il distributore sia rifornito", "Errore",
                                        JOptionPane.ERROR_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Inserire l'importo",
                                        "Pagamento", JOptionPane.INFORMATION_MESSAGE);
                            }
                            break;

                        case "Acqua Frizzante 0,5 l €0.5":
                            b = d.eroga(4);
                            if (b == null) {
                                JOptionPane.showMessageDialog(null, "Prodotto esaurito! \n" + "Scegliere un'altro prodotto o aspettare"
                                        + " che il distributore sia rifornito", "Errore",
                                        JOptionPane.ERROR_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Inserire l'importo",
                                        "Pagamento", JOptionPane.INFORMATION_MESSAGE);
                            }
                            break;

                        case "The al limone 0,5 l €1.2":
                            b = d.eroga(5);
                            if (b == null) {
                                JOptionPane.showMessageDialog(null, "Prodotto esaurito! \n" + "Scegliere un'altro prodotto o aspettare"
                                        + " che il distributore sia rifornito", "Errore",
                                        JOptionPane.ERROR_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Inserire l'importo",
                                        "Pagamento", JOptionPane.INFORMATION_MESSAGE);
                            }
                            break;

                        case "The alla pesca 0,5 l €1.2":
                            b = d.eroga(6);
                            if (b == null) {
                                JOptionPane.showMessageDialog(null, "Prodotto esaurito! \n" + "Scegliere un'altro prodotto o aspettare"
                                        + " che il distributore sia rifornito", "Errore",
                                        JOptionPane.ERROR_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Inserire l'importo",
                                        "Pagamento", JOptionPane.INFORMATION_MESSAGE);
                            }
                            break;

                        default:
                            break;
                    }
                    if (!scelta.equals("Esci")) {
                        System.out.println("Il tuo prodotto: " + scelta);
                    }
                }
            }
        } while (!user.equals("Spegnimento"));
        JOptionPane.showMessageDialog(null, "Grazie", "Distributore", JOptionPane.INFORMATION_MESSAGE);
    }
}
