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
public abstract class LlamadaBase {

    protected String ContactoDestino; 
    protected int DuracionSegundos;
    protected boolean EsSaliente;

    public LlamadaBase(String ContactoDestino, int DuracionSegundos, boolean EsSaliente) {
        this.ContactoDestino = ContactoDestino;
        this.DuracionSegundos = DuracionSegundos;
        this.EsSaliente = EsSaliente;
    }
    abstract double calcularCosto();
    abstract String imprimirDetalle();
    
}
