package icp.icpForCitln.product.service;

import icp.icpForCitln.product.eneity.ProductAttribuit;
import icp.icpForCitln.product.eneity.ProductAttribuitDefinition;
import icp.icpForCitln.product.eneity.ProductAttribuitValue;
import icp.icpForCitln.product.eneity.ProductInfo;

public interface ProductService {
    void productAttribuitSaveTest(ProductAttribuit productAttribuit);  //储存测试
    void productAttribuitDefinitionSaveTest(ProductAttribuitDefinition productAttribuitDefinition); //储存测试
    void productAttribuitValueSaveTest(ProductAttribuitValue productAttribuitValue); //储存测试
    void productInfoSaveTest(ProductInfo productInfo); //储存测试
}
