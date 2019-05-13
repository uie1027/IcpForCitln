/**
 * Project Name: icpForCitln
 * File Name: ProductionOrderVO
 * Package Name: icp.icpForCitln.produce.vo
 * Date: 19/05/05 14:43
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.produce.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ProductionOrderVO {
    private String id;

    private String productionOrderType; //订单类型

    private Integer productionOrderStatus;  //生产订单状态

    private String productionOrderCode;  //订单编号

    private String productCode;  //产品编码

    private String productName;  //产品名称

    private BigDecimal productionNumber;  //生产数量

    private Date startTime;  //开始时间

    private Date endTime;  //结束时间

    private String basicUnit;  //单位

    private String factoryName; //工厂名称

    private BigDecimal completionNumber;
}
