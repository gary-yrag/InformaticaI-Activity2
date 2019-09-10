/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
//import java.lang.Math;

/**
 *
 * @author estudiantes
 * Clase para definir metodos de calculo propios del punto
 */
public interface punto {
    /**
     * Declaración de metodo para calcular la Distancia entre dos puntos
     * @param x1 => Hace referencia a la coordenada X del primer punto
     * @param y1 => Hace referencia a la coordenada y del primer punto
     * @param x2 => Hace referencia a la coordenada X del segundo punto
     * @param y2 => Hace referencia a la coordenada y del segundo punto
     * @return => Devuelve la distancia entre los dos puntos
     */
    double calcularDistancia(int x1, int y1, int x2, int y2);    
}

/**
 * Implementación de metodos en interfaz punto, para solucionar la declaración
 * @author estudiantes
 */
class Ipunto implements punto{    
    @Override
    /**
     * Permite calcular la distancia entre dos puntos
     * retornando un valor en formato [Double]
     */
    public double calcularDistancia(int x1, int y1, int x2, int y2) {
       double res = 0.0;
       res = Math.sqrt(Math.pow((x1-x2),2) +Math.pow((y1-y2),2)); 
       return res;         
    }    
}


