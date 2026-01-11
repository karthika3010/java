import java.util.Scanner;
class Evalution1
{
	int mark1,mark2,mark3;
	int total;
	float percentage;
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args)
	{
		Evalution1 evl= new Evalution1();
		evl.inputmarks();
		evl.mainmenu();
	}
	void mainmenu()
	{
		Scanner sc=new Scanner(System.in);
		int option;
		do
		{
			System.out.println("-----Main Menu-----");
			System.out.println("1.Display Result");
			System.out.println("2.Display Grade");
			System.out.println("3.Display Total");
			System.out.println("4.Display percentage");
			System.out.println("5.Exit");
			System.out.println("Enter Your Option:");
			option=sc.nextInt();
			switch(option)
			{
				case 1:
				{
					System.out.println("Display Result");
					displayresult();
					break;
				}
				case 2:
				{
					System.out.println("Display Grade");
					displaygrade();
					break;
				}
				case 3:
				{
					System.out.println("Display Total");
					calculate_total();
					System.out.println("Your Total Marks is:"+total);
					break;
				}
				case 4:
				{
					System.out.println("Display percentage");
					calculate_percentage();
				    System.out.println("Your Total percentage is:"+percentage);
					break;
				}
				case 5:
				{
					System.out.println("Exit the program");
					break;
				}
				default:
				{
					System.out.println("please...Enter Valid Option!!!");
				}
			}
		}while(option!=5);
	}
	void inputmarks()
	{
		System.out.print("Enter your Mark1:");
		mark1=sc.nextInt();
	    System.out.print("Enter your Mark2:");
		mark2=sc.nextInt();
	    System.out.print("Enter your Mark3:");
		mark3=sc.nextInt();
	}
	int calculate_total()
	{
	    total=mark1+mark2+mark3;
		return total;
		
	}
	float  calculate_percentage()
	{
		calculate_total();
	     percentage = (total * 100.0f) / 300;
         return percentage;
	
	}
	void displayresult()
	{
		calculate_percentage();
		if(percentage>=40)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	void displaygrade()
	{
		calculate_percentage();
		if(percentage>=75)
		{
			System.out.println("A Grade");
		}
		else if((percentage<75)&&(percentage>=60))
		{
			System.out.println("B Grade");
		}
		else if((percentage<60)&&(percentage>=40))
		{
			System.out.println("C Grade");
		}
		else
		{
			System.out.println("F Grade");
		}
	}
	

}