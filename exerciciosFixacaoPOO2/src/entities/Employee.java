package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	public double percentage;
	
	public double netSalary(){
		return (grossSalary - tax);
	}
	public void increaseSalary() {
		grossSalary = grossSalary * (1 + percentage / 100.0);
	}
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", netSalary());
		
	}

}
