
package map;

import java.util.HashMap;

public class Movie 
{
    public static void main(String[] args)
    {
    
        HashMap<String,Double> movies = new HashMap<>();
        {

            movies.put("Leo",4.5);
            movies.put("Vikram",4.8);
            movies.put("Master",4.2);
            movies.put("jailer",4.7);
            movies.put("miruthan",4.5);

            System.out.println("Before Update");
            System.out.println(movies);

            System.out.println(movies.get("Vikram"));

            System.out.println("After Update");
            movies.put("Master",5.2);
            System.out.println(movies);

            movies.remove("jailer");
            System.out.println(movies);

            movies.values();
        }
    }
}
