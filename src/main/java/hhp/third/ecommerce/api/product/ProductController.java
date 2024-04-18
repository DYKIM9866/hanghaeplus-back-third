package hhp.third.ecommerce.api.product;

import hhp.third.ecommerce.api.product.response.ProductDetailResponse;
import hhp.third.ecommerce.api.product.response.ProductListResponse;
import hhp.third.ecommerce.api.product.response.ProductSimpleInfo;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Tag(name="상품 전체 조회 API", description = "등록된 상품 모두를 조회하는 API")
    @GetMapping
    public ProductListResponse list(){
        return null;
    }
    @Tag(name = "상품 상세 조회 API", description = "상품 세부 내용을 조회 하는 API")
    @GetMapping("{id}")
    public ProductDetailResponse detail(){
        return new ProductDetailResponse("productId","productName",10_000,85);
    }
    @Tag(name = "인기 상품 조회 API", description = "인기 상품 목록을 조회 하는 API")
    @GetMapping("/pop")
    public ProductListResponse popList(){
        return null;
    }
}
