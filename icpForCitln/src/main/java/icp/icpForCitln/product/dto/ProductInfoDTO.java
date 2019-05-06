/**
 * Project Name: icpForCitln
 * File Name: ProductInfoDTO
 * Package Name: icp.icpForCitln.product.dto
 * Date: 19/05/05 16:52
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.product.dto;

import icp.icpForCitln.common.enetity.BaseEntity;
import icp.icpForCitln.sysconf.entity.SystemDictionaryInfo;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class ProductInfoDTO extends BaseEntity {
    @Field("PRODUCT_CODE")
    private String productCode;

    @Field("PRODUCT_NAME")
    private String productName;

    private String basicUnit;

    @Field("INFO")
    private SystemDictionaryInfo info;
}
