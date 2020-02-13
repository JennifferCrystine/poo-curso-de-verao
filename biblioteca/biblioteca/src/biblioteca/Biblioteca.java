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
public class Biblioteca {
    private int cadastrados = 0;
    private Leitor[] leitores;
    private int registrados = 0;
    private Livro[] livros; 
    private int emprestados = 0;
    private Emprestimo[] emprestimos;
    private final int QTD_LIVRO = 5;
    private final int QTD_CLIENTE = 10;
    private final int QTD_EMP = 10;
    
    public Biblioteca() {        
        this.leitores = new Leitor[QTD_CLIENTE];
        this.livros = new Livro[QTD_LIVRO];    
    }

    
    public void cadastrarCliente() {       
       leitores[cadastrados] = new Leitor();  
       cadastrados++;        
    }    
    
    public void listaLeitores() {
         for(int i = 0; i < cadastrados; i++) {
            leitores[i].exibeLeitor();         
        }        
    }
        
    public void cadastrarLivro() {       
       livros[registrados] = new Livro();  
       registrados++;        
    }
 
     
    public void listaLivros() {
         for(int i = 0; i < cadastrados; i++) {
            leitores[i].exibeLeitor();         
        }        
    }
    
    public Leitor procuraLeitor(int id){
        return leitores[id];    
    }
    
     public Livro procuraLivro(int id){
        return livros[id];    
    }
    
    
     public void novoEmprestimo() { 
         Scanner teclado = new Scanner(System.in);
         int idLeitor, idLivro;
         System.out.println("Qual é o código do leitor? ");
         idLeitor = teclado.nextInt();
         System.out.println("Qual é o código do livro? ");
         idLivro = teclado.nextInt();
         
       emprestimos[emprestados] = new Emprestimo(procuraLeitor(idLeitor), procuraLivro(idLivro));  
       registrados++;        
    }
     
     public void listaEmprestimos() {
         for(int i = 0; i < emprestados; i++) {
            emprestimos[i].exibeEmpretimo();
        }        
    }

    public byte menu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem vindo a nossa biblioteca!");
        System.out.println("Selecione:");
        System.out.println("1) Cadastrar cliente");
        System.out.println("2) Cadastrar livro");
        System.out.println("3) Emprestar livro");
        System.out.println("4) Devolver livro");
        System.out.println("5) Visualizar todos os clientes");
        System.out.println("6) Visualizar todos os livros");
        System.out.println("7) Visualizar todos os emprestimos");
        System.out.println("O que deseja fazer? ");
        byte opcao = teclado.nextByte();
        
        return opcao;
    }
    
    public void menuIterativo() {
        Leitor novoLeitor;
        Biblioteca biblioteca = new Biblioteca();
        byte opcao = menu();
        
        switch(opcao) {
            case 1: 
                biblioteca.cadastrarCliente();
                    break;
            case 2:
                biblioteca.cadastrarLivro();
                    break;
            case 3:
                biblioteca.novoEmprestimo();
        }
    }
    
    
 
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.exibeLivro();
    }
    
    
    
}