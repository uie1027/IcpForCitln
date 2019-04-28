/**
 * Project Name: icpForCitln
 * File Name: PricePorchase
 * Package Name: icp.icpForCitln.pricePorchase.controller
 * Date: 2019-04-15 下午 3:43
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.pricePorchase.controller;

import icp.icpForCitln.common.result.CommonResult;
import icp.icpForCitln.pricePorchase.dto.PricePurchaseProductSupplierDTO;
import icp.icpForCitln.pricePorchase.service.PricePurchaseService;
import icp.icpForCitln.pricePorchase.vo.PricePurchaseProductSupplierVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/pricePorchase")
public class PricePorchaseController {
    @Autowired
    private PricePurchaseService pricePurchaseService;

    /**
     * @author: Hujh
     * @date: 2019/4/24 16:14
     * @since: JDK 1.8
     *
     * @description: 供应商采购价格保存
     * @param: [pricePurchaseProductSupplierDTO]
     * @return: void
     */
    @PostMapping("/pricePurchaseProductSupplierSave")
    public void pricePurchaseProductSupplierSave(
            PricePurchaseProductSupplierDTO pricePurchaseProductSupplierDTO){
        pricePurchaseService.pricePurchaseProductSupplierSave(pricePurchaseProductSupplierDTO);
    }

    /**
     * @author: Hujh
     * @date: 2019/4/24 16:17
     * @since: JDK 1.8
     *
     * @description: 供应商采购价格修改
     * @param: [pricePurchaseProductSupplierDTO]
     * @return: void
     */
    @PostMapping("/pricePurchaseProductSupplierUpdate")
    public void pricePurchaseProductSupplierUpdate(
            PricePurchaseProductSupplierDTO  pricePurchaseProductSupplierDTO){
        pricePurchaseService.pricePurchaseProductSupplierUpdate(pricePurchaseProductSupplierDTO);
    }

    /**
     * @author: Hujh
     * @date: 2019/4/24 16:23
     * @since: JDK 1.8
     *
     * @description: 供应商采购价格删除
     * @param: [list]
     * @return: void
     */
    @PostMapping("/pricePurchaseProductSupplierDelete")
    public void pricePurchaseProductSupplierDelete(@RequestBody List<PricePurchaseProductSupplierDTO> list){
        pricePurchaseService.pricePurchaseProductSupplierDelete(list);
    }

    /**
     * @author: Hujh
     * @date: 2019/4/24 16:23
     * @since: JDK 1.8
     *
     * @description: 供应商采购价格分页查询
     * @param: [pageIndex, pageSize, pricePurchaseProductSupplierDTO]
     * @return: void
     */
    @PostMapping("/pricePurchaseProductSupplierFindByPage")
    public CommonResult pricePurchaseProductSupplierFindByPage(
            @RequestParam(value = "pageIndex") Integer pageIndex,
            @RequestParam(value = "pageSize") Integer pageSize,
              PricePurchaseProductSupplierDTO pricePurchaseProductSupplierDTO){
       List<PricePurchaseProductSupplierVO> resList
               = pricePurchaseService.pricePurchaseProductSupplierFindByPage(
                       pricePurchaseProductSupplierDTO,pageIndex,pageSize);

        return CommonResult.returnResult(CommonResult.SUCCESS_CODE ,resList);
    }
}
