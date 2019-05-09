/**
 * Project Name: icpForCitln
 * File Name: PricePurchaseProductSupplier
 * Package Name: icp.icpForCitln.price.entity
 * Date: 2019/4/29 11:22
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.dto;

import lombok.Data;

@Data
//供应商产品价格查询条件
public class PriceProductSupplierSearchDTO {
    private Integer pageIndex;  //页码
    private Integer pageSzie;   //每页显示行项目数
    private String supplierInfo;    //供应商
    private String productInfo;
}
