/**
 * Project Name: icpForCitln
 * File Name: OtherOutboundSaveDTO
 * Package Name: icp.icpForCitln.stock.dto
 * Date: 19/05/08 14:03
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class OtherOutboundSaveDTO {
    private String otherOutboundCode; //其它出库编码

    private Integer documentType; //凭证类型 1其他出库

    private String factoryInfoId; //工厂ID

    private String productInfoId; //产品ID

    private String systemDictionaryInfoId;  //基本单位id

    private BigDecimal outboundNumber; //出库数量

    private String inventoryLocationId; //库存地点id

    private Integer receiptStatus; //出库单状态 1已出库 2已取消

    private Date documentTime; //凭证日期

    private String remark; //备注
}
