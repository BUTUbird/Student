package com.example.student.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("sc")
public class Sc implements Serializable {

    private static final long serialVersionUID = 1L;



    @TableId("Sno")
    private String sno;


    @TableField ("Cno")
    private String cno;

    @TableField("Grade")
    private Integer grade;


}
