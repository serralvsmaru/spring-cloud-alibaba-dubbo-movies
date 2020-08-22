package com.konosuba.spring.cloud.alibaba.dubbo.movies.web.service.service;

import com.konosuba.spring.cloud.alibaba.dubbo.movies.web.service.domain.vo.MoviesVo;

import java.util.List;

public interface MoviesService {
    List<MoviesVo> showMovies();
}
