package com.spring.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.spring.test.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;

public class JDBCTest {

    @Test
    public void jdbcTest() throws SQLException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("service.xml");

        JdbcTemplate jdbcTemplate = (JdbcTemplate)context.getBean("jdbcTemplate");
        Integer integer = jdbcTemplate.queryForObject("select count(*) from t_user_info", Integer.TYPE);
        System.out.println(integer);
    }
}
