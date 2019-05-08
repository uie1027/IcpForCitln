/**
 * Project Name: icpForCitln
 * File Name: PurchaseOrderDetailDTO
 * Package Name: icp.icpForCitln.order.dto
 * Date: 2019/5/5 14:19
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PurchaseOrderDetailDTO {
    private String purchaseOrderRowCode;//行项目号
    private String productInfoId;  //产品id
    private BigDecimal unitPrice; //含税单价
    private Double quantity;  //数量
    private String basicUnitId;  //基本单位id
    private String agreementCode;  //协议编号
    private String agreementRowCode; //协议行号
    private Date deliveryDate;  //交货日期
    private String factoryInfoId;  //工厂id
    private String inventoryLocationInfoId;  //库存地点id

    private String priceStrategy;     //价格策略优先级：01-客户产品价格，02-客户产品组价格，03-产品价格，04-产品组价格
    private String deliveryAddress;     //送货地址
    private String invoiceAddress;     //发票地址
    private String detailRemark;     //行项目备注（优先取值产品数据表采购文本内容）
}
