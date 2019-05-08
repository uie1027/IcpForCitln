/**
 * Project Name: icpForCitln
 * File Name: SaleOrderInfoSearchDTO
 * Package Name: icp.icpForCitln.order.dto
 * Date: 2019/5/7 18:17
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.dto;

import lombok.Data;

@Data
public class SaleOrderInfoSearchDTO {
    private String customerInfo_customerName;  //客户名称
    private String customerInfo_customerCode;  //客户编码
    private String saleOrderCode;//销售订单编码

}
