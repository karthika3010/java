
package day42;


public class Node
{
    int mob_id;
    String brand_name;
    double price;
    Node next;
    
    Node(int mob_id,String brand_name,double price)
    {
        this.mob_id=mob_id;
        this.brand_name=brand_name;
        this.price=price;
    }
    
}
