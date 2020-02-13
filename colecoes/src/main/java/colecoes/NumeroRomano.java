/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jenniffer
 */
public class NumeroRomano {
    Map<Integer, String> romanos = new HashMap<>();
    
    public void adicionaNoMap(){
        romanos.put(1, "I");
        romanos.put(2, "II");
        romanos.put(3, "III");
        romanos.put(4, "IV");
        romanos.put(5, "V");
        romanos.put(6, "VI");
        romanos.put(7, "VII");
        romanos.put(8, "VIII");
        romanos.put(9, "IX");
        romanos.put(10, "X");
        romanos.put(50, "L");
        romanos.put(100, "C");
        romanos.put(500, "D");
        romanos.put(1000, "M"); 
    }
    
    
    
    
    
    
}
