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
public class pedido {
   public void newpedido(){
          
        Scanner tec = new Scanner(System.in);
        int dia;
        
        
        
        System.out.println("MENU PEDIDO ");
        System.out.println("Seleccionar Dia de Entrega");
        System.out.println("1. Lunes");
        System.out.println("2. Martes");
        System.out.println("3. Miercoles");
        System.out.println("4. Jueves");
        System.out.println("5. Viernes");
        System.out.println("6. Sabado");
        System.out.println("7. Domingo");
        
        System.out.println();
        
        System.out.print("Seleccione su dia =  ");
        global.dia = tec.nextInt();
        
        
        System.out.println();
        
        if(global.dia > 7 || global.dia == 0){
            
            System.out.println("Opcion invalida");
            
            System.out.println("********************************************");
            pedido callp = new pedido();
            callp.newpedido();
        }else{
            
            System.out.println("********************************************");
            todo callt = new todo();
            callt.newtodo();
        }
    } 
}
