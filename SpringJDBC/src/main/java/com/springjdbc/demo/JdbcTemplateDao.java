package com.springjdbc.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class JdbcTemplateDao {
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public void setDateSource(DataSource dateSource){
        this.jdbcTemplate=new JdbcTemplate(dateSource);
    }

    /**
     * 建表
     */
    public void creatTable(){
        jdbcTemplate.execute("create table  user_test( id integer ,first_name varchar (100) ,last_name varchar (100))");
    }

    /**
     * 插入
     */
    public void insertData(){
        this.jdbcTemplate.update("insert into user_test value (1,?,?)","meimei","han");
        this.jdbcTemplate.update("insert into user_test value (1,?,?)","王二","小宝");
    }

    /**
     * 返回总数
     * @return
     */
    public int count(){
        return this.jdbcTemplate.queryForObject("select count(*) from user_test",Integer.class);
    }

    public List<Student> getAll(){
       return null;
    }
}
