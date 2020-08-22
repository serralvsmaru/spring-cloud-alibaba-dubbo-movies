package com.konosuba.spring.cloud.alibaba.dubbo.movies.web.service.controller;

import com.konosuba.spring.cloud.alibaba.dubbo.movies.web.service.domain.vo.MoviesVo;
import com.konosuba.spring.cloud.alibaba.dubbo.movies.web.service.service.MoviesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MoviesController {

    @Resource
    MoviesService moviesService;

    @GetMapping("/test")
    public List<MoviesVo> showAllMovies(){
        List<MoviesVo> moviesVos = moviesService.showMovies();
        return moviesVos;
    }
}
