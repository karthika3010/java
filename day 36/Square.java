class Square extends Shape
{
	Square(double side)
	{
		super(side);
	}
	
	double CalculateArea()
	{
		return value*value;
	}
}