package com.example.student.serviceImpl;

import com.example.student.entity.Course;
import com.example.student.mapper.CourseMapper;
import com.example.student.service.CourseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author BUTUbird
 * @since 2021-12-12
 */
@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {
}
