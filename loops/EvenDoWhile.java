class EvenDoWhile
{
	public static void main(String[] args)
	{
		int a=1;
		do
		{
			if(a%2==0)
			{
				System.out.println("Even Number " +a);
			}
			
			a++;
		}while(a<=30);
	}
}