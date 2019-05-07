package icp.icpForCitln.product.service;

import icp.icpForCitln.product.dto.ProductInfoSaveDTO;
import icp.icpForCitln.product.eneity.ProductInfo;
import icp.icpForCitln.product.vo.ProductInfoFindVO;

import java.util.List;

public interface ProductService {
    List<ProductInfoFindVO> productInfoFind(ProductInfo productInfo);
    void productInfoSave(ProductInfoSaveDTO productInfoSaveDTO);    //产品新增
}
