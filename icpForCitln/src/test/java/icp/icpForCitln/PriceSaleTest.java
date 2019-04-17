/**
 * Project Name: icpForCitln
 * File Name: PriceSaleTest
 * Package Name: icp.icpForCitln
 * Date: 2019/4/16 16:17
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln;

import icp.icpForCitln.priceSale.dto.PriceSaleProductGroupDto;
import icp.icpForCitln.priceSale.service.PriceSaleService;
import icp.icpForCitln.priceSale.vo.PriceSaleProductGroupVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PriceSaleTest {
    @Autowired
    private PriceSaleService priceSaleService;

    @Test
    public  void saveTest(){

    }

    @Test
    public  void delTest(){
        priceSaleService.priceSaleProductGroupDel("111111,222222");
    }

    @Test
    public  void updateTest(){
        List<PriceSaleProductGroupDto> list = new ArrayList<>();
        PriceSaleProductGroupDto priceSaleProductGroupDto = new PriceSaleProductGroupDto();
        priceSaleProductGroupDto.setId("111111");
        priceSaleProductGroupDto.setTaxRate("17% 进项税,中国");
        priceSaleProductGroupDto.setTaxIncludedPrice(new BigDecimal(18.8));
        priceSaleProductGroupDto.setCurrency("CNY");
        priceSaleProductGroupDto.setEach(100);
        list.add(priceSaleProductGroupDto);
        priceSaleService.priceSaleProductGroupUpdate(list);
    }

    @Test
    public  void findTest(){
        List<PriceSaleProductGroupVO> list =
                priceSaleService.priceSaleProductGroupListByPage(1,2);
        System.out.println(list.toString());
    }



}
