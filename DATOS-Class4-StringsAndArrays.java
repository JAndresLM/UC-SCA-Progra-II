package datos.thirdclass;

public class DATOSThirdClass {
    public static void main(String[] args) {
        char letter = 'A';
        
        //This is the way to declare a string
        String myFullName = "andres Lopez Molina";
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
        
        // This fuction is to get the last position of X letter
        int lastPositionOfLetter = myFullName.lastIndexOf("a");
        
        //This function is to replace X character by Y Character
        String newFullName = myFullName.replace(' ', '&');
        
        // this function is to split the string in a list
        String[] myList = myFullName.split(" ");
        String[] myList2 = myFullName.split(" ",1);//with limits
        
        // This function is get a substring of the big string
        String newSubString = myFullName.substring(3,9);
        
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
        
        //String[] alphabet = new String[4];
        String[] alphabet = {"a","b","c","d"};
        alphabet[3] = "d";
    }
}
