/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiralista;
import primeiralista.primeiraLista;

/**
 *
 * @author jenniffer
 */
public class Fibonacci {
        public static int fibonacci(int n) {

            if(n < 2) return n;

            else return fibonacci(n-1) + fibonacci(n-2);

        }
          
        public static void main(String[] args) {
            int n = primeiraLista.leiaInteiro("Digite a quantidade de termos: ");
            for(int i = 0; i < n; i++) {
                System.out.print(fibonacci(i)+"\t");
            }
        
        }
    
}
