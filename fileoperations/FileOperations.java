
package fileoperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {

    public static void main(String[] args) throws IOException 
    {
        /*
        File fi=new File("A:\\fileoperations.txt");
        if(fi.createNewFile())
        {
            System.out.println("file created");
        }
        else
        {
            System.out.println("file is already exist");
        }
        FileWriter fw=new FileWriter(fi);
        fw.write("today's date:25/2/26");
        fw.close();
*/
         Scanner sc = new Scanner(new File("A:\\input.txt"));

        String longest = "";
        while (sc.hasNext()) {
            String word = sc.next();
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        sc.close();
        System.out.println("Longest word: " + longest);
        
    }
}
    
    

