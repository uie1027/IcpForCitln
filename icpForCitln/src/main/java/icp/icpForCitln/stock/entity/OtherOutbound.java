/**
 * Project Name: icpForCitln
 * File Name: OtherOutbound
 * Package Name: icp.icpForCitln.stock.entity
 * Date: 19/05/08 10:53
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.entity;

import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Document(collection = "OTHER_OUTBOUND")  //其他出库
@ToString(callSuper = true)
public class OtherOutbound extends BaseEntity {
    @Field("OTHER_OUTBOUND_CODE")
    private String otherOutboundCode; //其它出库编码

    @Field("DOCUMENT_TYPE")
    private Integer documentType; //凭证类型 1其他出库

    @Field("FACTORY_INFO_ID")
    private String factoryInfoId; //工厂ID

    @Field("PRODUCT_INFO_ID")
    private String productInfoId; //产品ID

    @Field("OUTBOUND_NUMBER")
    private BigDecimal outboundNumber; //出库数量

    @Field("SYSTEM_DICTIONARY_INFO_ID")
    private String systemDictionaryInfoId;  //基本单位id

    @Field("INVENTORY_LOCATION_ID")
    private String inventoryLocationId; //库存地点id

    @Field("RECEIPT_STATUS")
    private Integer receiptStatus; //入库单状态 1已入库 2已取消

    @Field("DOCUMENT_TIME")
    private Date documentTime; //凭证日期

    @Field("REMARK")
    private String remark; //备注
}
