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
public class LlamadaWhatsapp extends LlamadaBase {
    private int numeroC;
    private String estado;
    private static int costoMbs;
    private int mbsConsumo;
    
    public LlamadaWhatsapp(String ContactoDestino, int DuracionSegundos, boolean EsSaliente, String estado, int mbs ,int numeroC) {
        super(ContactoDestino, DuracionSegundos, EsSaliente);
        this.numeroC=numeroC;
        this.estado=estado;
        this.mbsConsumo=DuracionSegundos;
        this.costoMbs=mbs;
    }
    @Override
    double calcularCosto() {
        if(EsSaliente!= true){
            mbsConsumo*=costoMbs;
            return mbsConsumo;
        }
        return 0;
    }

    @Override
    String imprimirDetalle() {
        return "Nombre :"+ContactoDestino +"\nEstado :"+estado +"\nMegas Consumidos :"+mbsConsumo +"\nSaliente :"+EsSaliente + "\nCosto es " + mbsConsumo;
    }
    
}
