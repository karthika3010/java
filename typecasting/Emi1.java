class Emi1
{
	public static void main(String[] args)
	{
		long principal=100000;
		
		float rateofinterest=12.0f;
		
		rateofinterest=rateofinterest/(12*100);
		
		int time=1;
		
		int numberofmonths=time*12; //number of months
		
		double emi;
		
		emi=(principal*rateofinterest*Math.pow(1+rateofinterest,numberofmonths))/
		(Math.pow(1+rateofinterest,numberofmonths)-1);
		
		System.out.println("The EMI IS:"+emi);
		
		//Explicit type casting
		
		short p1=(short)principal;
		System.out.println("After explicit of principal in short:"+p1);
		
		//implicit type casting
		
		long t1=time;
		System.out.println("After implicit of time in long:"+t1);
	}
}










