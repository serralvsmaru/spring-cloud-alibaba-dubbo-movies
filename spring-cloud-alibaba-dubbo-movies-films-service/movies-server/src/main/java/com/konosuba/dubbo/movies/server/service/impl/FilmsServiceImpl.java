package com.konosuba.dubbo.movies.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.konosuba.dubbo.movies.server.domain.entity.Films;
import com.konosuba.dubbo.movies.server.mapper.FilmsMapper;
import com.konosuba.spring.cloud.alibaba.dubbo.movies.api.dto.FilmsDto;
import com.konosuba.spring.cloud.alibaba.dubbo.movies.api.service.FilmsService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class FilmsServiceImpl implements FilmsService {

    @Resource
    FilmsMapper filmsMapper;
    @Override
    public List<FilmsDto> getAllFilms() {
        QueryWrapper<Films> qw = new QueryWrapper<>();
        List<FilmsDto> filmsDtos = new ArrayList<>();
        FilmsDto filmsDto = null;
        try{
            List<Films> filmsList = filmsMapper.selectList(qw);
            for (Films films : filmsList){
                filmsDto = new FilmsDto();
                BeanUtils.copyProperties(films, filmsDto);
                filmsDtos.add(filmsDto);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return filmsDtos;
    }
}
