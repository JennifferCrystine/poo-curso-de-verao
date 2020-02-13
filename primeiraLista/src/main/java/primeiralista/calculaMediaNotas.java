/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiralista;

import primeiralista.primeiraLista;

/**
 * questão 5
 * @author jenniffer
 */
public class calculaMediaNotas {
    public static float mediaNota(float [] notas) {
            int tamanho = notas.length;
            float media = 0;
            for(int i = 0; i < tamanho; i++){
                media = media + notas[i];            
            }
            media = media / tamanho;
            return media;        
        }
        
        public static String statusAluno(float media) {
            String status;
            if(media > 6) status = "Aprovado";
            else if(media > 4 && media < 6) status = "Verificação Suplementar";
            else status = "Reprovado";
            
            return status;        
        }
        
        public static float[] colheNotas(float[] notas, int tamanho) {            
            for(int i = 0; i < tamanho; i++) {
                notas[i] = primeiraLista.leiaFloat("Digite a nota: ");                
            }
            return notas;            
        }
    
            
        public static void main(String[] args) {
            System.out.println("Numero de avaliaçoes: ");
            int tamanho = primeiraLista.leiaInteiro("Escolha um tamanho: ");
            float media = 0;
            float[] notas = new float[tamanho];
            notas = colheNotas(notas, tamanho);
            media = mediaNota(notas);       
            System.out.println("A media do aluno foi: "+media+" E seu status eh: "+statusAluno(media));


        
        }
}
