/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendadelpeluquero.Inventarios;


import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author PC267
 *///hecho por: Jose David Zapata Jaramillo  y Michel Augusto Velasquez Ibarra
public class Articulos {
    
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public static String generarId(){
        
        Random random = new Random();
        String idCategoria = "";
        if(random.nextBoolean()){
            idCategoria = "01";
        }else{
            if(random.nextBoolean()){
                idCategoria = "01";                
            }else{
                idCategoria = "02";
            }
            
        }
        String idMarca = "";
        String idProducto = "";
        if(idCategoria == "01"){
            String numero = String.format("%01d", random.nextInt(4)+1); 
            idProducto = "00"+numero+"0"+numero;
        }else{
            idProducto = "001";
            idMarca = "05";
        }
        
        
        String id = "AB-" + idCategoria + idProducto + idMarca;
        
        return id;
        
    }
    
   
        
        
}

