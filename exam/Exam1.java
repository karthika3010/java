import java.util.Scanner;
class Exam1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		int option;
		
		int n=0;
		do
		{
			
			System.out.println("1.Insert elements into the array");
			System.out.println("2.Display array elements");
			System.out.println("3.Find the sum of the all elements");
			System.out.println("4.Find the largest element");
			System.out.println("5.Exit");
			System.out.print("Enter  your option:");
			option=sc.nextInt();
			
			switch(option)
			{
				
				case 1:
				{
					System.out.print("Enter number of elements (max 10): ");
                    n = sc.nextInt();
                    System.out.println("Enter elements:");
					

                    for(int i = 0; i < n; i++)
                    {
                        arr[i] = sc.nextInt();
                    }
                    break;
					
				}
				case 2:
				{
					System.out.println(" array elements");
					for(int i=0;i<n;i++)
					{
						System.out.println(arr[i] +"");
					}
					break;
				}
				case 3:
				{
					int sum=0;
					for(int i=0;i<n;i++)
					{
						
						sum+=arr[i];
					}
					System.out.println("sum of the all elements"+sum);
					
					break;
				}
				case 4:
				{
					int larger=arr[0];
					System.out.println(" largest element");
					for(i=0;i<n;i++)
					{
						if(arr[i] > larger)
                        {
                            larger = arr[i];
                        }
						System.out.println("Largest element: " + larger);
					}
					
					break;
				}
				case 5:
				{
					System.out.println("Exiting the program");
					break;
				}
				default:
				{
					System.out.println("Invalid option!!! Enter correct Option....");
				}
			}
		}while(option!=5);
	}
}