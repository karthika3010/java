class Logical
{
	public static void main(String[] args)
	{
		int marks=85;
		boolean attendance=true;
		boolean disclipline=true;
		boolean a=(attendance)&&(disclipline);
		boolean b=(marks>50)||(marks<50);
		boolean c=!(marks>50);
		System.out.println("AND:"+a);
		System.out.println("OR:"+b);
		System.out.println("NOT:"+c);
	}
}