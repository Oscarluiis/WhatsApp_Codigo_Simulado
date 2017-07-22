/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendeprogra;

/**
 *
 * @author Oscarluiis
 */
public class LlamadaSkype extends LlamadaBase {
    private String id;
    private final int costo=10;
    private boolean SkypeGratuito;
    public LlamadaSkype(String ContactoDestino, int DuracionSegundos, boolean EsSaliente,boolean SkypeGratuito) {
        super(ContactoDestino, DuracionSegundos, EsSaliente);
        this.SkypeGratuito=SkypeGratuito;
        this.id=ContactoDestino;
    }
    
    @Override
    double calcularCosto() {
        if(SkypeGratuito!= true)
            return costo;
        return 0;
    }

    @Override
    String imprimirDetalle() {
        return "ID Usuario :"+id+"\nSkype Gratis :"+SkypeGratuito+"\nSaliente :"+EsSaliente +"\nCosto de Llamada :"+costo;

    }
    
}
