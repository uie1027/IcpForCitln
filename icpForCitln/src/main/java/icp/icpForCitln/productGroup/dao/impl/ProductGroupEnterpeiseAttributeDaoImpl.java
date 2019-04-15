/**
 * Project Name: icpForCitln
 * File Name: ProductGroupEnterpeiseAttributeDaoImpl
 * Package Name: icp.icpForCitln.productGroup.dao.impl
 * Date: 2019/4/12 15:59
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.productGroup.dao.impl;

import icp.icpForCitln.productGroup.dao.ProductGroupEnterpeiseAttributeDao;
import icp.icpForCitln.productGroup.entity.ProductGroupEnterpeiseAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductGroupEnterpeiseAttributeDaoImpl implements ProductGroupEnterpeiseAttributeDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * @author: Hujh
     * @date: 2019/4/15 11:28
     * @since: JDK 1.8
     *
     * @description: 保存ProductGroupEnterpeiseAttribute对象
     * @param: [productGroupEnterpeiseAttribute]
     * @return: void
     */
    @Override
    public void saveTest(ProductGroupEnterpeiseAttribute productGroupEnterpeiseAttribute) {

        mongoTemplate.save(productGroupEnterpeiseAttribute);
    }
}
