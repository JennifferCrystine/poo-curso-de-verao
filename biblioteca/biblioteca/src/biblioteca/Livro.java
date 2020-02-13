/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Livro {
    private String titulo;
    private String autor;
    private int codigo;
    private static int proximoCod = 1;
    
      public Livro(){
        System.out.println("Novo livro");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o titulo do livro: ");
        this.titulo = teclado.nextLine();
        System.out.println("Informe o autor do livro: ");
        this.autor = teclado.nextLine(); 
        this.codigo = proximoCod++;     
    }
      
    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;  
        this.codigo = proximoCod++;
    }   
    
   public void exibeLivro() {
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Autor: "+this.autor);  
   }
}