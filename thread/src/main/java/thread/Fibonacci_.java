package thread;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jenniffer
 */
public class Fibonacci_ implements Runnable {
    private int n;
    private long resultado;
    
    public Fibonacci_(int n){
        this.n = n;
    }
    
    public long calculaFibonacci(long n) {
        if(n < 2) return n;
        
        else 
            resultado = calculaFibonacci(n - 1) + calculaFibonacci(n - 2);
        
        return resultado;
    }
        
    public void run() {   
        resultado = calculaFibonacci(n);
    }

    public long getResultado() {
        return resultado;
    }
    
    
    
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        Fibonacci_ fib1 = new Fibonacci_(n - 1);
        Fibonacci_ fib2 = new Fibonacci_(n - 2);
        
        
        
        Thread t1 = new Thread(fib1);
        Thread t2 = new Thread(fib2);
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        
        long resultado = fib1.getResultado() + fib2.getResultado();
        System.out.println(resultado);
    }
    
}
