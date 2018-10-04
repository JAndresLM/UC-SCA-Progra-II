package progra_class5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PROGRA_Class5 {

    public static void printFileInfo(){
        String fileName = "C:\\Users\\Andres\\Desktop\\names.txt";
        String myLine = null;
        
        try {
            FileReader myFileReader = new FileReader(fileName);
            BufferedReader myBufferedReader =  new BufferedReader(myFileReader);
            
            myLine = myBufferedReader.readLine();
            while(myLine != null){
                System.out.println("Student name is:"+myLine);
                myLine = myBufferedReader.readLine();
            }
            myBufferedReader.close();
        } catch(FileNotFoundException myException) {
            System.out.println("Unable to open file '" + fileName + "'");
            System.out.println(""+myException.getMessage());
            myException.printStackTrace();
        } catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
            System.out.println(""+ex.getMessage());
        }catch (Exception e) {
            System.out.println("Unknown Issue, why?");
        }
    }
    
    public static void writeFileInfo(){
        String fileName = "C:\\Users\\Andres\\Desktop\\movies.txt";
        try {
            FileWriter myFileWriter = new FileWriter(fileName);
            BufferedWriter myBufferedWriter = new BufferedWriter(myFileWriter);
            
            myBufferedWriter.write("Intensamente");
            myBufferedWriter.newLine();
            myBufferedWriter.write("La Princesa Mononoke");
            myBufferedWriter.newLine();
            myBufferedWriter.write("Wonder Woman");
            
            myBufferedWriter.close();
        }catch(IOException ex) {
            System.out.println("Error writing to file '"+ fileName + "'");
        }
    }
    
    public static void confirmExit(){
        System.out.println("Press Enter to exit");
        Scanner scanner = new Scanner(System.in);
        String quit = scanner.nextLine();
    }
    
    public static void main(String[] args) {
        printFileInfo();
        writeFileInfo();
        confirmExit();  
    } 
}
