package com.example.student.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.student.entity.Student;
import com.example.student.entity.vo.StudentVo;
import com.example.student.mapper.StudentMapper;
import com.example.student.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author BUTUbird
 * @since 2021-12-12
 */
@CrossOrigin
@RestController
@RequestMapping("/api")
public class StudentController {


    @Resource
    private StudentService studentService;

    @Resource
    private StudentMapper studentMapper;


    @PostMapping("/add")
    public Boolean add(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping("/delete/{Sno}")
    public Boolean delete(@PathVariable String Sno) {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("Sno",Sno);
        int result =  studentMapper.delete(queryWrapper);
        return result == 1;
    }

    @PostMapping("/update")
    public Boolean update(@RequestBody Student student) {
        return studentService.updateById(student);
    }

    @GetMapping("/get/{Sno}")
    public List<Student> get(@PathVariable String Sno) {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("Sno",Sno);
        return studentMapper.selectList(queryWrapper);
    }

    @GetMapping("/list")
    public List<Student> list() {
        return studentService.list();
    }

    @GetMapping("/findByAgeBetween")
    public List<Student> findByAgeBetween(){
        QueryWrapper<Student> wrapper = new QueryWrapper<>();
        wrapper.between("Sage",19,21);
        return studentMapper.selectList(wrapper);

    }
    @GetMapping("/SQL_API")
    public List<Student> SQL_API(){
        return studentMapper.SQL_API();
    }
    @GetMapping("queryStudent/{current}/{size}")
    public StudentVo queryList(@PathVariable Integer current, @PathVariable Integer size){
        StudentVo studentVo = new StudentVo();
        IPage<Student> page = new Page<>(current,size);
        studentMapper.selectPage(page,null);
        studentVo.setCurrent(current);
        studentVo.setSize(size);
        studentVo.setTotal(page.getTotal());
        studentVo.setStudentList(page.getRecords());
        return studentVo;
    }
}
