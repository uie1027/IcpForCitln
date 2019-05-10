/**
 * Project Name: icpForCitln
 * File Name: CustomerServicce
 * Package Name: icp.icpForCitln.customer.service
 * Date: 19/05/10 11:18
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.customer.service;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.customer.dto.CustomerInfoDTO;

public interface CustomerServicce {
    MongoResult customerInfoListFind(Integer pageIndex, Integer pageSize, CustomerInfoDTO customerInfoDTO);

}
