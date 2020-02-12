package com.cg.eis.pl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import com.cg.eis.service.Services;

public class MainClass {
	

	InputStreamReader isr;
	BufferedReader buff;
	
	public static void main(String[] args) {
		MainClass mObject=new MainClass();
		mObject.isr = new InputStreamReader(System.in);
		mObject.buff=new BufferedReader(mObject.isr);
		Services service=new Services();
		mObject.getInput(service);
		mObject.performOperation(service);

	}

	public void performOperation(Services service) {
		
		service.getEmployeeDetails();
		service.findInsuranceScheme();
		service.showDetails();
		
		
	}

	public void getInput(Services service) {
	
		try {
			System.out.print("Enetr Employee Id:");
			String id = buff.readLine();
			System.out.print("Enetr Employee Name:");
			String name=buff.readLine();
			System.out.print("Enetr Employee Salary:");
			double sal=Double.parseDouble(buff.readLine());
			///Employee emp=new Employee(id, name, sal);
			service.setId(id);
			service.setName(name);
			service.setSalary(sal);
			
			//setInfoOfEmployee(id, name, sal);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
		
	}

	public void setInfoOfEmployee(String id, String name,  double sal) {
		System.out.println(id+name+sal);

		
		
		
	}

}
