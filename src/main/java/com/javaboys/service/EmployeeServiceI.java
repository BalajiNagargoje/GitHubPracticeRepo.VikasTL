package com.javaboys.service;

import java.util.ArrayList;
import java.util.List;

import com.javaboys.model.Employee;

public class EmployeeServiceI implements EmployeeServiceII {

	public void EmployeeDetails() {
    Employee emp=new Employee();	
    emp.setName("vikas");
    emp.setId(101);
    emp.setCity("pune");
   
    Employee emp1=new Employee();
    emp1.setName("balaji");
    emp1.setId(102);
    emp1.setCity("nashik");
    
    List<Employee> list=new ArrayList();
    list.add(emp1);
    list.add(emp);
    System.out.println(list);

	}

}
