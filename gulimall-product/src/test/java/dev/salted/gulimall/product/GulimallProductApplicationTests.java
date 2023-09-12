package dev.salted.gulimall.product;

import dev.salted.gulimall.product.entity.BrandEntity;
import dev.salted.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {


    @Autowired
    private BrandService brandService;


    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("huawei2");
        brandEntity.setDescript("huawei2");
        brandEntity.setBrandId(1L);

        brandService.updateById(brandEntity);


    }

}
