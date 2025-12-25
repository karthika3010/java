import java.util.Scanner;
class Area
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		{
			System.out.print("choose your shape:");
			String shape=sc.nextLine();
			switch(shape)
			{
				case "circle":
				{
					System.out.print("Enter a radius:");
					int r=sc.nextInt();
					double areaofcircle=3.14*r*r;
					System.out.println("Area of circle:"+areaofcircle);
					break;
				}
				case "square":
				{
					System.out.print("Enter a side:");
					int a=sc.nextInt();
					double areaofsquare=a*a;
					System.out.print("Area of square:"+areaofsquare);
					break;
				}
				case "rectangle":
				{
					System.out.println("Enter a width:");
					int width=sc.nextInt();
					System.out.println("Enter a height:");
					int height=sc.nextInt();
					int areaofrectangle=width*height;
					System.out.println("Area of rectangle:"+areaofrectangle);
				}
				case "triangle":
				{
					System.out.println("Enter the height:");
					float height=sc.nextFloat();
					System.out.println("Enter the base:");
					int base=sc.nextInt();
					double areaoftriangle=1/2*base*height;
					System.out.println("Area of triangle:"+areaoftriangle);
				}
			}
		}
	}
}