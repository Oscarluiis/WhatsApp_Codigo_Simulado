/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendeprogra;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Oscarluiis
 */
public class LogLlamadas {
    private ArrayList<LlamadaBase> llamadas;
    public int costoMB;
    public int costoMinuto; 
    public boolean skypeGratuito;
    private Scanner lea;
    public LogLlamadas(int costoMb,int costoMin){
        llamadas=new ArrayList<>();
        lea=new Scanner(System.in);
        this.costoMB=costoMb;
        this.costoMinuto=costoMin;
    }
    public void agregar(int tipo){
        String con,op;
        int dur, num;
        boolean sal=false, SkypeGratis=false;
        String es;
        switch (tipo) {
            case 1:
                {
                    System.out.print("Nombre Contacto :");
                    con=lea.next();
                    System.out.println("Numero Contacto :");
                    num=lea.nextInt();
                    System.out.print("Duracion :");
                    dur=lea.nextInt();
                    System.out.print("Estado del Contacto :");
                    es=lea.next();
                    System.out.println("Es saliente :? ");
                    op=lea.next();
                    if(op.equalsIgnoreCase("Si"))
                        sal=true;
                    LlamadaWhatsapp l1=new LlamadaWhatsapp(con, dur, sal, es, costoMB,num);
                    llamadas.add(l1);
                    break;
                }
            case 2:
                
                System.out.print("Nombre Contacto :");
                
                con=lea.next();
                
                System.out.print("Duracion :");
                
                dur=lea.nextInt();
                
                System.out.println("Es saliente :? ");
                
                op=lea.next();
                
                if(op.equalsIgnoreCase("Si"))
                
                    sal=true;
                
                LlamadaSenal l2=new LlamadaSenal(con, dur, sal,costoMinuto);
                
                llamadas.add(l2);
                
                
               break;
            case 3:
                {
               
                    System.out.print("Nombre Contacto :");
                    
                    con=lea.next();
                    
                    System.out.print("Duracion :");
                    
                    dur=lea.nextInt();
                    
                    System.out.println("Plan Incluye Sype Gratis :? "); 
                    
                    es=lea.next();
                    
                    if(es.equalsIgnoreCase("Si"))
                    
                        SkypeGratis=true;
                    
                    System.out.println("Es saliente :? ");
                    
                    op=lea.next();
                    
                    if(op.equalsIgnoreCase("Si"))
                    
                        sal=true;
                    
                    
                    LlamadaSkype l1=new LlamadaSkype(con, dur, sal,SkypeGratis);
                    
                    llamadas.add(l1);
                    
                    break;
                }
            
            default:
            
                System.out.println("No es valido");
                
                break;
        }
    }
    
    public void Historial(){
    
        llamadas.forEach((i) -> {
        
            if(i.EsSaliente!=true) 
            
                System.out.println(i.ContactoDestino +"\nEntrante");
            
            else 
            
                System.out.println(i.ContactoDestino+"\nSaliente");
        });
    }
    
    public void Detalles(){
    
        llamadas.forEach((i) -> {
        
            System.out.println(i.imprimirDetalle());
        });
    }
}
