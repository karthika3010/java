import java.util.Scanner;
class Bill
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Up to 100 units");
		System.out.println("2.101 to 200 units");
		System.out.println("3.Above 200 units");
		System.out.print("Enter your choice:");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			{
				System.out.print("Enter your electricity unit:");
				int unit=sc.nextInt();
				unit=unit*5;
				System.out.print("Your electricity bill is:"+unit);
				break;
			}
			case 2:
			{
				System.out.print("Enter your electricity unit:");
				int unit1=sc.nextInt();
				unit1=unit1*7;
				System.out.print("Your electricity bill is:"+unit1);
				break;
			}
			case 3:
			{
				System.out.print("Enter your electricity unit:");
				int unit2=sc.nextInt();
				unit2=unit2*10;
				System.out.print("Your electricity bill is:"+unit2);
				break;
			}
			
		}
		
	}
}