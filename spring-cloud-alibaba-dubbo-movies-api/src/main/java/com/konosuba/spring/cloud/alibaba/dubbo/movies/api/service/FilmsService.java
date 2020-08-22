package com.konosuba.spring.cloud.alibaba.dubbo.movies.api.service;

import com.konosuba.spring.cloud.alibaba.dubbo.movies.api.dto.FilmsDto;

import java.util.List;

public interface FilmsService {
    public List<FilmsDto> getAllFilms();
}
