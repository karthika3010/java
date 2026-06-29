
package strategypattern;

public class UPI implements Payment
{
    @Override
    public void payAmount(int amt) 
    {
        System.out.println("Rs. "+amt+ " is paid via UPI");
    }
    
}
