import java.util.Scanner;
class Traffic
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		{
			System.out.print("Enter your signal colour:");
			String signal=sc.nextLine();
		    switch(signal)
			{
			  case "red" :
			  {
				  System.out.println("stop");
				  break;
			  }
			  case "green":
			  {
				  System.out.println("go");
				  break;
			  }
			  case "yellow":
			  {
				  System.out.println("wait");
				  break;
			  }
			  default:
			  {
				  System.out.println("Invalid signal");
			  }
			}
		}
	}
}