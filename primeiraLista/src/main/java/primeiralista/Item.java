/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiralista;
import primeiralista.primeiraLista;

/**
 * questão 19
 * @author jenniffer
 */
public class Item {
    private int quantidade;
    private float subtotal;
    private Produto produto;
    
    public Item(){
        this.produto = new Produto();
        this.quantidade = primeiraLista.leiaInteiro("Quantidade do produto");
        this.subtotal = this.quantidade * produto.getPreco();   
    
    }
    
    
    public void exibeItem() {
        this.produto.exibeProduto();
        System.out.println("Quantidade de itens: "+this.quantidade);
        System.out.println("Subtotal: "+this.subtotal);    
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public Produto getProduto() {
        return produto;
    }
    
    
    
    
}
