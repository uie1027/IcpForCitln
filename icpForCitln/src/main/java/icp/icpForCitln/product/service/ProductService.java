package icp.icpForCitln.product.service;

import icp.icpForCitln.product.eneity.ProductInfo;
import icp.icpForCitln.product.vo.ProductInfoFindVO;

import java.util.List;

public interface ProductService {
    List<ProductInfoFindVO> productInfoFind(ProductInfo productInfo);
}
