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
    private String documentType; //凭证类型id

    private String factoryInfoId; //工厂ID

    private String productInfoId; //产品ID

    private BigDecimal outboundNumber; //出库数量

    private String inventoryLocationId; //库存地点id

    private Date documentTime; //凭证日期

    private String remark; //备注
}
