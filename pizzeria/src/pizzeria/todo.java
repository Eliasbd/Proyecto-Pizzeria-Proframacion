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
        int tipo;
        int estilo; 
        int precio = 0;
         String nombre = " ";
         
         String direc, hora;
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
                
                tec.nextLine();
                
                System.out.println("Ingrese lo que se le pide");
                System.out.println();
                int exit;
                
                do{
                    System.out.print("Ingrese su nombre completo =    ");
                    nombre = tec.nextLine();
                    System.out.println();
                    
                    if(nombre.isEmpty() || nombre.length() < 5){
                        System.out.println("INGRESE UN NOMBRE VALIDO!!!");
                         System.out.println();
                          exit = 1;
                    }else{
                       exit = 0;
                        break;
                    }
                     
                     
                }while(exit != 0);
                
                
                System.out.println();
                
                
                 
                
               do{
                    System.out.print("Ingrese su telefono = ");
                    String telefono = tec.nextLine();
                    System.out.println();
                    
                    
                    if(telefono.isEmpty() || telefono.length() < 5){
                        System.out.println("INGRESE UN NUMERO DE TELEFONO VALIDO");
                        System.out.println();
                        exit = 1;
                    }else{
                        exit = 0;
                    }
               }while(exit != 0);
               
               do{
                    System.out.print("Ingrese su direccion = ");
                     direc = tec.nextLine();
                    System.out.println();
                    
                    if(direc.isEmpty()){
                        System.out.println("INGRESE UNA DIRECCION VALIDA");
                        System.out.println();
                        exit = 1;
                        
                    }else{
                        exit = 0;
                    }
               }while(exit != 0);
               
               
                do{
                      System.out.print("Ingrese su hora de entrega = ");
                        hora = tec.nextLine();
                        System.out.println();
                    if(hora.isEmpty()){
                        System.out.println("INGRESE UNA HORA VALIDA");
                        System.out.println();
                        exit = 1;
                        
                    }else{
                        exit = 0;
                    }
               }while(exit != 0);
              
               
             
              
               System.out.println("********************************************");
                int [] type_pizza = new int [numpizza];
               int [] style_pizza = new int [numpizza];
               int [] acum_precio = new int[numpizza];
               
               do{
                   System.out.println("Ingrese el tipo de pizza que desea ordenar");
                   System.out.println("1. Familiar");
                   System.out.println("2. Personal");
                   System.out.println();
                   System.out.print("Haga su eleccion =   ");
                   tipo = tec.nextInt();
                   System.out.println();
       
                   
                   
                   if(tipo > 2 || tipo == 0  ){
                       System.out.println("OPCION INVALIDA!!!");
                       System.out.println();
                       exit = 1;
                   }else{
                       exit = 0;
                       break;
                   }
               }while(exit != 0);
               
               type_pizza [0] = tipo;
               
              
               System.out.println("********************************************");
               
               do{
                 System.out.println("Ingrese el estilo de pizza que desea = ");
                 System.out.println("1. Artesanal   (318 lps.)");
                 System.out.println("2. 6 Quesos (280 lps.) ");
                 System.out.println("3. 4 estaciones (318 lps.) ");
               System.out.println("4. Francesa (280 lps.) ");
               System.out.println("5. Canadiense (280 lps.) ");
               System.out.println("6. Suprema (263 lps.) ");
               System.out.println();
               System.out.print("Haga su eleccion =   ");
               estilo = tec.nextInt();
               
               System.out.println(); 
               
               if(estilo > 6 || estilo == 0){
                   System.out.println("OPCION INVALIDA");
                   System.out.println();
                   exit = 1;
               }else{
                   exit = 0;
                   break;
               }
               
               
               
               }while(exit != 0);
               
               style_pizza [0] = estilo;
               
               if(estilo == 1){
                   precio = 318;
                   acum_precio[0] = precio;
               }else if(estilo == 2){
                   precio = 280;
                   acum_precio[0] = precio;
               }else if(estilo == 3){
                    precio = 318;
                   acum_precio[0] = precio;
               }else if(estilo == 4){
                    precio = 280;
                   acum_precio[0] = precio;
               }else if(estilo == 5){
                    precio = 280;
                   acum_precio[0] = precio;
               }else if(estilo == 6){
                    precio = 263;
                   acum_precio[0] = precio;
               }
               
  

               
              
               
               for(int x = 1; x < numpizza ; x++){
                   
                   do{
                   System.out.println("Ingrese el tipo de su " + (x+1) + " pizza que desea ordenar");
                   System.out.println("1. Familiar");
                   System.out.println("2. Personal");
                   System.out.println();
                   System.out.print("Haga su eleccion =   ");
                   tipo = tec.nextInt();
                   System.out.println();
       
                   
                   
                   if(tipo > 2 || tipo == 0  ){
                       System.out.println("OPCION INVALIDA!!!");
                       System.out.println();
                       exit = 1;
                   }else{
                       exit = 0;
                       break;
                   }
               }while(exit != 0);
                    
                    type_pizza [x] = tipo;
                    
                    
                    
                    
                             do{
                 System.out.println("Ingrese el estilo de su " + (x+1) + " pizza que desea = ");
                 System.out.println("1. Artesanal   (318 lps.)");
                 System.out.println("2. 6 Quesos (280 lps.) ");
                 System.out.println("3. 4 estaciones (318 lps.) ");
               System.out.println("4. Francesa (280 lps.) ");
               System.out.println("5. Canadiense (280 lps.) ");
               System.out.println("6. Suprema (263 lps.) ");
               System.out.println();
               System.out.print("Haga su eleccion =   ");
               estilo = tec.nextInt();
               
               System.out.println(); 
               
               if(estilo > 6 || estilo == 0){
                   System.out.println("OPCION INVALIDA");
                   System.out.println();
                   exit = 1;
               }else{
                   exit = 0;
                   break;
               }
               
               
               
               }while(exit != 0);
               
                style_pizza [x] = estilo;
               
                    if(estilo == 1){
                   precio += 318;
                   acum_precio[0] = precio;
               }else if(estilo == 2){
                   precio += 280;
                   acum_precio[0] = precio;
               }else if(estilo == 3){
                    precio += 318;
                   acum_precio[0] = precio;
               }else if(estilo == 4){
                    precio += 280;
                   acum_precio[0] = precio;
               }else if(estilo == 5){
                    precio += 280;
                   acum_precio[0] = precio;
               }else if(estilo == 6){
                    precio += 263;
                   acum_precio[0] = precio;
               }
               
               
               
               }
               
               System.out.println("********************************************");
               
               System.out.println("SU PEDIDO ES : ");
               System.out.println();
               System.out.print("Dia de entrega =         ");
               System.out.println(global.dia == 1 ? "Lunes" : global.dia == 2 ? "Martes" : global.dia == 3 ? "Miercoles" : global.dia == 4 ? "Jueves" :
                       global.dia == 5 ? "Viernes" : global.dia == 6 ? "Sabado"  : "Domingo");
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
               System.out.println(type_pizza[0] == 1 ? "Familiar" : "Personal");
               System.out.println();
               System.out.print("Estilo de su pizza =      ");
               System.out.println(style_pizza[0] == 1 ? "Artesanal" : style_pizza[0] == 2 ? "6 quesos"  : style_pizza[0] == 3 ? "4 Estaciones"  : style_pizza[0] == 4 ? "Francesa"  : style_pizza[0] == 5 ? "Canadiense"  :  "suprema" );
               System.out.println();
               
               for(int cos = 1; cos < numpizza; cos++){
                    System.out.print("Tipo de su pizza  " + (cos+1) + " =       ");
                    System.out.println(type_pizza[cos] == 1 ? "Familiar" : "Personal");
                    System.out.println();
                    System.out.print("Estilo de su pizza  " + (cos+1) + " =      ");
                    System.out.println(style_pizza[cos] == 1 ? "Artesanal" : style_pizza[cos] == 2 ? "6 quesos"  : style_pizza[cos] == 3 ? "4 Estaciones"  : style_pizza[cos] == 4 ? "Francesa"  : style_pizza[cos] == 5 ? "Canadiense"  :  "suprema" );
                    System.out.println();
                    
                
               }
               
               System.out.print("TOTAL A PAGAR ES =         ");
               System.out.println(precio);
               
              
               
               
               System.out.println("********************************************");
               
               System.out.println("Es correcto su pedido?");
               System.out.println();
               System.out.println("1. SI");
               System.out.println("2. No volver a ordenar");
               System.out.println();
               System.out.print("Elija =  ");
               int fis = tec.nextInt();
               System.out.println();
               
               if(fis == 1){
                   
                   int codigo = 0;
                 System.out.println("********************************************"); 
                 System.out.println();
                 System.out.println("Su codigo de pago es = " + codigo);
                 System.out.println();
                 System.out.println("GRACIAS POR PREFERINOS");
                 System.out.println("EL BUEN SABOR 2018");
                   //Derechos reservados Software Solutions JB xd
                 System.out.println("********************************************");  
                   Home callh = new Home();
                   callh.newhome();
                   
               }else if(fis == 2){
                   System.out.println("********************************************");
                   System.out.println();
                   todo callt = new todo();
                   callt.newtodo();
               }
               
               
               
            }
            
            
            
            
            
       
        
        
    }
  
    
}



