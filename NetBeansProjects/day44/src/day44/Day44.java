
package day44;

import java.util.Scanner;


public class Day44 {

    
    public static void main(String[] args)
    {
     
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Principal Amount:");
        double principal=sc.nextDouble();
        
        System.out.println("Enter the Number of Years:");
        int years=sc.nextInt();
        
        double interest = Bank.calculateinterest(principal,years);
        
        Bank bk=new Bank();
        bk.display(principal, years,interest);
        
    }
    
}
