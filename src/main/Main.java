/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Model.Calculatron;
import java.util.Scanner;

/**
 *
 * @author RE40044402
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double num1;
        Double num2;
        Double resultado;
        Calculatron c = new Calculatron();
        int opcao = 0;
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("selecione a opção desejada"
                    + "\n1 - Add"
                    
                    + "\n2 - Sub"
                    
                    + "\n3 - Square"
                    
                     +"\n4 - Mul"

                    + "\n5 - Div"

                    + "\n6 - Pot"

                    + "\n7 - Pi"

                    + "\n8 - Fibonacci"

                    + "\n9 - Exit");
                 
            opcao = teclado.nextInt();

            switch (opcao) {
                case (1):
                    num1 = null;
                    num2 = null;
                    resultado = null;
                    System.out.println("digite o primeiro numero da operação");
                    num1 = (Double) teclado.nextDouble();
                    System.out.println("digite o segundo numero da operação");
                    num2 = (Double) teclado.nextDouble();
                    resultado = Calculatron.add(num1, num2);
                    System.out.println("a soma de " + num1 + " + " + num2 + " = " + resultado);
                    break;
                case (2):
                    num1 = null;

                    resultado = null;
                    System.out.println("digite o primeiro numero da operação");
                    num1 = teclado.nextDouble();
                    System.out.println("digite o segundo numero da operação");
                    num2 = teclado.nextDouble();
                    resultado = Calculatron.sub(num1, num2);
                    System.out.println("a subtação de " + num1 + " - " + num2 + " = " + resultado);
                    break;
                case (3):
                    num1 = null;
                    System.out.println("digite o  numero da operação");
                    num1 = teclado.nextDouble();
                    resultado = Calculatron.square(num1);

                    System.out.println("a raiz quadrada  de " + num1 + " = " + resultado);
                    break;
                

                case (4):

                    num1 = null;

                    num2 = null;

                    resultado = null;

                    System.out.println("Digite o primeiro numero");

                    num1 = (Double) teclado.nextDouble();

                    System.out.println("Digite o segundo numero");

                    num2 = (Double) teclado.nextDouble();

                    resultado = c.Mull(num1, num2);

                    System.out.println("\nA multiplicaçao de " + num1 + "*" + num2 + " = " + resultado);

                    break;

                case (5):

                    num1 = null;

                    num2 = null;

                    resultado = null;

                    System.out.println("Digite o primeiro numero");

                    num1 = (Double) teclado.nextDouble();

                    System.out.println("Digite o segundo numero");

                    num2 = (Double) teclado.nextDouble();

                    resultado = c.Div(num1, num2);

                    System.out.println("\nA divisao de " + num1 + "/" + num2 + " = " + resultado);

                    break;

                case (6):

                    num1 = null;

                    num2 = null;

                    resultado = null;

                    System.out.println("Esse sera o numero da BASE");

                    System.out.println("Digite o primeiro numero");

                    num1 = (Double) teclado.nextDouble();

                    System.out.println("Esse sera o numero do EXPOENTE");

                    System.out.println("Digite o segundo numero");

                    num2 = (Double) teclado.nextDouble();

                    resultado = c.Pot(num1, num2);

                    System.out.println("\nA potenciaçao de " + num1 + "^" + num2 + " = " + resultado);

                    break;

                case (7):

                    System.out.println("\nπ = " + Math.PI);

                    break;

                case (8):

                    c.Fibonacci();

                    break;

                case (9):

                    System.out.println("Saindo");

                    break;
                default:
                    System.out.println("Digite um numero valido");
                    break;

            }

        } while (opcao != 9);

    }

}
