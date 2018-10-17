/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado;

/**
 *
 * @author Ernesto
 */
public class Cuadrado { 
    private double area;
    private double perimetro;
    double lado;
    public Cuadrado(){
        area=0;
        perimetro=0;
        lado=0;
    }
    public void setlado(double la){
    lado=la;
    }
    public void CalcularArea(){
        area=lado*lado;
    }
     public void CalcularPerimetro(){
        perimetro=lado*4;
    }
     public double getarea(){
         return area;
     }
      public double getperimetro(){
         return perimetro;
     }
      
}
