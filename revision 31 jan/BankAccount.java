class BankAccount
{
	int balance=1000;
	
	void deposit(int depositamount)
	{
		
		balance=balance+depositamount;
	}
	
	void withdraw(int withdrawamount)
	{
		
		if(balance>=withdrawamount)
		{
		balance=balance-withdrawamount;
		}
		else
		{
			System.out.println("Vaippu illa Raja...");
		}
	}
	
	void display()
	{
		System.out.println("Your Balance Amount is:" + balance);
	}
}