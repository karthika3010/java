class Emi
{
	public static void main(String[] args)
	{
		long score=60;
		double time=1;
		
		int rank=score/time;
		System.out.println("Rank is:"+rank);
		
		//implement correct casting
		
		int score1=score;
		System.out.println("score1 is:"+score1);
		
		//implement wrong casting
		
		String x=(string)time;
		System.out.println("x is:"+x);
		
		
		
		
		
	}
}