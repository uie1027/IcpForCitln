/**
 * Project Name: icpForCitln
 * File Name: OtherOutboundListVO
 * Package Name: icp.icpForCitln.stock.vo
 * Date: 19/05/08 14:40
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class OtherOutboundListVO {
    private String otherOutboundCode; //其它出库编码

    private Integer documentType; //凭证类型 1其他出库

    private BigDecimal outboundNumber; //出库数量

    private String productName;

    private String productCode;

    private String basicUntil;

    private String factoryName;

    private String id;

    private Date createTime;
}
