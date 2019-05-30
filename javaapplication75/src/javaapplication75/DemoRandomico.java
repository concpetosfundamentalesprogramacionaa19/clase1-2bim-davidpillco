/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class DemoRandomico {
    public static void main(String[] args) {
      Random aleatorios = new Random();
      int v = aleatorios.nextInt(4);
        System.out.printf("%d\n", v);
    }
    
}
