package com.konosuba.dubbo.movies.navi.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.konosuba.dubbo.movies.navi.domain.entity.Navi;
import com.konosuba.dubbo.movies.navi.mapper.NaviMapper;
import com.konosuba.spring.cloud.alibaba.dubbo.movies.api.dto.NaviDto;
import com.konosuba.spring.cloud.alibaba.dubbo.movies.api.service.NaviService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;
import java.nio.file.OpenOption;
import java.util.Optional;

@Service
public class NaviServiceImpl implements NaviService {

    @Resource
    NaviMapper naviMapper;

    @Override
    public NaviDto getNavi(int id) throws Exception {
//        QueryWrapper<Navi> qw = new QueryWrapper<>();
//        qw.eq(Navi.COL_NAVI_ID, id);
//        Navi navi = naviMapper.selectOne(qw);
//        NaviDto naviDto = new NaviDto();
//        BeanUtils.copyProperties(navi, naviDto);
//        return naviDto;

        Navi navi = Optional.ofNullable(
                naviMapper.selectOne(
                        Wrappers.lambdaQuery(Navi.class)
                                .eq(Navi::getNaviId, id)
                )
        ).orElseThrow(()->new Exception("空"));
        NaviDto naviDto = new NaviDto();
        BeanUtils.copyProperties(navi, naviDto);
        return naviDto;



//        @Override
//        public String value(EssentialFactorValueParameter parameter) {
//            return Optional.ofNullable(
//                    materialItemAttributeRelDao.selectOne(
//                            Wrappers.lambdaQuery(MaterialItemAttributeRelate.class)
//                                    .eq(MaterialItemAttributeRelate::getMaterialAttributeId, parameter.getEssentialFactor().getMaterialAttributeId())
//                                    .eq(MaterialItemAttributeRelate::getMaterialItemId, parameter.getMaterialItem().getMaterialId())
//                    ))
//                    .map(MaterialItemAttributeRelate::getAttributeValue)
//                    .orElseThrow(() -> new BaseException(
//                            "物料扩展属性获取失败 | 物料 [" + parameter.getMaterialItem().getMaterialCode()
//                                    + "]，扩展属性 [" + parameter.getEssentialFactor().getMaterialAttributeName() + "]"));
//        }

    }
}
