/**
 * Project Name: icpForCitln
 * File Name: CommonField
 * Package Name: icp.icpForCitln.base.eneity
 * Date: 2019-04-12 下午 3:29
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.common.enetity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
public class CommonField {      //公共字段类，供其它实体类继承
    @Id
    private String id;  //主键

    @Field("CREATER")
    private String creater;     //创建人

    @Field("CREATE_TIME")
    private Date createTime;    //创建时间

    @Field("LAST_MODIFIER")
    private String lastMondifier;   //最后更改人

    @Field("LAST_MODIFICATION_TIME")
    private Date lastModificationTime;  //最后更改时间

    @Field("IS_DELETE")
    private Integer isDelete;   //是否删除   1删除 2未删除
}
