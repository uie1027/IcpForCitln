/**
 * Project Name: icpForCitln
 * File Name: ProductionOrderSaveDTO
 * Package Name: icp.icpForCitln.produce.dto
 * Date: 19/05/20 09:44
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.produce.dto;

import icp.icpForCitln.produce.entity.ProductionOrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class ProductionOrderSaveDTO {
    private String productionOrderType; //订单类型

    private BigDecimal productionNumber;  //生产数量

    private Date startTime;  //开始时间

    private Date endTime;  //结束时间

    private String productInfoId;  //产品id

    private String factoryInfoId;  //工厂id

    private Date orderCreateTime; //订单创建时间

    private String companyInfoId;  //公司id

    private String plannedOrderId;  //计划订单id

    private String plannedOrderDetailId;  //计划订单行项目id

    private String remark;  //备注

    private List<ProductionOrderDetail> productionOrderDetails;
}
