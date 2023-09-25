package gondolatolvaso;



import java.util.Scanner;



public class Main {

    
    
    static String[] pakli = new String[21];

    
    
    public static void main(String[] args) {

        Feltolt();
        Kirak();
        
        for (int i = 0; i < 3; i++) {
            int oszlopId = Melyik();
            Kever(oszlopId);
            Kirak();
        }
        EzVolt();
    }

    
    
    public static void Feltolt() {
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
    }

    
    
    public static void Kirak() {
        System.out.println("Válasszon egy lapot és annak a oszlopát jelezze vissza nekünk!");
        int sor_s = 0;
        for (int j = 0; j < pakli.length; j++) {
            System.out.printf("%15s", pakli[j], "%15s", sor_s + 1);
            if ((j + 1) % 3 == 0) {
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
        String[] kevertPakli = new String[21];
        switch (oszlopId) {
            case 1:
                pakli = keveres1(kevertPakli);
                break;
            case 2:
                pakli = keveres2(kevertPakli);
                break;
            case 3:
                pakli = keveres3(kevertPakli);
                break;
        }
    }

    
    
    public static void EzVolt() {
        System.out.println("Ez volt a választótt kártyád: " + pakli[11]);
    }

    

    private static String[] keveres1(String[] kevertPakli) {
        int kartyaIndex = 18;
        String valasztott;
        for (int i = 0; i < pakli.length; i++) {
            valasztott = pakli[kartyaIndex];
            kevertPakli[i] = valasztott;
            kartyaIndex += -3;
            if (kartyaIndex < 0) {
                kartyaIndex += 22;
            }
        }
        return kevertPakli;     
    }

    private static String[] keveres2(String[] kevertPakli) {
        int kartyaIndex = 20;
        String valasztott;
        for (int i = 0; i < pakli.length; i++) {
            valasztott = pakli[kartyaIndex];
            kevertPakli[i] = valasztott;
            kartyaIndex += -3;
            if (kartyaIndex < 0) {
                kartyaIndex += 20;
            }
        }
        return kevertPakli;
    }
    
    private static String[] keveres3(String[] kevertPakli) {
        int kartyaIndex = 20;
        String valasztott;
        for (int i = 0; i < pakli.length; i++) {
            valasztott = pakli[kartyaIndex];
            kevertPakli[i] = valasztott;
            kartyaIndex += -3;
            if (kartyaIndex < 0) {
                kartyaIndex += 20;
            }
        }
        return kevertPakli;
    }

}
