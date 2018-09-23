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
public class Animal {
    private String name;
    private String habitat;
    private char genre;
    private int age;
    
    public Animal(String name, String habitat){
        this.name = name;
        this.habitat = habitat;
        this.genre = 'F';
        this.age = 0;   
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String newName){
        this.name = newName;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void walk(){
        System.out.println("This animal is walking");
    }
    
    public void eat(String food){
        System.out.println("This "+this.name + " is eating "+food);
    }
}
