/**
 * Project Name: icpForCitln
 * File Name: SalesDeliverySaveDTO
 * Package Name: icp.icpForCitln.stock.dto
 * Date: 19/05/09 17:37
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.dto;

import icp.icpForCitln.stock.entity.SalesDeliveryDetail;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class SalesDeliverySaveDTO {
    private String salesDeliveryCode;  //销售发货单编号

    private String companyInfoId; //公司ID

    private String customerInfoId; //客户ID

    private Date documentTime; //凭证日期

    private String remark; //备注

    List<SalesDeliveryDetail> detailList;
}
