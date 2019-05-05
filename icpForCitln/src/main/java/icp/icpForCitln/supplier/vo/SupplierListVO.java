/**
 * Project Name: icpForCitln
 * File Name: SupplierListVO
 * Package Name: icp.icpForCitln.supplier.vo
 * Date: 19/05/05 10:06
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.supplier.vo;

import lombok.Data;

import java.util.Date;

@Data
public class SupplierListVO {
    private String supplierCode;  //客户编码

    private String supplierName;  //公司名称

    private String supplierTelephone;  //公司座机

    private String id;  //主键

    private String creater;     //创建人

    private Date createTime;    //创建时间

    private String lastMondifier;   //最后更改人

    private Date lastModificationTime;  //最后更改时间
}
