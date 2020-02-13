/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tratamentoexcecoes;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author jenniffer
 */
public class Ponto {
    private double x;
    private double y;
    private double z;
    
    public Ponto() {
        Scanner teclado = new Scanner(System.in);
        try{
            System.out.println("X: ");
            x = teclado.nextDouble();
            System.out.println("Y: ");
            y = teclado.nextDouble();
            System.out.println("Z: ");
            z = teclado.nextDouble();  

        } catch (InputMismatchException excp) {
            System.out.println("Por favor, insira um número!");
        }   
    
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
    
    
 
}
