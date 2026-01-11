import java.util.Scanner;
class Num
{
	int num[]=new int[10];
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		Num n=new Num();
		n.mainmenu();
	}
	void mainmenu()
	{
		int option;
		do
		{
			System.out.println("1.Enter Numbers");
			System.out.println("2.Display Numbers");
			System.out.println("3.Display Numbers in reverse order");
			System.out.println("4.Exit");
			System.out.println("Enter your option:");
			option=sc.nextInt();
			switch(option)
			{
				case 1:
				{
					enter_numbers();
					break;
				}
				case 2:
				{
					display_number();
					break;
				}
				case 3:
				{
					reverse_order();
					break;
				}
				case 4:
				{
					System.out.println("Exit the program!!!");
					break;
				}
				default:
				{
					System.out.println("please...Enter valid option!!!");
				}
			}
		}while(option!=4);
	}
	void enter_numbers()
	{
		System.out.println("Enter 10 numbers:");
		for(int i=0;i<10;i++)
		{
			num[i]=sc.nextInt();
		}
	}
	void display_number()
	{
		System.out.println("Display the Numbers...");
		for(int i=0;i<10;i++)
		{
			System.out.println(num[i]+"");
			
		}
		System.out.println();
	}
	void reverse_order()
	{
		System.out.println("Display the reverse Numbers...");
		for(int i=9;i>=0;i--)
		{
			System.out.println(num[i]+"");
			
		}
		System.out.println();
	}
}