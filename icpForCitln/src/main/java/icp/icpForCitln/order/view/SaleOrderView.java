/**
 * Project Name: icpForCitln
 * File Name: SaleOrderView
 * Package Name: icp.icpForCitln.order.view
 * Date: 2019/5/10 13:32
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.view;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.Date;


@Data
@Document("SALE_ORDER_VIEW")
public class SaleOrderView {
    @Id
    private  String id;

    @Field("SALE_ORDER_CODE")
    private String saleOrderCode;  //销售订单编码

    @Field("ORDER_TYPE_ID")
    private String orderTypeId;  //订单类型ID

    @Field("ORDER_TYPE.SYSTEM_DICTIONARY_VALUE")
    private String orderType;  //订单类型

    @Field("ORDER_ORIGIN_ID")
    private String orderOriginId;  //订单来源ID

    @Field("ORDER_ORIGIN.SYSTEM_DICTIONARY_VALUE")
    private String orderOrigin;  //订单来源

    @Field("CUSTOMER_INFO_ID")
    private String customerInfoId; //客户ID

    @Field("CUSTOMER.CUSTOMER_NAME")
    private String customerName; //客户名称

    @Field("PAYMENT_METHOD_ID")
    private String payentMethodId; //付款方式ID

    @Field("PAYMENT.SYSTEM_DICTIONARY_VALUE")
    private String payentMethodName; //付款方式

    @Field("COMPANY_INFO_ID")
    private String companyInfoId; //公司id

    @Field("SALE_CONTRACT_CODE")
    private String saleContractCode; //采购合同编号

    @Field("CURRENCY_ID")
    private String currencyId; //币种ID

    @Field("CURRENCY.SYSTEM_DICTIONARY_VALUE")
    private String currencyName; //币种

    @Field("TOTAL_AMOUNT")
    private BigDecimal totalAmount; //订单总金额

    @Field("SALE_ORDER_TITLE_REMARKS")
    private String saleOrderTitleRemarks;//抬头备注

    @Field("SALE_ORDER_STATUS")
    private String saleOrderStatus;  //订单状态

    @Field("CREATE_TIME")
    private Date createTime;    //创建时间

    @Field("SALE_ORDER_DATE")
    private Date saleOrderDate;  //订单时间
}
