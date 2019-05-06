/**
 * Project Name: icpForCitln
 * File Name: StockServiceImpl
 * Package Name: icp.icpForCitln.stock.service.impl
 * Date: 19/05/06 18:58
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.stock.service.impl;

import icp.icpForCitln.stock.dao.StockDAO;
import icp.icpForCitln.stock.dto.ProductionReceiptFindDTO;
import icp.icpForCitln.stock.dto.ProductionReceiptListDTO;
import icp.icpForCitln.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockService {
    @Autowired
    StockDAO stockDAO;

    /**
     * @author: guoxs
     * @date: 19/05/06 19:02
     * @since: JDK 1.8
     *
     * @description: 生产入库单列表
     * @param: [pageIndex, pageSize, productionReceiptFindDTO]
     * @return: java.util.List<icp.icpForCitln.stock.dto.ProductionReceiptListDTO>
     */
    public List<ProductionReceiptListDTO> productionReceiptListFind(Integer pageIndex, Integer pageSize, ProductionReceiptFindDTO productionReceiptFindDTO){
        List<ProductionReceiptListDTO> listDTOS= stockDAO.productionReceiptListFind(pageIndex,pageSize,productionReceiptFindDTO);
        if (listDTOS.size()>0){
            for (ProductionReceiptListDTO productionReceiptListDTO:listDTOS){
                if (productionReceiptListDTO.getFactoryInfo()!=null) {
                    productionReceiptListDTO.setFactoryName(productionReceiptListDTO.getFactoryInfo().getFactoryName());
                }
                if (productionReceiptListDTO.getProductionOrder()!=null) {
                    productionReceiptListDTO.setOrderCode(productionReceiptListDTO.getProductionOrder().getOrderNumber());
                }
            }
        }
        return listDTOS;
    }
}
