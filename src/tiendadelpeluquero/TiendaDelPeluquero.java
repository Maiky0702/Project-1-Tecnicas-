/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendadelpeluquero;

import tiendadelpeluquero.Sistema.Colas;
import tiendadelpeluquero.Sistema.DoubleLinkedList;
import tiendadelpeluquero.Sistema.Node;
import static tiendadelpeluquero.Inventarios.Articulos.generarId;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author PC267
 */
public class TiendaDelPeluquero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        DoubleLinkedList inventario = new DoubleLinkedList();
        int cantEntrada = 1000000;
        
        for(int i = 0; i < cantEntrada; i++){
            
            String id = generarId(); 
            inventario.insertBegining(new Node(id));
        }
        
        
        
        Colas cera = new Colas();
        Colas secador = new Colas();
        Colas plancha = new Colas();
        Colas crema = new Colas();
        Colas shampoo = new Colas();
        
        inventario.Reabastecer(cera, secador, plancha, crema, shampoo);
        
        cera.imprimirCola();
        secador.imprimirCola();
        plancha.imprimirCola();
        shampoo.imprimirCola();
        crema.imprimirCola();
        
        System.out.println(" ");
        int cantCera = cera.tamañoCola();
        int cantSecador = secador.tamañoCola();
        int cantPlancha = plancha.tamañoCola();
        int cantShampoo = shampoo.tamañoCola();
        int cantCrema = crema.tamañoCola();
        
        long totalInventario = (long) cantCera + cantSecador + cantPlancha + cantShampoo + cantCrema;
        
        int costoCera = 11600;
        int costoSecador = 191900;
        int costoPlancha = 126900;
        int costoShampoo = 21900;
        int costoCrema = 129500;
        
        long costoInvCera = (long) cantCera * costoCera ;
        long costoInvSecador = (long) cantSecador * costoSecador;
        long costoInvPlancha = (long) cantPlancha * costoPlancha;
        long costoInvShampoo = (long) cantShampoo * costoShampoo;
        long costoInvCrema = (long) cantCrema * costoCrema;
        
        long costoInventario = (long) costoInvCera + costoInvSecador
                + costoInvShampoo + costoInvPlancha + costoInvCrema;
        
        System.out.println(costoInvCera);
        System.out.println(costoInvSecador);
        System.out.println(costoInvPlancha);
        System.out.println(costoInvShampoo);
        System.out.println(costoInvCrema);
        System.out.println(costoInventario);
        
        HashMap<String, String> productosCabello = new HashMap<String, String>();
        productosCabello.put("001", "Cera de peinar");
        productosCabello.put("002", "Secador de cabello");
        productosCabello.put("003", "Plancha de cabello");
        productosCabello.put("004", "Shampoo");
         
        
 
        var option = 0;
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("==========================");
            System.out.println("== Tienda del Peluquero ==");
            System.out.println("==========================");
            System.out.println("1. Realizar pedido.");
            System.out.println("2. Salir.");
         

            System.out.print("Enter your option: ");

            option = scan.nextInt();
            Scanner pedidos = new Scanner( System.in ); 
            var guardar = 0;
            switch(option){
                case 1:
                    System.out.println("cantidad de cera disponible:" + cantCera);
                    System.out.println("Valor por unidad de cera: " + costoCera);
                    System.out.println("cantidad ha pedir de cera:");
                    int pedidoCera = pedidos.nextInt();
                    int restanteCera = cantCera - pedidoCera;
                    long costoTotalCera = (long) pedidoCera * costoCera;
                    
                    System.out.println("cantidad de secadores disponibles:" + cantSecador);
                    System.out.println("Valor por unidad de secadores: " + costoSecador);
                    System.out.println("cantidad ha pedir de secadores:");
                    int pedidoSecador = pedidos.nextInt();
                    int restanteSecador = cantSecador - pedidoSecador;
                    long costoTotalSecador = (long) pedidoSecador * costoSecador;
                 
                        
                    System.out.println("cantidad de planchas disponibles:" + cantPlancha);
                    System.out.println("Valor por unidad de planchas: " + costoPlancha);
                    System.out.println("cantidad ha pedir de planchas:");
                    int pedidoPlancha = pedidos.nextInt();
                    int restantePlancha = cantPlancha - pedidoPlancha;
                    long costoTotalPlancha = (long) pedidoPlancha * costoPlancha;
                   
                     
                    System.out.println("cantidad de shampoo disponible:" + cantShampoo);
                    System.out.println("Valor por unidad de shampoo: " + costoShampoo);
                    System.out.println("cantidad ha pedir de shampoo:");
                    int pedidoShampoo = pedidos.nextInt();
                    int restanteShampoo = cantShampoo - pedidoShampoo;
                    long costoTotalShampoo = (long) pedidoShampoo * costoShampoo;
                   
                     
                    System.out.println("cantidad de crema disponible:" + cantCrema);
                    System.out.println("Valor por unidad de crema: " + costoCrema);
                    System.out.println("cantidad ha pedir de crema:");
                    int pedidoCrema = pedidos.nextInt();
                    int restanteCrema = cantCrema - pedidoCrema;
                    long costoTotalCrema = (long) pedidoCrema * costoCrema;
                    
                    long totalArticulosVendidos = (long) pedidoCera + pedidoSecador + pedidoPlancha
                            + pedidoShampoo + pedidoCrema;
                    long totalInventarioActual = (long) (totalInventario - totalArticulosVendidos);
                    
                    long costoPedidoTotal = (long) costoTotalCera + costoTotalSecador + costoTotalPlancha
                            + costoTotalShampoo + costoTotalCrema; 
                    
                    long costoRestanteTotal = (long) (costoInventario - costoPedidoTotal);
                    
                    long diferenciaValores = (long) costoRestanteTotal - costoPedidoTotal; 
                                       
                    System.out.println("Tu pedido actual es:");
                    System.out.println("cera: " + pedidoCera + " con un valor de: " + costoTotalCera);
                    System.out.println("Secadores: " + pedidoSecador + " con un valor de: " + costoTotalSecador);
                    System.out.println("Shampoo: " + pedidoShampoo + " con un valor de: " + costoTotalShampoo);
                    System.out.println("plancha :" + pedidoPlancha + " con un valor de: " + costoTotalPlancha);
                    System.out.println("Cremas: " + pedidoCrema + " con un valor de: " + costoTotalCrema );
                    System.out.println("Costo total del pedido:" + costoPedidoTotal);
                    
                          
                    System.out.println("Pulse 1 para finalizar el pedido");
                    guardar = scan.nextInt();
                    
                    
                    switch(guardar){
                        case 1 -> {
                            System.out.println("Articulos que faltan por vender: ");
                            System.out.println("Cera: " + restanteCera + " unidades.");
                            System.out.println("Secadores: " + restanteSecador + " unidades.");
                            System.out.println("Shampoo: " + restanteShampoo + " unidades." );
                            System.out.println("Planchas: " + restantePlancha + " unidades.");
                            System.out.println("Cremas: " + restanteCrema + " unidades.");
                            System.out.println("Total de artculos restantes por vender: " + totalInventarioActual + " unidades.");
                            System.out.println("Valor de articulos restantes por vender: " + costoRestanteTotal);
                            System.out.println("Total articulos vendidos: " + totalArticulosVendidos);
                            System.out.println("diferencia del valor entre los articulos vendidos y los restantes: " + diferenciaValores);
                            return;
      
                    }
                        
                    }
 
                case 2:
                    System.out.println("proceso finalizado");
                    return;

        }

                   
            }
                 
                        
     }            
    
}
