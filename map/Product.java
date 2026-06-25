
package map;

import java.util.HashMap;

public class Product 
{
    public static void main(String[] args) 
    {
        HashMap<String,Integer> map = new HashMap<>();
        
        map.put("Rice",50);
        map.put("Oil",40);
        map.put("Hamam",100);
        map.put("Biscuit",78);
        map.put("Salt",56);
        
        System.out.println("Before Update");
        System.out.println(map);
        
        System.out.println(map.get("Biscuit"));
        
        System.out.println("After Update");
        map.put("Rice",100);
        System.out.println(map);
        
        map.remove("Hamam");
        System.out.println(map);
        
        map.values();
        
    }
    
}
