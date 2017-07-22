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
public class LlamadaSenal extends LlamadaBase{
    private String nombreC;
    private int costoMin;
    private double consumo;
    
    public LlamadaSenal(String ContactoDestino, int DuracionSegundos, boolean EsSaliente, int Costo) {
    
        super(ContactoDestino, DuracionSegundos, EsSaliente);
        
        this.consumo=DuracionSegundos/60;
        
        this.costoMin=Costo;
    }

    @Override
    double calcularCosto() {
        if(EsSaliente!= true){
            costoMin*=consumo;
            return costoMin;
        }
        return 0;
    }

    @Override
    String imprimirDetalle() {
        return "Nombre :"+nombreC+"\nMinutos Consumidos :"+consumo +"\nSaliente :"+EsSaliente +"\nCosto de Llamada :"+costoMin;

    }
    
}
