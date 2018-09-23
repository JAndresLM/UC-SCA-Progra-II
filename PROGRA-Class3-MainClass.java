/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prograthirdclass;

/**
 *
 * @author Andres
 */
public class PrograThirdClass {

    /**
     * @param args the command line arguments
     */
    public static void database(){
        String stringNumber = "12456";
        int intNumber = Integer.parseInt(stringNumber);
        System.out.println("Numero convertido:"+intNumber);
        
        int secondNumber = 124578;
        String secondStringNumber = String.valueOf(intNumber);
    }
    
    public static void main(String[] args) {
        Animal tommy = new Animal("cat", "home");
        tommy.setName("Dog");
        /*System.out.println("Tommy is a "+tommy.getName());
        tommy.walk();
        tommy.eat("meat");*/
        
        Car myNewCar = new Car("ALM-794", "Audi", "Grey", 4, "Automatic", 50000, "Andres", 23);
        myNewCar.accelerate();
        myNewCar.turnInOn();
        myNewCar.accelerate();
        myNewCar.accelerate();
        myNewCar.accelerate();
        myNewCar.accelerate();
        myNewCar.turnItOff();
        myNewCar.stop();
        myNewCar.turnItOff();
    }
    
}
