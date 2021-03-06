package com.revature.emp;

public class ContractualEmployee extends Employee {
	private int hoursLogged;

	public ContractualEmployee(int id, String name, String department, int hoursLogged) {
		super(id, name, department);
		this.hoursLogged = hoursLogged;
	}

	public int getHoursLogged() {
		return hoursLogged;
	}

	public void setHoursLogged(int hoursLogged) {
		this.hoursLogged = hoursLogged;
	}

	@Override
	public String toString() {
		return "ContractualEmployee [hoursLogged=" + hoursLogged + ", toString()=" + super.toString() + "]";
	}


	@Override
	public double calculateSalary(int x) {
		return this.getHoursLogged() * 15;
	}
	//polymorphism
	public void whoAmI() {
		System.out.println("I am the contractual employee class");
	}

	
	
	

}
