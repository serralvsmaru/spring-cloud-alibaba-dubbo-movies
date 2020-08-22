package com.konosuba.spring.cloud.alibaba.dubbo.movies.api.service;

import com.konosuba.spring.cloud.alibaba.dubbo.movies.api.dto.ImageDto;

public interface ImageService {
    public ImageDto getImage(int id);
}
