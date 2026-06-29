
package observer.pattern;

public class Customer implements OrderObserver
{
    private String name;

    public Customer(String name) 
    {
        this.name = name;
    }

    @Override
    public void update(String status)
    {
        switch (status)
        {
            case "Ordered":
                System.out.println(name + ": Your order has been placed successfully.");
                break;
            case "Packed":
                System.out.println(name + ": Your order has been packed.");
                break;
            case "Shipped":
                System.out.println(name + ": Your order has been shipped.");
                break;
            case "Delivered":
                System.out.println(name + ": Your order has been delivered successfully.");
                break;
        }
    }
    
}
