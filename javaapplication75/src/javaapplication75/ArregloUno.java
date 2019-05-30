/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

/**
 *
 * @author reroes
 */
public class ArregloUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arr1 = new int[5];
        
        arr1 [3] = 20;
        arr1 [1+1] = 5+6;
        arr1 [4] = 10;
        // arr1 [5] = 100;
        
        System.out.printf("%d + %d = %d", arr1[1], arr1[4],(arr1[1]+ arr1[4]) );
        System.out.printf("El tamaño del arreglo es: %d", arr1.length);
       
        
        
    }
    
}












