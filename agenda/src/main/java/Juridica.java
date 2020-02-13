/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author jenniffer
 */
public class Juridica extends Pessoa {
    private String razaoSocial;
    private String cnpj;
    private double faturamento;
    
    public Juridica() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Adicionando nova pessoa jurídica:");
        System.out.println("Razão social: ");
        this.razaoSocial = teclado.nextLine();
        System.out.println("CNPJ: ");
        this.cnpj = teclado.nextLine();
        System.out.println("Endereço: ");
        this.setEndereco(teclado.nextLine());
        System.out.println("Faturamento: ");
        this.faturamento = teclado.nextDouble();
      
    }

    public String getIdentificador(String identificador) {
        return cnpj;
    }
    
    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public double getFaturamento() {
        return faturamento;
    }
    
    public void mostraPessoa() {
        System.out.println("-----------------");
        System.out.println("Razão social: "+this.razaoSocial);
        System.out.println("-----------------");
        System.out.println("CNPJ: "+this.cnpj);
        System.out.println("-----------------");
        System.out.println("Endereço: "+this.getEndereco());
        System.out.println("-----------------");
        System.out.println("Faturamento: "+this.faturamento);
        System.out.println("-----------------");
    }
    
}
