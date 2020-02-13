/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author jenniffer
 */
public class centavoMoeda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos centavos voce tem?");
        int centavos = teclado.nextInt();
        int aux, somaMoeda, moeda = centavos / 100;
        System.out.println("moedas: " +moeda);
        aux = centavos % 100;
        System.out.println("moedas em aux: " +aux);
        //verifucar se aux eh menor q 100 se for, divide por 50 e pega o resto até chegar a 5 centavos
        somaMoeda = moeda + aux;
        
        System.out.println("quantidade total de moedas: " +somaMoeda);
        
    
    }
            
}