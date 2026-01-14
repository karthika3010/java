import java.util.Scanner;
class Books
{
	public static void main(String[] args)
	{
		String book_name=new String[10];
		int book_id=new int[10];
		
		int index=0;
		int option;
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1.Add Books");
			System.out.println("2.Display All Books");
			System.out.println("3.Search Book By Id");
			System.out.println("4.Exit");
			System.out.println("Enter your option:");
			option=sc.nextInt();
			switch(option)
			{
				case 1:
				{
					if(index<10)
					{
					System.out.println("Adding Books");
					System.out.println("Enter a BookName"+(index+1));
				    book_name[index]=sc1.nextLine();
					System.out.println("Enter the BooksId:");
					book_id=sc.nextInt();
				    index++;
					}
					else
					{
						System.out.println("library is full");
					}
					break;
				}
				case 2:
				{
					System.out.println("Displaying All Books");
					break;
				}
				case 3:
				{
					System.out.println("Searching Books By Id");
					break;
				}
				case 4:
				{
					System.out.println("Exiting the program...");
					break;
				}
				default:
				{
					System.out.println("Invalid option...Enter valid option!!!");
				}
				
			}
		}while(option!=4);
	}
}