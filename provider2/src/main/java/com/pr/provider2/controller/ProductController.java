package com.pr.provider2.controller;

import com.example.springbootdemoentity.entity.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ProductController
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/19 12:31
 * @Version V1.0
 **/
@RestController
public class ProductController {

    @RequestMapping(value = "getProduct")
    public String getProduct(){
        Product product = new Product();
        return product.toString();
    }
}
