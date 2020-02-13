package primeiralista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.util.ArrayList;
/**
 * @author jenniffer
 */
public class NumeroPrimo {
    private List<Integer> primos = new ArrayList<>();

    
    public boolean ehPrimo(int numero) {
        for(int i = 2; i < numero; i++) {
            if(numero % i == 0) return false;
        }
        return true;
    }
    
    public void descobreNPrimos(int numero) {
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
        NumeroPrimo primos = new NumeroPrimo();
        primos.descobreNPrimos(100);
        primos.listaNumerosPrimos();
        
    }
    
}
