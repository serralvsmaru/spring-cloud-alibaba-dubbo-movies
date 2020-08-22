package com.konosuba.spring.cloud.alibaba.dubbo.movies.web.service.service.impl;

import com.konosuba.spring.cloud.alibaba.dubbo.movies.api.dto.FilmsDto;
import com.konosuba.spring.cloud.alibaba.dubbo.movies.api.dto.ImageDto;
import com.konosuba.spring.cloud.alibaba.dubbo.movies.api.dto.NaviDto;
import com.konosuba.spring.cloud.alibaba.dubbo.movies.api.service.FilmsService;
import com.konosuba.spring.cloud.alibaba.dubbo.movies.api.service.ImageService;
import com.konosuba.spring.cloud.alibaba.dubbo.movies.api.service.NaviService;
import com.konosuba.spring.cloud.alibaba.dubbo.movies.web.service.domain.vo.MoviesVo;
import com.konosuba.spring.cloud.alibaba.dubbo.movies.web.service.service.MoviesService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MoviesServiceImpl implements MoviesService {
    @Reference
    FilmsService filmsService;
    @Reference
    ImageService imageService;
    @Reference
    NaviService naviService;
    @Override
    public List<MoviesVo> showMovies(){
        MoviesVo moviesVo;
        ImageDto imageDto;
        NaviDto naviDto;
        List<MoviesVo> moviesVos = new ArrayList<>();
        try {
            List<FilmsDto> filmsDtos = filmsService.getAllFilms();
            for (FilmsDto filmsDto : filmsDtos){
                moviesVo = new MoviesVo();
                imageDto = imageService.getImage(filmsDto.getFImg());
                naviDto = naviService.getNavi(filmsDto.getFType());
                moviesVo.setId(filmsDto.getFId());
                moviesVo.setFilmName(filmsDto.getFName());
                moviesVo.setFilmDate(filmsDto.getFDate());
                moviesVo.setImg(imageDto.getImageAddress());
                moviesVo.setType(naviDto.getNaviName());
                moviesVos.add(moviesVo);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return moviesVos;
    }
}
