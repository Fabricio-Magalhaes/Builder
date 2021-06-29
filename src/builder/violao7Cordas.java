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
public class violao7Cordas extends FabricaViolao{
    
    @Override
    public void preco() {
        System.out.println("Preço: 700,00");
    }

    @Override
    public void cor() {
        System.out.println("Cor: Verde");
    }

    @Override
    public void tipoCorda() {
        System.out.println("Tipo Corda: Aço");
    }

    @Override
    public void tipoTarraxa() {
        System.out.println("Tipo Tarraxa: 14CM");
    }

    @Override
    public void tipoMaterial() {
        System.out.println("Tipo Material: Madeira");
    }

    @Override
    public void modelo() {
        System.out.println("Modelo: Classico");
    }

    @Override
    public void tamanhoBraco() {
        System.out.println("Tamanho Braco: 5");
    }
}
