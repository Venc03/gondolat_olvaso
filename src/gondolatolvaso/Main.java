package gondolatolvaso;

import java.util.Scanner;

public class Main {

    static String[] pakli = new String[24];

    public static void main(String[] args) {

        Kirak();
        int hanyadik = Melyik();
        Kever(hanyadik);
        EzVolt();
    }

    public static void Kirak() {

        String[] szinek = {"P", "M", "Z", "T"};

        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};

        int i = 1;
        int lap = 0;

        for (int j = 0; j < ertekek.length; j++) {
            for (int k = 0; k < szinek.length; k++) {
                pakli[lap] = szinek[k] + "_" + ertekek[j];
                lap++;
            }

        }

        for (int j = 0; j < pakli.length; j++) {

            System.out.println(pakli[j] + "   " + j);
         

        }

    }

    public static int Melyik() {

   

        Scanner src = new Scanner(System.in);
        boolean jo;
        do {
            System.out.println("oszlop(1-3): ");
            int oszlop = src.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);

        return 3;

    }

    public static void Kever(int hanyadik) {
        
        
    //switch 1, 2, 3 nincs kesz
        //----------------------------------------
        switch (1) {
            case 1:
                for (int i = 1; i < 7; i++) {
                    [i] = 20 - (i - 1)*3;
                }
                        break;
            case 2:
                [i + 7] = 19-(i - 1)*3;
                    break;
            case 3:
                [i + 14] = 21-(i - 1)*3;
                    break;
        }

        switch (2) {
            case 1:
                [i
                ] = 19-(i - 1
                )*3;
                    break;
            case 2:
                [i + 7
                ] = 20-(i - 1
                )*3;
                    break;
            case 3:
                [i + 14
                ] = 21-(i - 1
                )*3;
                    break;
        }

        int oszlop = 2;
        switch (oszlop) {
            case 3:

        }
    
        
        String valasztott = "";
        
        switch (hanyadik) {
            case 3:
                hanyadik = 21;
                
                    for (int i = 1; i < 7; i++) {
                        valasztott = pakli[hanyadik];
                        pakli[i] = valasztott;       
                        System.out.println(valasztott);
                        hanyadik += -3;
                    }
                }
             
        

    }

    public static void EzVolt() {
        //ures, kell egy kiiro kod

}
}
