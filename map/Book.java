
package map;

import java.util.HashMap;

public class Book
{
    public static void main(String[] args) 
    {
        HashMap<String,Integer> book = new HashMap<>();
        {
            
            book.put("Java",1);
            book.put("Python",2);
            book.put("OS",3);
            book.put("C",4);
            book.put("C++",5);

            System.out.println("Before Update");
            System.out.println(book);

            System.out.println(book.get("Java"));

            System.out.println("After Update");
            book.put("C++",5);
            System.out.println(book);

            book.remove("Java");
            System.out.println(book);

            book.values();
            
        }
    }
        
    
    
}
