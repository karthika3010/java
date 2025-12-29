import java.util.Scanner;
class Books
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("THE BOOKS WORLD IS WELCOMES YOU");
		System.out.println("1.FICTION ");
		System.out.println("2. FANTASY");
		System.out.println("3. BUSINESS");
		System.out.println("4. PSYCHOLOGY");
		System.out.print("Enter your choice:");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("WELCOME TO FICTION BOOKS");
			System.out.println("1. RISE OF THE FALLEN: The Manwaan Series Book 1");
			System.out.println("2. Shadows Rising");
			System.out.println("3. Kunex, It Ends with Us");
			System.out.print("Enter your option:");
			int option=sc.nextInt();
			if(option==1)
			{
				System.out.println("1. RISE OF THE FALLEN: The Manwaan Series Book 1");
				System.out.println("Description:");
				System.out.println("A cultural fusion. A modern twist. An ancient battle of good and evil. Amidst an eternalfamily feud, a purposeless and hyper anxious Rinad discovers that he is part human and part celestial  aManwaan! As he navigates through his strange new reality, he encounters magnificent Angels, along withsavage Asuras and Rakshasas infiltrating Mumbai.");
                System.out.println("Author: Abhishek Krishnan");
				System.out.println("Language: English");
				System.out.println("Rate: Rs.300");
			}
			else if(option==2)
			{
				System.out.println("2. Shadows Rising");
				System.out.println("Description:");
				System.out.println("Banished from the celestial court for an unspeakable crime, Akran, once a powerful yaksha,spends his days in the city of Mumbai, drinking cheap rum and pretending to be human.When a young girl is abducted, Akran finds himself reluctantly dragged into the investigation. But, as hesoon discovers, this is not a simple case of kidnapping—villainous thugs, gods and demons are allinvolved. And an ancient evil is returning to the world.");
				System.out.println("Author: Rohan Monteiro ");
				System.out.println("Language: English ");
				System.out.println("Rate: Rs.250.");
			}
			else if(option==3)
			{
				System.out.println("3. Kunex, It Ends with Us");
				System.out.println("Description:");
				System.out.println("The newest, highly anticipated novel from beloved #1 New York Times bestselling author,Colleen Hoover. Sometimes it is the one who loves you who hurts you the most. Lily hasn?t always had iteasy, but that's never stopped her from working hard for the life she wants. She?s come a long way fromthe small town in Maine where she grew up?she graduated from college, moved to Boston and started herown business. So when she feels a spark with a gorgeous neurosurgeon named Ryle Kincaid, everythingin Lily?s life suddenly seems almost too good to be true");
				System.out.println("Author: Rohan Monteiro ");
				System.out.println("Language: English");
				System.out.println("Rate: Rs.350.");
			}
		}
		else if(choice==2)
		{
			System.out.println("WELCOME FANTASY BOOKS");
			System.out.println("1. Compass and Blade");
			System.out.println("2. Blood metal Bone");
			System.out.println("3. The shadows between us.");
			System.out.print("Enter your option:");
			int option=sc.nextInt();
			if(option==1)
			{
				System.out.println("WELCOME TO COMPASS AND BLADE BOOK");
				System.out.println("Description");
				System.out.println(" Mira is a wrecker, one of the seven chosen to swim out and plunder the wrecked shipsbeyond the Isle of Rosevear. The waves sing to her soul, the call of the sea beckoning her into deeperwaters. But Rosevear needs her, and she could never abandon her home. Until one evening whenlightning splits the sky and the Watch descend, taking Mira’s father away.");
				System.out.println("Author: Rachel Greenlaw");
				System.out.println("Language: English ");
				System.out.println("Rate: Rs.370");
			}
			else if(option==2)
			{
				System.out.println("WELCOME TO BLOOD METAL BONE BOOK");
				System.out.println("Description");
				System.out.println(" Wrongly accused of her brother’s murder, Sonara’s destiny was to die, sentenced toexecution by her own mother. Punished and left for dead, the shadows have cursed her with a second lifeas a Shadow-blood, cast out and hunted by society for her demon-like powers.");
				System.out.println("Author: Lindsay Cummings");
				System.out.println("Language: English ");
				System.out.println("Rate: Rs.275");
			}
			else if(option==3)
			{
				System.out.println("WELCOME TO The shadows between us BOOK");
				System.out.println("Description");
				System.out.println("No one knows the extent of the freshly crowned Shadow King's power. Some say he cancommand the shadows that swirl around him to do his bidding. Others say they speak to him, whisperingthe thoughts of his enemies. Regardless, Alessandra, tired of being overlooked, has a plan to gain power:woo the Shadow King, marry him, then kill him and take his kingdom for herself.");
				System.out.println("Author: Tricia Leven-seller");
				System.out.println("Language: English ");
				System.out.println("Rate: Rs.304");
			}
			
			
		}
		else if(choice==3)
		{
			System.out.println("WELCOME TO BUSINESS BOOKS");
			System.out.println("1. The Psychology of Money");
			System.out.println("2. Do It Today");
			System.out.println("3. Atomic Habits");
			System.out.print("Enter your option:");
			int option=sc.nextInt();
			if(option==1)
			{
				System.out.println("WELCOME TO The Psychology of Money BOOK");
				System.out.println("Description");
				System.out.println("Timeless lessons on wealth, greed, and happiness doing well with money isn?t necessarilyabout what you know. It?s about how you behave. AndAtomic Habits behavior is hard to teach, even to really smartpeople. How to manage money, invest it, and make business decisions are typically considered to involvea lot of mathematical calculations, where data and formulae tell us exactly what to do.");
				System.out.println("Author: Morgan Housel ");
				System.out.println("Language: English");
				System.out.println("Rate: Rs.300");
			}
			else if(option==2)
			{
				System.out.println("WELCOME TO Do It Today BOOK");
				System.out.println("Description");
				System.out.println("Are you also tired of putting off your dreams until tomorrow? Guess what! Tomorrownever comes. Am I right?I've procrastinated and putt off my desire to write a book for a decade. I always came up with excuseslike, it's not the right time. Or, I need to do more research.But in 2015 I got tired of this endless procrastination, and finally took action. Six months later, my firstbook was published.Look, we all have limited time on our hands. And we're getting closer to death every single minute. Thatshouldn't scare. That should motivate you!Time is limited, that's why we must do the things we want: Today");
				System.out.println("Author: Darius Foroux ");
				System.out.println("Language: English ");
				System.out.println("Rate: Rs.100");
			}
			else if(option==3)
			{
				System.out.println("WELCOME TO Atomic Habits BOOK");
				System.out.println("Description");
				System.out.println(" People think that when you want to change your life, you need to think big. But worldrenowned habits expert James Clear has discovered another way. He knows that real change comes fromthe compound effect of hundreds of small decisions: doing two push-ups a day, waking up five minutesearly, or holding a single short phone call.");
				System.out.println("Author: James Clear ");
				System.out.println("Language: English ");
				System.out.println("Rate: Rs.350");
			}
		}
		else if(choice==4)
		{
			System.out.println("WELCOME TO PSYCHOLOGY BOOKS");
			System.out.println("1. Dark Psychology Secrets & Manipulation");
			System.out.println("2. The Power of Your Subconscious Mind Do It Today");
			System.out.println("3. The Courage to Be Disliked");
			System.out.println("Enter your option:");
		    int option=sc.nextInt();
			if(option==1)
			{
				System.out.println("WELCOME TO Dark Psychology Secrets & Manipulation");
				System.out.println("Description");
				System.out.println(" In relation to the psychological essence of the various kinds of people who prey on others,dark psychology can be seen as studying the human condition. The truth is that there is the potential forany single human being to victimize other people or other living creatures. Most people prefer to suppresstheir dark impulses and prevent themselves from acting on any desire they have because of social norms,a human conscience, and other factors.");
				System.out.println("Author: Amy Brown ");
				System.out.println("Language: English");
				System.out.println("Rate: Rs.300");
			}
			else if(option==2)
			{
				System.out.println("WELCOME TO The Power of Your Subconscious Mind Do It Today");
				System.out.println("Description");
				System.out.println(" This remarkable book by Dr. Joseph Murphy, one of the pioneering voices of affirmativethinking, will unlock for you the truly staggering powers of your subconscious mind. Combining timehonored spiritual wisdom with cutting edge scientific research, Dr. Murphy explains how thesubconscious mind influences every single thing that you do and how, by understanding it and learning tocontrol its incredible force, you can improve the quality of your daily life.Everything, from the promotionthat you wanted and the raise you think you deserve, to overcoming phobias and bad habits andstrengthening interpersonal relationships, the Power of Your Subconscious Mind will open a world ofhappiness, success, prosperity and peace for you. It will change your life and your world by changingyour beliefs.");
				System.out.println("Author: Joseph Murphy ");
				System.out.println("Language: English ");
				System.out.println("Rate: Rs.100");
			}
			else if(option==3)
			{
				System.out.println("WELCOME TO The Courage to Be Disliked");
				System.out.println("Description");
				System.out.println("The Courage to be Disliked shows you how to unlock the power within yourself to becomeyour best and truest self, change your future and find lasting happiness. Using the theories of AlfredAdler, one of the three giants of 19th century psychology alongside Freud and Jung, the authors explainhow we are all free to determine our own future free of the shackles of past experiences, doubts and theexpectations of others. It's a philosophy that's profoundly liberating, allowing us to develop the courage tochange, and to ignore the limitations that we and those around us can place on ourselves.");
				System.out.println("Author: Ichiro Kishimi and Fumitake Koga ");
				System.out.println("Language: English");
				System.out.println("Rate: Rs.350");
			}
		}
		else
		{
			System.out.println("THANK YOU FOR USING ME ");
		}
	}
}