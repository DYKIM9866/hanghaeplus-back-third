package hhp.third.ecommerce.api.order;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    @Tag(name = "주문 API", description = "상품을 주문/결제하는 API")
    @PostMapping("{id}")
    public void create(@PathVariable("id") String id){

    }
}
