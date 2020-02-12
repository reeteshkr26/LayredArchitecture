package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class Services extends Employee implements EmployeeService {

	@Override
	public void getEmployeeDetails() {
		// TODO Auto-generated method stub
		if(getSalary()>5000.0 && getSalary()<20000.0) {
			setDesignation("System Associate");
			setInsuranceScheme("Scheme C");
			
		}
		else if(getSalary()>=20000.0 && getSalary()<40000.0) {
			setDesignation("Programmer");
			setInsuranceScheme("Scheme B");
		}
		else if(getSalary()>=40000.0) {
			setDesignation("Manager");
			setInsuranceScheme("Scheme A");
		}
		else {
			setDesignation("Clerk");
			setInsuranceScheme("No Scheme");
		}
		
		
	}

	@Override
	public void findInsuranceScheme() {
		// TODO Auto-generated method stub
		System.out.println(getInsuranceScheme());

		
	}

	@Override
	public void showDetails() {
		System.out.println("*************Employee Details**************");
		System.out.println("Employee Id: "+getId());
		System.out.println("Employee Name: "+getName());
		System.out.println("Designation: "+getDesignation());
		System.out.println("Insurance Scheme: "+getInsuranceScheme());
		System.out.println("Salary: "+getSalary());
		System.out.println("*******************************************");
		
	}
	

}
