/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendadelpeluquero.Sistema;

/**
 *
 * @author PC267
 *////hecho por: Jose David Zapata Jaramillo  y Michel Augusto Velasquez Ibarra
public class Node {
    
    public String value;
    private Node next;
    private Node before;
    
    public Node(String value,Node next,Node before){
        
        this.value = value;
        this.next = next;
        this.before = before;
        
    }
    
    public Node(String value){
        
        this.value = value;
        this.next = null;
        this.before = null;
        
    }
    
    public Node(){
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getBefore() {
        return before;
    }

    public void setBefore(Node before) {
        this.before = before;
    }
    
    
    
}
