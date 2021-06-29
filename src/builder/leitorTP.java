/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.List;
import jdk.nashorn.internal.parser.Token;

/**
 *
 * @author Usuario
 */
public class leitorTP {
    private FabricaViolao fabrica;
    
    public leitorTP(FabricaViolao fabrica){
        this.fabrica = fabrica;
    }
    public void fabricaVIO(){
        fabrica.preco();
        fabrica.cor();
        
        fabrica.tipoTarraxa();
        fabrica.tipoMaterial();
        fabrica.modelo();
        fabrica.tamanhoBraco();
    }
   
}
