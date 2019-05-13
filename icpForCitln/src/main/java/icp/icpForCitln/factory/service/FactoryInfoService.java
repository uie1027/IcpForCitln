package icp.icpForCitln.factory.service;

import icp.icpForCitln.factory.dto.FactoryInfoSaveDTO;
import icp.icpForCitln.factory.dto.FactoryInfoUpdateDTO;

public interface FactoryInfoService {

    void factoryInfoSave(FactoryInfoSaveDTO factoryInfoSaveDTO);  //新增工厂

    void factoryInfoIpdate(FactoryInfoUpdateDTO factoryInfoUpdateDTO);   //修改工厂信息
}
