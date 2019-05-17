/**
 * Project Name: icpForCitln
 * File Name: SystemProductAttribuitValueEditListDTO
 * Package Name: icp.icpForCitln.sysconf.dto
 * Date: 2019/5/17 16:26
 * Copyright (c) 2019, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package icp.icpForCitln.sysconf.dto;

import lombok.Data;

import java.util.List;

@Data
public class SystemProductAttribuitValueEditListDTO {
    private List<SystemProductAttribuitValueEditDTO> systemProductAttribuitValueEditDTOList;

    private Integer flag;
}
