/**
 * Project Name: icpForCitln
 * File Name: MongoResult
 * Package Name: icp.icpForCitln.common.enetity
 * Date: 19/05/08 15:30
 * Copyright (c) 2019,All Rights Reserved.
 */

package icp.icpForCitln.common.enetity;

import lombok.Data;

import java.util.List;

@Data
public class MongoResult {
    List resultList;

    Long count;
}
