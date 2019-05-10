/**
 * Project Name: icpForCitln
 * File Name: CustomerSaleOrderFindView
 * Package Name: icp.icpForCitln.customer.view
 * Date: 19/05/10 14:42
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.customer.view;

import icp.icpForCitln.order.view.SaleOrderFindTestView;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Document(collection = "CUSTOMER_SALE_ORDER_FIND_VIEW")
public class CustomerSaleOrderFindView {

    @Field("CUSTOMER_NAME")
    private String customerName;  //公司名称

    @Field("CUSTOMER_CONTACT")
    private String customerContact;  //公司联系人

    @Field("CUSTOMER_CONTACT_PHONE")
    private String customerContactPhone;  //联系人手机号

    @Field("CUSTOMER_ADDRESS")
    private String customerAddress;  //公司详细地址

    @Field("SALE_ORDER_INFO")
    private List<SaleOrderFindTestView> saleOrderInfo;
}
