import static org.junit.Assert.*;
import org.junit.Test;

public class BankAccountTest 
{
    @Test
    public void testDeposit() 
    {
        BankAccount acc = new BankAccount(1000);
        acc.deposit(500);
        assertEquals(1500, acc.checkBalance(), 0.001);
    }

    @Test
    public void testWithdraw() 
    {
        BankAccount acc = new BankAccount(1000);
        acc.withdraw(300);
        assertEquals(700, acc.checkBalance(), 0.001);
    }

    @Test
    public void testCheckBalance() 
    {
        BankAccount acc = new BankAccount(2000);
        assertEquals(2000, acc.checkBalance(), 0.001);
    }
}