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
        System.out.println("Válasszon egy lapot és annak a oszlopát jelezze vissza nekünk!");

        String[] szinek = {"P", "M", "Z", "T"};
        String[] ertekek = {"Asz", "Kir", "Fel", "X", "IX", "VIII"};
        int i = 0;
        for (String szin : szinek) {
            // 21 lapig rakja be a pakli tömbe
            for (int j = 0; i < 21 && j < ertekek.length; j++) {
                pakli[i] = szin + "_" + ertekek[j];
                i += 1;
            }
        }
        int sor_s = 0;
        for (int j = 0; j < pakli.length; j++) {
            System.out.printf("%15s", pakli[j] + ": " + j, "%15s", sor_s + 1);
            if ((j + 1)  % 3 == 0) {
                System.out.println();
                sor_s++;
            }

        }
        System.out.println();
        for (int g = 0; g < 45; g++) {
            System.out.print("_");
        }
        System.out.println();

    }

    public static int Melyik() {

        Scanner src = new Scanner(System.in);
        boolean jo;
        int oszlop = 0;
        do {
            System.out.print("A választott  lap oszlopa(1-3): ");
            oszlop = src.nextInt();
            System.out.println("");
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

    private static void keveresKiiras(int[] kevertPakliIndex) {
        System.out.println();
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
            System.out.printf("%9s", pakli[kevertPakliIndex[index]]);
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
