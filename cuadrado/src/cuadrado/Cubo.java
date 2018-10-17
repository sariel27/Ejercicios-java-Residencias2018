/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado;
import cuadrado.Cuadrado;
/**
 *
 * @author Ernesto
 */
public class Cubo {
    Cuadrado Cuadrado=new Cuadrado();
    private double volumen;
    private double perimetro;
    Cubo(){
        volumen=0;
        
        Cuadrado.CalcularPerimetro();
    }
    public void CalcularVolumen(){
        volumen=Cuadrado.lado*3;
    }
      public void CalcularPerimetro(){
        volumen=Cuadrado.lado*12;
    }
      public double getvolumen(){
          return volumen;
      }
      public double getperimetro(){
          return volumen;
      }

}
