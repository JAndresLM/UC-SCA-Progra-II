/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos_class6;

/**
 *
 * @author Andres
 */
public class ElementsList {
    private Node head;
    private int size;

    public ElementsList() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }
    
    public void addElementInFirstPosition(Object object){
        if (head==null){
            head = new Node(object);
        }else{
            Node newNode = new Node(object);
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }
    
   
}
