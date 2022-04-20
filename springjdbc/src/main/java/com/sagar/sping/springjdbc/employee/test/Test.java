package com.sagar.sping.springjdbc.employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sagar.sping.springjdbc.dao.EmployeeDAO;
import com.sagar.sping.springjdbc.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sagar/sping/springjdbc/employee/test/config.xml");
		EmployeeDAO jdbcTemplate = (EmployeeDAO) ctx.getBean("employeeDao"); 
		Employee employee = new Employee();
		employee.setId(2);
		employee.setFirstName("Rahul");
		employee.setLastName("Vatia");
		employee.setAge(30);
//		int result = jdbcTemplate.create(employee);
//		int result = jdbcTemplate.update(employee);
		int result = jdbcTemplate.delete(employee);
		System.out.println("Number of Record deleted -: " + result);
	}

}
