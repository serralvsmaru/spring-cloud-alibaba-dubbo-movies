package com.konosuba.spring.cloud.alibaba.dubbo.movies.api.service;

import com.konosuba.spring.cloud.alibaba.dubbo.movies.api.dto.NaviDto;

public interface NaviService {
    public NaviDto getNavi(int id) throws Exception;
}
