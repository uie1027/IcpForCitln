/**
 * Project Name: icpForCitln
 * File Name: PriceSaleServiceImpl
 * Package Name: icp.icpForCitln.priceSale.service.impl
 * Date: 19/04/12 16:15
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.priceSale.service.impl;

import icp.icpForCitln.common.util.BeanCopyUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.priceSale.dao.PriceSaleCustomerProductDAO;
import icp.icpForCitln.priceSale.dao.PriceSaleCustomerProductGroupDAO;
import icp.icpForCitln.priceSale.dao.PriceSaleProductDAO;
import icp.icpForCitln.priceSale.dao.PriceSaleProductGroupDAO;
import icp.icpForCitln.priceSale.dto.PriceSaleCustomerProductDTO;
import icp.icpForCitln.priceSale.dto.PriceSaleCustomerProductGroupDTO;
import icp.icpForCitln.priceSale.dto.PriceSaleProductDTO;
import icp.icpForCitln.priceSale.dto.PriceSaleProductGroupDTO;
import icp.icpForCitln.priceSale.eneity.PriceSaleCustomerProduct;
import icp.icpForCitln.priceSale.eneity.PriceSaleCustomerProductGroup;
import icp.icpForCitln.priceSale.eneity.PriceSaleProduct;
import icp.icpForCitln.priceSale.eneity.PriceSaleProductGroup;
import icp.icpForCitln.priceSale.service.PriceSaleService;
import icp.icpForCitln.priceSale.vo.PriceSaleCustomerProductGroupVO;
import icp.icpForCitln.priceSale.vo.PriceSaleCustomerProductVO;
import icp.icpForCitln.priceSale.vo.PriceSaleProductGroupVO;
import icp.icpForCitln.priceSale.vo.PriceSaleProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PriceSaleServiceImpl implements PriceSaleService {

    @Autowired
    private PriceSaleProductDAO priceSaleProductDAO;
    @Autowired
    private PriceSaleProductGroupDAO priceSaleProductGroupDAO;
    @Autowired
    private PriceSaleCustomerProductDAO priceSaleCustomerProductDAO;
    @Autowired
    private PriceSaleCustomerProductGroupDAO priceSaleCustomerProductGroupDAO;

    /**
     * @author: guoxs
     * date: 19/04/12 16:20
     * @since: JDK 1.8
     *
     * @description: 测试 PriceSaleProduct 保存
     * @param: [priceSaleProduct]
     * @return: void
     */
    @Override
    public void priceSaleProductSave(PriceSaleProductDTO priceSaleProductDto){
        PriceSaleProduct priceSaleProduct = BeanCopyUtil.copy(priceSaleProductDto,PriceSaleProduct.class);
        priceSaleProductDAO.priceSaleProductSave(priceSaleProduct);
    }

    /**
     * @author: Hujh
     * @date: 2019/4/16 11:44
     * @since: JDK 1.8
     *
     * @description: 根据ID删除一行或多行商品价格数据
     * @param: [ids]
     * @return: void
     */
    @Override
    public void priceSaleProductDelete(List<String> idList) {
        priceSaleProductDAO.priceSaleProductDelete(idList);
    }

    /**
     * @author: Hujh
     * @date: 2019/4/16 11:49
     * @since: JDK 1.8
     *
     * @description: 批量更新商品价格信息
     * @param: [list]
     * @return: void
     */
    @Override
    public void priceSaleProductUpdate(List<PriceSaleProductDTO> list) {
        List<PriceSaleProduct>  priceSaleProducts
                = BeanCopyUtil.copy(list,PriceSaleProduct.class);
        if( priceSaleProducts != null && priceSaleProducts.size() >0 ){
            priceSaleProductDAO.priceSaleProductUpdate(priceSaleProducts);
        }
    }

    /**
     * @author: Hujh
     * @date: 2019/4/16 15:20
     * @since: JDK 1.8
     *
     * @description: 分页查询数据
     * @param: [pageSize, pageNum]
     * @return: java.util.List<icp.icpForCitln.priceSale.vo.PriceSaleProductVO>
     */
    @Override
    public List<PriceSaleProductVO> priceSaleProductListByPage(Integer pageIndex, Integer pageSize) {
        List<PriceSaleProductVO> priceSaleProductVOS = new ArrayList<>();
        List<PriceSaleProduct> list = priceSaleProductDAO.priceSaleProductListByPage(pageIndex,pageSize);
        if(list != null && list.size() >0){
            priceSaleProductVOS = BeanCopyUtil.copy(list,PriceSaleProductVO.class);
        }
        return priceSaleProductVOS;
    }


    /**
     * @author: guoxs
     * date: 19/04/12 16:20
     * @since: JDK 1.8
     *
     * @description: 测试 PriceSaleProductGroup 保存
     * @param: [priceSaleProductGroup]
     * @return: void
     */
    @Override
    public void priceSaleProductGroupSave(PriceSaleProductGroupDTO priceSaleProductGroupDto){
        PriceSaleProductGroup priceSaleProductGroup = BeanCopyUtil.copy(priceSaleProductGroupDto,PriceSaleProductGroup.class);
        priceSaleProductGroupDAO.priceSaleProductGroupSave(priceSaleProductGroup);
    }

    /**
     * @author: Hujh
     * @date: 2019/4/16 16:08
     * @since: JDK 1.8
     *
     * @description: 这里用一句话描述这个方法的作用
     * @param: [ids]
     * @return: void
     */
    @Override
    public void priceSaleProductGroupDelete(List<String> idList) {
        //TODO 按照某种格式分割字符串
        priceSaleProductGroupDAO.priceSaleProductGroupDelete(idList);
    }

    /**
     * @author: Hujh
     * @date: 2019/4/16 16:09
     * @since: JDK 1.8
     *
     * @description: 这里用一句话描述这个方法的作用
     * @param: [list]
     * @return: void
     */
    @Override
    public void priceSaleProductGroupUpdate(List<PriceSaleProductGroupDTO> list) {
        List<PriceSaleProductGroup>  priceSaleProductGroups
                = BeanCopyUtil.copy(list,PriceSaleProductGroup.class);
        if( priceSaleProductGroups != null && priceSaleProductGroups.size() >0 ){
            priceSaleProductGroupDAO.priceSaleProductGroupUpdate(priceSaleProductGroups);
        }
    }

    /**
     * @author: Hujh
     * @date: 2019/4/16 16:09
     * @since: JDK 1.8
     *
     * @description: 这里用一句话描述这个方法的作用
     * @param: [pageIndex, pageSize]
     * @return: java.util.List<icp.icpForCitln.priceSale.vo.PriceSaleProductGroupVO>
     */
    @Override
    public List<PriceSaleProductGroupVO> priceSaleProductGroupListByPage(Integer pageIndex, Integer pageSize) {
        List<PriceSaleProductGroupVO> priceSaleProductGroupVOS= new ArrayList<>();
        List<PriceSaleProductGroup> resList = priceSaleProductGroupDAO.priceSaleProductGroupListByPage(pageIndex,pageSize);
        if(resList != null && resList.size()>0){
            priceSaleProductGroupVOS = BeanCopyUtil.copy(resList,PriceSaleProductGroupVO.class);
        }
        return priceSaleProductGroupVOS;
    }



    /**
     * @author: guoxs
     * date: 19/04/12 16:20
     * @since: JDK 1.8
     *
     * @description: 测试 PriceSaleCustomerProduct 保存
     * @param: [priceSaleCustomerProduct]
     * @return: void
     */
    @Override
    public void priceSaleCustomerProductSave(PriceSaleCustomerProductDTO priceSaleCustomerProductDto){
        PriceSaleCustomerProduct priceSaleCustomerProduct = BeanCopyUtil.copy(priceSaleCustomerProductDto,PriceSaleCustomerProduct.class);
        MongoUtil.insert(priceSaleCustomerProduct);
    }

    /**
     * @author: Hujh
     * @date: 2019/4/16 16:58
     * @since: JDK 1.8
     *
     * @description: 删除选择行项目
     * @param: [ids]
     * @return: void
     */
    @Override
    public void priceSaleCustomerProductDelete(List<String> idList) {
        priceSaleCustomerProductDAO.priceSaleCustomerProductDelete(idList);
    }

    /**
     * @author: Hujh
     * @date: 2019/4/16 16:59
     * @since: JDK 1.8
     *
     * @description: 更新行项目
     * @param: [list]
     * @return: void
     */
    @Override
    public void priceSaleCustomerProductUpdate(List<PriceSaleCustomerProductDTO> list) {
        List<PriceSaleCustomerProduct> priceSaleCustomerProducts
                = BeanCopyUtil.copy(list ,PriceSaleCustomerProduct.class);
        if(priceSaleCustomerProducts != null && priceSaleCustomerProducts.size() >0){
            priceSaleCustomerProductDAO.priceSaleCustomerProductUpdate(priceSaleCustomerProducts);
        }
    }

    /**
     * @author: Hujh
     * @date: 2019/4/16 17:02
     * @since: JDK 1.8
     *
     * @description: 分页查询
     * @param: [pageIndex, pageSize]
     * @return: java.util.List<icp.icpForCitln.priceSale.vo.PriceSaleCustomerProductVO>
     */
    @Override
    public List<PriceSaleCustomerProductVO> priceSaleCustomerProductListByPage(Integer pageIndex, Integer pageSize) {

        List<PriceSaleCustomerProductVO> priceSaleCustomerProductVOS = new ArrayList<>();
        List<PriceSaleCustomerProduct> list
                = priceSaleCustomerProductDAO.priceSaleCustomerProductListByPage(pageIndex, pageSize);
        if(list != null && list.size() >0){
            priceSaleCustomerProductVOS = BeanCopyUtil.copy(list,PriceSaleCustomerProductVO.class);
        }
        return priceSaleCustomerProductVOS;
    }





    /**
     * @author: guoxs
     * date: 19/04/12 16:20
     * @since: JDK 1.8
     *
     * @description: 测试 PriceSaleCustomerProductGroup 保存
     * @param: [priceSaleCustomerProductGroup]
     * @return: void
     */
    @Override
    public void priceSaleCustomerProductGroupSave(PriceSaleCustomerProductGroupDTO priceSaleCustomerProductGroupDto){
        PriceSaleCustomerProductGroup priceSaleCustomerProductGroup
                = BeanCopyUtil.copy(priceSaleCustomerProductGroupDto,PriceSaleCustomerProductGroup.class);
        MongoUtil.insert(priceSaleCustomerProductGroup);

        priceSaleCustomerProductGroupDAO.priceSaleCustomerProductGroupSave(priceSaleCustomerProductGroup);
    }

    @Override
    public void priceSaleCustomerProductGroupDelete(List<String> idList) {
        priceSaleCustomerProductGroupDAO.priceSaleCustomerProducGrouptDelete(idList);
    }

    @Override
    public void priceSaleCustomerProductGroupUpdate(List<PriceSaleCustomerProductGroupDTO> list) {
        List<PriceSaleCustomerProductGroup> priceSaleCustomerProductGroups
                = BeanCopyUtil.copy(list, PriceSaleCustomerProductGroup.class);
        if(priceSaleCustomerProductGroups != null && priceSaleCustomerProductGroups.size() >0){
            priceSaleCustomerProductGroupDAO.priceSaleCustomerProductGroupUpdate(priceSaleCustomerProductGroups);
        }
    }

    @Override
    public List<PriceSaleCustomerProductGroupVO> priceSaleCustomerProductGroupListByPage(Integer pageIndex, Integer pageSize) {
        List<PriceSaleCustomerProductGroupVO> priceSaleCustomerProductGroupVOS = new ArrayList<>();
        List<PriceSaleCustomerProductGroup> resList
                = priceSaleCustomerProductGroupDAO.priceSaleCustomerProductGroupListByPage(pageIndex,pageSize);
        if(resList != null && resList.size() >0){
            priceSaleCustomerProductGroupVOS = BeanCopyUtil.copy(resList,PriceSaleCustomerProductGroupVO.class);
        }
        return priceSaleCustomerProductGroupVOS;
    }

}
