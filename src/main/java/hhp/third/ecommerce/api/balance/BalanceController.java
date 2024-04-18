package hhp.third.ecommerce.api.balance;

import hhp.third.ecommerce.api.balance.response.BalanceResponse;
import hhp.third.ecommerce.api.balance.response.ChargeResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/balance")
public class BalanceController {

    @Tag(name="잔액 조회 API", description = "사용자의 잔액을 조회하는 API")
    @GetMapping("{id}")
    public BalanceResponse getBalance(@PathVariable("id") String id){
        return new BalanceResponse("id",10_000);
    }

    @Tag(name="잔액 충전 API", description = "잔액을 충전하는 API")
    @PatchMapping("/charge/{id}")
    public ChargeResponse chargeBalance(@PathVariable("id") String id,
                                        @RequestBody int amount){
        return new ChargeResponse("id", 10_000);
    }


}
