class Armstrong
{
	public static void main(String[] args)
	{
		int a=1221;
		int b=a%10; //1
		int c=a/10;
		int d=c%10; //2
		int e=c/10;
		int f=e%10; //2
		int g=e/10; //1
		
		int h=(g*g*g*g)+(f*f*f*f)+(d*d*d*d)+(b*b*b*b);
		boolean i=(a==h);
		System.out.println(i);
		
	}
}