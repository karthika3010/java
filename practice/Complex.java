import java.util.Scanner;
class Complex
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("Enter the total no of student : ");
		int tot = sc.nextInt();
		
		String student_name[]=new String [tot];
		
		int choice;
		int index = 0;
		do
		{
			System.out.println("1.Add students-Allow the user to enter student names one by one and store them in an array");
		    System.out.println("2.See the student list-display all student names that have been entered so far");
		    System.out.println("3.Exit-terminate the program");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
							System.out.println("Enter Name for Student"+(index+1));
							
							student_name[index]=sc1.nextLine();
							index++;
							break;

				case 2:
				
						for(int i = 0;i<student_name.length;i++)
						{
							if(student_name[i]!=null)
							{
								System.out.println(student_name[i]+" ");
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