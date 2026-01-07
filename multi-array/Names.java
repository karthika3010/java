import java.util.Scanner;
class Names
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no.of.rows:");
		int row=sc.nextInt();
		System.out.print("Enter the no.of.columns:");
		int col=sc.nextInt();
		char  arr[][]=new char[row][col];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print("Enter value of"+i+","+j+"index:");
				arr[i][j]=sc.next().charAt(0);
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