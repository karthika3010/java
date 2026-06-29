
package strategypattern;

public class PaymentContext 
{
   private final Payment pay;

    public PaymentContext (Payment pay) 
    {
        this.pay = pay;
    }
    
    public void paymentProcess(int amount)
    {
        pay.payAmount(amount);
    }
     
    
}
