/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordena;
import ordena.Agenda;

/**
 *
 * @author Aluno
 */
public class OrdenaNome extends Ordena {
    public boolean compara(Pessoa pessoaA, Pessoa pessoaB){        
        return (pessoaA.getNome().compareTo(pessoaB.getNome()) > 0);
            
    }
    
}
