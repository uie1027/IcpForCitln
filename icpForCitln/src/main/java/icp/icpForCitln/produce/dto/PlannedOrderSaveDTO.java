/**
 * Project Name: icpForCitln
 * File Name: PlannedOrderSaveDTO
 * Package Name: icp.icpForCitln.produce.dto
 * Date: 19/05/07 14:37
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.produce.dto;

import icp.icpForCitln.produce.entity.PlannedOrderDetail;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PlannedOrderSaveDTO {
    private String plannedOrderCode; //计划订单编码

    private Integer documentType; //凭证类型 1 采购入库

    private String companyInfoId; //公司ID

    private Date orderCreateTime; //订单创建时间

    private String remark; //备注

    private List<PlannedOrderDetail> detailList;  //行项目
}
