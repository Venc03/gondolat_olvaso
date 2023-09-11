package gondolatolvaso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Kirak();
        Melyik();
        Kever();
        EzVolt();
    }

    public static void Kirak() {

        String[] pakli = new String[22];

        String[] szinek = {"P", "M", "Z", "T"};

        String[] ertek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};

        int i = 1;
        for (String szin : szinek) {
            for (int e = 0; i < 22 && e < ertek.length; e++) {
                pakli[i++] = szin + "_" + ertek[e];
            }

        }

        for (int j = 0; j < pakli.length; j++) {
            String lap = pakli[i];
            System.out.printf("%-8s", lap);
            if (i % 3 == 0) {
                System.out.println("");
            }

        }

    }

    public static String Melyik() {

        Scanner src = new Scanner(System.in);
        boolean jo;
        do {
            System.out.println("oszlop(1-3): ");
            int oszlop = src.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);

        return null;

    }

    public static void Kever() {

    }

    public static void EzVolt() {

    }

}
