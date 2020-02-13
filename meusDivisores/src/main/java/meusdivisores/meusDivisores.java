/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meusdivisores;
import java.util.Scanner;

/**
 *
 * @author jenniffer
 */
public class meusDivisores {
    public static void main(String[] args) {
        int numero, i = 2;
        String resposta;
        Scanner teclado = new Scanner(System.in);
        do {
        System.out.println("De qual numero voce gostaria de saber os divisores? ");
        numero = teclado.nextInt();              
            do {
                while(numero % i != 0) i++;
                numero = numero / i;
                System.out.println(numero);            

            }while(numero >= 2);         
        
            System.out.println("Gostaria de analisar outro número? ");
            resposta = teclado.next();
        }while(resposta.equals("sim"));
        
          //eu queria incrementar o i a partir do
        
        
        
        
        // TODO code application logic here
       
    }
            
}
