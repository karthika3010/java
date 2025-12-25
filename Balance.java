class Balance
{
	public static void main(String[] args)
	{
		int deposit=25000;
		int rate=7;
		int time=4;
		int simpleinterest=(deposit*rate*time)/100;
		int total=deposit+simpleinterest;
		System.out.println("total balance:"+total);
	}
}