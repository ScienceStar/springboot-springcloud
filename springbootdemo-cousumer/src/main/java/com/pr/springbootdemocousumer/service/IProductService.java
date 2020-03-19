package com.pr.springbootdemocousumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="product-server",path = "/product")
@Component
public interface IProductService {

    @RequestMapping(value="getProduct")
    String getProduct();
}
