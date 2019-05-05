/**
 * Project Name: icpForCitln
 * File Name: CustomerController
 * Package Name: icp.icpForCitln.customer.contorller
 * Date: 19/04/29 14:46
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.customer.contorller;

import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.customer.dto.CustomerInfoDelDTO;
import icp.icpForCitln.customer.dto.CustomerInfoSaveDTO;
import icp.icpForCitln.customer.entity.CustomerInfo;
import icp.icpForCitln.customer.vo.CustomerInfoVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @PostMapping("/customerInfoSave")
    public PageResult customerInfoSave(CustomerInfoSaveDTO customerInfoSaveDTO){
        MongoUtil.insert(BeanCopyUtil.copy(customerInfoSaveDTO, CustomerInfo.class));
        return PageResult.returnResult(PageResult.SUCCESS_CODE, null);
    }

    @GetMapping("/customerFindByPage")
    public PageResult customerFindByPage(Integer pageIndex, Integer pageSize, CustomerInfoSaveDTO customerInfoSaveDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE,BeanCopyUtil.copy(MongoUtil.select(pageIndex,pageSize,BeanCopyUtil.copy(customerInfoSaveDTO,CustomerInfo.class)), CustomerInfoVO.class));
    }

    @PostMapping("/customerDelete")
    public PageResult customerDelete(CustomerInfoDelDTO customerInfoDelDTO){
        MongoUtil.delete(BeanCopyUtil.copy(customerInfoDelDTO,CustomerInfo.class));
        return PageResult.returnResult(PageResult.SUCCESS_CODE,null);
    }

    @PostMapping("/customerUpdate")
    public PageResult customerUpdate(CustomerInfoSaveDTO customerInfoSaveDTO){
        MongoUtil.upsert(BeanCopyUtil.copy(customerInfoSaveDTO,CustomerInfo.class));
        return PageResult.returnResult(PageResult.SUCCESS_CODE,null);
    }
}
