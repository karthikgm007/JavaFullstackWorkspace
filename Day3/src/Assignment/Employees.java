package Assignment;

public class Employees {
	String name;
	int id;
	double baseSalary;
	
	double grossSalary;
	double netSalary;
	
	
	
	
	@Override
	public String toString() {
		return "Employee:{Name=" + name + ", Id=" + id + ", BaseSalary=" + baseSalary + ", GrossSalary=" + grossSalary
				+ ", netSalary=" + netSalary + "}";
	}

	public Employees(String name, int id, double baseSalary) {
		super();
		this.name = name;
		this.id = id;
		this.baseSalary = baseSalary;
		

		if(baseSalary >=70000 && baseSalary<90000) {
			grossSalary=baseSalary+(baseSalary*0.35);
			netSalary=baseSalary+(baseSalary*(0.35-0.11));
			
		}
		else if(baseSalary >=50000 && baseSalary<70000) {
			grossSalary=baseSalary+(baseSalary*0.29);
			netSalary=baseSalary+(baseSalary*(0.29-0.09));
		}
		else if(baseSalary >=30000 && baseSalary<50000) {
			grossSalary=baseSalary+(baseSalary*0.24);
			netSalary=baseSalary+(baseSalary*(0.24-0.08));
		}
		else if(baseSalary<30000) {
			grossSalary=baseSalary+(baseSalary*0.15);
			netSalary=baseSalary+(baseSalary*0.15);
			
		}
	}

	public Employees() {
		super();
	}

	
}