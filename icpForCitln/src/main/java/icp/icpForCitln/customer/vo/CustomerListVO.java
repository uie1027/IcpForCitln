/**
 * Project Name: icpForCitln
 * File Name: CustomerListVO
 * Package Name: icp.icpForCitln.customer.vo
 * Date: 19/04/29 14:56
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.customer.vo;

import lombok.Data;

import java.util.Date;

@Data
public class CustomerListVO {
    private String customerCode;  //客户编码

    private String customerName;  //公司名称

    private String customerTelephone;  //公司座机

    private String id;  //主键

    private String creater;     //创建人

    private Date createTime;    //创建时间

    private String lastMondifier;   //最后更改人

    private Date lastModificationTime;  //最后更改时间

}
