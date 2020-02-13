/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.util.Scanner;

/**
 *
 * @author jenniffer
 */
public class Quadrado extends FiguraGeometrica {
    private double lado;
    private double area;
    
    public Quadrado() {
        System.out.println("Insira o valor do lado ");
        Scanner teclado = new Scanner(System.in);
        lado = teclado.nextDouble();
    }
    

    
    public void calculaArea() {
        this.area = Math.pow(lado, 2);    
    }

    public double getLado() {
        return lado;
    }

    public double getArea() {
        return area;
    }
    
    public void exibeQuadrado(String medida) {
        System.out.println("Sou um QUADRADO de lado "+lado+". Minha área em é "+area+medida);

    }
    
    public static void main(String[] args) {
        System.out.println("Em qual medida está esse valor? ex: cm, km, mm...");
        Scanner teclado = new Scanner(System.in);
        String medida = teclado.next();
        Quadrado quadrado = new Quadrado();
        quadrado.calculaArea();
        quadrado.exibeQuadrado(medida);
    }
    
}
