package gondolatolvaso;

import java.util.Scanner;

public class Main {

    static String[] pakli = new String[21];

    public static void main(String[] args) {

        Kirak();
        int oszlopId = Melyik();
        Kever(oszlopId);
        EzVolt();
    }

    public static void Kirak() {

        String[] szinek = {"P", "M", "Z", "T"};
        String[] ertekek = {"Asz", "Kir", "Fel", "X", "IX", "VIII"};
        int i = 0;
        int lap = 0;
        for (String szin : szinek) {
            // 21 lapig rakja be a pakli tömbe
            for (int j = 0; i < 21 && j < ertekek.length; j++) {
                pakli[i] = szin + "_" + ertekek[j];
                i += 1;
            }
        }
        for (int j = 0; j < pakli.length; j++) {
            System.out.println(pakli[j] + "   " + j);
        }

    }

    public static int Melyik() {

        Scanner src = new Scanner(System.in);
        boolean jo;
        int oszlop = 0;
        do {
            System.out.println("oszlop(1-3): ");
            oszlop = src.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);

        return oszlop;

    }

    public static void Kever(int oszlopId) {
        int[] kevertPakliIndex = new int[21];
        switch (oszlopId) {
            case 1:
                kevertPakliIndex = keveres1(kevertPakliIndex);
                break;
            case 2:
                kevertPakliIndex = keveres2(kevertPakliIndex);
                break;
            case 3:
                kevertPakliIndex = keveres3(kevertPakliIndex);
                break;
        }
        keveresKiiras(kevertPakliIndex);
    }

    public static void EzVolt() {
        //ures, kell egy kiiro kod

    }

    private static int[] keveres3(int[] kevertPakliIndex) {

        int kartyaIndex = 20;
        int valasztott;
        for (int i = 0; i < kevertPakliIndex.length; i++) {
            valasztott = kartyaIndex;
            kevertPakliIndex[i] = valasztott;
            kartyaIndex += -3;
            if (kartyaIndex < 0) {
                kartyaIndex += 20;
            }
        }
        return kevertPakliIndex;
    }

    ;

    private static int[] keveres1(int[] kevertPakliIndex) {
         int kartyaIndex = 18;
        int valasztott;
         for (int i = 0; i < kevertPakliIndex.length; i++) {
            valasztott = kartyaIndex;
            kevertPakliIndex[i] = valasztott;
            kartyaIndex += -3;
            if (kartyaIndex < 0) {
                kartyaIndex += 22;
        }
    }
          return kevertPakliIndex;
    }

    private static int[] keveres2(int[] kevertPakliIndex) {
         

        return kevertPakliIndex;
    }
    

    private static void keveresKiiras(int[] kevertPakliIndex) {
        for (int oszlop = 0; oszlop < 3; oszlop++) {
            System.out.printf("%9s", oszlop + 1);
        }
        System.out.println();
        for (int i = 0; i < 35; i++) {
            System.out.print("_");
        }
        System.out.println();
        int index = 0;
        int sor = 0;
        while (index < pakli.length) {
            System.out.printf("%9s", kevertPakliIndex[index] + 1);
            index++;
            if (index % 3 == 0) {
                System.out.print(" |");
                System.out.printf("%12s", sor + 1);
                System.out.println();
                sor++;
            }

        }

    }

}
