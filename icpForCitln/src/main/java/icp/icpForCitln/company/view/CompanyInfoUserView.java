/**
 * Project Name: icpForCitln
 * File Name: CompanyInfoUserView
 * Package Name: icp.icpForCitln.company.view
 * Date: 2019/5/9 14:08
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.company.view;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document(collection = "COMPANY_INFO_USER")
public class CompanyInfoUserView {      //公司列表视图
    @Id
    private String id;  //ID

    @Field("COMPANY_CODE")
    private String companyCode;     //公司编码

    @Field("COMPANY_NAME")
    private String companyName;     //公司名称

    @Field("COMPANY_TELEPHONE")
    private String companyTelephone;    //公司座机

    @Field("CREATER_USER.USER_NAME")
    private String creater;     //创建人

    @Field("CREATE_TIME")
    private Date createTime;    //创建时间

    @Field("LAST_MODIFIER_USER.USER_NAME")
    private String lastMondifier;   //最后更改人

    @Field("LAST_MODIFICATION_TIME")
    private Date lastModificationTime;  //最后更改时间
}
