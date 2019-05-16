/**
 * Project Name: icpForCitln
 * File Name: ProductionInfoView
 * Package Name: icp.icpForCitln.product.view
 * Date: 19/05/16 17:26
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.product.view;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "PRODUCT_INFO_VIEW")
public class ProductionInfoView {
    @Id
    private String id;

    @Field("PRODUCT_CODE")
    private String productCode;  //产品编码

    @Field("PRODUCT_NAME")
    private String productName;  //产品名称

    @Field("BASIC_UNIT.SYSTEM_DICTIONARY_VALUE")
    private String basicUnit;  //单位
}
