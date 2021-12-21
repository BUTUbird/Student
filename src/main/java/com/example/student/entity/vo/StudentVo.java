package com.example.student.entity.vo;

import com.example.student.entity.Student;
import lombok.Data;

import java.util.List;

/**
 * @author BUTUbird
 */
@Data
public class StudentVo {

    private Integer current;
    private Integer size;
    private Long total;
    private List<Student> studentList;

}
