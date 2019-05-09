/**
 * Project Name: icpForCitln
 * File Name: OtherOutboundFindView
 * Package Name: icp.icpForCitln.stock.view
 * Date: 19/05/09 16:46
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.view;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Document(collection = "OTHER_OUTBOUND_FIND_VIEW")
public class OtherOutboundFindView {
    @Id
    private String id;

    @Field("OTHER_OUTBOUND_CODE")
    private String otherOutboundCode; //其它出库编码

    @Field("DOCUMENT_TYPE")
    private Integer documentType; //凭证类型 1其他出库

    @Field("PRODUCT_INFO.PRODUCT_CODE")
    private String productCode;

    @Field("PRODUCT_INFO.PRODUCT_NAME")
    private String productName;

    @Field("BASIC_UNIT.SYSTEM_DICTIONARY_VALUE")
    private String basicUnit;

    @Field("FACTORY_INFO.FACTORY_NAME")
    private String factoryName;

    @Field("OUTBOUND_NUMBER")
    private BigDecimal outboundNumber; //出库数量

    @Field("CREATE_TIME")
    private Date createTime;
}
