/**
 * Project Name: icpForCitln
 * File Name: PurchaseOrderDTO
 * Package Name: icp.icpForCitln.order.dto
 * Date: 2019/5/5 14:18
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.order.dto;

import icp.icpForCitln.company.eneity.CompanyInfo;
import icp.icpForCitln.supplier.entity.SupplierInfo;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class PurchaseOrderDTO  {

    @Field("ORDER_TYPE_ID")
    private String orderTypeId;  //订单类型

    @Field("ORDER_ORIGIN_ID")
    private String orderOriginId;  //订单来源

    @Field("PURCHASE_ORDER_CODE")
    private String purchaseOrderCode;  //采购订单编码

    @Field("SUPPLIER_INFO_ID")
    private String supplierInfoId; //供应商ID

    private String supplierName; //供应商名称

    private String payentMethodId; //付款方式

    @Field("COMPANY_INFO_ID")
    private String companyInfoId; //公司id

    private String companyName; //公司id

    @Field("PURCHASE_CONTRACT_CODE")
    private String purchaseContractCode; //采购合同编号

    private BigDecimal amount; //订单总金额

    private String currencyId; //币种

    private String purchaseOrderTitleRemarks;//抬头备注

    @Field("PURCHASE_ORDER_STATUS")
    private String purchaseOrderStatus;  //订单状态

    private List<PurchaseOrderDetailDTO> purchaseOrderDetailDTOS; //订单明细

    @Field("SUPPLIER")
    private SupplierInfo supplierInfo; //供应商信息

    @Field("COMPANY")
    private CompanyInfo companyInfo; //公司信息

    @Field("CREATE_TIME")
    private Date createTime;
}
