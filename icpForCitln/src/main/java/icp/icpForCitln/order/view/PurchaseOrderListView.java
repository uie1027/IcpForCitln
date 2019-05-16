/**
 * Project Name: icpForCitln
 * File Name: PurchaseOrderListView
 * Package Name: icp.icpForCitln.order.view
 * Date: 19/05/16 17:08
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.view;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Document(collection = "PURCHASE_ORDER_LIST_VIEW")
public class PurchaseOrderListView {
    @Id
    private String id;

    @Field("PURCHASE_ORDER_CODE")
    private String purchaseOrderCode;  //采购订单编码

    @Field("PURCHASE_ORDER_DETAIL")
    private List<PurchaseOrderDetailListView> purchaseOrderDetails;
}
