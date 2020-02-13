/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiralista;
import primeiralista.Produto;

/**
 *
 * @author jenniffer
 */
public class Supermercado {
    private Pedido pedido;
    private String nome;

    
    public Supermercado() {
        this.nome = primeiraLista.leiaString("Nome do supermercado: ");
        int tamanho = primeiraLista.leiaInteiro("Quantidade de itens (produtos diferentes): ");
        pedido = new Pedido(tamanho);
    
    }
    
     public void exibeMercado() {
         System.out.println("Supermercados "+nome.toUpperCase());
         pedido.imprimePedido();
     }
    
    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado();
        supermercado.exibeMercado();
    }
    
}
