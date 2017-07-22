/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendeprogra;
import java.util.Scanner;
/**
 *
 * @author Oscarluiis
 */
public class Main {
    public static void main(String[] args) {
        Scanner lea= new Scanner(System.in);
        boolean menu=true;
        
        System.out.print("Ingrese costo de de los megas :");
        int costoMb=lea.nextInt();
        System.out.print("Ingrese costo de los miinutos :");
        int costoMin=lea.nextInt();
        
        LogLlamadas l=new LogLlamadas(costoMb, costoMin);
            
            
        do{
            System.out.println("------>Menu<-------"); 
            System.out.println("\n1.Ingresar Llamada \n2.Historial \n3.Detalles");
            int menu2=lea.nextInt();
            
            switch(menu2){
                case 1:
                    System.out.println("\n1.Llamada Whatsapp \n2.Llamada Senal \n3.Llamada Skype");
                    int op=lea.nextInt();
                    
                    l.agregar(op);
                    break;
                case 2:
                    l.Historial();
                    break;
                case 3:
                    l.Detalles();
                    break;
                default:
                    System.out.println("La opcion no es valida");
                    break;
            }
            System.out.println("Desea continuar en el menu:?");
            String op2=lea.next();
            if(op2.equalsIgnoreCase("no"))
                menu=false; 
            
        }while(menu==true);
        
    }
}
