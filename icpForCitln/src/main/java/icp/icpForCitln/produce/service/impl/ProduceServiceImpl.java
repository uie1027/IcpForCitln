/**
 * Project Name: icpForCitln
 * File Name: ProduceServiceImpl
 * Package Name: icp.icpForCitln.produce.service.impl
 * Date: 19/05/06 10:49
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.produce.service.impl;

import icp.icpForCitln.produce.dao.ProduceDAO;
import icp.icpForCitln.produce.dto.ProductionReceiptFindDTO;
import icp.icpForCitln.produce.dto.ProductionReceiptListDTO;
import icp.icpForCitln.produce.service.ProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduceServiceImpl implements ProduceService {
    @Autowired
    ProduceDAO produceDAO;
    public List<ProductionReceiptListDTO> productionReceiptListFind(Integer pageIndex, Integer pageSize, ProductionReceiptFindDTO productionReceiptFindDTO){
        List<ProductionReceiptListDTO> listDTOS= produceDAO.productionReceiptListFind(pageIndex,pageSize,productionReceiptFindDTO);
        if (listDTOS.size()>0){
            for (ProductionReceiptListDTO productionReceiptListDTO:listDTOS){
                productionReceiptListDTO.setFactoryName(productionReceiptListDTO.getFactoryInfoList().getFactoryName());
                productionReceiptListDTO.setOrderCode(productionReceiptListDTO.getProductionOrderList().getOrderNumber());
            }
        }
        return listDTOS;
    }
}
