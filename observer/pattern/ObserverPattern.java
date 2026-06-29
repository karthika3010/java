
package observer.pattern;

public class ObserverPattern 
{
    public static void main(String[] args) 
    {
        Order order = new Order();

        Customer c1 = new Customer("Alice");
        order.addObserver(c1);

        order.setStatus("Ordered");
        order.setStatus("Packed");
        order.setStatus("Shipped");
        order.setStatus("Delivered");
    }
    
}
