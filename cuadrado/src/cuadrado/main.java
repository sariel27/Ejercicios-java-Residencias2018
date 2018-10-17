/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado;
import java.util.Scanner;
/**
 *
 * @author Ernesto
 */
public class main {
      public static void main(String[] args) {
          Scanner en=new Scanner(System.in);
       Cuadrado Cuadrado=new Cuadrado();
       Cubo Cubo= new Cubo();
       char ca;
          System.out.println("MENU SOBRE CALCULAR EL VOLUMEN DE UN CUBO O CUADRADO");
          do{
          System.out.println("Ingrese la medida del lado");
          double c=en.nextDouble();
          Cuadrado.setlado(c);
          System.out.println("Ingrese que operacion le gustaria realizar: PERIMETRO(p/P),AREA(A/a),VOLUMEN(V/v),PERIMETRO DEL CUBO (l/L),SALIR(S)");
           ca=en.next().charAt(0);
          if(ca=='p'|ca=='P'){
              System.out.println(Cuadrado.getperimetro());
          }
           if(ca=='a'|ca=='A'){
              System.out.println(Cuadrado.getarea());
          }
            if(ca=='V'|ca=='v'){
              System.out.println(Cubo.getvolumen());
          }   if(ca=='l'|ca=='L'){
              System.out.println(Cubo.getvolumen());
          }
          }while(ca=='S');
    
}
}