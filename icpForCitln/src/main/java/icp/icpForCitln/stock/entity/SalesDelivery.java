/**
 * Project Name: icpForCitln
 * File Name: SalesDelivery
 * Package Name: icp.icpForCitln.stock.entity
 * Date: 19/05/09 17:08
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document(collection = "SALES_DELIVERY") //销售发货单
public class SalesDelivery extends BaseEntity {
    @Field("SALES_DELIVERY_CODE")
    private String salesDeliveryCode;  //销售发货单编号

    @Field("COMPANY_INFO_ID")
    private String companyInfoId; //公司ID

    @Field("CUSTOMER_INFO_ID")
    private String customerInfoId; //客户ID

    @Field("DOCUMENT_TIME")
    private Date documentTime; //凭证日期

    @Field("REMARK")
    private String remark; //备注
}
