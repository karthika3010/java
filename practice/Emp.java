import java.util.Scanner;
class Emp
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("Enter the total no of Employee : ");
		int tot = sc.nextInt();
		
		String emp_name[]=new String [tot];
		
		int choice;
		int index = 0;
		do
		{
			System.out.println("1.Add employee names");
		    System.out.println("2.Display the list of all employees.");
		    System.out.println("3.Exit the program.");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
							System.out.println("Enter Name for employee"+(index+1));
							
							emp_name[index]=sc1.nextLine();
							index++;
							break;

				case 2:
				
						for(int i = 0;i<emp_name.length;i++)
						{
							if(emp_name[i]!=null)
							{
								System.out.println(emp_name[i]+" ");
							}
						}
						
						break;
						
				case 3 :
						break;
				default:
							System.out.print("Enter the correct choice... ");
				
						
			}
			
		}while(choice!=3);
	}
}