package com.revature.emp.manager;


import com.revature.emp.ContractualEmployee;
//import com.revature.emp.Employee;
import com.revature.emp.SalariedEmployee;

public class EmployeeManager  {

	public static void main(String[] args) {
		
		//cannot instantiate an abstract class
		//Employee e = new Employee(001,"Van","Dept");
		
		SalariedEmployee se1 = new SalariedEmployee(101,"Luke", "HR", 50);
		System.out.println(se1);
		System.out.println("Salary of Salaried Emp = " + se1.calculateSalary(se1.getDaysPresent()));
		se1.calculateTax();
		
		ContractualEmployee ce1 = new ContractualEmployee(201,"John", "Law",150);
			System.out.println(ce1);
			System.out.println("Salary of Contractual Emp = " + ce1.calculateSalary(ce1.getHoursLogged()));
	}

}
