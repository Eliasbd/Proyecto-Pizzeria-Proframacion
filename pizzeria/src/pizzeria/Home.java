/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.util.Scanner;

/**
 *
 * @author Nis
 */
public class Home {
    public void newhome(){
        
        int opc;
        Scanner tec = new Scanner(System.in);
        
        System.out.println("MENU PRINCIPAL Pizzeria Buen Sabor ");
        System.out.println("1. Hacer pedido");
        System.out.println("2. Hacer pago");
        System.out.println("3. Mostrar Informacion");
        System.out.println("4. Salir");
        
        System.out.println();
        
        System.out.print("Ingrese su Seleccion =  ");
        opc = tec.nextInt();
        
         System.out.println();
         
         
         if(opc == 1){
            
                System.out.println("********************************************");
                pedido callp = new pedido();
                callp.newpedido();
                
         }else if(opc == 2){
                
                System.out.println("********************************************");
                pago callpago = new pago();
                callpago.newpago();
             
         }else if(opc == 3){
                
                System.out.println("********************************************");
                info callinf = new info();
                callinf.newinfo();
                
             
         }else if(opc == 4){
              System.exit(0);
         }else{
             System.out.println("Seleccion Invalida");
                
                System.out.println("********************************************");
                Home callh = new Home();
                callh.newhome();
          
         }
        
        
        
        
    }
    
    
    
}
