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
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};

        int i = 0;
        int lap = 0;
        for (String szin: szinek){
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

        //switch 1, 2, 3 nincs kesz
        //----------------------------------------
        /*    switch (1) {
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
    
         */
        

        switch (oszlopId) {
            case 1:
                break;
            case 2:
                   break;
            case 3:
                keveres3(); 
                break;
        }

    }

    public static void EzVolt() {
        //ures, kell egy kiiro kod

    }

    private static void keveres3() {
        String [] kevertPakli = new String[21];
        int kartyaIndex = 21;
        String valasztott = "";
         for (int i = 0; i < kevertPakli.length; i++) {
                    valasztott = pakli[kartyaIndex];
                    kevertPakli[i] = kartyaIndex;
                    System.out.print(valasztott);
                    System.out.println(" "+kartyaIndex);
                    kartyaIndex += -3;
                    if(kartyaIndex <= 0){
                        kartyaIndex += 20;
                    }
                }
    }
;
}
