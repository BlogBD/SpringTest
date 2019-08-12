package com.springjdbc.mybatis;

import com.springjdbc.demo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component("mybatisUserService")
public class MybatisUserService {

    /*@Autowired
    @Qualifier("mybatisUserDao")
    上面两个等价于 @Resource */
    @Resource(name = "mybatisUserDao")
    MybatisUserDao mybatisUserDao;

    public Student findById(String id){
        return mybatisUserDao.getUserById(id);
    }

    public List<Student> getAll(){
        return mybatisUserDao.getAll();
    }

}
