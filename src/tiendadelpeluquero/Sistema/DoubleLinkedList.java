/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendadelpeluquero.Sistema;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author PC267
 */
public class DoubleLinkedList {
    
    public Node head;
    private Node end;
    String regex = "^AB-(01(001(01)|002(02)|003(03)|004(04))|02(00105))$";
    
    Pattern pattern = Pattern.compile(regex);
    public boolean Reabastecer;
    
    public DoubleLinkedList(){
        
    }
    
    public DoubleLinkedList(Node head,Node end){
        
        this.head = head;
        this.end = end;
        
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getEnd() {
        return end;
    }

    public void setEnd(Node end) {
        this.end = end;
    }
    
    public void insertBegining(Node node){
        
        Matcher matcher = pattern.matcher(node.getValue());
        if(matcher.matches()){
            
            if( this.head == null){
                this.head = node;
                this.end = node;
            
            }else{
                node.setNext(this.head);
                this.head.setBefore(node);
                this.head = node;
            
            }
            
        }
        
        
    }
    
    public String removeEnd(){
        if(listEmpty()){
            return null;
        } else if(this.head.getNext() == null){
            String node = this.head.value;
            this.head = null;
            this.end = null;
            return node;
        }
        
        Node oldEnd = this.end;
        
        this.end = this.end.getBefore();
        this.end.setNext(null);
        
        oldEnd.setBefore(null);
        return oldEnd.value;
    }
    
    private boolean listEmpty(){
        
        if(this.head == null){
            return true;
        }
        return false;
    }
    
    public void printList() {
        if (this.head == null) {
            System.out.println("The list is empty.");
        } else {
            var index = 0;
            Node actualNode = this.head;
            while (actualNode != null) {
                System.out.println("Node value: " + actualNode.getValue() + " - Index: " + index);
                actualNode = actualNode.getNext();
                index++;
            }
        }
    }
    
    public void Reabastecer(Colas cera,Colas secador,
            Colas plancha,Colas crema,Colas shampo){
        
        while(this.head != null){
            String articulo = this.removeEnd();
            
            
            
            if("01".equals(articulo.substring(3, 5))){
                if(null != articulo.substring(5, 8))switch (articulo.substring(5, 8)) {
                    case "001":
                        cera.agregarCola(articulo);
                        break;
                    case "002":
                        secador.agregarCola(articulo);
                        break;
                    case "003":
                        plancha.agregarCola(articulo);
                        break;
                    case "004":
                        shampo.agregarCola(articulo);
                        break;
                    default:
                        break;
                }
            }else if("02".equals(articulo.substring(3, 5))){
                crema.agregarCola(articulo);
            }
        }
    
    }
    
}
