/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

import java.util.Scanner;

/**
 *
 * @author Ernesto
 */
public class Morse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
          morse_texto morse_texto=new morse_texto();
        texto_morse texto_morse=new texto_morse();
        Scanner en=new Scanner (System.in);
        String c;
         String d,m;
         do{
        System.out.println("Ingrese un numero dependiendo de la accion a realizar (1.-De texto a morse,2.- De morse a texto)");
        d=en.nextLine();
        switch(d){
            case "1":
            System.out.println("Ingrese una cadena");
            c=en.nextLine();
            texto_morse.traducirAlfabeto(c);
            System.out.println(texto_morse.getmorse());
            break;
            case "2":
            System.out.println("Ingrese una cadena");
            c=en.nextLine();
            morse_texto.traducirMorse(c);
            System.out.println(morse_texto.getmorse());
            break;    
        }
             System.out.println("Desea ingresar otro dato(S/N)");
             m=en.nextLine();
        }while("S".equals(m));
    }
    
}
