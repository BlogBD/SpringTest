package com.springjdbc.mybatis;

import com.springjdbc.demo.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Component(value = "mybatisUserDao")
public interface MybatisUserDao {
    @Select(value = "select * from student where id = #{id}")
    public Student getUserById(String id);

    /**
     * 查询全部
     * @return
     */

    @Select(value = "select * from student")
    public List<Student>  getAll();
}
