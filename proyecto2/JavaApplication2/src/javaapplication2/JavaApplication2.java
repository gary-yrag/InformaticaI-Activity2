/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author estudiantes
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //System.out.println("Ingrese Valor de x1");
        //System.out.println("Ingrese Valor de y1");
        //System.out.println("Ingrese Valor de x2");
        //System.out.println("Ingrese Valor de y2");
        
        
        cuadrado cua = new cuadrado(0,0,2,2);   
        circulo cir = new circulo(0,0,2,2);   
        rectangulo rec = new rectangulo(1,1,4,3);   
        
        
        System.out.println("\nCuadrado area: "+ cua.calcularArea());        
        System.out.println("Cuadrado perimetro: "+ cua.calcularPerimetro());
        
        System.out.println("\nCirculo area: "+ cir.calcularArea());        
        System.out.println("Circulo perimetro: "+ cir.calcularPerimetro());
        
        System.out.println("\nRectangulo area: "+ rec.calcularArea());        
        System.out.println("Rectangulo perimetro: "+ rec.calcularPerimetro());
        
    }
    
}
