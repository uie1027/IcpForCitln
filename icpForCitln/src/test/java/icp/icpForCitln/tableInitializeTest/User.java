/**
 * Project Name: icpForCitln
 * File Name: User
 * Package Name: icp.icpForCitln.tableInitializeTest
 * Date: 2019/5/17 14:46
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.tableInitializeTest;


import icp.icpForCitln.common.enetity.BaseEntity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "user")
public class User extends BaseEntity {
    @Field("name")
    private String name;

    @Field("age")
    private Integer age;


    @Field("sex")
    private String sex;
}
