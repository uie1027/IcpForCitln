/**
 * Project Name: icpForCitln
 * File Name: PriceSaleController
 * Package Name: icp.icpForCitln.price.controller
 * Date: 2019/4/29 15:38
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.service.impl;


import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.price.dao.PriceSaleDao;
import icp.icpForCitln.price.dto.PriceSaleCustomerProductDTO;
import icp.icpForCitln.price.dto.PriceSaleCustomerProductGroupDTO;
import icp.icpForCitln.price.dto.PriceSaleProductDTO;
import icp.icpForCitln.price.dto.PriceSaleProductGroupDTO;
import icp.icpForCitln.price.entity.PriceSaleCustomerProduct;
import icp.icpForCitln.price.entity.PriceSaleCustomerProductGroup;
import icp.icpForCitln.price.entity.PriceSaleProduct;
import icp.icpForCitln.price.entity.PriceSaleProductGroup;
import icp.icpForCitln.price.service.PriceSaleService;
import icp.icpForCitln.price.vo.PriceSaleCustomerProductGroupVO;
import icp.icpForCitln.price.vo.PriceSaleCustomerProductVO;
import icp.icpForCitln.price.vo.PriceSaleProductGroupVO;
import icp.icpForCitln.price.vo.PriceSaleProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    /**
     * @author:
     * date: 2019/5/14 14:37
     * @since: JDK 1.8
     *
     * @description: 商品组价格保存
     * @param: [priceSaleProductGroupDTO]
     * @return: void
     */
    @Override
    public void priceSaleProductGroupSave(PriceSaleProductGroupDTO priceSaleProductGroupDTO) {
        PriceSaleProductGroup priceSaleProductGroup = BeanCopyUtil.copy(priceSaleProductGroupDTO,PriceSaleProductGroup.class);
        priceSaleProductGroup.setPriceSaleProductGroupCode(GeneratedCodeUtil.generatedCode());
        MongoUtil.insert(priceSaleProductGroup);
    }

    /**
     * @author:
     * date: 2019/5/14 14:38
     * @since: JDK 1.8
     *
     * @description: 商品价格保存
     * @param: [priceSaleProductDTO]
     * @return: void
     */
    @Override
    public void priceSaleProductSave(PriceSaleProductDTO priceSaleProductDTO) {
        PriceSaleProduct priceSaleProduct = BeanCopyUtil.copy(priceSaleProductDTO,PriceSaleProduct.class);
        priceSaleProduct.setPriceSaleProductCode(GeneratedCodeUtil.generatedCode());
        MongoUtil.insert(priceSaleProduct);
    }


    /**
     * @author:
     * date: 2019/5/14 14:39
     * @since: JDK 1.8
     *
     * @description: 客户商品组价格保存
     * @param: [priceSaleCustomerProductGroupDTO]
     * @return: void
     */
    @Override
    public void priceSaleCustomerProductGroupSave(PriceSaleCustomerProductGroupDTO priceSaleCustomerProductGroupDTO) {
        PriceSaleCustomerProductGroup priceSaleCustomerProductGroup
                = BeanCopyUtil.copy(priceSaleCustomerProductGroupDTO,PriceSaleCustomerProductGroup.class);
        priceSaleCustomerProductGroup.setPriceSaleCustomerProductGroupCode(GeneratedCodeUtil.generatedCode());
        MongoUtil.insert(priceSaleCustomerProductGroup);
    }


    /**
     * @author:
     * date: 2019/5/14 14:39
     * @since: JDK 1.8
     *
     * @description: 客户商品价格保存
     * @param: [priceSaleProductGroupDTO]
     * @return: void
     */
    @Override
    public void priceSaleCustomerProductSave(PriceSaleCustomerProductDTO priceSaleCustomerProductDTO) {
        PriceSaleCustomerProduct priceSaleCustomerProduct = BeanCopyUtil.copy(priceSaleCustomerProductDTO,PriceSaleCustomerProduct.class);
        priceSaleCustomerProduct.setPriceSaleCustomerProductCode(GeneratedCodeUtil.generatedCode());
        MongoUtil.insert(priceSaleCustomerProduct);
    }


    /**
     * @author:
     * date: 2019/5/14 17:36
     * @since: JDK 1.8
     *
     * @description: 通过ID查询价格数据
     * @param: [priceSaleProductDTOS]
     * @return: java.util.List<icp.icpForCitln.price.vo.PriceSaleProductVO>
     */
    @Override
    public List<PriceSaleProductVO> priceSaleProductFindById(List<PriceSaleProductDTO> priceSaleProductDTOS) {
        List<PriceSaleProduct> list   = BeanCopyUtil.copy(priceSaleProductDTOS,PriceSaleProduct.class);
        List<PriceSaleProduct> resList =  new ArrayList<>();
        if(list != null && list.size() >0){
            for (PriceSaleProduct priceSaleProduct : list){
                resList.addAll(MongoUtil.select(priceSaleProduct));
            }
        }
        return BeanCopyUtil.copy(resList,PriceSaleProductVO.class);
    }

    /**
     * @author:
     * date: 2019/5/14 17:43
     * @since: JDK 1.8
     *
     * @description: 通过ID查询商品组价格
     * @param: [priceSaleProductGroupDTOS]
     * @return: java.util.List<icp.icpForCitln.price.vo.PriceSaleProductGroupVO>
     */
    @Override
    public List<PriceSaleProductGroupVO> priceSaleProductGroupFindById(List<PriceSaleProductGroupDTO> priceSaleProductGroupDTOS){
        List<PriceSaleProductGroup> list = BeanCopyUtil.copy(priceSaleProductGroupDTOS,PriceSaleProductGroup.class);
        List<PriceSaleProductGroup> resList = new ArrayList<>();
        for (PriceSaleProductGroup priceSaleProductGroup :list){
            resList.addAll(MongoUtil.select(priceSaleProductGroup));
        }
        return BeanCopyUtil.copy(resList,PriceSaleProductGroupVO.class);
    }

    /**
     * @author:
     * date: 2019/5/14 17:43
     * @since: JDK 1.8
     *
     * @description: 通过ID客户商品价格
     * @param: [priceSaleCustomerProductDTOS]
     * @return: java.util.List<icp.icpForCitln.price.vo.PriceSaleCustomerProductVO>
     */
    @Override
    public List<PriceSaleCustomerProductVO> priceSaleCustomerProductFindById(List<PriceSaleCustomerProductDTO> priceSaleCustomerProductDTOS){
        List<PriceSaleCustomerProduct> list = BeanCopyUtil.copy(priceSaleCustomerProductDTOS,PriceSaleCustomerProduct.class);
        List<PriceSaleCustomerProduct> resList = new ArrayList<>();
        for (PriceSaleCustomerProduct priceSaleCustomerProduct :list){
            resList.addAll(MongoUtil.select(priceSaleCustomerProduct));
        }
        return BeanCopyUtil.copy(resList,PriceSaleCustomerProductVO.class);
    }

    /**
     * @author:
     * date: 2019/5/14 17:42
     * @since: JDK 1.8
     *
     * @description: 通过ID查询客户商品组价格
     * @param: [priceSaleCustomerProductGroupDTOS]
     * @return: java.util.List<icp.icpForCitln.price.vo.PriceSaleCustomerProductGroupVO>
     */
    @Override
    public List<PriceSaleCustomerProductGroupVO> priceSaleCustomerProductGroupFindById(
            List<PriceSaleCustomerProductGroupDTO> priceSaleCustomerProductGroupDTOS) {
        List<PriceSaleCustomerProductGroup> list = BeanCopyUtil.copy(priceSaleCustomerProductGroupDTOS,PriceSaleCustomerProductGroup.class);
        List<PriceSaleCustomerProductGroup> resList = new ArrayList<>();
        for (PriceSaleCustomerProductGroup priceSaleCustomerProductGroup :list){
            resList.addAll(MongoUtil.select(priceSaleCustomerProductGroup));
        }
        return BeanCopyUtil.copy(resList,PriceSaleCustomerProductGroupVO.class);
    }


}
