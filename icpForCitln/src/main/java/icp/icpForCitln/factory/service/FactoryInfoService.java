package icp.icpForCitln.factory.service;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.factory.dto.FactoryInfoSaveDTO;
import icp.icpForCitln.factory.dto.FactoryInfoUpdateDTO;
import icp.icpForCitln.factory.dto.OranizationInfoGetListDTO;
import icp.icpForCitln.factory.view.CompanyFactoryView;

import java.util.List;

public interface FactoryInfoService {

    void factoryInfoSave(FactoryInfoSaveDTO factoryInfoSaveDTO);  //新增工厂

    void factoryInfoIpdate(FactoryInfoUpdateDTO factoryInfoUpdateDTO);   //修改工厂信息

    MongoResult oranizationInfoGetListByPage(OranizationInfoGetListDTO oranizationInfoGetListDTO);  //组织信息列表  分页
    List<CompanyFactoryView> factoryListGet();
}
