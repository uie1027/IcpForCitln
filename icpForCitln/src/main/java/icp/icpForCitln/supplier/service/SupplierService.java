/**
 * Project Name: icpForCitln
 * File Name: SupplierService
 * Package Name: icp.icpForCitln.supplier.service
 * Date: 19/05/10 13:13
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.supplier.service;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.supplier.dto.SupplierInfoDTO;

public interface SupplierService {
    MongoResult supplierInfoListFind(Integer pageIndex, Integer pageSize, SupplierInfoDTO supplierInfoDTO);
}
