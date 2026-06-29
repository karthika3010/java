
package observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class Order
{
    private List<OrderObserver> observers = new ArrayList<>();
    private String status;

    public void addObserver(OrderObserver observer)
    {
        observers.add(observer);
    }

    public void setStatus(String status)
    {
        this.status = status;
        notifyAllObservers();
    }

    private void notifyAllObservers()
    {
        for (OrderObserver observer : observers)
        {
            observer.update(status);
        }
    }
    
}
