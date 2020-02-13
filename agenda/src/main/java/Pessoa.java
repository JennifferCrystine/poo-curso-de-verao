import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jenniffer
 */
public abstract class Pessoa {
    private String endereco;
    
    public abstract String getIdentificador(String identificador);
    
    public abstract void mostraPessoa();

    public String getEndereco() {
        return endereco;
    }  

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
