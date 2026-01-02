import java.util.Scanner;
class Arms
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value for a:");
		int a=sc.nextInt();
		int temp=a;
		int rem=0;
		int sum=0;
		while(temp>0)
		{
			rem=temp%10;
	        sum=sum+(rem*rem*rem);
	        temp=temp/10;
		}
		if(a==sum)
        {
			System.out.println("it is a Armstrong number");
        }
        else
        {
	       System.out.println("it is  not a Armstrong number");
        }

    }
}