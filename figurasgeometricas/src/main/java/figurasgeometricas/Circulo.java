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
public class Circulo extends FiguraGeometrica{
    private double raio;
    private double area;
    private final double PI = 3.14;
    
    public Circulo() {
        System.out.println("Insira o valor do raio ");
        Scanner teclado = new Scanner(System.in);
        raio = teclado.nextDouble();

    }
    
     public void calculaArea() {
        this.area = PI * Math.pow(raio, 2);    
    }

    public double getRaio() {
        return raio;
    }

    public double getArea() {
        return area;
    }

    public double getPI() {
        return PI;
    }
     
         
    public void exibeCirculo(String medida) {
        System.out.println("Sou um CÍRCULO de raio "+raio+". Minha área em é "+area+medida);
    }
    
    public static void main(String[] args) {
        System.out.println("Em qual medida está esse valor? ex: cm, km, mm...");
        Scanner teclado = new Scanner(System.in);
        String medida = teclado.next();
        Circulo circulo = new Circulo();
        circulo.calculaArea();
        circulo.exibeCirculo(medida);
    }
    
}
