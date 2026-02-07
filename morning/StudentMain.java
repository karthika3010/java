import java.util.Scanner;
class StudentMain 
{
	public static void main(String[] args)
	{
		Student stu=new Student();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a name:");
		stu.name=sc.nextLine();
		
		System.out.println("Enter the id:");
		stu.studentid=sc.nextInt();
		
		System.out.println("Enter the number of subjects:");
		int n=sc.nextInt();
		
		stu.arrmarks=new int[n];
		
		System.out.println("Enter the Marks:");
		for(int i=0;i<n;i++)
		{
			stu.arrmarks[i]=sc.nextInt();
		}
		
		stu.calculate_total();
		stu.calculate_avg();
		stu.display();
	}
}