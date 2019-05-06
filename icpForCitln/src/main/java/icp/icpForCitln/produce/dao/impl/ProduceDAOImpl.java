/**
 * Project Name: icpForCitln
 * File Name: ProduceDAOImpl
 * Package Name: icp.icpForCitln.produce.dao.impl
 * Date: 19/05/06 10:20
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.produce.dao.impl;

import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.factory.entity.FactoryInfo;
import icp.icpForCitln.produce.dao.ProduceDAO;
import icp.icpForCitln.produce.dto.ProductionReceiptFindDTO;
import icp.icpForCitln.produce.dto.ProductionReceiptListDTO;
import icp.icpForCitln.produce.entity.ProductionOrder;
import icp.icpForCitln.produce.entity.ProductionReceipt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProduceDAOImpl implements ProduceDAO {
    @Autowired
    MongoTemplate mongoTemplate;

    public List<ProductionReceiptListDTO> productionReceiptListFind(Integer pageIndex, Integer pageSize, ProductionReceiptFindDTO productionReceiptFindDTO){
        List<Class> minorClass = new ArrayList<>();
        minorClass.add(FactoryInfo.class);
        minorClass.add(ProductionOrder.class);
        return MongoUtil.aggregateSelect(minorClass, ProductionReceipt.class,productionReceiptFindDTO,ProductionReceiptListDTO.class,pageIndex,pageSize);
    }
}
