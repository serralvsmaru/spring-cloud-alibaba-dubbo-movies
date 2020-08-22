package com.konosuba.spring.cloud.alibaba.dubbo.movies.api.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ImageDto implements Serializable {
    /**
     * 主键
     */
    private Integer imageId;

    /**
     * 图片地址
     */
    private String imageAddress;
}
