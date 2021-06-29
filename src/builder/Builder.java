/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Usuario
 */
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        leitorTP vender = new leitorTP(new violaoClassico());
        
        vender.fabricaVIO();
        
        leitorTP vender2 = new leitorTP(new violao7Cordas());
        
        vender2.fabricaVIO();
        
    }
    
}
