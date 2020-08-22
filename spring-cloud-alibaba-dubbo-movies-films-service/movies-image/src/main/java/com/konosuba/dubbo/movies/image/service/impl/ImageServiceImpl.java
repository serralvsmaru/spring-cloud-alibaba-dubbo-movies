package com.konosuba.dubbo.movies.image.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.konosuba.dubbo.movies.image.domain.entity.Image;
import com.konosuba.dubbo.movies.image.mapper.ImageMapper;
import com.konosuba.spring.cloud.alibaba.dubbo.movies.api.dto.ImageDto;
import com.konosuba.spring.cloud.alibaba.dubbo.movies.api.service.ImageService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;

@Service
public class ImageServiceImpl implements ImageService {

    @Resource
    ImageMapper imageMapper;

    @Override
    public ImageDto getImage(int id) {
        QueryWrapper<Image> qw = new QueryWrapper<>();
        qw.eq(Image.COL_IMAGE_ID, id);
        Image image = imageMapper.selectOne(qw);
        ImageDto imageDto = new ImageDto();
        BeanUtils.copyProperties(image, imageDto);
        return imageDto;
    }
}
