package com.kk.springcloud.controller;

import com.kk.springcloud.service.WxComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;

/**
 * Created by kk on 2017/12/3.
 */
@Controller
@RequestMapping("/component")
public class WxComponentController {

    @Autowired
    private WxComponentService wxComponentService;

    @RequestMapping(value = "/list")
    @ResponseBody
    public Object findAll(){
        return wxComponentService.findAll();
    }

}
