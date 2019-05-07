/**
 * Project Name: icpForCitln
 * File Name: PriceSaleController
 * Package Name: icp.icpForCitln.price.controller
 * Date: 2019/4/29 15:38
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.price.service.impl;


import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.StringUtil;
import icp.icpForCitln.price.dao.PriceSaleDao;
import icp.icpForCitln.price.dto.PriceSaleProductDTO;
import icp.icpForCitln.price.dto.PriceSaleProductGroupDTO;
import icp.icpForCitln.price.service.PriceSaleService;
import icp.icpForCitln.price.vo.PriceSaleProductGroupVO;
import icp.icpForCitln.price.vo.PriceSaleProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
