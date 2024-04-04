package hhp.third.ecommerce.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/charge")
public class ChargeController {

    @PatchMapping("{userId}")
    public void recharge(@PathVariable("userId") String userId){

    }
    @GetMapping("{userId}")
    public void detail(@PathVariable("userId") String userId){

    }
}
