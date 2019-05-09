/**
 * Project Name: icpForCitln
 * File Name: SalesDeliveryFindView
 * Package Name: icp.icpForCitln.stock.view
 * Date: 19/05/09 18:26
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.view;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document(collection = "SALES_DELIVERY_FIND_VIEW")
public class SalesDeliveryFindView {
    @Id
    private String id;

    @Field("SALES_DELIVERY_CODE")
    private String salesDeliveryCode;  //销售发货单编号

    @Field("CUSTOMER_INFO.CUSTOMER_NAME")
    private String customerName;

    @Field("DOCUMENT_TIME")
    private Date documentTime; //凭证日期

    @Field("USER_INFO.USER_NAME")
    private String creater;

    @Field("CREATE_TIME")
    private Date createTime;

    @Field("CUSTOMER_INFO.CUSTOMER_CODE")
    private String customerCode;
}
