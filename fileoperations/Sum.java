
package fileoperations;

import java.io.File;
import java.util.Scanner;


public class Sum 
{
     public static void main(String[] args) throws Exception {
        File file = new File("A:\\numbers.txt");
        Scanner sc = new Scanner(file);

        int sum = 0;
        while (sc.hasNextInt()) {
            sum += sc.nextInt();
        }

        sc.close();
        System.out.println("Sum = " + sum);
    }
    
    
}
