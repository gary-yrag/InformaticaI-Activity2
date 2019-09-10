/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 * Calcular el area del cuadrado
 * Calcular el perimetro del cuadrado
 * @author estudiantes
 */
public class cuadrado extends Ipunto implements figura  {
    
    /**
     * Declaracion de metodo constructor, para incializar propiedades de la calse
     * @param x1
     * @param y1
     * @param x2
     * @param y2 
     */
    public cuadrado(int x1,int y1,int x2,int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    /**
     * Definir propiedad x1
     * Definir propiedad x2
     * Definir propiedad y1
     * Definir propiedad y2
     */    
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    /**
     * Implementación para calcular el area del cuadrado
     * @return => Retorna el valor del area del cuadrado
     */
    
    @Override
    public double calcularArea() {
       double area = 0.0;
       double dist = 0.0;       
      
       dist = calcularDistancia(x1, y1, x2, y2);       
       
       System.out.println("Distancia: " + dist);
       
       area = (Math.pow(dist,2)/2);                 
       //area = Math.pow((x1-x2),2);        
       return area;       
    }

    /**
     * Calcular el perimetro del cuadrado
     * @return 
     */
    @Override
    public double calcularPerimetro() {
        double perim = 0.0;       
        double dist = 0.0;
        //area = calcularDistancia(x1, y1, x2, y2);
       //perim = ((x1-x2)*4);
       dist = calcularDistancia(x1, y1, x2, y2);        
       
       perim = 4 * (Math.sqrt(Math.pow(dist,2)/2));
       return perim;
    }

    /**
     * @return the x1
     */
    public int getX1() {
        return x1;
    }

    /**
     * @param x1 the x1 to set
     */
    public void setX1(int x1) {
        this.x1 = x1;
    }

    /**
     * @return the x2
     */
    public int getX2() {
        return x2;
    }

    /**
     * @param x2 the x2 to set
     */
    public void setX2(int x2) {
        this.x2 = x2;
    }

    /**
     * @return the y1
     */
    public int getY1() {
        return y1;
    }

    /**
     * @param y1 the y1 to set
     */
    public void setY1(int y1) {
        this.y1 = y1;
    }

    /**
     * @return the y2
     */
    public int getY2() {
        return y2;
    }

    /**
     * @param y2 the y2 to set
     */
    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    
}
