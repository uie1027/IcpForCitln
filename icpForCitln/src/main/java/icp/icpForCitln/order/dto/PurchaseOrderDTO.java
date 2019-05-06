/**
 * Project Name: icpForCitln
 * File Name: PurchaseOrderDTO
 * Package Name: icp.icpForCitln.order.dto
 * Date: 2019/5/5 14:18
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class PurchaseOrderDTO  {

    private String orderTypeId;  //订单类型

    private String supplieInfoId; //供应商编码/名称

    private String payentMethodId; //付款方式

    private String companyInfoId; //公司id

    private String purchaseContractCode; //采购合同编号

    private BigDecimal amount; //订单总金额

    private String currencyId; //币种

    private String purchaseOrderTitleRemarks;//抬头备注

    private String purchaseOrderStatus;  //订单状态

    private List<PurchaseOrderDetailDTO> purchaseOrderDetailDTOS; //订单明细

}
