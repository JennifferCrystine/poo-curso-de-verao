/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;
import java.util.Scanner;

/**
 *
 * @author jenniffer
 */
public class Fibonacci {
    private long n;
    private long resultado;
    
   
    public long calculaFibonacci(long n) {
        if(n < 2) resultado = n;
        
        else
            resultado = calculaFibonacci(n - 1) + calculaFibonacci(n - 2);
        
        return resultado;
    }
    
    public void exibeFibonacci(){
        System.out.println(calculaFibonacci(n));
    
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long n = teclado.nextLong();
        Fibonacci fib = new Fibonacci();
        System.out.print(fib.calculaFibonacci(n));
    }
    
}
