
package string.and.stringbuffer;

import java.util.Scanner;

public class StringAndStringbuffer {

   
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter a sentence:");
        String sentence=sc.nextLine();
        
        int charcount=0;
        int vowelcount=0;
        
        for(int i=0;i<sentence.length();i++)
        {
            char ch=sentence.charAt(i);
            
            
            if(ch != ' ')
            {
                charcount++;
            }
            char lower=Character.toLowerCase(ch);
            if(lower=='a'||lower=='e'||lower=='i'||lower=='o'||lower=='u')
            {
                vowelcount++;
            }
        }
        
        String[] words=sentence.split(" ");
        int wordcount=words.length;
        
        System.out.println("total characters (without spaces):"+charcount);
        System.out.println("total words:"+wordcount);
        System.out.println("total vowels:"+vowelcount);
        
        sc.close();
        
        
    }
    
}
