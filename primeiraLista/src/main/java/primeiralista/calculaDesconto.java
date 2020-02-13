/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiralista;

import java.util.Scanner;

/**
 * questão 4
 * @author jenniffer
 */
public class calculaDesconto {
     public static double calculaDesconto(int quantidade, double preco) {
        double desconto = 0;
        
         if(quantidade <= 10) preco = preco * quantidade;
         else if(quantidade > 10 && quantidade <= 20){ 
                preco = preco * quantidade;
                desconto = preco * 0.1;           
                preco = preco - desconto; 
                System.out.println("Desconto: "+desconto);
                
         }else  if(quantidade > 20 && quantidade <= 50){ 
                preco = preco * quantidade;
                desconto = preco * 0.2;           
                preco = preco - desconto; 
                System.out.println("Desconto: "+desconto);
                
         }else {
                preco = preco * quantidade;
                desconto = preco * 0.25;           
                preco = preco - desconto; 
                System.out.println("Desconto: "+desconto);
         } 
         
         return preco;    
    
    }
   
    public static void recebeProduto() {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int quantidade, item = 0;
        double preco, desconto;
        byte adicionar;       
    
        do {
            System.out.println("bem-vindo ao nosso mercado!");
            System.out.println("Adicione seus produtos: ");
            System.out.println("Nome do produto: ");
            nome = teclado.next();
            System.out.println("Preço do produto: ");
            preco = teclado.nextDouble();
            System.out.println("Quantidade: ");
            quantidade = teclado.nextInt();
            
            
            preco = calculaDesconto(quantidade, preco);            
           
            System.out.println("Nome do produto                Preço");
            System.out.println(nome+"----------------------- "+preco);            
                        
            item++;
            System.out.println("Deseja adicionar mais itens?");
            adicionar = teclado.nextByte();
        
        }while(adicionar == 1);
    }
    
    public static void main(String[] args) {
        recebeProduto(); 
    
    }
}
