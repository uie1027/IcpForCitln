/**
 * Project Name: icpForCitln
 * File Name: SupplierInfoFindView
 * Package Name: icp.icpForCitln.supplier.view
 * Date: 19/05/10 13:11
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.supplier.view;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
@Data
@Document(collection = "SUPPLIER_INFO_FIND_VIEW") //供应商列表视图
public class SupplierInfoFindView {
    @Id
    private String id;

    @Field("SUPPLIER_CODE")
    private String supplierCode;    //供应商编码

    @Field("SUPPLIER_NAME")
    private String supplierName;    //公司名称

    @Field("SUPPLIER_CONTACT")
    private String supplierContact;    //公司联系人

    @Field("CREATER.USER_NAME")
    private String creater;     //创建人

    @Field("CREATE_TIME")
    private Date createTime;    //创建时间

    @Field("LAST_MODIFIER.USER_NAME")
    private String lastMondifier;   //最后更改人

    @Field("LAST_MODIFICATION_TIME")
    private Date lastModificationTime;  //最后更改时间

    @Field("FROZEN")
    private Integer frozen;    //冻结标识 1冻结 2不冻结
}
