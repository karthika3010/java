class Circle extends Shape
{
	Circle(double radius)
	{
		super(radius);
	}
	
	double CalculateArea()
	{
		return 3.14*value*value;
	}
}