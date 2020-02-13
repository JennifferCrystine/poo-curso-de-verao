/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiralista;
import primeiralista.primeiraLista;

/**
 *questão 6
 * @author jenniffer
 */
public class numeroDigitos {
    public static int quantosDigitos (int numero){
        int i = 1,resto;
        int divisor =(int) Math.pow(10, i);
        while(numero > 0) {
            numero = numero / 10;
            resto = numero % 10;
            if(numero == 0) return i;
            else if(numero == 1) return i+1;
            else i++;
        }
        return i;
        
    }
    
    public static void main(String[] args) {
        int numero = primeiraLista.leiaInteiro("Digite um numero: ");
        int digitos = quantosDigitos(numero);
        System.out.println("O numero "+numero+" possui "+digitos+" digitos");
    
    }
    
}
