package icp.icpForCitln.product.dao;

import icp.icpForCitln.product.dto.ProductInfoDTO;
import icp.icpForCitln.product.eneity.ProductInfo;

import java.util.List;

public interface ProductDAO {
    List<ProductInfoDTO> productInfoFind(ProductInfo productInfo);
}
