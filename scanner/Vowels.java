import java.util.Scanner;
class Vowels
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		{
			System.out.print("Enter your letter:");
			char letter=sc.next().charAt(0);
			switch(letter)
			{
				case 'a':
				{
					System.out.println( "a is a voewls");
					break;
				}
				case 'e':
				{
					System.out.println("e is a vowel");
					break;
				}
				case 'i':
				{
					System.out.println("i is a voewl");
					break;
				}
				case 'o':
				{
					System.out.println("o is a vowel");
					break;
                }
				case 'u':
				{
					System.out.println("u is a vowel");
					break;
				}
				default:
				{
					System.out.println("it is a consonat");
				}
				
			}
		}
	}
}