/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Scanner;

/**
 *
 * @author RE40044402
 */
public class Calculatron {

    public static Double add(Double num1, Double num2) {
        return num1 + num2;
    }

    public static Double sub(Double num1, Double num2) {
        return num1 - num2;
    }

    public static Double square(Double num1) {
        return Math.sqrt(num1);
    }

    public static Double abs(Double num1) {
        return Math.abs(num1);
    }

    public Double Mull(Double num1, Double num2) {

        return num1 * num2;

    }

    public Double Div(Double num1, Double num2) {

        if (num2 == 0) {

            System.out.print("Divisao por zero");

            return 0.0;

        } else {

            return num1 / num2;

        }

    }

    public Double Pot(Double num1, Double num2) {

        return Math.pow(num1, num2);

    }

    public void Fibonacci() {

        double num1, num2, aux, quant;

        num1 = 0;

        num2 = 1;

        aux = 0;

        quant = 0;

        System.out.println("Insira a quantidade de numeros para a sequencia");

        Scanner c = new Scanner(System.in);

        quant = c.nextInt();

        System.out.println();

        for (int i = 0; i < quant; i++) {

            aux = num1 + num2;

            num2 = num1;

            num1 = aux;

            System.out.println(aux);

        }

    }

}
