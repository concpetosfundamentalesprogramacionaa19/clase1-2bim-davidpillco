/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo31 {

    public static void main(String[] args) {
        // Declaracion de variables 

        int contador = 1;
        double nota;
        String cond;
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        // Arreglo para los rangos
        String[] rangos = {"0-8", "8.1-12", "12.1-16", "16.1-19", "19.1-20",
             "20.1- adelante"};
        // Arreglo para los datos
        double[] datos = new double[6];
        // Ciclo para pedir las notas y evaluarlas
        while (bandera) {

            System.out.println("Ingrese la nota");
            nota = entrada.nextDouble();
            if (nota >= 0 && nota <= 8) {
                datos[0] = datos[0] + 1;
            } else {
                if (nota >= 8.1 && nota <= 12) {
                    datos[1] = datos[1] + 1;
                } else {
                    if (nota >= 12.1 && nota <= 16) {
                        datos[2] = datos[2] + 1;
                    } else {
                        if (nota >= 16.1 && nota <= 19) {
                            datos[3] = datos[3] + 1;
                        } else {
                            if (nota >= 16.1 && nota <= 20) {
                                datos[4] = datos[4] + 1;
                            } else {
                                datos[5] = datos[5] + 1;
                            }
                        }

                    }
                }

            }
            // Limpieza del buffer
            entrada.nextLine();
            // Se pregunta si desea ingresar otra nota 
            System.out.println("Desea ingresar mas notas: |Si| |No|");
            cond = entrada.nextLine();
            if(cond.equalsIgnoreCase("si")) {
                bandera = true;
            } else {
                bandera = false;
            }

        }
        // Impresion final
        System.out.println("Rangos");
        // Condicion para que llegue hasta el limite
        for (int i = 0; i < datos.length; i++) {
            System.out.printf("%s - %.2f\n", rangos[i], datos[i]);
        }
    }
}
