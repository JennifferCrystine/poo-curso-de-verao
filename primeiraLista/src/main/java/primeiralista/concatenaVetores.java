/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiralista;
import primeiralista.ordenaVetor;

/**
 *
 * @author jenniffer
 */
public class concatenaVetores {
        public static int[] concatenaVetores(int[] vetor1,int[] vetor2) {
            int tamanho = vetor1.length + vetor2.length;
            int[] vetorResultante = new int[tamanho];
            for(int i = 0; i < vetor1.length; i++) {
                if(vetor1[i] < vetor2[i]) {
                    vetorResultante[i] = vetor1[i];
                     for(int j = i+1; j < tamanho; j++) {
                         vetorResultante[j] = vetor2[i];
                    }   
                }
                else {
                    vetorResultante[i] = vetor2[i];
                    for(int j = i+1; j < vetor1.length; j++) {
                        vetorResultante[j] = vetor1[i];
                    }
                }
            }
            return vetorResultante;
        }
        
        public static void main(String[] args) {
             /*fazer 3 whiles um pra se forem iguais um pra se um tiver acabado*/
        
            final int TAMANHO = 50;
            int[] vetor1, vetor2, vetorResultante;
            vetor1 = ordenaVetor.geraVetor(TAMANHO);
            vetor1 = ordenaVetor.ordenaVetor(vetor1, TAMANHO);
            ordenaVetor.imprimeVetor(vetor1, TAMANHO);
            vetor2 = ordenaVetor.geraVetor(TAMANHO);
            vetor2 = ordenaVetor.ordenaVetor(vetor2, TAMANHO);
            System.out.println();
            ordenaVetor.imprimeVetor(vetor2, TAMANHO);
            vetorResultante = concatenaVetores(vetor1, vetor2);
            ordenaVetor.imprimeVetor(vetorResultante, vetorResultante.length);
        
        }
    
}
