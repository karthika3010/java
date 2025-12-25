import java.util.Scanner;
class Grade
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		{
			System.out.print("Enter your Grade:");
		    char grade=sc.next().charAt(0);
		    switch(grade)
		    {
				case 'A':
                {
					System.out.println("Excellent");
				    break;
			    }
			    case 'B':
			    {
				    System.out.println("Very Good");
				    break;
			    }
			    case 'C':
			    {
				    System.out.println("Good");
				    break;
			    }
			    case 'D':
			    {
				    System.out.println("Okey");
				    break;
			    }
			    default:
			    {
				    System.out.println("Not okey");
				    break;
			    }
			}	
		}
	}
}