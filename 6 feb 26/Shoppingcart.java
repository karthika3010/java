import java.util.Scanner;
class Shoppingcart
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		Display display=new Display();
		Insert insert=new Insert();
		int choice;
		do
		{
			System.out.println("1.Add product to cart");
			System.out.println("2.View Cart Items");
			System.out.println("3.Exit");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					System.out.println("Add product to cart");
					System.out.println("Enter Product id:");
					int id=sc.nextInt();
					System.out.println("Enter the Product name:");
					String name=sc1.nextLine();
					System.out.println("Enter price:");
					double price=sc.nextDouble();
					insert.increaseproduct(id,name,price);
					break;
				}
				case 2:
				{
					System.out.println("View Cart Items");
					display.display(insert.getHead());
					break;
				}
				case 3:
				{
					System.out.println("the program is exiting...");
					break;
				}
				default:
				{
					System.out.println("Invalid choice!!! Enter the Correct choice...");
				}
			}
		}while(choice!=3);
	}
}

