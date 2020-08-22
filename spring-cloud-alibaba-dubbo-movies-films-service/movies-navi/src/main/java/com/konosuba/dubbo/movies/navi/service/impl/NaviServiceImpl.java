package com.konosuba.dubbo.movies.navi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.konosuba.dubbo.movies.navi.domain.entity.Navi;
import com.konosuba.dubbo.movies.navi.mapper.NaviMapper;
import com.konosuba.spring.cloud.alibaba.dubbo.movies.api.dto.NaviDto;
import com.konosuba.spring.cloud.alibaba.dubbo.movies.api.service.NaviService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;

@Service
public class NaviServiceImpl implements NaviService {

    @Resource
    NaviMapper naviMapper;

    @Override
    public NaviDto getNavi(int id) {
        QueryWrapper<Navi> qw = new QueryWrapper<>();
        qw.eq(Navi.COL_NAVI_ID, id);
        Navi navi = naviMapper.selectOne(qw);
        NaviDto naviDto = new NaviDto();
        BeanUtils.copyProperties(navi, naviDto);
        return naviDto;
    }
}
