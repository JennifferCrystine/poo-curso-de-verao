/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */

public class Contato {
    private byte idade;
    private String nome;
    private String telefone;
    
    public Contato() {
        Scanner teclado = new Scanner(System.in);
        this.nome = primeiraLista.leiaString("Informe o nome: ");
        this.idade = primeiraLista.leiaByte("Informe a idade: "); 
        this.telefone = primeiraLista.leiaString("Informe o telefone: ");
    }
    
    public Contato(String nome, byte idade, String telefone) {
        this.nome = nome;
        this.idade = idade; 
        this.telefone = telefone;
    }
    
    public Contato[] criaContatos(int quantidadePessoas) {
        Contato[] pessoas = new Contato[quantidadePessoas];        
        for(int i = 0; i < quantidadePessoas; i++){
            pessoas[i] = new Contato();
        }
        return pessoas;
    } 
    
    public void mostraContato() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade+" anos");
        System.out.println("Telefone: "+this.telefone);
    
    }

    public byte getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    
}