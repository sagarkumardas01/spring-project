package com.sagar.sping.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		
        ApplicationContext context = new ClassPathXmlApplicationContext("com/sagar/sping/springjdbc/config.xml");
        JdbcTemplate bean = (JdbcTemplate)context.getBean("jdbcTemplate");
        String sql = "insert into employee values(?,?,?,?)"; 
        int result = bean.update(sql,new Integer(100),"Rahul","Singh",new Integer(25));
        System.out.println("No.of record processed : " + result);
	}

}
