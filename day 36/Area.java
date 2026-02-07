import java.util.Scanner;
class Area
{
	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		int option;
		do
		{
			System.out.println("1.Circle");
			System.out.println("2.Square");
			System.out.println("3.Exit");
			System.out.println("Enter Your Option");
			option=sc.nextInt();
			switch(option)
			{
				case 1:
				System.out.println("Area Calculation Of Circle");
				System.out.println("Enter the radius of the cicle:");
				double radius=sc.nextDouble();
				Circle cr=new Circle(radius);
				System.out.println("The Area Of Circle:"+cr.CalculateArea());
				break;
				
				case 2:
				System.out.println("Area Calculation Of Square");
				System.out.println("Enter the side of the square:");
				double side=sc.nextDouble();
				Square sq=new Square(side);
				System.out.println("The Area Of Square:"+sq.CalculateArea());
				break;
				
				case 3:
				System.out.println("Exiting The Program...");
				break;
				
				default:
				System.out.println("Invalid option!!! Enter the correct option...");
			}
		}while(option!=3);	
	}
}