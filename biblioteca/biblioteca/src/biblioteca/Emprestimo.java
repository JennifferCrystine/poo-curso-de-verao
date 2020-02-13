/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Aluno
 */
public class Emprestimo {
    private boolean ativo;
    private Livro livro;
    private Leitor cliente;
    
    public Emprestimo(Leitor cliente, Livro livro){
        this.cliente = cliente;
        this.livro = livro;
        this.ativo = true;   
    }
    
    public void devolve() {
        this.ativo = false;
    }
    
    public void exibeEmpretimo(){
        this.cliente.exibeLeitor();
        this.livro.exibeLivro();
        if(this.ativo == true) System.out.println("Este emprestimo está ativo!");
        else System.out.println("Este empréstimo foi devolvido!");
    }
    
}