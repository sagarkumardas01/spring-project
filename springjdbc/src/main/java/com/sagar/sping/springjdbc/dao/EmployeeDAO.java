package com.sagar.sping.springjdbc.dao;

import com.sagar.sping.springjdbc.dto.Employee;

public interface EmployeeDAO {
   int create(Employee employee);
   int update(Employee employee);
   int delete(Employee employee);
}
