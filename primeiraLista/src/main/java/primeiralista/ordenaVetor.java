/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiralista;

/**
 * questão 13
 * @author jenniffer
 */
public class ordenaVetor {
    public static int[] ordenaVetor(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = i+1; j < tamanho; j++) {
                if (vetor[i] > vetor[j]) {
                    int temporario = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temporario;
                }   
            }
        }
        return vetor;
    }

    public static int[] geraVetor(int tamanho){
        int[] vetor = new int[tamanho];
        for(int i = 0; i < tamanho; i++) {
            vetor[i] =(int) (Math.random()*1000);            
        }
        return vetor;
    }
    
    public static void imprimeVetor(int[] vetor, int tamanho) {
        for(int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i]+" ");
        }        
    }
    
    
    public static void main(String[] args) {
        final int TAMANHO = 100;
        int[] vetor;
        vetor = geraVetor(TAMANHO);
        vetor = ordenaVetor(vetor, TAMANHO);
        imprimeVetor(vetor, TAMANHO);
    
    }
    
}
