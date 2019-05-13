/**
 * Project Name: icpForCitln
 * File Name: OtherOutboundView
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
@Document(collection = "OTHER_OUTBOUND_VIEW")
public class OtherOutboundView {
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

    @Field("RECEIPT_STATUS")
    private Integer receiptStatus; //入库单状态 1已入库 2已取消

    @Field("OUTBOUND_NUMBER")
    private BigDecimal outboundNumber; //出库数量

    @Field("CREATE_TIME")
    private Date createTime;

    @Field("USER_INFO.USER_NAME")
    private String creater;

    @Field("REMARK")
    private String remark;

    @Field("DOCUMENT_TIME")
    private Date documentTime;
}
