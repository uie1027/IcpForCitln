/**
 * Project Name: icpForCitln
 * File Name: PriceSaleDaoImpl
 * Package Name: icp.icpForCitln.price.dao.impl
 * Date: 2019/5/6 19:37
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.dao.impl;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.price.dao.PriceSaleDao;
import icp.icpForCitln.price.view.PriceSaleCustomerProductGroupView;
import icp.icpForCitln.price.view.PriceSaleCustomerProductView;
import icp.icpForCitln.price.view.PriceSaleProductGroupView;
import icp.icpForCitln.price.view.PriceSaleProductView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PriceSaleDaoImpl implements PriceSaleDao {
    @Autowired
    MongoTemplate mongoTemplate;

    /**
     * @author: Hujh
     * @date: 2019/5/6 21:37
     * @since: JDK 1.8
     *
     * @description: 商品组价格分页查询（销售）
     * @param: [searchField, pageIndex, pageSize]
     * @return: java.util.List<icp.icpForCitln.price.dto.PriceSaleProductGroupDTO>
     */
    @Override
    public MongoResult priceSaleProductGroupFindByPage(String searchField, Integer pageIndex, Integer pageSize) {
        PriceSaleProductGroupView priceSaleProductGroupView = new PriceSaleProductGroupView();
        priceSaleProductGroupView.setProductGroupCode(searchField);
        priceSaleProductGroupView.setProductGroupName(searchField);
        return MongoUtil.select(pageIndex, pageSize, priceSaleProductGroupView);
    }


    /**
     * @author: Hujh
     * @date: 2019/5/6 21:37
     * @since: JDK 1.8
     *
     * @description: 商品价格分页查询
     * @param: [searchField, pageIndex, pageSize]
     * @return: java.util.List<icp.icpForCitln.price.dto.PriceSaleProductDTO>
     */
    @Override
    public MongoResult priceSaleProductFindByPage(String searchField, Integer pageIndex, Integer pageSize) {
        PriceSaleProductView priceSaleProductView = new PriceSaleProductView();
        priceSaleProductView.setProductCode(searchField);
        priceSaleProductView.setProductName(searchField);
        return MongoUtil.select(pageIndex, pageSize, priceSaleProductView);
    }



    /**
     * @author: Hujh
     * @date: 2019/5/7 11:18
     * @since: JDK 1.8
     *
     * @description:
     * @param: [customerInfo, productGroupInfo, pageIndex, pageSize]
     * @return: java.util.List<icp.icpForCitln.price.dto.PriceSaleCustomerProductGroupDTO>
     */
    @Override
    public MongoResult priceSaleCustomerProductGroupFindByPage(
            String customerInfo, String productGroupInfo, Integer pageIndex, Integer pageSize) {
        PriceSaleCustomerProductGroupView priceSaleCustomerProductGroupView = new PriceSaleCustomerProductGroupView();
        priceSaleCustomerProductGroupView.setCustomerCode(customerInfo);
        priceSaleCustomerProductGroupView.setCustomerName(customerInfo);
        priceSaleCustomerProductGroupView.setProductGroupCode(productGroupInfo);
        priceSaleCustomerProductGroupView.setProductGroupName(productGroupInfo);
        return MongoUtil.select(pageIndex, pageSize, priceSaleCustomerProductGroupView);
    }

    /**
     * @author: Hujh
     * @date: 2019/5/7 11:18
     * @since: JDK 1.8
     *
     * @description: 这里用一句话描述这个方法的作用
     * @param: [customerInfo, productInfo, pageIndex, pageSize]
     * @return: java.util.List<icp.icpForCitln.price.dto.PriceSaleCustomerProductDTO>
     */
    @Override
    public MongoResult priceSaleCustomerProductFindByPage(
            String customerInfo, String productInfo, Integer pageIndex, Integer pageSize) {
        PriceSaleCustomerProductView priceSaleCustomerProductView = new PriceSaleCustomerProductView();
        priceSaleCustomerProductView.setCustomerCode(customerInfo);
        priceSaleCustomerProductView.setCustomerName(customerInfo);
        priceSaleCustomerProductView.setProductCode(productInfo);
        priceSaleCustomerProductView.setProductName(productInfo);
        return MongoUtil.select(pageIndex, pageSize, priceSaleCustomerProductView);
    }


}
