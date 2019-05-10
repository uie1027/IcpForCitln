/**
 * Project Name: icpForCitln
 * File Name: CustomerInfoFindView
 * Package Name: icp.icpForCitln.customer.view
 * Date: 19/05/10 11:14
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.customer.view;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document(collection = "CUSTOMER_INFO_FIND_VIEW")
public class CustomerInfoFindView {
    @Id
    private String id;

    @Field("CUSTOMER_CODE")
    private String customerCode;  //客户编码

    @Field("CUSTOMER_NAME")
    private String customerName;  //公司名称

    @Field("CUSTOMER_CONTACT")
    private String customerContact;  //公司联系人

    @Field("CREATER.USER_NAME")
    private String creater;     //创建人

    @Field("CREATE_TIME")
    private Date createTime;    //创建时间

    @Field("LAST_MODIFIER.USER_NAME")
    private String lastMondifier;   //最后更改人

    @Field("LAST_MODIFICATION_TIME")
    private Date lastModificationTime;  //最后更改时间

}
