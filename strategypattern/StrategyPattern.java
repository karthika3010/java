
package strategypattern;

public class StrategyPattern
{
    public static void main(String[] args)
    {
        Payment gPay = new UPI();
        Payment sbicc = new CreditCardPayment();
        Payment hdfcdc = new NetBankingPayment();
        
        PaymentContext pc = new PaymentContext(hdfcdc);
        
        pc.paymentProcess(890);
    }
    
}
