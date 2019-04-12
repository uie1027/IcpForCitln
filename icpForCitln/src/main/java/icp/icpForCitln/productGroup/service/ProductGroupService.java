package icp.icpForCitln.productGroup.service;

import icp.icpForCitln.productGroup.entity.ProductGroupEnterpeiseAttribute;
import icp.icpForCitln.productGroup.entity.ProductGroupInfo;
import icp.icpForCitln.productGroup.entity.ProductGroupMailDisplay;
import icp.icpForCitln.productGroup.entity.ProductGroupPlatformAttribute;

public interface ProductGroupService {

     void productGroupEnterpeiseAttributeSaveTest(ProductGroupEnterpeiseAttribute productGroupEnterpeiseAttribute);

     void productGroupInfoSaveTest(ProductGroupInfo productGroupInfo);

     void productGroupMailDisplaySaveTest(ProductGroupMailDisplay productGroupMailDisplay);

     void productGroupPlatformAttributeSaveTest(ProductGroupPlatformAttribute productGroupPlatformAttribute);

}
