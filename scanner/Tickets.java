import java.util.Scanner;
class Tickets
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		{
			System.out.print("Enter a number:");
			int num=sc.nextInt();
			switch(num)
			{
				case 1:
				{
					System.out.println("General class and rate for general is 300");
					break;
				}
				case 2:
				{
					System.out.println("sleeper class and rate for sleeper is 700");
					break;
				}
				case 3:
				{
					System.out.println("AC3 Tier and rate for AC3 Tier is 1000");
					break;
				}
				case 4:
				{
					System.out.println("AC2 Tier and rate for AC2 Tier is 1200");
					break;
				}
				case 5:
				{
					System.out.println("First Class and rate for first class is 2000");
				}
				default:
				{
					System.out.println("Tickets not available");
				}
			}
		}
	}
}