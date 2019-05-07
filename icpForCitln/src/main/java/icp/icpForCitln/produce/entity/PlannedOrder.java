/**
 * Project Name: icpForCitln
 * File Name: PlannedOrder
 * Package Name: icp.icpForCitln.produce.entity
 * Date: 19/05/07 13:47
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.produce.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document(collection = "PLANNED_ORDER") //计划订单表
@ToString(callSuper = true)
public class PlannedOrder extends BaseEntity {
    @Field("PLANNED_ORDER_CODE")
    private String plannedOrderCode; //计划订单编码

    @Field("DOCUMENT_TYPE")
    private Integer documentType; //凭证类型 1 采购入库

    @Field("COMPANY_INFO_ID")
    private String companyInfoId; //公司ID

    @Field("ORDER_CREATE_TIME")
    private Date orderCreateTime; //订单创建时间

    @Field("REMARK")
    private String remark; //备注
}
