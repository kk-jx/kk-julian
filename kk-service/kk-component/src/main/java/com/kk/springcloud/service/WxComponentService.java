package com.kk.springcloud.service;

import com.kk.springcloud.mapper.WxComponentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kk on 2017/12/3.
 */
@Service
public class WxComponentService {

    @Autowired
    private WxComponentMapper wxComponentMapper;

    public List findAll(){
        return wxComponentMapper.findAll();
    }


}
