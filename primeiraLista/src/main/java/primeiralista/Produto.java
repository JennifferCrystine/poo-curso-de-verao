/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiralista;

/**
 *
 * @author jenniffer
 */
public class Produto {
    private float preco;
    private String nome;
    private int quantidade;
    
    public Produto(String nome, float preco) {
        this.preco = preco;
        this.nome = nome;
    
    }
    
    public Produto() {  
        this.nome = primeiraLista.leiaString("Nome do produto: ");
        this.preco = primeiraLista.leiaFloat("Preço do produto: ");        
        this.quantidade = primeiraLista.leiaInteiro("Quantidade do produto em estoque: "); 
    }
    
    public void exibeProduto() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Preço: "+this.preco);
        System.out.println("Quantidade em estoque: "+quantidade);   
    }

    public float getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    
    
    
}
