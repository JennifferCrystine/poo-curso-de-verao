/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;
import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;

/**
 *
 * @author jenniffer
 */
public class Vetor {
    private List<Integer> inteiros = new ArrayList<>();
    
     public void geraVetor(int tamanho){
        for(int i = 0; i < tamanho; i++) {
            inteiros.add((int)(Math.random()*1000));            
        }
    }
     
    public int size() {
        return inteiros.size();
    }
    
    public int get(int i) {
        return inteiros.get(i);
    }
     
    public void add(int i) {
        inteiros.add(i);
    }
    
      public void add(int i, int n) {
        inteiros.add(i, n);
    }
    
    public void ordenaVetor(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = i+1; j < tamanho; j++) {
                if (inteiros.get(i) > inteiros.get(j)) {
                    int temporario = inteiros.get(i);
                    inteiros.set(i, inteiros.get(j));
                    inteiros.set(j, temporario);
                }   
            }
        }
    }
    
    public void imprimeVetor() {        
        for (Integer inteiro : inteiros) {
            System.out.print("[ "+inteiro+" ]\t");
        }        
    }
    
    /*public static void main(String[] args) {
        int tamanho = 3;
        Vetor inteiros = new Vetor();
        inteiros.geraVetor(tamanho);
        System.out.println("vetor aleatorio ");
        inteiros.imprimeVetor(tamanho);
        System.out.println();
        inteiros.ordenaVetor(tamanho);
        System.out.println("vetor ordenado ");
        inteiros.imprimeVetor(tamanho);
    }  */ 
}
