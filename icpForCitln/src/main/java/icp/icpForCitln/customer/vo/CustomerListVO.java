/**
 * Project Name: icpForCitln
 * File Name: CustomerListVO
 * Package Name: icp.icpForCitln.customer.vo
 * Date: 19/04/29 14:56
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.customer.vo;

import lombok.Data;

@Data
public class CustomerListVO {
    private String customerName;  //公司名称

    private String customerTelephone;  //公司座机

    private String id;  //主键

    private String customerContact;  //公司联系人

    private String customerContactPhone;  //联系人手机号

    private String customerAddress;  //公司详细地址

}
