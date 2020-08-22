package com.konosuba.spring.cloud.alibaba.dubbo.movies.api.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class NaviDto implements Serializable {

    private Integer naviId;

    private String naviName;

}
