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
import icp.icpForCitln.customer.dto.CustomerInfoDTO;
import icp.icpForCitln.customer.dto.CustomerInfoSaveAndUpdateDTO;
import icp.icpForCitln.customer.entity.CustomerInfo;
import icp.icpForCitln.customer.vo.CustomerInfoVO;
import icp.icpForCitln.customer.vo.CustomerListVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    /**
     * @author: guoxs
     * @date: 19/05/05 10:14
     * @since: JDK 1.8
     *
     * @description: 客户主数据保存
     * @param: [supplierSaveAndUpdateDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/customerInfoSave")
    public PageResult customerInfoSave(CustomerInfoSaveAndUpdateDTO customerInfoSaveAndUpdateDTO){
        MongoUtil.insert(BeanCopyUtil.copy(customerInfoSaveAndUpdateDTO, CustomerInfo.class));
        return PageResult.returnResult(PageResult.SUCCESS_CODE, null);
    }

    /**
     * @author: guoxs
     * @date: 19/05/05 10:16
     * @since: JDK 1.8
     *
     * @description: 客户主数据删除
     * @param: [supplierInfoDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/customerDelete")
    public PageResult customerDelete(CustomerInfoDTO customerInfoDTO){
        MongoUtil.delete(BeanCopyUtil.copy(customerInfoDTO,CustomerInfo.class));
        return PageResult.returnResult(PageResult.SUCCESS_CODE,null);
    }

    /**
     * @author: guoxs
     * @date: 19/05/05 10:16
     * @since: JDK 1.8
     *
     * @description: 客户主数据更新
     * @param: [supplierSaveAndUpdateDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/customerUpdate")
    public PageResult customerUpdate(CustomerInfoSaveAndUpdateDTO customerInfoSaveAndUpdateDTO){
        MongoUtil.upsert(BeanCopyUtil.copy(customerInfoSaveAndUpdateDTO,CustomerInfo.class));
        return PageResult.returnResult(PageResult.SUCCESS_CODE,null);
    }

    /**
     * @author: guoxs
     * @date: 19/05/05 10:17
     * @since: JDK 1.8
     *
     * @description: 客户主数据详情获取
     * @param: [supplierInfoDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/customerInfoFind")
    public PageResult customerInfoFind(CustomerInfoDTO customerInfoDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE,BeanCopyUtil.copy(MongoUtil.select(BeanCopyUtil.copy(customerInfoDTO,CustomerInfo.class)), CustomerInfoVO.class));
    }

    /**
     * @author: guoxs
     * @date: 19/05/05 10:17
     * @since: JDK 1.8
     *
     * @description: 客户主数据列表获取
     * @param: [pageIndex, pageSize, supplierInfoDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/customerListFindByPage")
    public PageResult customerListFindByPage(Integer pageIndex, Integer pageSize, CustomerInfoDTO customerInfoDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE,BeanCopyUtil.copy(MongoUtil.select(pageIndex,pageSize,BeanCopyUtil.copy(customerInfoDTO,CustomerInfo.class)), CustomerListVO.class));
    }
}
