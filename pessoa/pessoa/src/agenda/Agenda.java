/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;


/**
 * questão 20
 * @author Aluno
 */
public class Agenda {
    private Contato[] contatos;
    
    public Agenda(int quantidadePessoas) {
        this.contatos = new Contato[quantidadePessoas];        
        for(int i = 0; i < quantidadePessoas; i++){
            contatos[i] = new Contato();
        }
    }  
    
    public void mostraContatos() {
        int tamanho = contatos.length;
        for(int i = 0; i < tamanho; i++){
           contatos[i].mostraContato();
        }
    }
    
    public void ordenaContatoPorNome(){
        int auxiliar, tamanho = contatos.length;
        Contato[] contatoAuxiliar = new Contato[1];
        for(int i = 0; i < tamanho; i++) {
            for(int j = 1; j < tamanho; j++) {
                if(contatos[i].getNome().compareTo(contatos[j].getNome()) > 0) {
                    contatoAuxiliar[0] = contatos[i];
                    contatos[i] = contatos[j];
                    contatos[j] = contatoAuxiliar[0];
                }
            }           
        }

    }

    public void ordenaContatoPorIdade(){
        int auxiliar, tamanho = contatos.length;
        Contato[] contatoAuxiliar = new Contato[1];
        for(int i = 0; i < tamanho; i++) {
            for(int j = 1; j < tamanho; j++) {
                if(contatos[i].getIdade() > contatos[j].getIdade()) {
                    contatoAuxiliar[0] = contatos[i];
                    contatos[i] = contatos[j];
                    contatos[j] = contatoAuxiliar[0];
                }
            }           
        }

    }

    
    public static void main(String[] args) {
        Agenda agenda = new Agenda(3);
        agenda.mostraContatos();
        agenda.ordenaContatoPorIdade();
        agenda.mostraContatos();
        agenda.ordenaContatoPorNome();  
        
    }
    
}
