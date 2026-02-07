import java.util.Scanner;
class MainMenu
{
	public static void main(String[] args)
	{
		BankAccount obj=new BankAccount();
		
		boolean status=true;
		do
		{
			System.out.println("Which Operations You Want to Perform");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Display");
			System.out.println("4.Exit");
			System.out.println("Enter Your Choice:");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				System.out.println("Enter the Deposit Amount:");
				int depositamount=sc.nextInt();
				obj.deposit(depositamount);
				break;
				case 2:
				System.out.println("Enter the withdraw Amount:");
				int withdrawamount=sc.nextInt();
				obj.withdraw(withdrawamount);
				break;
				case 3:
				obj.display();
				break;
				case 4:
				System.out.println("thankyou for your visit");
				status=false;
				break;
				default:
				System.out.println("invalid choice!!! pls enter valid option");
            }
			
		}while(status);
	}
}