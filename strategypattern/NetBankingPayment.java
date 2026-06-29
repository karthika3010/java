
package strategypattern;

public class NetBankingPayment implements Payment
{
    @Override
    public void payAmount(int amt) 
    {
         System.out.println("Paid " + amt+ " using Net Banking.");
    }
    
}
