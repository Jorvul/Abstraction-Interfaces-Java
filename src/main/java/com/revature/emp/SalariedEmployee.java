package com.revature.emp;

public class SalariedEmployee extends Employee implements Tax {
	private int daysPresent;

	

	public SalariedEmployee(int id, String name, String department, int daysPresent) {
		super(id, name, department);
		this.daysPresent = daysPresent;
	}

	public int getDaysPresent() {
		return daysPresent;
	}

	public void setDaysPresent(int daysPresent) {
		this.daysPresent = daysPresent;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [daysPresent=" + daysPresent + ", toString()=" + super.toString() + "]";
	}

	
	public double calculateSalary(int x) {
		return this.getDaysPresent() * 200;
	}
	
	//polymorphism
	public void whoAmI() {
		System.out.println("I am the salaried employee class");
	}

	@Override
	public void calculateTax() {
		System.out.println("Calculate tax of salaried employee");
		
	}
	
	
}
