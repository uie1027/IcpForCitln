/**
 * Project Name: icpForCitln
 * File Name: DataInfoInsert
 * Package Name: icp.icpForCitln.datatest
 * Date: 2019-5-20 14:18
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.datatest;

import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.company.eneity.CompanyInfo;
import icp.icpForCitln.order.entity.PurchaseOrderInfo;
import icp.icpForCitln.order.entity.SaleOrderInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataInfoInsert {
    @org.junit.Test
    public void companyInsert(){
        CompanyInfo companyInfo=new CompanyInfo();
        /*
        companyInfo.setId("cx5cdd42d8abac563e18d9d4e6");
        companyInfo.setCompanyCode("10000001");
        companyInfo.setCompanyName("浙江华峰氨纶股份有限公司");
        companyInfo.setEnterpriseInfoId("cx5cdd42d8abac563e18d9d4ec");
        companyInfo.setCompanyShortName("华峰氨纶");
        companyInfo.setCompanyType("公司");
        companyInfo.setCompanyBusinessScope("氨纶产品的加工制造、销售、技术开发，经营进出口业务。");
        companyInfo.setCompanyTelephone("0577-65150000");
        companyInfo.setCompanyMail("spandex@huafeng.com");
        companyInfo.setCompanyFax("0577-65537858");
        companyInfo.setCompanyLegalPerson("杨从登");
        companyInfo.setCurrencyId("CNY");
        companyInfo.setCompanyRegisteredCapital(new BigDecimal("167680"));
        companyInfo.setTaxpayerTypeId("一般纳税人");
        companyInfo.setUnifiedSocialCreditCode("913300007176139000");



        companyInfo.setId("cx5cdd42d8abac563e18d9d4e7");
        companyInfo.setCompanyCode("10000002");
        companyInfo.setCompanyName("上海华峰铝业股份有限公司");
        companyInfo.setEnterpriseInfoId("cx5cdd42d8abac563e18d9d4ec");
        companyInfo.setCompanyShortName("华峰铝业");
        companyInfo.setCompanyType("公司");
        companyInfo.setCompanyBusinessScope("铝合金复合材料的生产及其技术开发、自研技术的转让，销售自产产品；铝及铝合金板材、带材、箔材、管材、有色金属复合材料、新型合金材料的批发、进出口；佣金代理（拍卖除外）及其相关配套业务；汽车零部件生产及销售；空调零部件生产及销售；模具开发、生产及销售。");
        companyInfo.setCompanyTelephone("021-67276665");
        companyInfo.setCompanyMail("18020180636@qq.com");
        companyInfo.setCompanyFax("021-67270000");
        companyInfo.setCompanyLegalPerson("尤小华");
        companyInfo.setCurrencyId("CNY");
        companyInfo.setCompanyRegisteredCapital(new BigDecimal("60000"));
        companyInfo.setTaxpayerTypeId("一般纳税人");
        companyInfo.setUnifiedSocialCreditCode("91500102MA5U7RGE16");

         companyInfo.setId("cx5cdd42d8abac563e18d9d4e8");
        companyInfo.setCompanyCode("10000003");
        companyInfo.setCompanyName("上海华峰超纤材料股份有限公司");
        companyInfo.setEnterpriseInfoId("cx5cdd42d8abac563e18d9d4ec");
        companyInfo.setCompanyShortName("华峰超纤");
        companyInfo.setCompanyType("公司");
        companyInfo.setCompanyBusinessScope("超细纤维聚氨酯合成革（不含危险化学品）、聚氨酯革用树脂的研发、生产，化工产品（除危险品）、塑料制品、皮革制品的销售，从事货物与技术进出口业务。");
        companyInfo.setCompanyTelephone("021-31108666");
        companyInfo.setCompanyMail("chengming2003@126.com");
        companyInfo.setCompanyFax("021-31106839");
        companyInfo.setCompanyLegalPerson("尤小平");
        companyInfo.setCurrencyId("CNY");
        companyInfo.setCompanyRegisteredCapital(new BigDecimal("37553"));
        companyInfo.setTaxpayerTypeId("一般纳税人");
        companyInfo.setUnifiedSocialCreditCode("91310000744207135C");

        companyInfo.setId("cx5cdd42d8abac563e18d9d4e9");
        companyInfo.setCompanyCode("10000004");
        companyInfo.setCompanyName("上海华峰普恩聚氨酯有限公司");
        companyInfo.setEnterpriseInfoId("cx5cdd42d8abac563e18d9d4ec");
        companyInfo.setCompanyShortName("华峰普恩");
        companyInfo.setCompanyType("公司");
        companyInfo.setCompanyBusinessScope("研发、生产聚氨酯硬泡等高效建筑保温材料（危险化学品除外），并提供相关技术、咨询等售后服务，销售自产产品；以上同类商品及砂浆、网格布、保温钉等配套辅助材料的批发、进出口及佣金代理（拍卖除外）（不涉及国营贸易管理商品，涉及配额许可证管理、专项规定管理的商品按国家有关规定办理）。");
        companyInfo.setCompanyTelephone("0577-65178888");
        companyInfo.setCompanyMail("huafon@huafeng.com");
        companyInfo.setCompanyFax("0577-65178888");
        companyInfo.setCompanyLegalPerson("尤小华");
        companyInfo.setCurrencyId("EUR");
        companyInfo.setCompanyRegisteredCapital(new BigDecimal("39604"));
        companyInfo.setTaxpayerTypeId("一般纳税人");
        companyInfo.setUnifiedSocialCreditCode("91310000674577711Q");

        companyInfo.setId("cx5cdd42d8abac563e18d9d4ea");
        companyInfo.setCompanyCode("10000005");
        companyInfo.setCompanyName("重庆华峰化工有限公司");
        companyInfo.setEnterpriseInfoId("cx5cdd42d8abac563e18d9d4ec");
        companyInfo.setCompanyShortName("华峰化工");
        companyInfo.setCompanyType("公司");
        companyInfo.setCompanyBusinessScope("苯、液氨；研发、生产、销售：氢气、环己烷（中间产品）、环己酮、环己醇混合物、硝酸、环己烯、正戊醇、二氧化碳、环己烷（副产品）（以上经营范围按许可证核定的期限从事经营）； 销售：化工原料（不含危险品）；研发、生产、销售化工产品（不含危险化学品）、化肥（须经审批的经营项目，取得审批后方可从事经营）；聚氨酯产品制造和销售；印铁制罐制造和销售；从事投资业务(不得从事金融业务)；货物进出口、技术进出口；普通货运（按许可证核定的期限从事经营）。");
        companyInfo.setCompanyTelephone("023-87800000");
        companyInfo.setCompanyMail("huafon@huafeng.com");
        companyInfo.setCompanyFax("023-87800878");
        companyInfo.setCompanyLegalPerson("尤飞锋");
        companyInfo.setCurrencyId("CNY");
        companyInfo.setCompanyRegisteredCapital(new BigDecimal("40347"));
        companyInfo.setTaxpayerTypeId("一般纳税人");
        companyInfo.setUnifiedSocialCreditCode("91500102556781535M");*/

        companyInfo.setId("cx5cdd42d8abac563e18d9d4eb");
        companyInfo.setCompanyCode("10000006");
        companyInfo.setCompanyName("浙江华峰新材料股份有限公司");
        companyInfo.setEnterpriseInfoId("cx5cdd42d8abac563e18d9d4ec");
        companyInfo.setCompanyShortName("华峰新材料");
        companyInfo.setCompanyType("公司");
        companyInfo.setCompanyBusinessScope("苯（在许可证有效期内经营）； 聚酯多元醇、聚氨酯系列产品的研发制造和销售；化工原料（不含危险化学品）的销售；印铁制罐制造、销售；货物运输、物流服务（限分支机构经营）；货物进出口、技术进出口。");
        companyInfo.setCompanyTelephone("0577 - 65179999");
        companyInfo.setCompanyMail("xcl@huafeng.com");
        companyInfo.setCompanyFax("0577－65178080");
        companyInfo.setCompanyLegalPerson("尤飞锋");
        companyInfo.setCurrencyId("CNY");
        companyInfo.setCompanyRegisteredCapital(new BigDecimal("50000"));
        companyInfo.setTaxpayerTypeId("一般纳税人");
        companyInfo.setUnifiedSocialCreditCode("913303006683402246");
        MongoUtil.insert(companyInfo);
    }
    @Test
    public void saleOrderInsert(){
        SaleOrderInfo saleOrderInfo = new SaleOrderInfo();
        /*
        saleOrderInfo.setId("cx5cdd42d8abac563e18d9d573");
        saleOrderInfo.setOrderTypeId("标准订单");
        saleOrderInfo.setSaleOrderCode("SO10000001");
        saleOrderInfo.setCustomerInfoId("cx5cdd42d8abac563e18d9d561");
        saleOrderInfo.setCustomerInfoId("C10000001");
        saleOrderInfo.setPayentMethodId("汇票");
        saleOrderInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        saleOrderInfo.setCurrencyId("CNY");
        saleOrderInfo.setTotalAmount(new BigDecimal("48000"));
        saleOrderInfo.setSaleOrderStatus("已确认");


       saleOrderInfo.setId("cx5cdd42d8abac563e18d9d574");
        saleOrderInfo.setOrderTypeId("标准订单");
        saleOrderInfo.setSaleOrderCode("SO10000002");
        saleOrderInfo.setCustomerInfoId("cx5cdd42d8abac563e18d9d562");
        saleOrderInfo.setCustomerInfoId("C10000002");
        saleOrderInfo.setPayentMethodId("汇票");
        saleOrderInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        saleOrderInfo.setCurrencyId("CNY");
        saleOrderInfo.setTotalAmount(new BigDecimal("48000"));
        saleOrderInfo.setSaleOrderStatus("已确认");


       saleOrderInfo.setId("cx5cdd42d8abac563e18d9d575");
        saleOrderInfo.setOrderTypeId("标准订单");
        saleOrderInfo.setSaleOrderCode("SO10000003");
        saleOrderInfo.setCustomerInfoId("cx5cdd42d8abac563e18d9d563");
        saleOrderInfo.setCustomerInfoId("C10000003");
        saleOrderInfo.setPayentMethodId("汇票");
        saleOrderInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        saleOrderInfo.setCurrencyId("CNY");
        saleOrderInfo.setTotalAmount(new BigDecimal("48000"));
        saleOrderInfo.setSaleOrderStatus("已确认");


        saleOrderInfo.setId("cx5cdd42d8abac563e18d9d576");
        saleOrderInfo.setOrderTypeId("标准订单");
        saleOrderInfo.setSaleOrderCode("SO10000004");
        saleOrderInfo.setCustomerInfoId("cx5cdd42d8abac563e18d9d564");
        saleOrderInfo.setCustomerInfoId("C10000004");
        saleOrderInfo.setPayentMethodId("汇票");
        saleOrderInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        saleOrderInfo.setCurrencyId("CNY");
        saleOrderInfo.setTotalAmount(new BigDecimal("48000"));
        saleOrderInfo.setSaleOrderStatus("已确认");


      saleOrderInfo.setId("cx5cdd42d8abac563e18d9d577");
        saleOrderInfo.setOrderTypeId("标准订单");
        saleOrderInfo.setSaleOrderCode("SO10000005");
        saleOrderInfo.setCustomerInfoId("cx5cdd42d8abac563e18d9d565");
        saleOrderInfo.setCustomerInfoId("C10000005");
        saleOrderInfo.setPayentMethodId("汇票");
        saleOrderInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        saleOrderInfo.setCurrencyId("CNY");
        saleOrderInfo.setTotalAmount(new BigDecimal("48000"));
        saleOrderInfo.setSaleOrderStatus("已确认");

*/
        saleOrderInfo.setId("cx5cdd42d8abac563e18d9d578");
        saleOrderInfo.setOrderTypeId("标准订单");
        saleOrderInfo.setSaleOrderCode("SO10000006");
        saleOrderInfo.setCustomerInfoId("cx5cdd42d8abac563e18d9d566");
        saleOrderInfo.setCustomerInfoId("C10000006");
        saleOrderInfo.setPayentMethodId("汇票");
        saleOrderInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        saleOrderInfo.setCurrencyId("CNY");
        saleOrderInfo.setTotalAmount(new BigDecimal("48000"));
        saleOrderInfo.setSaleOrderStatus("已确认");

      MongoUtil.insert(saleOrderInfo);

    }

    @Test
    public void purchaseOrderInsert(){
        PurchaseOrderInfo purchaseOrderInfo = new PurchaseOrderInfo();
       purchaseOrderInfo.setId("cx5cdd42d8abac563e18d9d56d");
        purchaseOrderInfo.setPurchaseOrderCode("PO10000001");
        purchaseOrderInfo.setOrderTypeId("标准订单");
        purchaseOrderInfo.setSupplierInfoId("cx5cdd42d8abac563e18d9d567");
        purchaseOrderInfo.setPayentMethodId("汇票");
        purchaseOrderInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        purchaseOrderInfo.setTotalAmount(new BigDecimal("48000"));
        purchaseOrderInfo.setCurrencyId("CNY");
/*
        purchaseOrderInfo.setId("cx5cdd42d8abac563e18d9d56e");
        purchaseOrderInfo.setPurchaseOrderCode("PO10000002");
        purchaseOrderInfo.setOrderTypeId("标准订单");
        purchaseOrderInfo.setSupplierInfoId("cx5cdd42d8abac563e18d9d568");
        purchaseOrderInfo.setPayentMethodId("汇票");
        purchaseOrderInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        purchaseOrderInfo.setTotalAmount(new BigDecimal("48000"));
        purchaseOrderInfo.setCurrencyId("CNY");

        purchaseOrderInfo.setId("cx5cdd42d8abac563e18d9d56f");
        purchaseOrderInfo.setPurchaseOrderCode("PO10000003");
        purchaseOrderInfo.setOrderTypeId("标准订单");
        purchaseOrderInfo.setSupplierInfoId("cx5cdd42d8abac563e18d9d569");
        purchaseOrderInfo.setPayentMethodId("汇票");
        purchaseOrderInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        purchaseOrderInfo.setTotalAmount(new BigDecimal("48000"));
        purchaseOrderInfo.setCurrencyId("CNY");

       purchaseOrderInfo.setId("cx5cdd42d8abac563e18d9d570");
        purchaseOrderInfo.setPurchaseOrderCode("PO10000004");
        purchaseOrderInfo.setOrderTypeId("标准订单");
        purchaseOrderInfo.setSupplierInfoId("cx5cdd42d8abac563e18d9d56a");
        purchaseOrderInfo.setPayentMethodId("汇票");
        purchaseOrderInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        purchaseOrderInfo.setTotalAmount(new BigDecimal("48000"));
        purchaseOrderInfo.setCurrencyId("CNY");

        purchaseOrderInfo.setId("cx5cdd42d8abac563e18d9d571");
        purchaseOrderInfo.setPurchaseOrderCode("PO10000005");
        purchaseOrderInfo.setOrderTypeId("标准订单");
        purchaseOrderInfo.setSupplierInfoId("cx5cdd42d8abac563e18d9d56b");
        purchaseOrderInfo.setPayentMethodId("汇票");
        purchaseOrderInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        purchaseOrderInfo.setTotalAmount(new BigDecimal("48000"));
        purchaseOrderInfo.setCurrencyId("CNY");

        purchaseOrderInfo.setId("cx5cdd42d8abac563e18d9d572");
        purchaseOrderInfo.setPurchaseOrderCode("PO10000006");
        purchaseOrderInfo.setOrderTypeId("标准订单");
        purchaseOrderInfo.setSupplierInfoId("cx5cdd42d8abac563e18d9d56c");
        purchaseOrderInfo.setPayentMethodId("汇票");
        purchaseOrderInfo.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        purchaseOrderInfo.setTotalAmount(new BigDecimal("48000"));
        purchaseOrderInfo.setCurrencyId("CNY");
*/


        MongoUtil.insert(purchaseOrderInfo);


    }



}
