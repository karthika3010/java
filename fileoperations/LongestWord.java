
package fileoperations;

import java.io.File;
import java.util.Scanner;


public class LongestWord
{
    public static void main(String[] args) throws Exception {
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
