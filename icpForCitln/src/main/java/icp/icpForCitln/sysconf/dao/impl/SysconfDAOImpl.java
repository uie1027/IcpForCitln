/**
 * Project Name: icpForCitln
 * File Name: SysconfDAOImpl
 * Package Name: icp.icpForCitln.sysconf.dao.impl
 * Date: 2019-04-30 下午 5:18
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.sysconf.dao.impl;

import icp.icpForCitln.sysconf.dao.SysconfDAO;
import icp.icpForCitln.sysconf.dto.SystemProductAttribuitAndValueDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.LookupOperation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SysconfDAOImpl implements SysconfDAO {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * @author: 方瑞冬
     * @date: 2019-04-30 下午 5:19
     * @since: JDK 1.8
     *
     * @description: 产品属性和产品属性值联表查询
     * @param: []
     * @return: java.util.List<icp.icpForCitln.sysconf.dto.SystemProductAttribuitAndValueDTO>
     */
    @Override
    public List<SystemProductAttribuitAndValueDTO> systemProductAttribuitAndValueFind() {
        LookupOperation lookupOperation = LookupOperation.newLookup().from("SYSTEM_PRODUCT_ATTRIBUIT_VALUE").localField("_id").foreignField("SYSTEM_PRODUCT_ATTRIBUIT_ID").as("SYSTEM_PRODUCT_ATTRIBUIT_VALUES");
        Aggregation aggregation = Aggregation.newAggregation(
                lookupOperation
        );
        return mongoTemplate.aggregate(aggregation, "SYSTEM_PRODUCT_ATTRIBUIT", SystemProductAttribuitAndValueDTO.class).getMappedResults();
    }
}
