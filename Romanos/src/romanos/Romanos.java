/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romanos;
  import java.util.Scanner;
/**
 *
 * @author Ernesto
 */
public class Romanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner en=new Scanner(System.in);
      String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
      String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
      String Centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
      System.out.println("Ingresa numero entre 1 y 1000");
      int p = en.nextInt();
      int u=p%10;
      int d=(p/10)%10;
      int c=p/100;
      if(p>=100){         
          System.out.println(Centena[c]+Decena[d]+Unidad[u]);
      }else{
          if(p>=10){
              System.out.println(Decena[d]+Unidad[u]);          
          }else{
              System.out.println(Unidad[p]);          
          } 
      }          
    }
}
    
    

