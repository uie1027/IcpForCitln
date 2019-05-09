/**
 * Project Name: icpForCitln
 * File Name: SupplierController
 * Package Name: icp.icpForCitln.supplier.controller
 * Date: 19/05/05 09:53
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.supplier.controller;

import icp.icpForCitln.common.result.PageResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.supplier.dto.SupplierInfoDTO;
import icp.icpForCitln.supplier.dto.SupplierSaveAndUpdateDTO;
import icp.icpForCitln.supplier.entity.SupplierInfo;
import icp.icpForCitln.supplier.vo.SupplierInfoVO;
import icp.icpForCitln.supplier.vo.SupplierListVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    /**
     * @author: guoxs
     * @date: 19/05/05 10:14
     * @since: JDK 1.8
     *
     * @description: 供应商主数据保存
     * @param: [supplierSaveAndUpdateDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/supplierSave")
    public PageResult supplierSave(SupplierSaveAndUpdateDTO supplierSaveAndUpdateDTO){
        MongoUtil.insert(BeanCopyUtil.copy(supplierSaveAndUpdateDTO, SupplierInfo.class));
        return PageResult.returnResult(PageResult.SUCCESS_CODE,null);
    }

    /**
     * @author: guoxs
     * @date: 19/05/05 10:16
     * @since: JDK 1.8
     *
     * @description: 供应商主数据删除
     * @param: [supplierInfoDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/supplierDelete")
    public PageResult supplierDelete(SupplierInfoDTO supplierInfoDTO){
        MongoUtil.delete(BeanCopyUtil.copy(supplierInfoDTO,SupplierInfo.class));
        return PageResult.returnResult(PageResult.SUCCESS_CODE,null);
    }

    /**
     * @author: guoxs
     * @date: 19/05/05 10:16
     * @since: JDK 1.8
     *
     * @description: 供应商主数据更新
     * @param: [supplierSaveAndUpdateDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @PostMapping("/supplierUpdate")
    public PageResult supplierUpdate(SupplierSaveAndUpdateDTO supplierSaveAndUpdateDTO){
        MongoUtil.upsert(BeanCopyUtil.copy(supplierSaveAndUpdateDTO,SupplierInfo.class),1);
        return PageResult.returnResult(PageResult.SUCCESS_CODE,null);
    }

    /**
     * @author: guoxs
     * @date: 19/05/05 10:17
     * @since: JDK 1.8
     *
     * @description: 供应商主数据详情获取
     * @param: [supplierInfoDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/supplierInfoFind")
    public PageResult supplierInfoFind(SupplierInfoDTO supplierInfoDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE,BeanCopyUtil.copy(MongoUtil.select(BeanCopyUtil.copy(supplierInfoDTO,SupplierInfo.class)), SupplierInfoVO.class));
    }

    /**
     * @author: guoxs
     * @date: 19/05/05 10:17
     * @since: JDK 1.8
     *
     * @description: 供应商主数据列表获取
     * @param: [pageIndex, pageSize, supplierInfoDTO]
     * @return: icp.icpForCitln.common.result.PageResult
     */
    @GetMapping("/supplierListFindByPage")
    public PageResult supplierListFindByPage(Integer pageIndex,Integer pageSize,SupplierInfoDTO supplierInfoDTO){
        return PageResult.returnResult(PageResult.SUCCESS_CODE,BeanCopyUtil.copy(MongoUtil.select(pageIndex,pageSize,BeanCopyUtil.copy(supplierInfoDTO,SupplierInfo.class)), SupplierListVO.class));
    }

}
