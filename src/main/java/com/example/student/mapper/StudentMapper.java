package com.example.student.mapper;

import com.example.student.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author BUTUbird
 * @since 2021-12-12
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {


    @Select("select * from Student")
    List<Student> SQL_API();

    /**
     * 删除
     * @return
     */
    @Select("delete from Student where  Sno = #{Sno}")
    boolean delBySno(String Sno);
}
