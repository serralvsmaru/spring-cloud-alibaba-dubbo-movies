package com.konosuba.dubbo.movies.navi.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tb_navi")
public class Navi {
    /**
     * 主键
     */
    @TableId(value = "navi_id", type = IdType.AUTO)
    private Integer naviId;

    /**
     * 类型名称
     */
    @TableField(value = "navi_name")
    private String naviName;

    public static final String COL_NAVI_ID = "navi_id";

    public static final String COL_NAVI_NAME = "navi_name";
}