/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;

/**
 *
 * @author jenniffer
 */
public class Concatena extends Vetor {
    

    public void concatenaVetores(Vetor um, Vetor dois) {
        int countVet1 = 0;
        int countVet2 = 0;
        for(int i = 0; i < um.size() + dois.size(); i++) {
            if(countVet2 == dois.size() || (countVet1 < um.size() && um.get(countVet1) < dois.get(countVet2)) 
                 ) {
                add(i, um.get(countVet1));
                countVet1++;
            }
            else {
               add(i, dois.get(countVet2));
               countVet2++;
            }
        }     
    }
    
    public static void main(String[] args) {
        int tamanho = 3;
        Vetor vet1 = new Vetor();
        Vetor vet2 = new Vetor();
        
        vet1.geraVetor(tamanho);
        vet2.geraVetor(tamanho);
        
        
        System.out.println("Vetores aleatorios\n");
        vet1.imprimeVetor();
        System.out.println("---------------------\n");
        vet2.imprimeVetor();
        System.out.println("--------------------\n");
        
     
        vet1.ordenaVetor(tamanho);
        vet2.ordenaVetor(tamanho);
        
        System.out.println("Vetores ordenados\n");
        vet1.imprimeVetor();
        System.out.println("-----------------\n");
        vet2.imprimeVetor();
        System.out.println("------------------\n");
        
        Concatena concatVet = new Concatena();
        concatVet.concatenaVetores(vet1, vet2);
        System.out.println("vetor concatenado");
        concatVet.imprimeVetor();
        
        
    }
 
}
