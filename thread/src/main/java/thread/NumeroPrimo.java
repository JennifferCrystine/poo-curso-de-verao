package thread;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author jenniffer
 */
public class NumeroPrimo implements Runnable {
    private List<Integer> primos = new ArrayList<>();
    private int numero;
    
    public NumeroPrimo(int numero) {
        this.numero = numero;
    }

    
    public boolean ehPrimo(int numero) {
        for(int i = 2; i < numero; i++) {
            if(numero % i == 0) return false;
        }
        return true;
    }
    
    public void run() {
        for(int i = 2; i < numero; i++) {
            if(ehPrimo(i)){
                primos.add(i);
            }
        }
    }
    
    public void listaNumerosPrimos() {
        for(Integer primo : primos) {
            System.out.print(primo+"  ");
        
        }
     
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        NumeroPrimo n1 = new  NumeroPrimo(numero/2);
        NumeroPrimo n2 = new  NumeroPrimo(numero-numero/2);
        
       

        Thread t1 = new Thread(n1);
        Thread t2 = new Thread(n2);
        
        t1.start();
        t2.start();
        
       /* 
        t1.join();
        t2.join();
        */
        
    }
    
}
