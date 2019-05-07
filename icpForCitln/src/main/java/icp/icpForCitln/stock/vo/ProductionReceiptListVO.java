/**
 * Project Name: icpForCitln
 * File Name: ProductionReceiptListVO
 * Package Name: icp.icpForCitln.produce.vo
 * Date: 19/05/06 09:54
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.vo;

import lombok.Data;

import java.util.Date;

@Data
public class ProductionReceiptListVO {
    private String id;

    private String productionReceiptCode;  //生产入库单号

    private Integer documentType; //凭证类型 1 生产订单 2 其他订单

    private String factoryName; //工厂ID

    private Integer receiptStatus; //入库单状态 1已入库 2已取消

    private String orderCode; //订单编号

    private Date createTime;    //创建时间
}
