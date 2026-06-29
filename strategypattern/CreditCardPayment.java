
package strategypattern;

public class CreditCardPayment implements Payment
{
     @Override
    public void payAmount(int amt) 
    {
        System.out.println("Rs. "+amt+ " is paid via Credit Card");
    }
}
