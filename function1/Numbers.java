import java.util.Scanner;
class Numbers
{
	int num[]=new int[10];
	Scanner sc=new Scanner(System.in);
	int zero_count=0;
	int positive_numbers=0;
	int negative_numbers=0;
	public static void main(String[] args)
	{
		Numbers n=new Numbers();
		n.mainmenu();
	}
	void mainmenu()
	{
		int option;
		do
		{
			System.out.println("1.Enter Numbers");
			System.out.println("2.Display Numbers");
			System.out.println("3.Count Positive Numbers");
			System.out.println("4.Count Negative Numbers");
			System.out.println("5.count Zeros");
			System.out.println("6.Exit");
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
					positive_numbers();
					break;
				}
				case 4:
				{
					negative_numbers();
					break;
				}
				case 5:
				{
					zeros_count();
					break;
				}
				case 6:
				{
					System.out.println("Exit the program...");
					break;
				}
				
				default:
				{
					System.out.println("please...Enter valid option!!!");
				}
			}
		}while(option!=6);
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
	void positive_numbers()
	{
        int count = 0;
        for(int i = 0; i < 10; i++)
        {
            if(num[i] > 0)
                count++;
        }
        System.out.println("Positive numbers count: " + count);
    }
	void negative_numbers()
	 {
        int count = 0;
        for(int i = 0; i < 10; i++)
        {
            if(num[i] < 0)
                count++;
        }
        System.out.println("Negative numbers count: " + count);
    }
	void zeros_count()
	{
        int count = 0;
        for(int i = 0; i < 10; i++)
        {
            if(num[i] == 0)
                count++;
        }
        System.out.println("Zero count: " + count);
    }
		
}
	
