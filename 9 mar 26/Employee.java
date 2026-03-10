class Employee
{
	int EmpId;
	String EmpName;
	String Dept;
	
	Employee(int EmpId,String EmpName,String Dept)
	{
		this.EmpId=EmpId;
		this.EmpName=EmpName;
		this.Dept=dept;
	}
	
	void view()
	{
		System.out.println("EmpId :"+EmpId);
		System.out.println("EmpName :"+EmpName);
		System.out.println("Dept :"+Dept);
	}

}