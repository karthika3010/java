import java.util.Scanner;
class Songs
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("SPOTIFY WELCOMES YOU");
		System.out.println("1. A.R. RAHMAN");
		System.out.println("2. ANIRUDH");
		System.out.println("3. HARISH JEYARAJ");
		System.out.print("Enter your choice:");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("welcome to A.R.RAHMAN Hits");
			System.out.println("1.Melody songs");
			System.out.println("2.Motivational songs");
			System.out.println("3.Kuthu songs");
			System.out.println("4.Sad songs");
			System.out.print("Enter your choice:");
			int option=sc.nextInt();
			if(option==1)
			{
				System.out.println("Welcome To A.R.RAHMAN  Melody Hits");
				System.out.println("• Netru illadha Matram");
				System.out.println("• Enna Solla Pogirai");
				System.out.println("• Ennavale Adi Ennavale");
				System.out.println("• Malargale Malargale");
				
			}
			else if(option==2)
			{
				System.out.println("Welcome To A.R.RAHMAN Motivational Hits");
				System.out.println("• Vande Mataram");
				System.out.println("• Oruvan Oruvan mudhalli");
				System.out.println("• Shakthi kodu");
				System.out.println("• Kappal Yeari Poyachu");
				
			}
			else if(option==3)
			{
				System.out.println("Welcome To A.R.RAHMAN Kuthu Hits");
				System.out.println("• Thaiya Thaiya");
				System.out.println("• Mukkala Mukkabala");
				System.out.println("• Urvashi Urvashi");
				System.out.println("• Aathichudi");
			}
			else if(option==4)
			{
				System.out.println("Welcome To A.R.RAHMAN Sad songs");
				System.out.println("• Poongatrile");
				System.out.println("• Rasathi");
				System.out.println("• Oru poiyavathu Sol");
				System.out.println("• Minnalea En vazhvin");
			}
			else
			{
				System.out.println("Your option is not available");
			}
		}
		else if(choice==2)
		{
		    System.out.println("welcome to Anirudh Hits");
			System.out.println("1.Melody songs");
			System.out.println("2.Motivational songs");
			System.out.println("3.Kuthu songs");
			System.out.println("4.Sad songs");
			System.out.print("Enter your choice:");
			int option=sc.nextInt();
			if(option==1)
			{
				System.out.println("Welcome To Anirudh  Melody Hits");
				System.out.println("• Neeyum Nanum Anbe");
				System.out.println("• Velicha Poove");
				System.out.println("• Po Indru Neeyaga");
				System.out.println("• Nee partha vizhigal");
				
			}
			else if(option==2)
			{
				System.out.println("Welcome To Anirudh Motivational Hits");
				System.out.println("• Surviva");
				System.out.println("• Ethir Neechal");
				System.out.println("• Boomi Enna Suthudhe");
				System.out.println("• Velai Illa pattathari");
				
			}
			else if(option==3)
			{
				System.out.println("Welcome To Anirudh Kuthu Hits");
				System.out.println("• Vandha Edam");
				System.out.println("• Badass");
				System.out.println("• Naa Ready");
				System.out.println("• Vaathi Raid");
			}
			else if(option==4)
			{
				System.out.println("Welcome To Anirudh Sad songs");
				System.out.println("• Porkanda Singam");
				System.out.println("• Kanave Kanave");
				System.out.println("• Kannaana Kanne");
				System.out.println("• Jodi Nilave");
			}
			else
			{
				System.out.println("Your option is not available");
			}
		}
		else if(choice==3)
		{
			System.out.println("welcome to Harish Jeyaraj Hits");
			System.out.println("1.Melody songs");
			System.out.println("2.Kuthu songs");
			System.out.println("3.Sad songs");
			System.out.print("Enter your choice:");
			int option=sc.nextInt();
			if(option==1)
			{
				System.out.println("Welcome To Harish Jeyaraj  Melody Hits");
				System.out.println("• Unnale");
				System.out.println("• Paartha Mudhal");
				System.out.println("• Vaseegara");
				System.out.println("• Annul Maele");
				
			}
			else if(option==2)
			{
				System.out.println("Welcome To Harish Jeyaraj  Kuthu songs");
				System.out.println("• Tirunelveli Halwa Da");
				System.out.println("• Aradi katre");
				System.out.println("• Soda Bottle");
				System.out.println("• Aruva Meesai");
				
			}
			else if(option==3)
			{
				System.out.println("Welcome To Harish Jeyaraj Sad songs");
				System.out.println("•Venmathiye");
				System.out.println("•Oh maname");
				System.out.println("•Yamma Yamma");
				System.out.println("•Othayile");
			}
			else
			{
				System.out.println("Your option is not available");
			}
			
		}
		else 
		{
			System.out.println("Your choice is not available");
		}
			
		
		
		
		
		
		
		

	}
}