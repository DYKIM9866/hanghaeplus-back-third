package hhp.third.ecommerce.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @GetMapping
    public void list(){

    }
    @GetMapping("{goodId}")
    public void detail(@PathVariable("goodId") String goodId){

    }
    @GetMapping("/pop")
    public void popList(){

    }
}
