package com.konosuba.spring.cloud.alibaba.dubbo.movies.web.service.domain.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MoviesVo implements Serializable {
    private int id;
    private String filmName;
    private Date filmDate;
    private String type;
    private String img;
}
