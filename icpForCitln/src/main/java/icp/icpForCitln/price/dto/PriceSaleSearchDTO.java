/**
 * Project Name: icpForCitln
 * File Name: PriceSaleSearchDTO
 * Package Name: icp.icpForCitln.price.dto
 * Date: 2019/5/7 11:44
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.dto;

import lombok.Data;

@Data
public class PriceSaleSearchDTO {
    private String customerInfo_customerName;  //客户名称
    private String customerInfo_customerCode;  //客户编码

    private String productGroupInfo_productGroupCode;  //产品组编码
    private String productGroupInfo_productGroupName;  //产品组名称

    private String productInfo_productCode;  //产品编码
    private String productInfo_productName;  //产品名称
}
