import java.util.Scanner;
class Numbers
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		if((num%2==0)&&(num%1==0))
		{
			System.out.println("the num is a prime number");
		}
		else 
		{
			System.out.println("the num is not a prime number");
		}
	}
}
