/**
 * Project Name: icpForCitln
 * File Name: SaleOrderFindTestView
 * Package Name: icp.icpForCitln.order.view
 * Date: 19/05/10 15:01
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.view;

import icp.icpForCitln.order.entity.SaleOrderDetilInfo;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
public class SaleOrderFindTestView {
    @Field("SALE_CONTRACT_CODE")
    private String saleCode;
    @Field("SALE_ORDER_DETIL_INFO")
    List<SaleOrderDetilInfo> saleOrderDetil;
}
