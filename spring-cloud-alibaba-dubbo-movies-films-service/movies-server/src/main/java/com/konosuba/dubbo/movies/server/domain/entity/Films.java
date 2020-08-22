package com.konosuba.dubbo.movies.server.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

@Data
@TableName(value = "tb_films")
public class Films {
    /**
     * 主键
     */
    @TableId(value = "f_id", type = IdType.AUTO)
    private Integer fId;

    /**
     * 电影名称
     */
    @TableField(value = "f_name")
    private String fName;

    /**
     * 电影日期
     */
    @TableField(value = "f_date")
    private Date fDate;

    /**
     * 电影类型ID
     */
    @TableField(value = "f_type")
    private Integer fType;

    /**
     * 图片id
     */
    @TableField(value = "f_img")
    private Integer fImg;

    public static final String COL_F_ID = "f_id";

    public static final String COL_F_NAME = "f_name";

    public static final String COL_F_DATE = "f_date";

    public static final String COL_F_TYPE = "f_type";

    public static final String COL_F_IMG = "f_img";
}