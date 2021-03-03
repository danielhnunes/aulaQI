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
public class Exercicio3Aula02 {
    double num1;
    //instanciamento da classe Scanner
    static Scanner leia = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.print("Digite um valor: ");
    double num1 = leia.nextDouble();
    
    System.out.println("O dobro do valor é "+(num1*2));
    System.out.println("O triplo dobro do valor é "+((num1*2)*3));
    System.out.println("a metade do triplo do dobro do valor é "+(((num1*2)*3))/2);
    System.out.println("o quadrado do valor é "+(num1*num1));
    System.out.println("a quinta parte do dobro do valor é "+((num1*2)/5));
    }
}