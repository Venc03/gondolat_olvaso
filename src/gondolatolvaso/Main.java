package gondolatolvaso;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        Kirak();
        Melyik();
        Kever();
        EzVolt();
    }
        

    public static void Kirak(){
        
    String[] pakli = new String[24];
                    
    String[] szinek = {"P", "M", "Z", "T"};
                    
    String[] ertekek = {"Ász","Kir","Fel","X","IX", "VIII"};
    
    
    int i = 1;
    int lap = 0;
    
    
        for (int j = 0; j < ertekek.length; j++) {
            for (int k = 0; k < szinek.length; k++) {
                pakli[lap] = szinek[k] + "_" + ertekek[j];
                lap ++;
            }
            
        }
  
          for (int j = 0; j < pakli.length; j++) {
              System.out.println(pakli[j]);
            
        }
   
                
        
        
    
    }
        
    public static String Melyik(){
        
    Scanner src = new Scanner(System.in);
    boolean jo;
    do {
        System.out.println("oszlop(1-3): ");
        int oszlop = src.nextInt();
        jo = oszlop >= 1 && oszlop <= 3;
    }while(!jo);
    
    return null;
            
            
    }
        
    public static void Kever(){
        int oszlop = 2;
        switch(oszlop) { 
            case 3:
                
                
                
            
        }
        
            
        
                    
    }
        
    public static void EzVolt(){
            
        
                    
    }
        
}

