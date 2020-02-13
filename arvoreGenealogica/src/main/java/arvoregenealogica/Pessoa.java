/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoregenealogica;

import java.util.Scanner;

/**
 *
 * @author jenniffer
 */

public class Pessoa {
    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;
    
    //pensar em adicionar uma lista de filhos na pessoa e se a 
    //pessoa tiver um filho, adicionar esse filho na pessoa
    
    public Pessoa(String nome, int idade) {
        this(nome, idade, null, null);
    }
    
    public Pessoa(String nome, int idade, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }
  

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Pessoa getPai() {
        return pai;
    }

    public Pessoa getMae() {
        return mae;
    }
    

    public static int leiaByte(String frase) {
    System.out.println(frase);
    Scanner teclado = new Scanner(System.in);
    int valor = teclado.nextInt();
    return valor;  
    }
     
     public static String leiaString(String frase) {
        System.out.println(frase);
        Scanner teclado = new Scanner(System.in);
        String opcao = teclado.next();
        return opcao; 
    } 
     
    public void exibePessoa() {
        System.out.println("Oi, meu nome é "+nome+" tenho "+idade+" "
                + "anos. Sou filh@ da "+mae.nome+" e do "+pai.nome);
    }
     
    
    
    
    public static void main(String[] args) {
        Pessoa mae = new Pessoa("Vanilda", 59);
        Pessoa pai = new Pessoa("Julio", 63);
        Pessoa filha = new Pessoa("Jenniffer", 21, pai, mae);
        filha.exibePessoa();
      
        
    }
    
    
}
