import java.util.Scanner;
class States
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no.of.states:");
		int state=sc.nextInt();
		System.out.print("Enter the no.of.cities:");
		int city=sc.nextInt();
		String  arr[][]=new String[state][city];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print("Enter value of"+i+","+j+"index:");
				arr[i][j]=sc.next();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println("");
		}
	}
}