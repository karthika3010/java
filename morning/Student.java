import java.util.Scanner;
class Student
{
	int studentid;
	String name;
	int arrmarks[];
	double avgmarks;
	int total;
	
	void calculate_total()
	{
		total=0;
		for(int i=0;i<arrmarks.length-1;i++)
		{
			total+=arrmarks[i];
		}
	}
	
	void calculate_avg()
	{
		avgmarks=total/arrmarks.length;
		
	}
	
	
	
	void display()
	{
		System.out.println("Student Name:"+name);
		System.out.println("Student id:"+studentid);
		System.out.println("Student avgmark is:"+avgmarks);
		System.out.println("Student Total is:"+total);
		System.out.println("Result is:");
		
		if(avgmarks>=50)
		{
			System.out.println("Result:Pass");
		}
		else
		{
			System.out.println("Result:Fail");
		}
		
		
		
	}
	
		
	
}