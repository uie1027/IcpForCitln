/**
 * Project Name: icpForCitln
 * File Name: CustomerListVO
 * Package Name: icp.icpForCitln.customer.vo
 * Date: 19/04/19 10:53
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.customer.vo;

import lombok.Data;

import java.util.Date;

@Data
public class CustomerListVO {
    private String companyCode;     //客户编码
    private String companyName;     //公司名称
    private String companyContactPhone;     //联系人手机号
    private String id;  //主键
    private String creater;     //创建人
    private Date createTime;    //创建时间
    private String lastMondifier;   //最后更改人
    private Date lastModificationTime;  //最后更改时间
    private Integer isDelete;   //是否删除   1删除 2未删除
}
