/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendadelpeluquero.Sistema;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author PC267
 *///hecho por: Jose David Zapata Jaramillo  y Michel Augusto Velasquez Ibarra
public class Colas {
    
    private Queue<String> cola;
    
    public Colas(){
        
        cola = new LinkedList<>();
        
    }
    
    public void agregarCola(String valor){
        
        cola.offer(valor);
        
    }
    
    public String eliminarCola(){
        
        String producto = cola.poll();
        return producto;
    }
    
    public void imprimirCola(){
        
        Iterator<String> it = cola.iterator();
        
        System.out.println(" ");
        while(it.hasNext()){
            System.out.print(it.next() + "->");
            
        }
        
    }    
    public int tamañoCola(){
        System.out.println(cola.size());
        return cola.size();
    }
        
    
}
