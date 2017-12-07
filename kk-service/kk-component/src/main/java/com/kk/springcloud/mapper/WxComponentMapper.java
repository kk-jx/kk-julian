package com.kk.springcloud.mapper;

import com.kk.springcloud.model.WxComponent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by kk on 2017/12/3.
 */
@Mapper
@Component(value = "wxComponentMapper")
public interface WxComponentMapper {

    List<WxComponent> findAll();

}
