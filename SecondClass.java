/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondclass;

import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class SecondClass {

    public static int getNumber(){
        System.out.println("Por Favor digite un numero:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }
    
    public static boolean isEven(int number){
        boolean isEven = false;
        if (number%2==0)
            isEven = true;
        return isEven;    
    }
    
    public static void printResult(boolean result){
        if (result)
            System.out.println("El numero es Par");
        else
            System.out.println("El numero es impar");
    } 
    
    
    public static void main(String[] args) {
        int number = getNumber();
        boolean isEvenNumber = isEven(number);
        printResult(isEvenNumber);
    } 
}
