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
public class Exercicio1Aula02 {
    String nome;
    double nota1, nota2, nota3;
    double media;
    //instanciamento da classe Scanner
    static Scanner leia = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.print("Insira seu nome:");
    String nome = leia.nextLine();
    System.out.print("Insira a Nota 1:");
    double nota1 = leia.nextDouble();
    System.out.print("Insira a Nota 2:");
    double nota2 = leia.nextDouble();
    System.out.print("Insira a Nota 3:");
    double nota3 = leia.nextDouble();
    double media = ((nota1+nota2+nota3)/3);
    
    System.out.println("Seu nome é "+nome+" e sua média é "+media);
    }
    
}
