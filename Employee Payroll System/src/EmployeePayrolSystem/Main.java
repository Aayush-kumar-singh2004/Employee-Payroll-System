package EmployeePayrolSystem;

import java.util.ArrayList;

abstract class Employee{
	private String name;
	private int id;
	 
	//constructor
	public Employee(String name, int id) {
		this.name=name;
		this.id=id;
	}
	
	//getter
	public String getName(){
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	//abstract method
	public abstract double calculateSalary();
	
	@Override
	public String toString() {
		return " Employee [name="+name +", id="+id+", salary="+calculateSalary()+"] ";
	}
	
}


class FullTimeEmployee extends Employee{
	
	private double monthlySalary;
	
	public FullTimeEmployee(String name, int id, double monthlySalary){
		super(name, id);
		this.monthlySalary=monthlySalary;
	}
		@Override
		public double calculateSalary(){
			return monthlySalary;
	}
}


class PartTimeEmployee extends Employee{
	
	  private int hoursWorked;
	  private double hourlyRate;
	  
	  public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
		  super(name, id);
		  this.hoursWorked=hoursWorked;
		  this.hourlyRate=hourlyRate;
	  }
	  
	  @Override
	  public double calculateSalary() {
		  return hoursWorked * hourlyRate;
	  }
}


class PayRollSystem{
	
	private ArrayList<Employee> employeeList;
	
	//constructor
	public PayRollSystem() {
		employeeList=new ArrayList<>();
	}
	
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}
	
	public void removeEmployee(int id) {
		Employee employeeToRemove = null;
		
		for(Employee employee : employeeList) {
			if(employee.getId()==id) {
				employeeToRemove = employee;
				break;
			}
		}
		
		if(employeeToRemove != null) {
			employeeList.remove(employeeToRemove);
		}
	}
	
	public void displayEmployees() {
		for(Employee employee: employeeList) {
			System.out.println(employee);
		}
	}
}

public class Main {
public static void main(String[] args) {
	PayRollSystem payrollSystem=new PayRollSystem();
	
	FullTimeEmployee emp1 = new FullTimeEmployee("Vikash", 1, 5000.0);
	FullTimeEmployee emp2 = new FullTimeEmployee("Alex", 2, 4000.0);
	
	 PartTimeEmployee emp3 = new PartTimeEmployee("Rahul", 3, 100, 20.0);
	
	payrollSystem.addEmployee(emp1);
	payrollSystem.addEmployee(emp2);
	payrollSystem.addEmployee(emp3);
	
	System.out.println("Initial Employee Details: ");
	payrollSystem.displayEmployees();
	
	System.out.println("Removing Employees ");
	payrollSystem.removeEmployee(2);
	
	System.out.println("Remaining Employee Details: ");
	payrollSystem.displayEmployees();
	
	
}
}




































