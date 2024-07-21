package Assignment;

public class MainEmployee2 {
public static void main(String[] args) {
	Employees []e=new Employees[3];
	e[0]=new Employees("abc",17,66000);
	e[1]=new Employees("cde",11,75000);
	e[2]=new Employees("dsdd",9,53000);
	
	Employees max=new Employees();
	double maxSalary=0;
	for(int i=0;i<e.length;i++)
	{
		if(e[i].netSalary>maxSalary)
		{
			maxSalary=e[i].netSalary;
			max=e[i];
		}
	}
	
	System.out.println("The Employees are");
	for(Employees em:e)
	{
		System.out.println(em);
	}
	System.out.println("The Employee with max Net Salary is\n"+max);
	
}
}