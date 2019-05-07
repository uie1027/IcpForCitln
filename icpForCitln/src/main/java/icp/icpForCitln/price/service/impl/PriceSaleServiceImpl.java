/**
 * Project Name: icpForCitln
 * File Name: PriceSaleController
 * Package Name: icp.icpForCitln.price.controller
 * Date: 2019/4/29 15:38
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.service.impl;


import com.sun.org.apache.bcel.internal.generic.RETURN;
import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.StringUtil;
import icp.icpForCitln.price.dao.PriceSaleDao;
import icp.icpForCitln.price.dto.PriceSaleCustomerProductDTO;
import icp.icpForCitln.price.dto.PriceSaleCustomerProductGroupDTO;
import icp.icpForCitln.price.dto.PriceSaleProductDTO;
import icp.icpForCitln.price.dto.PriceSaleProductGroupDTO;
import icp.icpForCitln.price.service.PriceSaleService;
import icp.icpForCitln.price.vo.PriceSaleCustomerProductGroupVO;
import icp.icpForCitln.price.vo.PriceSaleCustomerProductVO;
import icp.icpForCitln.price.vo.PriceSaleProductGroupVO;
import icp.icpForCitln.price.vo.PriceSaleProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.events.UIEvent;

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
    * @return: java.util.List<icp.icpForCitln.price.vo.PriceSaleProductGroupVO>
    */
   public List<PriceSaleProductGroupVO>  priceSaleProductGroupFindByPage(
           String searchField, Integer pageIndex, Integer pageSize){

       List<PriceSaleProductGroupDTO> resList =
               priceSaleDao.priceSaleProductGroupFindByPage(searchField,pageIndex,pageSize);
       if(resList == null ) return null;
       for(PriceSaleProductGroupDTO priceSaleProductGroupDTO :resList){
            if(!StringUtil.isEmpty(priceSaleProductGroupDTO.getProductGroupInfo())){
                priceSaleProductGroupDTO.setProductGroupCode(priceSaleProductGroupDTO.getProductGroupInfo().getProductGroupCode());
                priceSaleProductGroupDTO.setProductGroupName(priceSaleProductGroupDTO.getProductGroupInfo().getProductGroupName());
            }
       }
       return BeanCopyUtil.copy(resList, PriceSaleProductGroupVO.class);
   }

    /**
     * @author: Hujh
     * @date: 2019/5/6 22:36
     * @since: JDK 1.8
     *
     * @description: 商品价格分页查询（销售）
     * @param: [searchField, pageIndex, pageSize]
     * @return: java.util.List<icp.icpForCitln.price.vo.PriceSaleProductVO>
     */
    public List<PriceSaleProductVO>  priceSaleProductFindByPage(
            String searchField, Integer pageIndex, Integer pageSize){

        List<PriceSaleProductDTO> resList =
                priceSaleDao.priceSaleProductFindByPage(searchField,pageIndex,pageSize);
        if(resList == null ) return null;
        for(PriceSaleProductDTO priceSaleProductDTO :resList){
            if(!StringUtil.isEmpty(priceSaleProductDTO.getProductInfo())){
                priceSaleProductDTO.setProductCode(priceSaleProductDTO.getProductInfo().getProductCode());
                priceSaleProductDTO.setProductName(priceSaleProductDTO.getProductInfo().getProductName());
            }
        }
        return BeanCopyUtil.copy(resList, PriceSaleProductVO.class);
    }

    /**
     * @author: Hujh
     * @date: 2019/5/7 14:39
     * @since: JDK 1.8
     *
     * @description: 客户商品组价格分页查询（销售）
     * @param: [customerInfo, productGroupInfo, pageIndex, pageSize]
     * @return: java.util.List<icp.icpForCitln.price.vo.PriceSaleCustomerProductGroupVO>
     */
    @Override
    public List<PriceSaleCustomerProductGroupVO> priceSaleCustomerProductGroupFindByPage(
            String customerInfo, String productGroupInfo, Integer pageIndex, Integer pageSize) {
        List<PriceSaleCustomerProductGroupDTO> resList =
                priceSaleDao.priceSaleCustomerProductGroupFindByPage(customerInfo,productGroupInfo,pageIndex,pageSize);
        if(resList == null ) return null;
        for(PriceSaleCustomerProductGroupDTO priceSaleCustomerProductGroupDTO :resList){
            if(!StringUtil.isEmpty(priceSaleCustomerProductGroupDTO.getProductGroupInfo())){
                priceSaleCustomerProductGroupDTO.setProductGroupCode(priceSaleCustomerProductGroupDTO.getProductGroupInfo().getProductGroupCode());
                priceSaleCustomerProductGroupDTO.setProductGroupName(priceSaleCustomerProductGroupDTO.getProductGroupInfo().getProductGroupName());
            }
            if(!StringUtil.isEmpty(priceSaleCustomerProductGroupDTO.getCustomerInfo())){
                priceSaleCustomerProductGroupDTO.setCustomerCode(priceSaleCustomerProductGroupDTO.getCustomerInfo().getCustomerCode());
                priceSaleCustomerProductGroupDTO.setCustomerName(priceSaleCustomerProductGroupDTO.getCustomerInfo().getCustomerName());
            }
        }
        return BeanCopyUtil.copy(resList,PriceSaleCustomerProductGroupVO.class);
    }

    @Override
    public List<PriceSaleCustomerProductVO> priceSaleCustomerProductFindByPage(String customerInfo, String productInfo, Integer pageIndex, Integer pageSize) {
        List<PriceSaleCustomerProductDTO> resList =
                priceSaleDao.priceSaleCustomerProductFindByPage(customerInfo,productInfo,pageIndex,pageSize);
        if(resList == null ) return null;
        for(PriceSaleCustomerProductDTO priceSaleCustomerProductDTO :resList){
            if(!StringUtil.isEmpty(priceSaleCustomerProductDTO.getProductInfo())){
                priceSaleCustomerProductDTO.setProductCode(priceSaleCustomerProductDTO.getProductInfo().getProductCode());
                priceSaleCustomerProductDTO.setProductName(priceSaleCustomerProductDTO.getProductInfo().getProductName());
            }
            if(!StringUtil.isEmpty(priceSaleCustomerProductDTO.getCustomerInfo())){
                priceSaleCustomerProductDTO.setCustomerCode(priceSaleCustomerProductDTO.getCustomerInfo().getCustomerCode());
                priceSaleCustomerProductDTO.setCustomerName(priceSaleCustomerProductDTO.getCustomerInfo().getCustomerName());
            }
        }
        return BeanCopyUtil.copy(resList,PriceSaleCustomerProductVO.class);
    }


}
