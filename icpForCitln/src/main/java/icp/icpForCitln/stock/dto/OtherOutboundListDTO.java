/**
 * Project Name: icpForCitln
 * File Name: OtherOutboundListDTO
 * Package Name: icp.icpForCitln.stock.dto
 * Date: 19/05/08 14:26
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.dto;

import icp.icpForCitln.common.enetity.BaseEntity;
import icp.icpForCitln.factory.entity.FactoryInfo;
import icp.icpForCitln.product.eneity.ProductInfo;
import icp.icpForCitln.sysconf.entity.SystemDictionaryInfo;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@Data
public class OtherOutboundListDTO extends BaseEntity {
    @Field("OTHER_OUTBOUND_CODE")
    private String otherOutboundCode; //其它出库编码

    @Field("DOCUMENT_TYPE")
    private Integer documentType; //凭证类型 1其他出库

    @Field("SYSTEM_DICTIONARY_INFO")
    private SystemDictionaryInfo systemDictionaryInfo;

    @Field("PRODUCT_INFO")
    private ProductInfo productInfo;

    @Field("OUTBOUND_NUMBER")
    private BigDecimal outboundNumber; //出库数量

    @Field("FACTORY_INFO")
    private FactoryInfo factoryInfo;

    private String productName;

    private String productCode;

    private String basicUntil;

    private String factoryName;
}
