/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiralista;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author jenniffer
 */
public class primeiraLista {
   
    
    public static int pegaValor(char coeficiente) {
        System.out.println("Digite o coeficiente " +coeficiente+ " da equacao");
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();
        return valor;       
    
    }
    
    public static int leiaInteiro(String frase) {
        System.out.println(frase);
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();
        return valor;       
    
    }
     
    public static float leiaFloat(String frase) {
        System.out.println(frase);
        Scanner teclado = new Scanner(System.in);
        float valor = teclado.nextFloat();
        return valor;  
    }
     
     public static String leiaString(String frase) {
        System.out.println(frase);
        Scanner teclado = new Scanner(System.in);
        String opcao = teclado.next();
        return opcao; 
    } 
     
    public static char leiaChar(String frase) {
        System.out.println(frase);
        Scanner teclado = new Scanner(System.in);
        char opcao = teclado.next().charAt(0);
        return opcao;  
    } 
}