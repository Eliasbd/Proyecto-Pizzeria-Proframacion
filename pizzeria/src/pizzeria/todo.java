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
public class todo {
    public void newtodo(){
        int numpizza;
        Scanner tec = new Scanner(System.in);
        
       
            
            
           
            
            System.out.println("Cuantas pizzas va a desear ? (MAXIMO 5 Pizzas)");
            numpizza = tec.nextInt();
            System.out.println();
            
            if(numpizza > 5 || numpizza == 0){
                System.out.println("Numero de pizza Invalido SOLO  5 PIZZAs MAXIMO☺");
                System.out.println("1.  SEGUIR");
                System.out.println("2.  DEJAR DE ORDENAR");
                int fin = tec.nextInt();
                
                if(fin == 1){
                    System.out.println("********************************************");
                    
                    todo callt = new todo();
                    callt.newtodo();
                }else if(fin == 2){
                    System.out.println("********************************************");
                    
                    Home callh = new Home();
                    callh.newhome();
                    
                }else{
                    System.out.println("********************************************");
                    
                    todo callt = new todo();
                    callt.newtodo();
                }
                
            }else{
                System.out.println("********************************************");
                
              
                
                System.out.println("Ingrese lo que se le pide");
                System.out.println();
                
                
                System.out.print("Ingrese su nombre completo =    ");
                String nombre = tec.nextLine();
                System.out.println();
                tec.nextLine();
                 System.out.println();
                 
                System.out.print("Ingrese su telefono = ");
               String telefono = tec.nextLine();
               System.out.println();
               
               System.out.print("Ingrese su direccion = ");
               String direc = tec.nextLine();
               System.out.println();
              
               
               System.out.print("Ingrese su hora de entrega = ");
               String hora = tec.nextLine();
               System.out.println();
              
               System.out.println("********************************************");
                int [] type_pizza = new int [numpizza];
               int [] style_pizza = new int [numpizza];
               
               System.out.println("Ingrese el tipo de pizza que desea ordenar");
               System.out.println("1. Familiar");
               System.out.println("2. Personal");
               System.out.print("Haga su eleccion =   ");
               int tipo = tec.nextInt();
               type_pizza [0] = tipo;
               System.out.println();
               
              
               System.out.println("********************************************");
               
               System.out.println("Ingrese el estilo de pizza que desea = ");
               System.out.println("1. Artesanal   (318 lps.)");
               System.out.println("2. 6 Quesos (280 lps.) ");
               System.out.println("3. 4 estaciones (318 lps.) ");
               System.out.println("4. Francesa (280 lps.) ");
               System.out.println("5. Canadiense (280 lps.) ");
               System.out.println("6. Suprema (263 lps.) ");
               System.out.print("Haga su eleccion =   ");
               int estilo = tec.nextInt();
               style_pizza [0] = estilo;
               System.out.println();
               
  

               
              
               
               for(int x = 1; x < numpizza ; x++){
                   
                   System.out.println("Elija el tipo de su " + (x+1) + "  pizza =  ");
                   System.out.println("1. Familiar");
                   System.out.println("2. Personal");
                   System.out.print("Haga su eleccion =   ");
                    tipo = tec.nextInt();
                    System.out.println();
                    
                    type_pizza [x] = tipo;
                    
                    
                    
                    
               System.out.println("Elija el estilo de su " + (x+1) + "  pizza =  ");
               System.out.println("1. Artesanal   (318 lps.)");
               System.out.println("2. 6 Quesos (280 lps.) ");
               System.out.println("3. 4 estaciones (318 lps.) ");
               System.out.println("4. Francesa (280 lps.) ");
               System.out.println("5. Canadiense (280 lps.) ");
               System.out.println("6. Suprema (263 lps.) ");
               System.out.print("Haga su eleccion =   ");
                estilo = tec.nextInt();
               System.out.println();
               
                style_pizza [x] = estilo;
               
               
               
               
               
               }
               
               System.out.println("********************************************");
               
               System.out.println("Su pedido es =         ");
               System.out.println();
               System.out.print("Dia de entrega =         ");
               System.out.println(global.dia);
               System.out.println();
               System.out.print("Cantidad de pizza =      ");
               System.out.println(numpizza);
               System.out.println();
               System.out.print("Nombre del cliente =     ");
               System.out.println(nombre);
               System.out.println();
               System.out.print("Direccion =              ");
               System.out.println(direc);
               System.out.println();
               System.out.print("Hora de entrega =        ");
               System.out.println(hora);
               System.out.println();
               System.out.print("Tipo de su pizza =       ");
               System.out.println(type_pizza[0]);
               System.out.println();
               System.out.print("Estilo de su pizza =      ");
               System.out.println(style_pizza[0]);
               System.out.println();
               
               if(numpizza == 2){
                   System.out.println("Tipo de su 2 pizza =       " + type_pizza[1]);
                    System.out.println();
                   System.out.println("Estilo de su 2 pizza =     " + style_pizza[1]);
                    System.out.println();
               }else  if(numpizza == 3){
                   System.out.println("Tipo de su 2 pizza =       " + type_pizza[2]);
                    System.out.println();
                   System.out.println("Estilo de su 2 pizza =     " + style_pizza[2]);
                   System.out.println();
                   System.out.println("Tipo de su 3 pizza =       " + type_pizza[2]);
                   System.out.println();
                   System.out.println("Estilo de su 3 pizza =     " + style_pizza[2]);
                   
               }else  if(numpizza == 4){
                   System.out.println("Tipo de su 2 pizza =       " + type_pizza[3]);
                   System.out.println();
                   System.out.println("Estilo de su 2 pizza =     " + style_pizza[3]);
                    System.out.println("Tipo de su 3 pizza =       " + type_pizza[3]);
                    System.out.println();
                   System.out.println("Estilo de su 3 pizza =     " + style_pizza[3]);
                    System.out.println("Tipo de su 4 pizza =       " + type_pizza[3]);
                    System.out.println();
                   System.out.println("Estilo de su 4 pizza =     " + style_pizza[3]);
                   System.out.println();

               }else  if(numpizza == 5){
                   System.out.println("Tipo de su 2 pizza =       " + type_pizza[4]);
                   System.out.println();
                   System.out.println("Estilo de su 2 pizza =     " + style_pizza[4]);
                   System.out.println();
                   System.out.println("Tipo de su 3 pizza =       " + type_pizza[4]);
                   System.out.println();
                   System.out.println("Estilo de su 3 pizza =     " + style_pizza[4]);
                   System.out.println();
                   System.out.println("Tipo de su 4 pizza =       " + type_pizza[4]);
                   System.out.println();
                   System.out.println("Estilo de su 4  pizza =     " + style_pizza[4]);
                   System.out.println();
                   System.out.println("Tipo de su 5 pizza =       " + type_pizza[4]);
                   System.out.println();
                   System.out.println("Estilo de su 5 pizza =     " + style_pizza[4]);
                   System.out.println();
               }
               
            }
            
            
            
       
        
        
    }
  
    
}



