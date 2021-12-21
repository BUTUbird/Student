package com.example.student.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author BUTUbird
 * @since 2021-12-12
 */
@Getter
@Setter
@TableName("student")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("Sno")
    private String sno;

    @TableField("Sname")
    private String sname;

    @TableField("Ssex")
    private String ssex;

    @TableField("Sage")
    private Integer sage;

    @TableField("Sdept")
    private String sdept;

    @TableLogic(value = "0",delval = "1")
    @TableField("delete_flag")
    private Integer deleteFlag;
}
