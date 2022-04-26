package Distributore;

import java.util.Scanner;

public class TestDistriub {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Creo un nuovo distributore
        Distributore d = new Distributore(2, 2, 2);

        // Visualizzo il menù di scelta
        d.seleziona();

        String risp = "si";

        // Scelta bibita
        while (risp.equalsIgnoreCase("si")) {
            System.out.println("Seleziona bibita : (1/2/3)");
            int s = in.nextInt();
            d.compra(s);
            d.seleziona();
            in.nextLine();
            System.out.print("Vuoi un'altra bibita?");
            risp = in.nextLine();
        }

        risp = "si";

        // Inserimento nuove bibite
        while (risp.equalsIgnoreCase("si")) {
            System.out.println("Vuoi inserire delle bibite?");
            risp = in.nextLine();
            if (risp.equalsIgnoreCase("si")) {
                System.out.println("Seleziona bibita : (1/2/3)");
                int s = in.nextInt();
                System.out.println("Seleziona la quantità : ");
                int qu = in.nextInt();
                d.inserisci(s, qu);
                d.seleziona();
                in.nextLine();

            }
        }

        // Visualizzo lo stato del distributore
        System.out.println("Il totale di lattine ora presenti è : " + d.totaleLattine());
        System.out.println("Il totale di gettoni ora presenti è : " + d.totaleGettoni());

    }
}
