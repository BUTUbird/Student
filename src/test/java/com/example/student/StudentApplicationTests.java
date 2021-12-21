package com.example.student;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.student.entity.Student;
import com.example.student.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;


@SpringBootTest
class StudentApplicationTests {

    @Resource
    private StudentMapper studentMapper;
    @Test
    void contextLoads() {
    }
    @Test
    public void queryStudentPage(){
        IPage<Student> studentIPage = new Page<>(2,2);
        studentIPage = studentMapper.selectPage(studentIPage,null);
        List<Student> list = studentIPage.getRecords();
        for(Student student : list){
            System.out.println(student);
        }
    }

}
