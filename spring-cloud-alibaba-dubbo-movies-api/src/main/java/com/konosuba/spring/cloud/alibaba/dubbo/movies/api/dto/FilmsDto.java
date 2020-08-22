package com.konosuba.spring.cloud.alibaba.dubbo.movies.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class FilmsDto implements Serializable {
    /**
     * 主键
     */
    private Integer fId;

    /**
     * 电影名称
     */
    private String fName;

    /**
     * 电影日期
     */
    private Date fDate;

    /**
     * 电影类型ID
     */
    private Integer fType;

    /**
     * 图片id
     */
    private Integer fImg;
}
