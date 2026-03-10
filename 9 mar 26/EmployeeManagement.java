import java.util.Scanner;
class EmployeeManagement
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		Employee emp[]=new Employee[100];
		int count=0;
		int choice;
	
		System.out.println("1.Add Employee");
		System.out.println("2.View Employee");
		System.out.println("3.Search Employee");
		System.out.println("4.Exit");
		System.out.println("Enter your Choice:");
		choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
			{
				System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Department: ");
                String dept = sc.nextLine();

                emp[count] = new Employee(id, name, dept);
                count++;

                System.out.println("Employee Added!");
                break;
			}
			case 2:
			{
				for(int i=0;i<count;i++)
                {
                    emp[i].display();
                }
                break;

			}
			case 3:
			{
				System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for(int i=0;i<count;i++)
                    {
                        if(emp[i].id == searchId)
                        {
                            emp[i].display();
                            found = true;
                            break;
                        }
                    }

                    if(!found)
                    {
                        System.out.println("Employee not found");
                    }

                    break;

			}
			case 4:
			{
				System.out.println("Exiting...");
                break;
			}
			default:
			{
				 System.out.println("Invalid choice");
			}
		}while(choice!=4);
		
		
	}
}