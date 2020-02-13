/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Calculadora {
    
    public static int somar(int a, int b) {
        return a + b;        
    }
    
    public static int subtrair(int a, int b) {
        return a - b;
    }
    
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    
    public static int dividir(int a, int b) {
        return a / b;
    }
    
    public static int limpaMemoria(int a) {
        return a = 0;
    }
    
    public static int pegaValor() {
        int valor;
        System.out.println("Digite um valor: ");
        Scanner teclado = new Scanner(System.in);
        valor = teclado.nextInt();
        return valor;
    }

    public static void imprimeMenu() {
        System.out.println(
                "(1) Somar\n"
                + "(2) Subtrair\n"
                + "(3) Multiplicar\n"
                + "(4) Dividir \n"
                + "(5) Limpar memoria \n"
                + "(6) Sair do programa \n");
        System.out.println("Ola, que operacao deseja realizar? ");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
        
        imprimeMenu();
        Scanner teclado = new Scanner(System.in);
        byte estadoMemoria = 0;
        byte opcao = 0;
        opcao = teclado.nextByte();
        
        do {
            imprimeMenu();
            
            switch (opcao) {
                case 1: 
                    System.out.println("A soma eh: "+somar(pegaValor(), estadoMemoria));
                    break;
                    
                default: 
                    System.out.println("Desculpe, essa opcao eh invalida!");

            }
            
        }while(opcao != 6);  
    }
    
}
