/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.thirdclass;

/**
 *
 * @author Andres
 */
public class DATOSThirdClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letter = 'A';
        
        //This is the way to declare a string
        String myFullName = "Andres Lopez Molina";
        String ageMessage = "I am 24 years old";
        
        //You can use these ways to concatenate strings
        String completeMessage = "I am "+myFullName+ " and "+ageMessage;
        
        //This function is to get the number of elements
        int amountOfLetters = myFullName.length();
        
        //This function is to get an element in X position
        char firstLetter = myFullName.charAt(0);
        
        //This function determine if string ends with specific test
        boolean correctOpening = myFullName.startsWith("andrew");
        
        //This function determine if string ends with specific test
        boolean correctEnding = myFullName.endsWith("Molina");
        
        //This fuction is to compare strings
        boolean sameNameWithCases = myFullName.equalsIgnoreCase("andres lopez molina");
        boolean sameName = myFullName.equals("andres lopez molina");
        
        //This function is to convert string in lower case
        String nameWithLowerCase = myFullName.toLowerCase();
        
        //This function is to convert string in upper case
        String nameWithUpperCase = myFullName.toUpperCase();
        
        //This function is to get the position of X Letter
        int positionOfLetter = myFullName.indexOf("X");
        
        //This function is to convert chars on strings
        String vowel = String.valueOf(myFullName.charAt(0));
        String vowelA = String.valueOf('A');
        
        String fullText = "This is a full message with vowels";
        int numberOfVowels = 0;
        for (int index=0;index<fullText.length();index++){
            char specificLetter = fullText.charAt(index);
            String specificStringLetter = String.valueOf(specificLetter);
            if(specificStringLetter.equalsIgnoreCase("a") || specificStringLetter.equalsIgnoreCase("e") ||specificStringLetter.equalsIgnoreCase("i") ||specificStringLetter.equalsIgnoreCase("o") ||specificStringLetter.equalsIgnoreCase("u"))
                numberOfVowels++;
        }
        System.out.println("El texto tiene "+numberOfVowels+" vocales");
        System.out.println("La primera A esta en la posicion: "+fullText.indexOf("a"));

    }
    
}
