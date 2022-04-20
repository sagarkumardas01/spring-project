package com.sagar.spring.springjdbc.daoimpl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sagar.sping.springjdbc.dao.EmployeeDAO;
import com.sagar.sping.springjdbc.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName(),
				employee.getAge());
		return result;
	}

	@Override
	public int update(Employee employee) {
		String sql = "update employee set firstname=?,lastname=? where id=?";
		int result = jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int delete(Employee employee) {
		String sql = "delete from employee where id=?";
		int result = jdbcTemplate.update(sql,employee.getId());
		return result;
	}

}
