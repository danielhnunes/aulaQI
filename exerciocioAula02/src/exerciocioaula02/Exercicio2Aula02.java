/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciocioaula02;

import java.util.Scanner;

/**
 *
 * @author scherer.danielnu
 */
public class Exercicio2Aula02 {
    double num1, num2;
    //instanciamento da classe Scanner
    static Scanner leia = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.print("Digite o valor de um raio de uma circunferencia:");
    double num1 = leia.nextDouble();
    
    System.out.println("O valor do diametro é "+(num1+num1));
    System.out.println("O valor do quadrante é "+(num1/4));
    }
}