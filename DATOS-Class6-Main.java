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
public class DATOS_Class6 {

    public static void main(String[] args) {
        Node firstNode = new Node("N1");
        Node secondNode = new Node("N2");
        Node thirdNode = new Node("N3");
        
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        
        //System.out.println("Element:"+firstNode.getElement().toString());
        //System.out.println("Next Element:"+firstNode.getNext().getElement().toString());
        ElementsList myList = new ElementsList();
        myList.addElementInFirstPosition("Andres");
        myList.addElementInFirstPosition("Eddy");
        myList.addElementInFirstPosition("Gabriel");
        myList.addElementInFirstPosition("Norvin");
        myList.addElementInFirstPosition("Brian");
        myList.addElementInFirstPosition("Felipe");
        myList.addElementInFirstPosition("Johan");
        myList.addElementInFirstPosition("Fabricio");
        myList.addElementInFirstPosition("Yaneiry");
        System.out.println("The List has:"+myList.getSize()+" Elements");
        
    }
    
}
