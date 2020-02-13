/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordena;

/**
 *
 * @author Aluno
 */
public abstract class Ordena {
    public abstract boolean compara(Pessoa pessoaA, Pessoa pessoaB);
    
    public void ordena(Pessoa[] pessoas){
        for (int i = 0; i < pessoas.length; i++) {
            for (int j = i+1; j < pessoas.length; j++) {
                if (compara(pessoas[i], pessoas[j])) {
                    Pessoa aux = pessoas[i];
                    pessoas[i] = pessoas[j];
                    pessoas[j] = aux;
                }            
            }
        }    
    }
    
    
}



