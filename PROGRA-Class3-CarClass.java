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
public class Car {
    private String id;
    private String brand;
    private String color;
    private int numberOfDoors;
    private String transmission;
    private int price;
    private String owner;
    private int currentSpeed;
    private int acceleration;
    private boolean isOn;

    public Car(String id, String brand, String color, int numberOfDoors, String transmission, int price, String owner, int acceleration) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.transmission = transmission;
        this.price = price;
        this.owner = owner;
        this.acceleration = acceleration;
        this.currentSpeed = 0;
        this.isOn =false;
    }
    
    public void turnInOn(){
        if (this.isOn){
            System.out.println("The Car is already On");
        }else{
            System.out.println("The car in being turned on");
            this.isOn = true;
            System.out.println("The car was turned on successfully");
        }
    }
    
    public void accelerate(){
        if (this.isOn){
            this.currentSpeed = this.currentSpeed + this.acceleration;
            System.out.println("The car is running at "+currentSpeed +" Km/h");
        }else{
            System.out.println("the Car is off, please turn it on first");
        }
    }
    
    public void stop(){
        if (this.isOn){
            this.currentSpeed = 0;
            System.out.println("the car was stopped");
            System.out.println("The car is running at "+currentSpeed +" Km/h");
        }else{
            System.out.println("the Car is off,so it is already stopped");
        }
    }
    
    public void turnItOff(){
        if (this.isOn){
            if (this.currentSpeed > 0){
                System.out.println("Unable to turn it off when is running, please stop first");
            }else{
                this.isOn = false;
                System.out.println("The car was turned it off successfully");
            }
        }else{
            System.out.println("the Car was off, so your action does not work");
        }
    }
}
