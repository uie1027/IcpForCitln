/**
 * Project Name: icpForCitln
 * File Name: PriceSaleController
 * Package Name: icp.icpForCitln.price.controller
 * Date: 2019/4/29 15:38
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.service.impl;


import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.price.dao.PriceSaleDao;
import icp.icpForCitln.price.service.PriceSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceSaleServiceImpl implements PriceSaleService {
    @Autowired
    private PriceSaleDao priceSaleDao;

    /**
    * @author: Hujh
    * @date: 2019/5/6 22:35
    * @since: JDK 1.8
    *
    * @description: 商品组价格分页查询（销售）
    * @param: [searchField, pageIndex, pageSize]
    * @return: java.util.List<icp.icpForCitln.price.vo.PriceSaleProductGroupView>
    */
   public MongoResult priceSaleProductGroupFindByPage(
           String searchField, Integer pageIndex, Integer pageSize){
       return priceSaleDao.priceSaleProductGroupFindByPage(searchField,pageIndex,pageSize);
   }

    /**
     * @author: Hujh
     * @date: 2019/5/6 22:36
     * @since: JDK 1.8
     *
     * @description: 商品价格分页查询（销售）
     * @param: [searchField, pageIndex, pageSize]
     * @return: java.util.List<icp.icpForCitln.price.vo.PriceSaleProductView>
     */
    public MongoResult  priceSaleProductFindByPage(
            String searchField, Integer pageIndex, Integer pageSize){

        return priceSaleDao.priceSaleProductFindByPage(searchField,pageIndex,pageSize);
    }

    /**
     * @author: Hujh
     * @date: 2019/5/7 14:39
     * @since: JDK 1.8
     *
     * @description: 客户商品组价格分页查询（销售）
     * @param: [customerInfo, productGroupInfo, pageIndex, pageSize]
     * @return: java.util.List<icp.icpForCitln.price.vo.PriceSaleCustomerProductGroupView>
     */
    @Override
    public MongoResult priceSaleCustomerProductGroupFindByPage(
            String customerInfo, String productGroupInfo, Integer pageIndex, Integer pageSize) {
        return priceSaleDao.priceSaleCustomerProductGroupFindByPage(customerInfo,productGroupInfo,pageIndex,pageSize);
    }

    @Override
    public MongoResult priceSaleCustomerProductFindByPage(String customerInfo, String productInfo, Integer pageIndex, Integer pageSize) {
        return priceSaleDao.priceSaleCustomerProductFindByPage(customerInfo,productInfo,pageIndex,pageSize);
    }


}
