/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiralista;
import primeiralista.primeiraLista;

/**
 *
 * @author jenniffer
 */
public class Pedido {
    private float total;
    private Item[] itens;
    private String formaPagamento;
    
    public Pedido(int tamanho) {
        itens = new Item[tamanho];
        for(int i = 0; i < tamanho; i++) {
            itens[i] = new Item();
        }
        
        for(int i = 0; i < tamanho; i++) {
            this.total += itens[i].getSubtotal();
        }
        
        formaPagamento = primeiraLista.leiaString("Forma de pagamento: ");
    }
    
    public void imprimePedido() {
        int tamanho = itens.length;
         for(int i = 0; i < tamanho; i++) {
            itens[i].exibeItem();
             System.out.println("-----------------------");
        }
        System.out.println("TOTAL: "+total);
        System.out.println("Forma de pagamento: "+formaPagamento);    
    }
    
}
