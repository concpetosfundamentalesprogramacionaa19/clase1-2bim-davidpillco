/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Random aleatorios = new Random();
        int[] datos = new int[5];
        for(int i = 0; i<=1000; i++){
            int v = aleatorios.nextInt(5);
            System.out.println(v);
            datos[v] = datos[v]+1;
        }
        
        System.out.println("Resultados");
        for (int i = 0; i < datos.length; i++) {
            System.out.printf("posición: %d - %d\n", i, datos[i]);
        }
                
        

    }
}
