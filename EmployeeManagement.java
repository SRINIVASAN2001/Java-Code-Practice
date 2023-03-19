class EmployeeManagement
{
	final static String Company ="ZOHO";
	int Id;
	double Salary;
	String Name;
	
	EmployeeManagement(int Id,String Name,double Salary)
	{
		System.out.println("Crerating Emp Object..:");
		this.Id=Id;
		this.Name=Name;
		
	}
	
	EmployeeManagement(int Id,String Name)
	{
		System.out.println("Creating Emp Object...:");
		this.Id=Id;
		this.Name=Name;
		this.Salary = 0;
		
	}
	void Display()
	{
		System.out.println("Employee Id:"+Id);
		System.out.println("Employee Name:"+Name);
		System.out.println("Employee Salary:"+Salary +"Rs");
	}
}

class MainClass
{
	public static void main(String[] args)
	{
		System.out.println("********************************");
		System.out.println("Welcome to "+EmployeeManagement.Company);
		EmployeeManagement emp1=new EmployeeManagement(123,"Srinivasan");
		emp1.Display();
		EmployeeManagement emp2=new EmployeeManagement(123,"Srinivasan",40000.0);
		emp2.Display();
		System.out.println("********************************");
		
		
	}
	
}
