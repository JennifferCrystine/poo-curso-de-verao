/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jenniffer
 */
public class Agenda {
    //Map <String, Pessoa> pessoas = new HashMap<>();
    List <Pessoa> pessoas = new ArrayList<>();
    
    public void adicionaContato(Pessoa pessoa) {
        pessoas.add(pessoa);    
    }
    
    public void exibeContatos() {
        for(Pessoa pessoa : pessoas) {
            pessoa.mostraPessoa();                   
        }
    }
    
    public Pessoa buscaContato(String codigo) {
        
        for(Pessoa pessoa : pessoas) {
            if(pessoa.getIdentificador(codigo).compareTo(codigo) == 0) return pessoa;          
        }
        return null;
    }
    
    public void exibePessoaBuscada() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o CPF ou CNPJ de quem você está procurando: ");
        String codigo = teclado.nextLine();
        Pessoa pessoa = buscaContato(codigo);
        if(pessoa != null){ 
            pessoa.mostraPessoa();
        }
        else System.out.println("Pessoa não cadastrada na agenda!");
        
    }
    
    
    public static void main(String[] args) {        
        Agenda agenda = new Agenda();
        Pessoa fisica = new Fisica();
        Pessoa juridica = new Juridica();
        
        agenda.adicionaContato(fisica);
       agenda.adicionaContato(juridica);
        
        agenda.exibeContatos();
        
        agenda.exibePessoaBuscada();
    }
}
