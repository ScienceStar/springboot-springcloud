package com.pr.springbootdemocousumer.controller;

import com.pr.springbootdemocousumer.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ComsumerController
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/19 13:07
 * @Version V1.0
 **/
@RestController
public class ComsumerController {

    @Autowired
    private IProductService productService;

    @RequestMapping(value = "getConsumer")
    public String getComsumer(){
        String str= productService.getProduct();
        return str;
    }
}
