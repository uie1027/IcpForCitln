/**
 * Project Name: icpForCitln
 * File Name: OtherOutboundUpdateDTO
 * Package Name: icp.icpForCitln.stock.dto
 * Date: 19/05/13 19:38
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OtherOutboundUpdateDTO {
    private String id;
    private BigDecimal outboundNumber;
    private String factoryInfoId;
    private String remark;
    private Integer flag;
}
