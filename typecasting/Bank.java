import java.util.Scanner;
class Bank
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		double balance=5000.456;
		
		float withdrawel;
		System.out.println("Enter the withdrawel amount:");
		withdrawel=sc.nextFloat();
		
		
		
		int w2 = (int) withdrawel;
        double wrongBalance = balance - w2;

        System.out.println("Balance after wrong casting: " + wrongBalance);
		
		double w3 = withdrawel;
        double correctBalance = balance - w3;

        System.out.println("Balance after proper casting: " + correctBalance);
		
		
		
	}
}