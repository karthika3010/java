import java.util.Scanner;
class Bank
{
	float accountbalance=0.0f;
	public static void main(String[] args)
	{
		Bank b=new Bank();
	    b.mainmenu();
		
		
	}
	
	
	void mainmenu()
	{
		Scanner sc=new Scanner(System.in);
		int option;
		do
		{
			System.out.println("-----Main Menu-----");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Checkbalance");
			System.out.println("4.Exit");
			System.out.println("Enter Your Option:");
			option=sc.nextInt();
			switch(option)
			{
				case 1:
				{
					System.out.println("Enter your deposit amt:");
					double depositamt=sc.nextDouble();
					deposit(depositamt);
		            break;
				}
				case 2:
				{
					System.out.println("Enter your withdrawal amt");
					double withdrawamt=sc.nextDouble();
					withdraw(withdrawamt);
			        break;
				}
				case 3:
				{
					System.out.println("check balance");
					check_balance();
					break;
				}
				case 4:
				{
					System.out.println("Exit the program");
					break;
				}
				default:
				{
					System.out.println("please...Enter Valid Option!!!");
				}
			}
		}while(option!=4);
	}
	void deposit(double depositamt)
	{
		accountbalance+=depositamt;
	}
	void withdraw(double withdrawamt)
	{
		if(accountbalance>=withdrawamt)
		{
			accountbalance-=withdrawamt;
		}
		else
		{
			System.out.println("Enter lesser amount!!!");
		}
		
	}
	void check_balance()
	{
		System.out.println(accountbalance);
	}
}