/**
 * Project Name: icpForCitln
 * File Name: DataInfoInsert
 * Package Name: icp.icpForCitln.datatest
 * Date: 2019-5-20 14:18
 * Copyright (c) 2019,All Rights Reserved.
 */
package icp.icpForCitln.datatest;

import icp.icpForCitln.common.util.DateUtil;
import icp.icpForCitln.common.util.GeneratedCodeUtil;
import icp.icpForCitln.common.util.MongoUtil;
import icp.icpForCitln.company.eneity.CompanyInfo;
import icp.icpForCitln.customer.entity.CustomerInfo;
import icp.icpForCitln.order.entity.PurchaseOrderInfo;
import icp.icpForCitln.order.entity.SaleOrderDetailInfo;
import icp.icpForCitln.order.entity.SaleOrderInfo;
import icp.icpForCitln.platform.entity.PlantformDirectoryAttribute;
import icp.icpForCitln.platform.entity.PlantformDirectoryAttributeValue;
import icp.icpForCitln.platform.entity.PlantformDirectoryInfo;
import icp.icpForCitln.platform.entity.PlantformMailDisplay;
import icp.icpForCitln.price.entity.PriceSaleCustomerProduct;
import icp.icpForCitln.price.entity.PriceSaleCustomerProductGroup;
import icp.icpForCitln.price.entity.PriceSaleProduct;
import icp.icpForCitln.price.entity.PriceSaleProductGroup;
import icp.icpForCitln.stock.entity.*;
import icp.icpForCitln.supplier.entity.SupplierInfo;
import icp.icpForCitln.sysconf.entity.SystemBrandInfo;
import icp.icpForCitln.sysconf.entity.SystemProductAttribuit;
import icp.icpForCitln.sysconf.entity.SystemProductAttribuitValue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataInfoInsert {

    /**
     * 公司列表增加数据
     */
    @org.junit.Test
    public void companyInsert() {
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
    /**
     * 销售订单列表增加数据
     */
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

    /**
     * 采购订单表增加数据
     */
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
        purchaseOrderInfo.setPurchaseOrderDate(new Date("2019/5/1"));
        purchaseOrderInfo.setPurchaseOrderStatus("已确认");

        PurchaseOrderInfo purchaseOrderInfo1 = new PurchaseOrderInfo();
        purchaseOrderInfo1.setId("cx5cdd42d8abac563e18d9d56e");
        purchaseOrderInfo1.setPurchaseOrderCode("PO10000002");
        purchaseOrderInfo1.setOrderTypeId("标准订单");
        purchaseOrderInfo1.setSupplierInfoId("cx5cdd42d8abac563e18d9d568");
        purchaseOrderInfo1.setPayentMethodId("汇票");
        purchaseOrderInfo1.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        purchaseOrderInfo1.setTotalAmount(new BigDecimal("48000"));
        purchaseOrderInfo1.setCurrencyId("CNY");
        purchaseOrderInfo.setPurchaseOrderDate(new Date("2019/5/1"));
        purchaseOrderInfo1.setPurchaseOrderStatus("已确认");

        PurchaseOrderInfo purchaseOrderInfo2 = new PurchaseOrderInfo();
        purchaseOrderInfo2.setId("cx5cdd42d8abac563e18d9d56f");
        purchaseOrderInfo2.setPurchaseOrderCode("PO10000003");
        purchaseOrderInfo2.setOrderTypeId("标准订单");
        purchaseOrderInfo2.setSupplierInfoId("cx5cdd42d8abac563e18d9d569");
        purchaseOrderInfo2.setPayentMethodId("汇票");
        purchaseOrderInfo2.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        purchaseOrderInfo2.setTotalAmount(new BigDecimal("48000"));
        purchaseOrderInfo2.setCurrencyId("CNY");
        purchaseOrderInfo.setPurchaseOrderDate(new Date("2019/5/1"));
        purchaseOrderInfo2.setPurchaseOrderStatus("已确认");

        PurchaseOrderInfo purchaseOrderInfo3 = new PurchaseOrderInfo();
        purchaseOrderInfo3.setId("cx5cdd42d8abac563e18d9d570");
        purchaseOrderInfo3.setPurchaseOrderCode("PO10000004");
        purchaseOrderInfo3.setOrderTypeId("标准订单");
        purchaseOrderInfo3.setSupplierInfoId("cx5cdd42d8abac563e18d9d56a");
        purchaseOrderInfo3.setPayentMethodId("现金");
        purchaseOrderInfo3.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        purchaseOrderInfo3.setTotalAmount(new BigDecimal("48000"));
        purchaseOrderInfo3.setCurrencyId("CNY");
        purchaseOrderInfo.setPurchaseOrderDate(new Date("2019/5/1"));
        purchaseOrderInfo3.setPurchaseOrderStatus("已完成");

        PurchaseOrderInfo purchaseOrderInfo4 = new PurchaseOrderInfo();
        purchaseOrderInfo4.setId("cx5cdd42d8abac563e18d9d571");
        purchaseOrderInfo4.setPurchaseOrderCode("PO10000005");
        purchaseOrderInfo4.setOrderTypeId("标准订单");
        purchaseOrderInfo4.setSupplierInfoId("cx5cdd42d8abac563e18d9d56b");
        purchaseOrderInfo4.setPayentMethodId("现金");
        purchaseOrderInfo4.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        purchaseOrderInfo4.setTotalAmount(new BigDecimal("48000"));
        purchaseOrderInfo4.setCurrencyId("CNY");
        purchaseOrderInfo.setPurchaseOrderDate(new Date("2019/5/1"));
        purchaseOrderInfo4.setPurchaseOrderStatus("已完成");

        PurchaseOrderInfo purchaseOrderInfo5 = new PurchaseOrderInfo();
        purchaseOrderInfo5.setId("cx5cdd42d8abac563e18d9d572");
        purchaseOrderInfo5.setPurchaseOrderCode("PO10000006");
        purchaseOrderInfo5.setOrderTypeId("标准订单");
        purchaseOrderInfo5.setSupplierInfoId("cx5cdd42d8abac563e18d9d56c");
        purchaseOrderInfo5.setPayentMethodId("现金");
        purchaseOrderInfo5.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        purchaseOrderInfo5.setTotalAmount(new BigDecimal("48000"));
        purchaseOrderInfo5.setCurrencyId("CNY");
        purchaseOrderInfo.setPurchaseOrderDate(new Date("2019/5/1"));
        purchaseOrderInfo5.setPurchaseOrderStatus("已删除");



        MongoUtil.insert(purchaseOrderInfo);
        MongoUtil.insert(purchaseOrderInfo1);
        MongoUtil.insert(purchaseOrderInfo2);
        MongoUtil.insert(purchaseOrderInfo3);
        MongoUtil.insert(purchaseOrderInfo4);
        MongoUtil.insert(purchaseOrderInfo5);


    }
    /**
     * 平台目录列表增加数据
     */
    @Test
    public void plantformDirectoryInsert(){
     /*   PlantformDirectoryInfo plantformDirectoryInfo1 = new PlantformDirectoryInfo();
        plantformDirectoryInfo1.setId("cx5cdd42d8abac563e18d9d51a");
        plantformDirectoryInfo1.setPlantformDirectoryCode("100001");
        plantformDirectoryInfo1.setPlantformDirectoryName("聚氨酯生产原料");
        plantformDirectoryInfo1.setPlantformDirectoryLevel(1);

        PlantformDirectoryInfo plantformDirectoryInfo2 = new PlantformDirectoryInfo();
        plantformDirectoryInfo2.setId("cx5cdd42d8abac563e18d9d51b");
        plantformDirectoryInfo2.setPlantformDirectoryCode("100002");
        plantformDirectoryInfo2.setPlantformDirectoryName("聚氨酯工业产品");
        plantformDirectoryInfo2.setPlantformDirectoryLevel(1);

        PlantformDirectoryInfo plantformDirectoryInfo3 = new PlantformDirectoryInfo();
        plantformDirectoryInfo3.setId("cx5cdd42d8abac563e18d9d51c");
        plantformDirectoryInfo3.setPlantformDirectoryCode("100003");
        plantformDirectoryInfo3.setPlantformDirectoryName("聚氨酯应用产品");
        plantformDirectoryInfo3.setPlantformDirectoryLevel(1);

        PlantformDirectoryInfo plantformDirectoryInfo4 = new PlantformDirectoryInfo();
        plantformDirectoryInfo4.setId("cx5cdd42d8abac563e18d9d51d");
        plantformDirectoryInfo4.setPlantformDirectoryCode("100004");
        plantformDirectoryInfo4.setPlantformDirectoryName("终端消费品");
        plantformDirectoryInfo4.setPlantformDirectoryLevel(1);

        PlantformDirectoryInfo plantformDirectoryInfo5 = new PlantformDirectoryInfo();
        plantformDirectoryInfo5.setId("cx5cdd42d8abac563e18d9d51e");
        plantformDirectoryInfo5.setPlantformDirectoryCode("100001");
        plantformDirectoryInfo5.setPlantformDirectoryName("异氰酸酯类");
        plantformDirectoryInfo5.setPlantformDirectoryLevel(2);
*/
        PlantformDirectoryInfo plantformDirectoryInfo6 = new PlantformDirectoryInfo();
        plantformDirectoryInfo6.setId("cx5cdd42d8abac563e18d9d51f");
        plantformDirectoryInfo6.setPlantformDirectoryCode("100002");
        plantformDirectoryInfo6.setPlantformDirectoryName("多元醇类");
        plantformDirectoryInfo6.setPlantformDirectoryLevel(2);

        PlantformDirectoryInfo plantformDirectoryInfo7 = new PlantformDirectoryInfo();
         plantformDirectoryInfo7.setId("cx5cdd42d8abac563e18d9d520");
        plantformDirectoryInfo7.setPlantformDirectoryCode("100003");
        plantformDirectoryInfo7.setPlantformDirectoryName("助剂类");
        plantformDirectoryInfo7.setPlantformDirectoryLevel(2);

        PlantformDirectoryInfo plantformDirectoryInfo8 = new PlantformDirectoryInfo();
        plantformDirectoryInfo8.setId("cx5cdd42d8abac563e18d9d521");
        plantformDirectoryInfo8.setPlantformDirectoryCode("20001");
        plantformDirectoryInfo8.setPlantformDirectoryName("聚氨酯树脂");
        plantformDirectoryInfo8.setPlantformDirectoryLevel(2);

        PlantformDirectoryInfo plantformDirectoryInfo9 = new PlantformDirectoryInfo();
        plantformDirectoryInfo9.setId("cx5cdd42d8abac563e18d9d522");
        plantformDirectoryInfo9.setPlantformDirectoryCode("20002");
        plantformDirectoryInfo9.setPlantformDirectoryName("氨纶长丝");
        plantformDirectoryInfo9.setPlantformDirectoryLevel(2);

        PlantformDirectoryInfo plantformDirectoryInfo10 = new PlantformDirectoryInfo();
        plantformDirectoryInfo10.setId("cx5cdd42d8abac563e18d9d523");
        plantformDirectoryInfo10.setPlantformDirectoryCode("20003");
        plantformDirectoryInfo10.setPlantformDirectoryName("TPU");
        plantformDirectoryInfo10.setPlantformDirectoryLevel(2);

        PlantformDirectoryInfo plantformDirectoryInfo11 = new PlantformDirectoryInfo();
        plantformDirectoryInfo11.setId("cx5cdd42d8abac563e18d9d524");
        plantformDirectoryInfo11.setPlantformDirectoryCode("20004");
        plantformDirectoryInfo11.setPlantformDirectoryName("聚氨酯原液");
        plantformDirectoryInfo11.setPlantformDirectoryLevel(2);

        PlantformDirectoryInfo plantformDirectoryInfo12 = new PlantformDirectoryInfo();
        plantformDirectoryInfo12.setId("cx5cdd42d8abac563e18d9d525");
        plantformDirectoryInfo12.setPlantformDirectoryCode("30001");
        plantformDirectoryInfo12.setPlantformDirectoryName("纤维");
        plantformDirectoryInfo12.setPlantformDirectoryLevel(2);

        PlantformDirectoryInfo plantformDirectoryInfo13 = new PlantformDirectoryInfo();
        plantformDirectoryInfo13.setId("cx5cdd42d8abac563e18d9d526");
        plantformDirectoryInfo13.setPlantformDirectoryCode("30002");
        plantformDirectoryInfo13.setPlantformDirectoryName("原生基布");
        plantformDirectoryInfo13.setPlantformDirectoryLevel(2);

        PlantformDirectoryInfo plantformDirectoryInfo14 = new PlantformDirectoryInfo();
        plantformDirectoryInfo14.setId("cx5cdd42d8abac563e18d9d527");
        plantformDirectoryInfo14.setPlantformDirectoryCode("30003");
        plantformDirectoryInfo14.setPlantformDirectoryName("后处理基布");
        plantformDirectoryInfo14.setPlantformDirectoryLevel(2);


        PlantformDirectoryInfo plantformDirectoryInfo15 = new PlantformDirectoryInfo();
        plantformDirectoryInfo15.setId("cx5cdd42d8abac563e18d9d528");
        plantformDirectoryInfo15.setPlantformDirectoryCode("40001");
        plantformDirectoryInfo15.setPlantformDirectoryName("鞋");
        plantformDirectoryInfo15.setPlantformDirectoryLevel(2);

        PlantformDirectoryInfo plantformDirectoryInfo16 = new PlantformDirectoryInfo();
        plantformDirectoryInfo16.setId("cx5cdd42d8abac563e18d9d529");
        plantformDirectoryInfo16.setPlantformDirectoryCode("40002");
        plantformDirectoryInfo16.setPlantformDirectoryName("箱包");
        plantformDirectoryInfo16.setPlantformDirectoryLevel(2);

        PlantformDirectoryInfo plantformDirectoryInfo17 = new PlantformDirectoryInfo();
        plantformDirectoryInfo17.setId("cx5cdd42d8abac563e18d9d52a");
        plantformDirectoryInfo17.setPlantformDirectoryCode("40003");
        plantformDirectoryInfo17.setPlantformDirectoryName("服饰");
        plantformDirectoryInfo17.setPlantformDirectoryLevel(2);

        PlantformDirectoryInfo plantformDirectoryInfo18 = new PlantformDirectoryInfo();
        plantformDirectoryInfo18.setId("cx5cdd42d8abac563e18d9d52b");
        plantformDirectoryInfo18.setPlantformDirectoryCode("40004");
        plantformDirectoryInfo18.setPlantformDirectoryName("汽车坐垫");
        plantformDirectoryInfo18.setPlantformDirectoryLevel(2);

    /*    MongoUtil.insert(plantformDirectoryInfo1);
        MongoUtil.insert(plantformDirectoryInfo2);
        MongoUtil.insert(plantformDirectoryInfo3);
        MongoUtil.insert(plantformDirectoryInfo4);
        MongoUtil.insert(plantformDirectoryInfo5);
*/

        MongoUtil.insert(plantformDirectoryInfo6);
        MongoUtil.insert(plantformDirectoryInfo7);
        MongoUtil.insert(plantformDirectoryInfo8);
        MongoUtil.insert(plantformDirectoryInfo9);
        MongoUtil.insert(plantformDirectoryInfo10);
        MongoUtil.insert(plantformDirectoryInfo11);
        MongoUtil.insert(plantformDirectoryInfo12);
        MongoUtil.insert(plantformDirectoryInfo13);
        MongoUtil.insert(plantformDirectoryInfo14);
        MongoUtil.insert(plantformDirectoryInfo15);
        MongoUtil.insert(plantformDirectoryInfo16);
        MongoUtil.insert(plantformDirectoryInfo17);
        MongoUtil.insert(plantformDirectoryInfo18);


    }
    /**
     * 平台商城展示表增加数据
     */
    @Test
    public void plantformMailDisplayInsert(){
        PlantformMailDisplay plantformMailDisplay1 = new PlantformMailDisplay();
        plantformMailDisplay1.setId("cx5cdd42d8abac563e18d9d516");
        plantformMailDisplay1.setMailDisplayCode("0001");
        plantformMailDisplay1.setMailName("工业品超市");

        PlantformMailDisplay plantformMailDisplay2 = new PlantformMailDisplay();
        plantformMailDisplay2.setId("cx5cdd42d8abac563e18d9d517");
        plantformMailDisplay2.setMailDisplayCode("0002");
        plantformMailDisplay2.setMailName("集采中心");

        PlantformMailDisplay plantformMailDisplay3 = new PlantformMailDisplay();
        plantformMailDisplay3.setId("cx5cdd42d8abac563e18d9d518");
        plantformMailDisplay3.setMailDisplayCode("0003");
        plantformMailDisplay3.setMailName("个性化定制");

        PlantformMailDisplay plantformMailDisplay4 = new PlantformMailDisplay();
        plantformMailDisplay4.setId("cx5cdd42d8abac563e18d9d519");
        plantformMailDisplay4.setMailDisplayCode("0004");
        plantformMailDisplay4.setMailName("智能选配");

        MongoUtil.insert(plantformMailDisplay1);
        MongoUtil.insert(plantformMailDisplay2);
        MongoUtil.insert(plantformMailDisplay3);
        MongoUtil.insert(plantformMailDisplay4);
    }

    /**
     * 平台目录属性表增加数据
     */
    @Test
    public void plantformDirectoryAttributeInsert(){
        PlantformDirectoryAttribute plantformDirectoryAttribute1 = new PlantformDirectoryAttribute();
        plantformDirectoryAttribute1.setId("cx5cdd42d8abac563e18d9d52c");
        plantformDirectoryAttribute1.setPlantformDirectoryId("cx5cdd42d8abac563e18d9d525");
        plantformDirectoryAttribute1.setPlantformAttributeCode("0001");
        plantformDirectoryAttribute1.setPlantformAttributeName("材质");

        PlantformDirectoryAttribute plantformDirectoryAttribute2 = new PlantformDirectoryAttribute();
        plantformDirectoryAttribute2.setId("cx5cdd42d8abac563e18d9d52d");
        plantformDirectoryAttribute2.setPlantformDirectoryId("cx5cdd42d8abac563e18d9d525");
        plantformDirectoryAttribute2.setPlantformAttributeCode("0002");
        plantformDirectoryAttribute2.setPlantformAttributeName("用途");


        PlantformDirectoryAttribute plantformDirectoryAttribute3 = new PlantformDirectoryAttribute();
        plantformDirectoryAttribute3.setId("cx5cdd42d8abac563e18d9d52e");
        plantformDirectoryAttribute3.setPlantformDirectoryId("cx5cdd42d8abac563e18d9d525");
        plantformDirectoryAttribute3.setPlantformAttributeCode("0003");
        plantformDirectoryAttribute3.setPlantformAttributeName("纹路");


        PlantformDirectoryAttribute plantformDirectoryAttribute4 = new PlantformDirectoryAttribute();
        plantformDirectoryAttribute4.setId("cx5cdd42d8abac563e18d9d52f");
        plantformDirectoryAttribute4.setPlantformDirectoryId("cx5cdd42d8abac563e18d9d525");
        plantformDirectoryAttribute4.setPlantformAttributeCode("0004");
        plantformDirectoryAttribute4.setPlantformAttributeName("底布");


        PlantformDirectoryAttribute plantformDirectoryAttribute5 = new PlantformDirectoryAttribute();
        plantformDirectoryAttribute5.setId("cx5cdd42d8abac563e18d9d530");
        plantformDirectoryAttribute5.setPlantformDirectoryId("cx5cdd42d8abac563e18d9d525");
        plantformDirectoryAttribute5.setPlantformAttributeCode("0005");
        plantformDirectoryAttribute5.setPlantformAttributeName("厚度");


        PlantformDirectoryAttribute plantformDirectoryAttribute6 = new PlantformDirectoryAttribute();
        plantformDirectoryAttribute6.setId("cx5cdd42d8abac563e18d9d531");
        plantformDirectoryAttribute6.setPlantformDirectoryId("cx5cdd42d8abac563e18d9d525");
        plantformDirectoryAttribute6.setPlantformAttributeCode("0006");
        plantformDirectoryAttribute6.setPlantformAttributeName("效果");


        PlantformDirectoryAttribute plantformDirectoryAttribute7 = new PlantformDirectoryAttribute();
        plantformDirectoryAttribute7.setId("cx5cdd42d8abac563e18d9d532");
        plantformDirectoryAttribute7.setPlantformDirectoryId("cx5cdd42d8abac563e18d9d525");
        plantformDirectoryAttribute7.setPlantformAttributeCode("0007");
        plantformDirectoryAttribute7.setPlantformAttributeName("颜色");



        MongoUtil.insert(plantformDirectoryAttribute1);
        MongoUtil.insert(plantformDirectoryAttribute2);
        MongoUtil.insert(plantformDirectoryAttribute3);
        MongoUtil.insert(plantformDirectoryAttribute4);
        MongoUtil.insert(plantformDirectoryAttribute5);
        MongoUtil.insert(plantformDirectoryAttribute6);
        MongoUtil.insert(plantformDirectoryAttribute7);



    }

    /**
     * 平台目录属性值表增加数据
     */
    @Test
    public void plantformDirectoryAttributeValueInsert(){
        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue1 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue1.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d52c");
        plantformDirectoryAttributeValue1.setPlantformAttributeCode("0001");
        plantformDirectoryAttributeValue1.setPlantformAttributeContent("超纤");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue2 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue2.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d52c");
        plantformDirectoryAttributeValue2.setPlantformAttributeCode("0002");
        plantformDirectoryAttributeValue2.setPlantformAttributeContent("PU革");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue3 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue3.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d52c");
        plantformDirectoryAttributeValue3.setPlantformAttributeCode("0003");
        plantformDirectoryAttributeValue3.setPlantformAttributeContent("半PU");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue4 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue4.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d52c");
        plantformDirectoryAttributeValue4.setPlantformAttributeCode("0004");
        plantformDirectoryAttributeValue4.setPlantformAttributeContent("TPU");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue5 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue5.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d52c");
        plantformDirectoryAttributeValue5.setPlantformAttributeCode("0005");
        plantformDirectoryAttributeValue5.setPlantformAttributeContent("超纤革");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue6 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue6.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d52d");
        plantformDirectoryAttributeValue6.setPlantformAttributeCode("0001");
        plantformDirectoryAttributeValue6.setPlantformAttributeContent("车用革");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue7 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue7.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d52d");
        plantformDirectoryAttributeValue7.setPlantformAttributeCode("0002");
        plantformDirectoryAttributeValue7.setPlantformAttributeContent("鞋面革");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue8 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue8.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d52d");
        plantformDirectoryAttributeValue8.setPlantformAttributeCode("0003");
        plantformDirectoryAttributeValue8.setPlantformAttributeContent("服装革");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue9 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue9.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d52d");
        plantformDirectoryAttributeValue9.setPlantformAttributeCode("0004");
        plantformDirectoryAttributeValue9.setPlantformAttributeContent("家具革");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue10 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue10.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d52d");
        plantformDirectoryAttributeValue10.setPlantformAttributeCode("0005");
        plantformDirectoryAttributeValue10.setPlantformAttributeContent("箱包革");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue11 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue11.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d52e");
        plantformDirectoryAttributeValue11.setPlantformAttributeCode("0001");
        plantformDirectoryAttributeValue11.setPlantformAttributeContent("波浪纹");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue12 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue12.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d52e");
        plantformDirectoryAttributeValue12.setPlantformAttributeCode("0002");
        plantformDirectoryAttributeValue12.setPlantformAttributeContent("大理石纹");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue13 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue13.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d52e");
        plantformDirectoryAttributeValue13.setPlantformAttributeCode("0003");
        plantformDirectoryAttributeValue13.setPlantformAttributeContent("鳄鱼纹");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue14 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue14.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d52e");
        plantformDirectoryAttributeValue14.setPlantformAttributeCode("0004");
        plantformDirectoryAttributeValue14.setPlantformAttributeContent("牛纹");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue15 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue15.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d52e");
        plantformDirectoryAttributeValue15.setPlantformAttributeCode("0005");
        plantformDirectoryAttributeValue15.setPlantformAttributeContent("荔枝纹");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue16 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue16.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d52f");
        plantformDirectoryAttributeValue16.setPlantformAttributeCode("0001");
        plantformDirectoryAttributeValue16.setPlantformAttributeContent("超纤");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue17 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue17.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d52f");
        plantformDirectoryAttributeValue17.setPlantformAttributeCode("0002");
        plantformDirectoryAttributeValue17.setPlantformAttributeContent("仿超纤");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue18 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue18.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d52f");
        plantformDirectoryAttributeValue18.setPlantformAttributeCode("0003");
        plantformDirectoryAttributeValue18.setPlantformAttributeContent("反绒皮");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue19 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue19.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d52f");
        plantformDirectoryAttributeValue19.setPlantformAttributeCode("0004");
        plantformDirectoryAttributeValue19.setPlantformAttributeContent("牛津布");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue20 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue20.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d52f");
        plantformDirectoryAttributeValue20.setPlantformAttributeCode("0005");
        plantformDirectoryAttributeValue20.setPlantformAttributeContent("无纺布");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue21 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue21.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d530");
        plantformDirectoryAttributeValue21.setPlantformAttributeCode("0001");
        plantformDirectoryAttributeValue21.setPlantformAttributeContent("0.2mm");


        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue22 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue22.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d530");
        plantformDirectoryAttributeValue22.setPlantformAttributeCode("0002");
        plantformDirectoryAttributeValue22.setPlantformAttributeContent("0.3mm");


        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue23 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue23.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d530");
        plantformDirectoryAttributeValue23.setPlantformAttributeCode("0003");
        plantformDirectoryAttributeValue23.setPlantformAttributeContent("0.4mm");


        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue24 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue24.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d530");
        plantformDirectoryAttributeValue24.setPlantformAttributeCode("0004");
        plantformDirectoryAttributeValue24.setPlantformAttributeContent("0.5mm");


        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue25 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue25.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d530");
        plantformDirectoryAttributeValue25.setPlantformAttributeCode("0005");
        plantformDirectoryAttributeValue25.setPlantformAttributeContent("0.6mm");


        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue26 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue26.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d531");
        plantformDirectoryAttributeValue26.setPlantformAttributeCode("0001");
        plantformDirectoryAttributeValue26.setPlantformAttributeContent("冲孔");


        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue27 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue27.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d531");
        plantformDirectoryAttributeValue27.setPlantformAttributeCode("0002");
        plantformDirectoryAttributeValue27.setPlantformAttributeContent("防污");


        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue28 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue28.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d531");
        plantformDirectoryAttributeValue28.setPlantformAttributeCode("0003");
        plantformDirectoryAttributeValue28.setPlantformAttributeContent("双色");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue29 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue29.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d531");
        plantformDirectoryAttributeValue29.setPlantformAttributeCode("0004");
        plantformDirectoryAttributeValue29.setPlantformAttributeContent("水洗");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue30 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue30.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d531");
        plantformDirectoryAttributeValue30.setPlantformAttributeCode("0005");
        plantformDirectoryAttributeValue30.setPlantformAttributeContent("珠光");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue31 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue31.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d532");
        plantformDirectoryAttributeValue31.setPlantformAttributeCode("0001");
        plantformDirectoryAttributeValue31.setPlantformAttributeContent("白色");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue32 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue32.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d532");
        plantformDirectoryAttributeValue32.setPlantformAttributeCode("0002");
        plantformDirectoryAttributeValue32.setPlantformAttributeContent("黑色");


        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue33 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue33.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d532");
        plantformDirectoryAttributeValue33.setPlantformAttributeCode("0003");
        plantformDirectoryAttributeValue33.setPlantformAttributeContent("红色");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue34 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue34.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d532");
        plantformDirectoryAttributeValue34.setPlantformAttributeCode("0004");
        plantformDirectoryAttributeValue34.setPlantformAttributeContent("黄色");

        PlantformDirectoryAttributeValue plantformDirectoryAttributeValue35 = new PlantformDirectoryAttributeValue();
        plantformDirectoryAttributeValue35.setPlantformDirectoryAttributeId("cx5cdd42d8abac563e18d9d532");
        plantformDirectoryAttributeValue35.setPlantformAttributeCode("0005");
        plantformDirectoryAttributeValue35.setPlantformAttributeContent("绿色");


        MongoUtil.insert(plantformDirectoryAttributeValue1);
        MongoUtil.insert(plantformDirectoryAttributeValue2);
        MongoUtil.insert(plantformDirectoryAttributeValue3);
        MongoUtil.insert(plantformDirectoryAttributeValue4);
        MongoUtil.insert(plantformDirectoryAttributeValue5);
        MongoUtil.insert(plantformDirectoryAttributeValue6);
        MongoUtil.insert(plantformDirectoryAttributeValue7);
        MongoUtil.insert(plantformDirectoryAttributeValue8);
        MongoUtil.insert(plantformDirectoryAttributeValue9);
        MongoUtil.insert(plantformDirectoryAttributeValue10);
        MongoUtil.insert(plantformDirectoryAttributeValue11);
        MongoUtil.insert(plantformDirectoryAttributeValue12);
        MongoUtil.insert(plantformDirectoryAttributeValue13);
        MongoUtil.insert(plantformDirectoryAttributeValue14);
        MongoUtil.insert(plantformDirectoryAttributeValue15);
        MongoUtil.insert(plantformDirectoryAttributeValue16);
        MongoUtil.insert(plantformDirectoryAttributeValue17);
        MongoUtil.insert(plantformDirectoryAttributeValue18);
        MongoUtil.insert(plantformDirectoryAttributeValue19);
        MongoUtil.insert(plantformDirectoryAttributeValue20);
        MongoUtil.insert(plantformDirectoryAttributeValue21);
        MongoUtil.insert(plantformDirectoryAttributeValue22);
        MongoUtil.insert(plantformDirectoryAttributeValue23);
        MongoUtil.insert(plantformDirectoryAttributeValue24);
        MongoUtil.insert(plantformDirectoryAttributeValue25);
        MongoUtil.insert(plantformDirectoryAttributeValue26);
        MongoUtil.insert(plantformDirectoryAttributeValue27);
        MongoUtil.insert(plantformDirectoryAttributeValue28);
        MongoUtil.insert(plantformDirectoryAttributeValue29);
        MongoUtil.insert(plantformDirectoryAttributeValue30);
        MongoUtil.insert(plantformDirectoryAttributeValue31);
        MongoUtil.insert(plantformDirectoryAttributeValue32);
        MongoUtil.insert(plantformDirectoryAttributeValue33);
        MongoUtil.insert(plantformDirectoryAttributeValue34);
        MongoUtil.insert(plantformDirectoryAttributeValue35);



    }

    /**
     * 系统产品属性表增加数据
     */
    @Test
    public void systemProductAttribuitInsert(){
        SystemProductAttribuit systemProductAttribuit1 = new SystemProductAttribuit();
        systemProductAttribuit1.setId("cx5cdd42d8abac563e18d9d533");
        systemProductAttribuit1.setSystemProductAttribuitCode("0001");
        systemProductAttribuit1.setSystemProductAttribuitType(2);
        systemProductAttribuit1.setSystemProductAttribuitName("光感");

        SystemProductAttribuit systemProductAttribuit2 = new SystemProductAttribuit();
        systemProductAttribuit2.setId("cx5cdd42d8abac563e18d9d534");
        systemProductAttribuit2.setSystemProductAttribuitCode("0002");
        systemProductAttribuit2.setSystemProductAttribuitType(2);
        systemProductAttribuit2.setSystemProductAttribuitName("软硬度");

        SystemProductAttribuit systemProductAttribuit3 = new SystemProductAttribuit();
        systemProductAttribuit3.setId("cx5cdd42d8abac563e18d9d535");
        systemProductAttribuit3.setSystemProductAttribuitCode("0003");
        systemProductAttribuit3.setSystemProductAttribuitType(1);
        systemProductAttribuit3.setSystemProductAttribuitName("类别");

        SystemProductAttribuit systemProductAttribuit4 = new SystemProductAttribuit();
        systemProductAttribuit4.setId("cx5cdd42d8abac563e18d9d536");
        systemProductAttribuit4.setSystemProductAttribuitCode("0004");
        systemProductAttribuit4.setSystemProductAttribuitType(1);
        systemProductAttribuit4.setSystemProductAttribuitName("特性");

        SystemProductAttribuit systemProductAttribuit5 = new SystemProductAttribuit();
        systemProductAttribuit5.setId("cx5cdd42d8abac563e18d9d537");
        systemProductAttribuit5.setSystemProductAttribuitCode("0005");
        systemProductAttribuit5.setSystemProductAttribuitType(2);
        systemProductAttribuit5.setSystemProductAttribuitName("底布颜色");

        SystemProductAttribuit systemProductAttribuit6 = new SystemProductAttribuit();
        systemProductAttribuit6.setId("cx5cdd42d8abac563e18d9d538");
        systemProductAttribuit6.setSystemProductAttribuitCode("0006");
        systemProductAttribuit6.setSystemProductAttribuitType(2);
        systemProductAttribuit6.setSystemProductAttribuitName("表面颜色");

        MongoUtil.insert(systemProductAttribuit1);
        MongoUtil.insert(systemProductAttribuit2);
        MongoUtil.insert(systemProductAttribuit3);
        MongoUtil.insert(systemProductAttribuit4);
        MongoUtil.insert(systemProductAttribuit5);
        MongoUtil.insert(systemProductAttribuit6);




    }

    /**
     * 系统产品属性值表增加数据
     */

    @Test
    public void systemProductAttribuitValueInsert(){
        SystemProductAttribuitValue systemProductAttribuitValue1 = new SystemProductAttribuitValue();
        systemProductAttribuitValue1.setId("cx5cdd42d8abac563e18d9d539");
        systemProductAttribuitValue1.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d535");
        systemProductAttribuitValue1.setSystemProductAttribuitValueCode("0001");
        systemProductAttribuitValue1.setSystemProductAttribuitContent("不定岛纤维");

        SystemProductAttribuitValue systemProductAttribuitValue2 = new SystemProductAttribuitValue();
        systemProductAttribuitValue2.setId("cx5cdd42d8abac563e18d9d53a");
        systemProductAttribuitValue2.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d535");
        systemProductAttribuitValue2.setSystemProductAttribuitValueCode("0002");
        systemProductAttribuitValue2.setSystemProductAttribuitContent("涤纶纤维");

        SystemProductAttribuitValue systemProductAttribuitValue3 = new SystemProductAttribuitValue();
        systemProductAttribuitValue3.setId("cx5cdd42d8abac563e18d9d53b");
        systemProductAttribuitValue3.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d535");
        systemProductAttribuitValue3.setSystemProductAttribuitValueCode("0003");
        systemProductAttribuitValue3.setSystemProductAttribuitContent("彩色基布");

        SystemProductAttribuitValue systemProductAttribuitValue4 = new SystemProductAttribuitValue();
        systemProductAttribuitValue4.setId("cx5cdd42d8abac563e18d9d53c");
        systemProductAttribuitValue4.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d535");
        systemProductAttribuitValue4.setSystemProductAttribuitValueCode("0004");
        systemProductAttribuitValue4.setSystemProductAttribuitContent("非染色后处理基布");

        SystemProductAttribuitValue systemProductAttribuitValue5 = new SystemProductAttribuitValue();
        systemProductAttribuitValue5.setId("cx5cdd42d8abac563e18d9d53d");
        systemProductAttribuitValue5.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d535");
        systemProductAttribuitValue5.setSystemProductAttribuitValueCode("0005");
        systemProductAttribuitValue5.setSystemProductAttribuitContent("原生基布");

        SystemProductAttribuitValue systemProductAttribuitValue6 = new SystemProductAttribuitValue();
        systemProductAttribuitValue6.setId("cx5cdd42d8abac563e18d9d53e");
        systemProductAttribuitValue6.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d535");
        systemProductAttribuitValue6.setSystemProductAttribuitValueCode("0006");
        systemProductAttribuitValue6.setSystemProductAttribuitContent("不定岛贴面革");

        SystemProductAttribuitValue systemProductAttribuitValue7 = new SystemProductAttribuitValue();
        systemProductAttribuitValue7.setId("cx5cdd42d8abac563e18d9d53f");
        systemProductAttribuitValue7.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d535");
        systemProductAttribuitValue7.setSystemProductAttribuitValueCode("0007");
        systemProductAttribuitValue7.setSystemProductAttribuitContent("彩色基布和绒面革");

        SystemProductAttribuitValue systemProductAttribuitValue8 = new SystemProductAttribuitValue();
        systemProductAttribuitValue8.setId("cx5cdd42d8abac563e18d9d540");
        systemProductAttribuitValue8.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d536");
        systemProductAttribuitValue8.setSystemProductAttribuitValueCode("0001");
        systemProductAttribuitValue8.setSystemProductAttribuitContent("双面磨光上油");

        SystemProductAttribuitValue systemProductAttribuitValue9 = new SystemProductAttribuitValue();
        systemProductAttribuitValue9.setId("cx5cdd42d8abac563e18d9d541");
        systemProductAttribuitValue9.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d536");
        systemProductAttribuitValue9.setSystemProductAttribuitValueCode("0002");
        systemProductAttribuitValue9.setSystemProductAttribuitContent("一面磨光一面拉毛");

        SystemProductAttribuitValue systemProductAttribuitValue10 = new SystemProductAttribuitValue();
        systemProductAttribuitValue10.setId("cx5cdd42d8abac563e18d9d542");
        systemProductAttribuitValue10.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d536");
        systemProductAttribuitValue10.setSystemProductAttribuitValueCode("0003");
        systemProductAttribuitValue10.setSystemProductAttribuitContent("单磨双面印刷商标");

        SystemProductAttribuitValue systemProductAttribuitValue11 = new SystemProductAttribuitValue();
        systemProductAttribuitValue11.setId("cx5cdd42d8abac563e18d9d543");
        systemProductAttribuitValue11.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d536");
        systemProductAttribuitValue11.setSystemProductAttribuitValueCode("0004");
        systemProductAttribuitValue11.setSystemProductAttribuitContent("双磨防虹吸揉纹");

        SystemProductAttribuitValue systemProductAttribuitValue12 = new SystemProductAttribuitValue();
        systemProductAttribuitValue12.setId("cx5cdd42d8abac563e18d9d544");
        systemProductAttribuitValue12.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d536");
        systemProductAttribuitValue12.setSystemProductAttribuitValueCode("0005");
        systemProductAttribuitValue12.setSystemProductAttribuitContent("单磨防虹吸不揉纹");

        SystemProductAttribuitValue systemProductAttribuitValue13 = new SystemProductAttribuitValue();
        systemProductAttribuitValue13.setId("cx5cdd42d8abac563e18d9d545");
        systemProductAttribuitValue13.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d536");
        systemProductAttribuitValue13.setSystemProductAttribuitValueCode("0006");
        systemProductAttribuitValue13.setSystemProductAttribuitContent("不磨防虹吸");

        SystemProductAttribuitValue systemProductAttribuitValue14 = new SystemProductAttribuitValue();
        systemProductAttribuitValue14.setId("cx5cdd42d8abac563e18d9d546");
        systemProductAttribuitValue14.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d536");
        systemProductAttribuitValue14.setSystemProductAttribuitValueCode("0007");
        systemProductAttribuitValue14.setSystemProductAttribuitContent("一面磨光一面短绒");

        SystemProductAttribuitValue systemProductAttribuitValue15 = new SystemProductAttribuitValue();
        systemProductAttribuitValue15.setId("cx5cdd42d8abac563e18d9d547");
        systemProductAttribuitValue15.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d537");
        systemProductAttribuitValue15.setSystemProductAttribuitValueCode("0001");
        systemProductAttribuitValue15.setSystemProductAttribuitContent("白色");

        SystemProductAttribuitValue systemProductAttribuitValue16 = new SystemProductAttribuitValue();
        systemProductAttribuitValue16.setId("cx5cdd42d8abac563e18d9d548");
        systemProductAttribuitValue16.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d5367");
        systemProductAttribuitValue16.setSystemProductAttribuitValueCode("0002");
        systemProductAttribuitValue16.setSystemProductAttribuitContent("黑色");

        SystemProductAttribuitValue systemProductAttribuitValue17 = new SystemProductAttribuitValue();
        systemProductAttribuitValue17.setId("cx5cdd42d8abac563e18d9d549");
        systemProductAttribuitValue17.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d537");
        systemProductAttribuitValue17.setSystemProductAttribuitValueCode("0003");
        systemProductAttribuitValue17.setSystemProductAttribuitContent("红色");

        SystemProductAttribuitValue systemProductAttribuitValue18 = new SystemProductAttribuitValue();
        systemProductAttribuitValue18.setId("cx5cdd42d8abac563e18d9d54a");
        systemProductAttribuitValue18.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d537");
        systemProductAttribuitValue18.setSystemProductAttribuitValueCode("0004");
        systemProductAttribuitValue18.setSystemProductAttribuitContent("黄色");

        SystemProductAttribuitValue systemProductAttribuitValue19 = new SystemProductAttribuitValue();
        systemProductAttribuitValue19.setId("cx5cdd42d8abac563e18d9d54b");
        systemProductAttribuitValue19.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d537");
        systemProductAttribuitValue19.setSystemProductAttribuitValueCode("0005");
        systemProductAttribuitValue19.setSystemProductAttribuitContent("绿色");

        SystemProductAttribuitValue systemProductAttribuitValue20 = new SystemProductAttribuitValue();
        systemProductAttribuitValue20.setId("cx5cdd42d8abac563e18d9d54c");
        systemProductAttribuitValue20.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d538");
        systemProductAttribuitValue20.setSystemProductAttribuitValueCode("0001");
        systemProductAttribuitValue20.setSystemProductAttribuitContent("白色");

        SystemProductAttribuitValue systemProductAttribuitValue21 = new SystemProductAttribuitValue();
        systemProductAttribuitValue21.setId("cx5cdd42d8abac563e18d9d54d");
        systemProductAttribuitValue21.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d538");
        systemProductAttribuitValue21.setSystemProductAttribuitValueCode("0002");
        systemProductAttribuitValue21.setSystemProductAttribuitContent("黑色");

        SystemProductAttribuitValue systemProductAttribuitValue22 = new SystemProductAttribuitValue();
        systemProductAttribuitValue22.setId("cx5cdd42d8abac563e18d9d54e");
        systemProductAttribuitValue22.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d538");
        systemProductAttribuitValue22.setSystemProductAttribuitValueCode("0003");
        systemProductAttribuitValue22.setSystemProductAttribuitContent("红色");

        SystemProductAttribuitValue systemProductAttribuitValue23 = new SystemProductAttribuitValue();
        systemProductAttribuitValue23.setId("cx5cdd42d8abac563e18d9d54f");
        systemProductAttribuitValue23.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d538");
        systemProductAttribuitValue23.setSystemProductAttribuitValueCode("0004");
        systemProductAttribuitValue23.setSystemProductAttribuitContent("黄色");

        SystemProductAttribuitValue systemProductAttribuitValue24 = new SystemProductAttribuitValue();
        systemProductAttribuitValue24.setId("cx5cdd42d8abac563e18d9d550");
        systemProductAttribuitValue24.setSystemProductAttribuitId("cx5cdd42d8abac563e18d9d538");
        systemProductAttribuitValue24.setSystemProductAttribuitValueCode("0005");
        systemProductAttribuitValue24.setSystemProductAttribuitContent("绿色");


        MongoUtil.insert(systemProductAttribuitValue1);
        MongoUtil.insert(systemProductAttribuitValue2);
        MongoUtil.insert(systemProductAttribuitValue3);
        MongoUtil.insert(systemProductAttribuitValue4);
        MongoUtil.insert(systemProductAttribuitValue5);
        MongoUtil.insert(systemProductAttribuitValue6);
        MongoUtil.insert(systemProductAttribuitValue7);
        MongoUtil.insert(systemProductAttribuitValue8);
        MongoUtil.insert(systemProductAttribuitValue9);
        MongoUtil.insert(systemProductAttribuitValue10);
        MongoUtil.insert(systemProductAttribuitValue11);
        MongoUtil.insert(systemProductAttribuitValue12);
        MongoUtil.insert(systemProductAttribuitValue13);
        MongoUtil.insert(systemProductAttribuitValue14);
        MongoUtil.insert(systemProductAttribuitValue15);
        MongoUtil.insert(systemProductAttribuitValue16);
        MongoUtil.insert(systemProductAttribuitValue17);
        MongoUtil.insert(systemProductAttribuitValue18);
        MongoUtil.insert(systemProductAttribuitValue19);
        MongoUtil.insert(systemProductAttribuitValue20);
        MongoUtil.insert(systemProductAttribuitValue21);
        MongoUtil.insert(systemProductAttribuitValue22);
        MongoUtil.insert(systemProductAttribuitValue23);
        MongoUtil.insert(systemProductAttribuitValue24);






    }

    /**
     * 品牌信息增加数据
     */
    @Test
    public void SystemBrandInfoInsert(){
        SystemBrandInfo systemBrandInfo1 = new SystemBrandInfo();
        systemBrandInfo1.setId("cx5cdd42d8abac563e18d9d551");
        systemBrandInfo1.setSystemBrandCode("0001");
        systemBrandInfo1.setSystemBrandName("华峰");

        SystemBrandInfo systemBrandInfo2 = new SystemBrandInfo();
        systemBrandInfo2.setId("cx5cdd42d8abac563e18d9d552");
        systemBrandInfo2.setSystemBrandCode("0002");
        systemBrandInfo2.setSystemBrandName("同大");

        SystemBrandInfo systemBrandInfo3 = new SystemBrandInfo();
        systemBrandInfo3.setId("cx5cdd42d8abac563e18d9d553");
        systemBrandInfo3.setSystemBrandCode("0003");
        systemBrandInfo3.setSystemBrandName("华阳");

        SystemBrandInfo systemBrandInfo4 = new SystemBrandInfo();
        systemBrandInfo4.setId("cx5cdd42d8abac563e18d9d554");
        systemBrandInfo4.setSystemBrandCode("0004");
        systemBrandInfo4.setSystemBrandName("上汽");

        SystemBrandInfo systemBrandInfo5 = new SystemBrandInfo();
        systemBrandInfo5.setId("cx5cdd42d8abac563e18d9d555");
        systemBrandInfo5.setSystemBrandCode("0005");
        systemBrandInfo5.setSystemBrandName("华谊");

        SystemBrandInfo systemBrandInfo6 = new SystemBrandInfo();
        systemBrandInfo6.setId("cx5cdd42d8abac563e18d9d556");
        systemBrandInfo6.setSystemBrandCode("0006");
        systemBrandInfo6.setSystemBrandName("波司登");

        MongoUtil.insert(systemBrandInfo1);
        MongoUtil.insert(systemBrandInfo2);
        MongoUtil.insert(systemBrandInfo3);
        MongoUtil.insert(systemBrandInfo4);
        MongoUtil.insert(systemBrandInfo5);
        MongoUtil.insert(systemBrandInfo6);

    }


    /**
     * 客户信息表增加数据
     */
    @Test
    public  void customerInfoInsert(){
        CustomerInfo customerInfo1 = new CustomerInfo();
        customerInfo1.setId("cx5cdd42d8abac563e18d9d561");
        customerInfo1.setCustomerCode("C10000001");
        customerInfo1.setUnifiedSocialCreditCode("91350500784545083G");
        customerInfo1.setCustomerName("福建华昌集团有限公司");
        customerInfo1.setCustomerShortName("华昌");
        customerInfo1.setCustomerFax("");
        customerInfo1.setCustomerEmail("jane.chen@huachanggroup.net");
        customerInfo1.setCustomerContact("张金聪");
        customerInfo1.setCustomerContactPhone("13506938888");
        customerInfo1.setCustomerTelephone("0595-85130988");
        customerInfo1.setCountryCode("中国");
        customerInfo1.setProvinceCode("福建省");
        customerInfo1.setCityCode("泉州市");
        customerInfo1.setDistrictCode("晋江市");
        customerInfo1.setCustomerAddress("晋江市陈埭镇湖中工业区");
        customerInfo1.setCurrencyId("CNY");

        CustomerInfo customerInfo2 = new CustomerInfo();
        customerInfo2.setId("cx5cdd42d8abac563e18d9d562");
        customerInfo2.setCustomerCode("C10000002");
        customerInfo2.setUnifiedSocialCreditCode("91440300567056486J");
        customerInfo2.setCustomerName("深圳市杰翔纺织品有限公司");
        customerInfo2.setCustomerShortName("杰翔");
        customerInfo2.setCustomerFax("");
        customerInfo2.setCustomerEmail("15814071672@126.com");
        customerInfo2.setCustomerContact("黄鹏");
        customerInfo2.setCustomerContactPhone("13510191186");
        customerInfo2.setCustomerTelephone("0755-84822078");
        customerInfo2.setCountryCode("中国");
        customerInfo2.setProvinceCode("广东省");
        customerInfo2.setCityCode("深圳市");
        customerInfo2.setDistrictCode("龙岗区");
        customerInfo2.setCustomerAddress("深圳市龙岗区龙岗街道新生社区深圳集银皮革综合广场C栋219号");
        customerInfo2.setCurrencyId("CNY");

        CustomerInfo customerInfo3 = new CustomerInfo();
        customerInfo3.setId("cx5cdd42d8abac563e18d9d563");
        customerInfo3.setCustomerCode("C10000003");
        customerInfo3.setUnifiedSocialCreditCode("310115759869289");
        customerInfo3.setCustomerName("上海汇恩国际贸易有限公司");
        customerInfo3.setCustomerShortName("上海汇恩（鼎厚）");
        customerInfo3.setCustomerFax("021-62649874");
        customerInfo3.setCustomerEmail("13901771961@163.com");
        customerInfo3.setCustomerContact("李蔚宇");
        customerInfo3.setCustomerContactPhone("13901771961");
        customerInfo3.setCustomerTelephone("021-68065285");
        customerInfo3.setCountryCode("中国");
        customerInfo3.setProvinceCode("上海市");
        customerInfo3.setCityCode("上海市");
        customerInfo3.setDistrictCode("浦东新区");
        customerInfo3.setCustomerAddress("上海市浦东新区莲振路298号4号楼H220室");
        customerInfo3.setCurrencyId("CNY");

        CustomerInfo customerInfo4 = new CustomerInfo();
        customerInfo4.setId("cx5cdd42d8abac563e18d9d564");
        customerInfo4.setCustomerCode("C10000004");
        customerInfo4.setUnifiedSocialCreditCode("91441900090172577W");
        customerInfo4.setCustomerName("东莞市飞炫皮革有限公司");
        customerInfo4.setCustomerShortName("飞炫（韩凤兴）");
        customerInfo4.setCustomerFax("");
        customerInfo4.setCustomerEmail("790983569@qq.com");
        customerInfo4.setCustomerContact("韩凤兴");
        customerInfo4.setCustomerContactPhone("13802453530");
        customerInfo4.setCustomerTelephone("0769-85908325");
        customerInfo4.setCountryCode("中国");
        customerInfo4.setProvinceCode("广东省");
        customerInfo4.setCityCode("东莞市");
        customerInfo4.setDistrictCode("厚街镇");
        customerInfo4.setCustomerAddress("东莞市厚街镇河田村河田大道南峰国际皮革鞋材交易中心B803号");
        customerInfo4.setCurrencyId("CNY");

        CustomerInfo customerInfo5 = new CustomerInfo();
        customerInfo5.setId("cx5cdd42d8abac563e18d9d565");
        customerInfo5.setCustomerCode("C10000005");
        customerInfo5.setUnifiedSocialCreditCode("9141132461466619X8");
        customerInfo5.setCustomerName("南阳山川皮革制品有限公司");
        customerInfo5.setCustomerShortName("南阳山川");
        customerInfo5.setCustomerFax("0377-65976377");
        customerInfo5.setCustomerEmail("qunxian1028@163.com");
        customerInfo5.setCustomerContact("宋群先");
        customerInfo5.setCustomerContactPhone("13598266798");
        customerInfo5.setCustomerTelephone("0595-0377-65976377");
        customerInfo5.setCountryCode("中国");
        customerInfo5.setProvinceCode("河南省");
        customerInfo5.setCityCode("南阳市");
        customerInfo5.setDistrictCode("镇平县");
        customerInfo5.setCustomerAddress("镇平县工业园区航天北路21号");
        customerInfo5.setCurrencyId("CNY");

        CustomerInfo customerInfo6 = new CustomerInfo();
        customerInfo6.setId("cx5cdd42d8abac563e18d9d566");
        customerInfo6.setCustomerCode("C10000006");
        customerInfo6.setUnifiedSocialCreditCode("91440300552118189U");
        customerInfo6.setCustomerName("深圳市韵圣达皮革有限公司");
        customerInfo6.setCustomerShortName("韵圣达");
        customerInfo6.setCustomerFax("");
        customerInfo6.setCustomerEmail("1430253423@qq.com");
        customerInfo6.setCustomerContact("宁新兵");
        customerInfo6.setCustomerContactPhone("13802580866");
        customerInfo6.setCustomerTelephone("0755-89633263");
        customerInfo6.setCountryCode("中国");
        customerInfo6.setProvinceCode("广东省");
        customerInfo6.setCityCode("深圳市");
        customerInfo6.setDistrictCode("龙岗区");
        customerInfo6.setCustomerAddress("深圳市平湖华南城皮革区L13栋115-117号");
        customerInfo6.setCurrencyId("CNY");

        MongoUtil.insert(customerInfo1);
        MongoUtil.insert(customerInfo2);
        MongoUtil.insert(customerInfo3);
        MongoUtil.insert(customerInfo4);
        MongoUtil.insert(customerInfo5);
        MongoUtil.insert(customerInfo6);

    }


    /**
     * 供应商信息表增加数据
     */
    @Test
    public void supplierInfoInsert(){
        SupplierInfo supplierInfo1 = new SupplierInfo();
        supplierInfo1.setId("cx5cdd42d8abac563e18d9d567");
        supplierInfo1.setSupplierCode("V10000001");
        supplierInfo1.setUnifiedSocialCreditCode("92321012MA1PXBE94F");
        supplierInfo1.setSupplierName("江都区健浩体育用品厂");
        supplierInfo1.setSupplierShortName("健浩");
        supplierInfo1.setSupplierFax("0514-86412631");
        supplierInfo1.setSupplierEmail("18961001927@163.com");
        supplierInfo1.setSupplierContact("徐建");
        supplierInfo1.setSupplierContactPhone("18961001927");
        supplierInfo1.setSupplierTelephone("0514-86412631");
        supplierInfo1.setCountryCode("中国");
        supplierInfo1.setProvinceCode("江苏省");
        supplierInfo1.setCityCode("扬州市");
        supplierInfo1.setDistrictCode("江都区");
        supplierInfo1.setSupplierAddress("江苏省扬州市江都区浦头镇高汉村友爱组10号");
        supplierInfo1.setCurrencyId("CNY");

        SupplierInfo supplierInfo2 = new SupplierInfo();
        supplierInfo2.setId("cx5cdd42d8abac563e18d9d568");
        supplierInfo2.setSupplierCode("V10000002");
        supplierInfo2.setUnifiedSocialCreditCode("91210100760065739F");
        supplierInfo2.setSupplierName("沈阳东镇体育用品有限公司");
        supplierInfo2.setSupplierShortName("东镇体育");
        supplierInfo2.setSupplierFax("024-89531211");
        supplierInfo2.setSupplierEmail("18640490440@163.com");
        supplierInfo2.setSupplierContact("闫营营");
        supplierInfo2.setSupplierContactPhone("18640490440");
        supplierInfo2.setSupplierTelephone("024-89531211");
        supplierInfo2.setCountryCode("中国");
        supplierInfo2.setProvinceCode("辽宁省");
        supplierInfo2.setCityCode("沈阳市");
        supplierInfo2.setDistrictCode("苏家屯区");
        supplierInfo2.setSupplierAddress("沈阳市苏家屯区十里河镇十里河村财吉街76号");
        supplierInfo2.setCurrencyId("CNY");

        SupplierInfo supplierInfo3 = new SupplierInfo();
        supplierInfo3.setId("cx5cdd42d8abac563e18d9d569");
        supplierInfo3.setSupplierCode("V10000003");
        supplierInfo3.setUnifiedSocialCreditCode("91310000551583433Q");
        supplierInfo3.setSupplierName("上海森伊斯特贸易有限公司");
        supplierInfo3.setSupplierShortName("森伊斯特");
        supplierInfo3.setSupplierFax("021-62361724");
        supplierInfo3.setSupplierEmail("shanghaidkc@163.com");
        supplierInfo3.setSupplierContact("安世云");
        supplierInfo3.setSupplierContactPhone("13917999713");
        supplierInfo3.setSupplierTelephone("021-62361723");
        supplierInfo3.setCountryCode("中国");
        supplierInfo3.setProvinceCode("上海市");
        supplierInfo3.setCityCode("上海市");
        supplierInfo3.setDistrictCode("闵行区");
        supplierInfo3.setSupplierAddress("上海市吴中路1369号欧银中心611室");
        supplierInfo3.setCurrencyId("CNY");

        SupplierInfo supplierInfo4 = new SupplierInfo();
        supplierInfo4.setId("cx5cdd42d8abac563e18d9d56a");
        supplierInfo4.setSupplierCode("V10000004");
        supplierInfo4.setUnifiedSocialCreditCode("91320582773210288C");
        supplierInfo4.setSupplierName("张家港嘉泰超纤科技有限公司");
        supplierInfo4.setSupplierShortName("嘉泰");
        supplierInfo4.setSupplierFax("0512-56902911");
        supplierInfo4.setSupplierEmail("478464092@qq.com");
        supplierInfo4.setSupplierContact("何再秋");
        supplierInfo4.setSupplierContactPhone("13773252333");
        supplierInfo4.setSupplierTelephone("0512-56902988");
        supplierInfo4.setCountryCode("中国");
        supplierInfo4.setProvinceCode("江苏省");
        supplierInfo4.setCityCode("苏州市");
        supplierInfo4.setDistrictCode("张家港市");
        supplierInfo4.setSupplierAddress("张家港市凤凰镇汉江路");
        supplierInfo4.setCurrencyId("CNY");

        SupplierInfo supplierInfo5 = new SupplierInfo();
        supplierInfo5.setId("cx5cdd42d8abac563e18d9d56b");
        supplierInfo5.setSupplierCode("V10000005");
        supplierInfo5.setUnifiedSocialCreditCode("91320412570315506T");
        supplierInfo5.setSupplierName("常州美美合成皮革有限公司");
        supplierInfo5.setSupplierShortName("美美");
        supplierInfo5.setSupplierFax("0519-86571768");
        supplierInfo5.setSupplierEmail("13511677111@163.com");
        supplierInfo5.setSupplierContact("梁新炽");
        supplierInfo5.setSupplierContactPhone("13511677111");
        supplierInfo5.setSupplierTelephone("0519-86571768");
        supplierInfo5.setCountryCode("中国");
        supplierInfo5.setProvinceCode("江苏省");
        supplierInfo5.setCityCode("常州市");
        supplierInfo5.setDistrictCode("武进区");
        supplierInfo5.setSupplierAddress("常州武进区湖塘镇长虹路88号");
        supplierInfo5.setCurrencyId("CNY");

        SupplierInfo supplierInfo6 = new SupplierInfo();
        supplierInfo6.setId("cx5cdd42d8abac563e18d9d56c");
        supplierInfo6.setSupplierCode("V10000006");
        supplierInfo6.setUnifiedSocialCreditCode("913206233022378986");
        supplierInfo6.setSupplierName("南通纽赛尔安全防护用品有限公司");
        supplierInfo6.setSupplierShortName("南通纽赛尔");
        supplierInfo6.setSupplierFax("00513-84651908");
        supplierInfo6.setSupplierEmail("15000772123@163.com");
        supplierInfo6.setSupplierContact("刘元海");
        supplierInfo6.setSupplierContactPhone("15000772123");
        supplierInfo6.setSupplierTelephone("0513-84651908");
        supplierInfo6.setCountryCode("中国");
        supplierInfo6.setProvinceCode("江苏省");
        supplierInfo6.setCityCode("南通市");
        supplierInfo6.setDistrictCode("如东县");
        supplierInfo6.setSupplierAddress("如东县双甸镇曙光村46组");
        supplierInfo6.setCurrencyId("CNY");

        MongoUtil.insert(supplierInfo1);
        MongoUtil.insert(supplierInfo2);
        MongoUtil.insert(supplierInfo3);
        MongoUtil.insert(supplierInfo4);
        MongoUtil.insert(supplierInfo5);
        MongoUtil.insert(supplierInfo6);




    }

    /**
     * 销售产品组价格信息表增加数据
     */
    @Test
    public void priceSaleProductGroupInsert(){
        PriceSaleProductGroup priceSaleProductGroup1 = new PriceSaleProductGroup();
        priceSaleProductGroup1.setPriceSaleProductGroupCode("10000001");
        priceSaleProductGroup1.setProductGroupInfoId("cx5cdd42d8abac563e18d9d557");
        priceSaleProductGroup1.setTaxRateId("J6");
        priceSaleProductGroup1.setTaxIncludedPrice(new BigDecimal("6"));
        priceSaleProductGroup1.setCurrencyId("CNY");
        priceSaleProductGroup1.setEach(100);
        priceSaleProductGroup1.setBasicUnitId("米");

        PriceSaleProductGroup priceSaleProductGroup2 = new PriceSaleProductGroup();
        priceSaleProductGroup2.setPriceSaleProductGroupCode("10000002");
        priceSaleProductGroup2.setProductGroupInfoId("cx5cdd42d8abac563e18d9d558");
        priceSaleProductGroup2.setTaxRateId("J6");
        priceSaleProductGroup2.setTaxIncludedPrice(new BigDecimal("7"));
        priceSaleProductGroup2.setCurrencyId("CNY");
        priceSaleProductGroup2.setEach(100);
        priceSaleProductGroup2.setBasicUnitId("米");

        PriceSaleProductGroup priceSaleProductGroup3 = new PriceSaleProductGroup();
        priceSaleProductGroup3.setPriceSaleProductGroupCode("10000003");
        priceSaleProductGroup3.setProductGroupInfoId("cx5cdd42d8abac563e18d9d559");
        priceSaleProductGroup3.setTaxRateId("J6");
        priceSaleProductGroup3.setTaxIncludedPrice(new BigDecimal("8"));
        priceSaleProductGroup3.setCurrencyId("CNY");
        priceSaleProductGroup3.setEach(100);
        priceSaleProductGroup3.setBasicUnitId("米");

        PriceSaleProductGroup priceSaleProductGroup4 = new PriceSaleProductGroup();
        priceSaleProductGroup4.setPriceSaleProductGroupCode("10000004");
        priceSaleProductGroup4.setProductGroupInfoId("cx5cdd42d8abac563e18d9d560");
        priceSaleProductGroup4.setTaxRateId("J6");
        priceSaleProductGroup4.setTaxIncludedPrice(new BigDecimal("9"));
        priceSaleProductGroup4.setCurrencyId("CNY");
        priceSaleProductGroup4.setEach(100);
        priceSaleProductGroup4.setBasicUnitId("米");

        PriceSaleProductGroup priceSaleProductGroup5 = new PriceSaleProductGroup();
        priceSaleProductGroup5.setPriceSaleProductGroupCode("10000005");
        priceSaleProductGroup5.setProductGroupInfoId("cx5cdd42d8abac563e18d9d561");
        priceSaleProductGroup5.setTaxRateId("J6");
        priceSaleProductGroup5.setTaxIncludedPrice(new BigDecimal("10"));
        priceSaleProductGroup5.setCurrencyId("CNY");
        priceSaleProductGroup5.setEach(100);
        priceSaleProductGroup5.setBasicUnitId("米");

        PriceSaleProductGroup priceSaleProductGroup6 = new PriceSaleProductGroup();
        priceSaleProductGroup6.setPriceSaleProductGroupCode("10000006");
        priceSaleProductGroup6.setProductGroupInfoId("cx5cdd42d8abac563e18d9d562");
        priceSaleProductGroup6.setTaxRateId("J6");
        priceSaleProductGroup6.setTaxIncludedPrice(new BigDecimal("11"));
        priceSaleProductGroup6.setCurrencyId("CNY");
        priceSaleProductGroup6.setEach(100);
        priceSaleProductGroup6.setBasicUnitId("米");

        MongoUtil.insert(priceSaleProductGroup1);
        MongoUtil.insert(priceSaleProductGroup2);
        MongoUtil.insert(priceSaleProductGroup3);
        MongoUtil.insert(priceSaleProductGroup4);
        MongoUtil.insert(priceSaleProductGroup5);
        MongoUtil.insert(priceSaleProductGroup6);




    }

    /**
     * 销售产品价格信息表增加数据
     */
    @Test
    public void priceSaleProductInsert(){
        PriceSaleProduct priceSaleProduct1 = new PriceSaleProduct();
        priceSaleProduct1.setPriceSaleProductCode("10000001");
        priceSaleProduct1.setProductInfoId("cx5cdd42d8abac563e18d9d55d");
        priceSaleProduct1.setTaxRateId("J6");
        priceSaleProduct1.setTaxIncludedPrice(new BigDecimal("6"));
        priceSaleProduct1.setCurrencyId("CNY");
        priceSaleProduct1.setEach(100);
        priceSaleProduct1.setBasicUnitId("米");

        PriceSaleProduct priceSaleProduct2 = new PriceSaleProduct();
        priceSaleProduct2.setPriceSaleProductCode("10000002");
        priceSaleProduct2.setProductInfoId("cx5cdd42d8abac563e18d9d55e");
        priceSaleProduct2.setTaxRateId("J6");
        priceSaleProduct2.setTaxIncludedPrice(new BigDecimal("7"));
        priceSaleProduct2.setCurrencyId("CNY");
        priceSaleProduct2.setEach(100);
        priceSaleProduct2.setBasicUnitId("米");

        PriceSaleProduct priceSaleProduct3 = new PriceSaleProduct();
        priceSaleProduct3.setPriceSaleProductCode("10000003");
        priceSaleProduct3.setProductInfoId("cx5cdd42d8abac563e18d9d55f");
        priceSaleProduct3.setTaxRateId("J6");
        priceSaleProduct3.setTaxIncludedPrice(new BigDecimal("8"));
        priceSaleProduct3.setCurrencyId("CNY");
        priceSaleProduct3.setEach(100);
        priceSaleProduct3.setBasicUnitId("米");

        PriceSaleProduct priceSaleProduct4 = new PriceSaleProduct();
        priceSaleProduct4.setPriceSaleProductCode("10000004");
        priceSaleProduct4.setProductInfoId("cx5cdd42d8abac563e18d9d560");
        priceSaleProduct4.setTaxRateId("J6");
        priceSaleProduct4.setTaxIncludedPrice(new BigDecimal("9"));
        priceSaleProduct4.setCurrencyId("CNY");
        priceSaleProduct4.setEach(100);
        priceSaleProduct4.setBasicUnitId("米");

        PriceSaleProduct priceSaleProduct5 = new PriceSaleProduct();
        priceSaleProduct5.setPriceSaleProductCode("10000005");
        priceSaleProduct5.setProductInfoId("cx5cdd42d8abac563e18d9d561");
        priceSaleProduct5.setTaxRateId("J6");
        priceSaleProduct5.setTaxIncludedPrice(new BigDecimal("10"));
        priceSaleProduct5.setCurrencyId("CNY");
        priceSaleProduct5.setEach(100);
        priceSaleProduct5.setBasicUnitId("米");

        PriceSaleProduct priceSaleProduct6 = new PriceSaleProduct();
        priceSaleProduct6.setPriceSaleProductCode("10000006");
        priceSaleProduct6.setProductInfoId("cx5cdd42d8abac563e18d9d562");
        priceSaleProduct6.setTaxRateId("J6");
        priceSaleProduct6.setTaxIncludedPrice(new BigDecimal("11"));
        priceSaleProduct6.setCurrencyId("CNY");
        priceSaleProduct6.setEach(100);
        priceSaleProduct6.setBasicUnitId("米");

        MongoUtil.insert(priceSaleProduct1);
        MongoUtil.insert(priceSaleProduct2);
        MongoUtil.insert(priceSaleProduct3);
        MongoUtil.insert(priceSaleProduct4);
        MongoUtil.insert(priceSaleProduct5);
        MongoUtil.insert(priceSaleProduct6);




    }


    /**
     * 销售客户产品组价格信息表增加数据
     */
    @Test
    public void priceSaleCustomerProductGroupInsert(){
        PriceSaleCustomerProductGroup priceSaleCustomerProductGroup1 = new PriceSaleCustomerProductGroup();
        priceSaleCustomerProductGroup1.setPriceSaleCustomerProductGroupCode("10000001");
        priceSaleCustomerProductGroup1.setCustomerInfoId("cx5cdd42d8abac563e18d9d561");
        priceSaleCustomerProductGroup1.setProductGroupInfoId("cx5cdd42d8abac563e18d9d557");
        priceSaleCustomerProductGroup1.setTaxRateId("J6");
        priceSaleCustomerProductGroup1.setTaxIncludedPrice(new BigDecimal("5.5"));
        priceSaleCustomerProductGroup1.setCurrencyId("CNY");
        priceSaleCustomerProductGroup1.setEach(100);
        priceSaleCustomerProductGroup1.setBasicUnitId("米");

        PriceSaleCustomerProductGroup priceSaleCustomerProductGroup2 = new PriceSaleCustomerProductGroup();
        priceSaleCustomerProductGroup2.setPriceSaleCustomerProductGroupCode("10000002");
        priceSaleCustomerProductGroup2.setCustomerInfoId("cx5cdd42d8abac563e18d9d561");
        priceSaleCustomerProductGroup2.setProductGroupInfoId("cx5cdd42d8abac563e18d9d558");
        priceSaleCustomerProductGroup2.setTaxRateId("J6");
        priceSaleCustomerProductGroup2.setTaxIncludedPrice(new BigDecimal("6.5"));
        priceSaleCustomerProductGroup2.setCurrencyId("CNY");
        priceSaleCustomerProductGroup2.setEach(100);
        priceSaleCustomerProductGroup2.setBasicUnitId("米");

        PriceSaleCustomerProductGroup priceSaleCustomerProductGroup3 = new PriceSaleCustomerProductGroup();
        priceSaleCustomerProductGroup3.setPriceSaleCustomerProductGroupCode("10000003");
        priceSaleCustomerProductGroup3.setCustomerInfoId("cx5cdd42d8abac563e18d9d561");
        priceSaleCustomerProductGroup3.setProductGroupInfoId("cx5cdd42d8abac563e18d9d559");
        priceSaleCustomerProductGroup3.setTaxRateId("J6");
        priceSaleCustomerProductGroup3.setTaxIncludedPrice(new BigDecimal("7.5"));
        priceSaleCustomerProductGroup3.setCurrencyId("CNY");
        priceSaleCustomerProductGroup3.setEach(100);
        priceSaleCustomerProductGroup3.setBasicUnitId("米");

        PriceSaleCustomerProductGroup priceSaleCustomerProductGroup4 = new PriceSaleCustomerProductGroup();
        priceSaleCustomerProductGroup4.setPriceSaleCustomerProductGroupCode("10000004");
        priceSaleCustomerProductGroup4.setCustomerInfoId("cx5cdd42d8abac563e18d9d562");
        priceSaleCustomerProductGroup4.setProductGroupInfoId("cx5cdd42d8abac563e18d9d557");
        priceSaleCustomerProductGroup4.setTaxRateId("J6");
        priceSaleCustomerProductGroup4.setTaxIncludedPrice(new BigDecimal("5.8"));
        priceSaleCustomerProductGroup4.setCurrencyId("CNY");
        priceSaleCustomerProductGroup4.setEach(100);
        priceSaleCustomerProductGroup4.setBasicUnitId("米");

        PriceSaleCustomerProductGroup priceSaleCustomerProductGroup5 = new PriceSaleCustomerProductGroup();
        priceSaleCustomerProductGroup5.setPriceSaleCustomerProductGroupCode("10000005");
        priceSaleCustomerProductGroup5.setCustomerInfoId("cx5cdd42d8abac563e18d9d562");
        priceSaleCustomerProductGroup5.setProductGroupInfoId("cx5cdd42d8abac563e18d9d558");
        priceSaleCustomerProductGroup5.setTaxRateId("J6");
        priceSaleCustomerProductGroup5.setTaxIncludedPrice(new BigDecimal("6.8"));
        priceSaleCustomerProductGroup5.setCurrencyId("CNY");
        priceSaleCustomerProductGroup5.setEach(100);
        priceSaleCustomerProductGroup5.setBasicUnitId("米");

        PriceSaleCustomerProductGroup priceSaleCustomerProductGroup6 = new PriceSaleCustomerProductGroup();
        priceSaleCustomerProductGroup6.setPriceSaleCustomerProductGroupCode("10000006");
        priceSaleCustomerProductGroup6.setCustomerInfoId("cx5cdd42d8abac563e18d9d562");
        priceSaleCustomerProductGroup6.setProductGroupInfoId("cx5cdd42d8abac563e18d9d559");
        priceSaleCustomerProductGroup6.setTaxRateId("J6");
        priceSaleCustomerProductGroup6.setTaxIncludedPrice(new BigDecimal("7.8"));
        priceSaleCustomerProductGroup6.setCurrencyId("CNY");
        priceSaleCustomerProductGroup6.setEach(100);
        priceSaleCustomerProductGroup6.setBasicUnitId("米");

        MongoUtil.insert(priceSaleCustomerProductGroup1);
        MongoUtil.insert(priceSaleCustomerProductGroup2);
        MongoUtil.insert(priceSaleCustomerProductGroup3);
        MongoUtil.insert(priceSaleCustomerProductGroup4);
        MongoUtil.insert(priceSaleCustomerProductGroup5);
        MongoUtil.insert(priceSaleCustomerProductGroup6);




    }

    /**
     * 销售客户产品价格信息表增加数据
     */
    @Test
    public void priceSaleCustomerProductInsert(){
        PriceSaleCustomerProduct priceSaleCustomerProduct1 = new PriceSaleCustomerProduct();
        priceSaleCustomerProduct1.setPriceSaleCustomerProductCode("10000001");
        priceSaleCustomerProduct1.setCustomerInfoId("cx5cdd42d8abac563e18d9d561");
        priceSaleCustomerProduct1.setProductInfoId("cx5cdd42d8abac563e18d9d55d");
        priceSaleCustomerProduct1.setTaxRateId("J6");
        priceSaleCustomerProduct1.setTaxIncludedPrice(new BigDecimal("5.5"));
        priceSaleCustomerProduct1.setCurrencyId("CNY");
        priceSaleCustomerProduct1.setEach(100);
        priceSaleCustomerProduct1.setBasicUnitId("米");

        PriceSaleCustomerProduct priceSaleCustomerProduct2 = new PriceSaleCustomerProduct();
        priceSaleCustomerProduct2.setPriceSaleCustomerProductCode("10000002");
        priceSaleCustomerProduct2.setCustomerInfoId("cx5cdd42d8abac563e18d9d561");
        priceSaleCustomerProduct2.setProductInfoId("cx5cdd42d8abac563e18d9d55e");
        priceSaleCustomerProduct2.setTaxRateId("J6");
        priceSaleCustomerProduct2.setTaxIncludedPrice(new BigDecimal("6.5"));
        priceSaleCustomerProduct2.setCurrencyId("CNY");
        priceSaleCustomerProduct2.setEach(100);
        priceSaleCustomerProduct2.setBasicUnitId("米");

        PriceSaleCustomerProduct priceSaleCustomerProduct3 = new PriceSaleCustomerProduct();
        priceSaleCustomerProduct3.setPriceSaleCustomerProductCode("10000003");
        priceSaleCustomerProduct3.setCustomerInfoId("cx5cdd42d8abac563e18d9d561");
        priceSaleCustomerProduct3.setProductInfoId("cx5cdd42d8abac563e18d9d55f");
        priceSaleCustomerProduct3.setTaxRateId("J6");
        priceSaleCustomerProduct3.setTaxIncludedPrice(new BigDecimal("7.5"));
        priceSaleCustomerProduct3.setCurrencyId("CNY");
        priceSaleCustomerProduct3.setEach(100);
        priceSaleCustomerProduct3.setBasicUnitId("米");

        PriceSaleCustomerProduct priceSaleCustomerProduct4 = new PriceSaleCustomerProduct();
        priceSaleCustomerProduct4.setPriceSaleCustomerProductCode("10000004");
        priceSaleCustomerProduct4.setCustomerInfoId("cx5cdd42d8abac563e18d9d562");
        priceSaleCustomerProduct4.setProductInfoId("cx5cdd42d8abac563e18d9d55d");
        priceSaleCustomerProduct4.setTaxRateId("J6");
        priceSaleCustomerProduct4.setTaxIncludedPrice(new BigDecimal("5.8"));
        priceSaleCustomerProduct4.setCurrencyId("CNY");
        priceSaleCustomerProduct4.setEach(100);
        priceSaleCustomerProduct4.setBasicUnitId("米");

        PriceSaleCustomerProduct priceSaleCustomerProduct5 = new PriceSaleCustomerProduct();
        priceSaleCustomerProduct5.setPriceSaleCustomerProductCode("10000005");
        priceSaleCustomerProduct5.setCustomerInfoId("cx5cdd42d8abac563e18d9d562");
        priceSaleCustomerProduct5.setProductInfoId("cx5cdd42d8abac563e18d9d55e");
        priceSaleCustomerProduct5.setTaxRateId("J6");
        priceSaleCustomerProduct5.setTaxIncludedPrice(new BigDecimal("6.8"));
        priceSaleCustomerProduct5.setCurrencyId("CNY");
        priceSaleCustomerProduct5.setEach(100);
        priceSaleCustomerProduct5.setBasicUnitId("米");

        PriceSaleCustomerProduct priceSaleCustomerProduct6 = new PriceSaleCustomerProduct();
        priceSaleCustomerProduct6.setPriceSaleCustomerProductCode("10000006");
        priceSaleCustomerProduct6.setCustomerInfoId("cx5cdd42d8abac563e18d9d562");
        priceSaleCustomerProduct6.setProductInfoId("cx5cdd42d8abac563e18d9d55f");
        priceSaleCustomerProduct6.setTaxRateId("J6");
        priceSaleCustomerProduct6.setTaxIncludedPrice(new BigDecimal("7.8"));
        priceSaleCustomerProduct6.setCurrencyId("CNY");
        priceSaleCustomerProduct6.setEach(100);
        priceSaleCustomerProduct6.setBasicUnitId("米");

        MongoUtil.insert(priceSaleCustomerProduct1);
        MongoUtil.insert(priceSaleCustomerProduct2);
        MongoUtil.insert(priceSaleCustomerProduct3);
        MongoUtil.insert(priceSaleCustomerProduct4);
        MongoUtil.insert(priceSaleCustomerProduct5);
        MongoUtil.insert(priceSaleCustomerProduct6);




    }

    /**
     * 销售订单表增加数据
     */
    @Test
    public void saleOrderInfoInsert(){
        SaleOrderInfo saleOrderInfo1 = new SaleOrderInfo();
        saleOrderInfo1.setId("cx5cdd42d8abac563e18d9d573");
        saleOrderInfo1.setOrderOriginId("cx5cda27c58dde33369401c25f");
        saleOrderInfo1.setOrderTypeId("标准订单");
        saleOrderInfo1.setSaleOrderCode("SO10000001");
        saleOrderInfo1.setCustomerInfoId("cx5cdd42d8abac563e18d9d561");
        saleOrderInfo1.setPayentMethodId("汇票");
        saleOrderInfo1.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        saleOrderInfo1.setCurrencyId("CNY");
        saleOrderInfo1.setTotalAmount(new BigDecimal("48000"));
        saleOrderInfo1.setSaleOrderDate(new Date("2019/5/1"));
        saleOrderInfo1.setSaleOrderStatus("已确认");

        SaleOrderInfo saleOrderInfo2 = new SaleOrderInfo();
        saleOrderInfo2.setId("cx5cdd42d8abac563e18d9d574");
        saleOrderInfo1.setOrderOriginId("cx5cda27c58dde33369401c25f");
        saleOrderInfo2.setOrderTypeId("标准订单");
        saleOrderInfo2.setSaleOrderCode("SO10000002");
        saleOrderInfo2.setCustomerInfoId("cx5cdd42d8abac563e18d9d562");
        saleOrderInfo2.setPayentMethodId("汇票");
        saleOrderInfo2.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        saleOrderInfo2.setCurrencyId("CNY");
        saleOrderInfo2.setTotalAmount(new BigDecimal("48000"));
        saleOrderInfo1.setSaleOrderDate(new Date("2019/5/2"));
        saleOrderInfo2.setSaleOrderStatus("已确认");

        SaleOrderInfo saleOrderInfo3 = new SaleOrderInfo();
        saleOrderInfo3.setId("cx5cdd42d8abac563e18d9d575");
        saleOrderInfo1.setOrderOriginId("cx5cda27c58dde33369401c25f");
        saleOrderInfo3.setOrderTypeId("标准订单");
        saleOrderInfo3.setSaleOrderCode("SO10000003");
        saleOrderInfo3.setCustomerInfoId("cx5cdd42d8abac563e18d9d563");
        saleOrderInfo3.setPayentMethodId("汇票");
        saleOrderInfo3.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        saleOrderInfo3.setCurrencyId("CNY");
        saleOrderInfo3.setTotalAmount(new BigDecimal("48000"));
        saleOrderInfo1.setSaleOrderDate(new Date("2019/4/30"));
        saleOrderInfo3.setSaleOrderStatus("已确认");

        SaleOrderInfo saleOrderInfo4 = new SaleOrderInfo();
        saleOrderInfo4.setId("cx5cdd42d8abac563e18d9d576");
        saleOrderInfo1.setOrderOriginId("cx5cda28288dde333d30c68306");
        saleOrderInfo4.setOrderTypeId("标准订单");
        saleOrderInfo4.setSaleOrderCode("SO10000004");
        saleOrderInfo4.setCustomerInfoId("cx5cdd42d8abac563e18d9d564");
        saleOrderInfo4.setPayentMethodId("汇票");
        saleOrderInfo4.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        saleOrderInfo4.setCurrencyId("CNY");
        saleOrderInfo4.setTotalAmount(new BigDecimal("48000"));
        saleOrderInfo1.setSaleOrderDate(new Date("2019/5/1"));
        saleOrderInfo4.setSaleOrderStatus("已完成");

        SaleOrderInfo saleOrderInfo5 = new SaleOrderInfo();
        saleOrderInfo5.setId("cx5cdd42d8abac563e18d9d577");
        saleOrderInfo1.setOrderOriginId("cx5cda28288dde333d30c68306");
        saleOrderInfo5.setOrderTypeId("标准订单");
        saleOrderInfo5.setSaleOrderCode("SO10000005");
        saleOrderInfo5.setCustomerInfoId("cx5cdd42d8abac563e18d9d565");
        saleOrderInfo5.setPayentMethodId("现金");
        saleOrderInfo5.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        saleOrderInfo5.setCurrencyId("CNY");
        saleOrderInfo5.setTotalAmount(new BigDecimal("48000"));
        saleOrderInfo1.setSaleOrderDate(new Date("2019/5/1"));
        saleOrderInfo5.setSaleOrderStatus("已完成");

        SaleOrderInfo saleOrderInfo6 = new SaleOrderInfo();
        saleOrderInfo6.setId("cx5cdd42d8abac563e18d9d578");
        saleOrderInfo1.setOrderOriginId("cx5cda28288dde333d30c68306");
        saleOrderInfo6.setOrderTypeId("标准订单");
        saleOrderInfo6.setSaleOrderCode("SO10000006");
        saleOrderInfo6.setCustomerInfoId("cx5cdd42d8abac563e18d9d566");
        saleOrderInfo6.setPayentMethodId("现金");
        saleOrderInfo6.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        saleOrderInfo6.setCurrencyId("CNY");
        saleOrderInfo6.setTotalAmount(new BigDecimal("48000"));
        saleOrderInfo1.setSaleOrderDate(new Date("2019/5/1"));
        saleOrderInfo6.setSaleOrderStatus("已删除");

        MongoUtil.insert(saleOrderInfo1);
        MongoUtil.insert(saleOrderInfo2);
        MongoUtil.insert(saleOrderInfo3);
        MongoUtil.insert(saleOrderInfo4);
        MongoUtil.insert(saleOrderInfo5);
        MongoUtil.insert(saleOrderInfo6);
    }

    /**
     * @author: 汪明月
     * date: 2019-5-22 13:12
     * @since: JDK 1.8
     *
     * @description: 销售订单详情表增加数据
     * @param: []
     * @return: void
     */

    @Test
    public void saleOrderDetailInfoInsert(){
        SaleOrderDetailInfo saleOrderDetailInfo1 = new SaleOrderDetailInfo();
        saleOrderDetailInfo1.setId("cx5cdd42d8abac563e18d9d58b");
        saleOrderDetailInfo1.setSaleOrderInfoId("cx5cdd42d8abac563e18d9d573");
        saleOrderDetailInfo1.setSaleOrderRowCode("0001");
        saleOrderDetailInfo1.setProductInfoId("cx5cdd42d8abac563e18d9d55d");
        saleOrderDetailInfo1.setTaxRateId("J6");
        saleOrderDetailInfo1.setUnitPrice(new BigDecimal("5.5"));
        saleOrderDetailInfo1.setSaleOrderQuantity(100000.0);
        saleOrderDetailInfo1.setBasicUnitId("米");
        saleOrderDetailInfo1.setDeliveryDate(new Date("2019/5/10"));
        saleOrderDetailInfo1.setFactoryInfoId("cx5cdd42d8abac563e18d9d5b");
        saleOrderDetailInfo1.setInventoryLocationInfoId("cx5cdd42d8abac563e18d9d515");

        SaleOrderDetailInfo saleOrderDetailInfo2 = new SaleOrderDetailInfo();
        saleOrderDetailInfo2.setId("cx5cdd42d8abac563e18d9d58c");
        saleOrderDetailInfo2.setSaleOrderInfoId("cx5cdd42d8abac563e18d9d573");
        saleOrderDetailInfo2.setSaleOrderRowCode("0002");
        saleOrderDetailInfo1.setProductInfoId("cx5cdd42d8abac563e18d9d55e");
        saleOrderDetailInfo2.setTaxRateId("J6");
        saleOrderDetailInfo2.setUnitPrice(new BigDecimal("6.5"));
        saleOrderDetailInfo2.setSaleOrderQuantity(100000.0);
        saleOrderDetailInfo2.setBasicUnitId("米");
        saleOrderDetailInfo2.setDeliveryDate(new Date("2019/5/10"));
        saleOrderDetailInfo2.setFactoryInfoId("cx5cdd42d8abac563e18d9d5c");
        saleOrderDetailInfo2.setInventoryLocationInfoId("cx5cdd42d8abac563e18d9d515");

        SaleOrderDetailInfo saleOrderDetailInfo3 = new SaleOrderDetailInfo();
        saleOrderDetailInfo3.setId("cx5cdd42d8abac563e18d9d58d");
        saleOrderDetailInfo3.setSaleOrderInfoId("cx5cdd42d8abac563e18d9d573");
        saleOrderDetailInfo3.setSaleOrderRowCode("0003");
        saleOrderDetailInfo1.setProductInfoId("cx5cdd42d8abac563e18d9d55f");
        saleOrderDetailInfo3.setTaxRateId("J6");
        saleOrderDetailInfo3.setUnitPrice(new BigDecimal("7.5"));
        saleOrderDetailInfo3.setSaleOrderQuantity(100000.0);
        saleOrderDetailInfo3.setBasicUnitId("米");
        saleOrderDetailInfo3.setDeliveryDate(new Date("2019/5/10"));
        saleOrderDetailInfo3.setFactoryInfoId("cx5cdd42d8abac563e18d9d5c");
        saleOrderDetailInfo3.setInventoryLocationInfoId("cx5cdd42d8abac563e18d9d515");

        SaleOrderDetailInfo saleOrderDetailInfo4 = new SaleOrderDetailInfo();
        saleOrderDetailInfo4.setId("cx5cdd42d8abac563e18d9d58e");
        saleOrderDetailInfo4.setSaleOrderInfoId("cx5cdd42d8abac563e18d9d573");
        saleOrderDetailInfo4.setSaleOrderRowCode("0004");
        saleOrderDetailInfo1.setProductInfoId("cx5cdd42d8abac563e18d9d560");
        saleOrderDetailInfo4.setTaxRateId("J6");
        saleOrderDetailInfo4.setUnitPrice(new BigDecimal("8.5"));
        saleOrderDetailInfo4.setSaleOrderQuantity(100000.0);
        saleOrderDetailInfo4.setBasicUnitId("米");
        saleOrderDetailInfo4.setDeliveryDate(new Date("2019/5/10"));
        saleOrderDetailInfo4.setFactoryInfoId("cx5cdd42d8abac563e18d9d5b");
        saleOrderDetailInfo4.setInventoryLocationInfoId("cx5cdd42d8abac563e18d9d515");

        SaleOrderDetailInfo saleOrderDetailInfo5 = new SaleOrderDetailInfo();
        saleOrderDetailInfo5.setId("cx5cdd42d8abac563e18d9d58f");
        saleOrderDetailInfo5.setSaleOrderInfoId("cx5cdd42d8abac563e18d9d573");
        saleOrderDetailInfo5.setSaleOrderRowCode("0005");
        saleOrderDetailInfo1.setProductInfoId("cx5cdd42d8abac563e18d9d561");
        saleOrderDetailInfo5.setTaxRateId("J6");
        saleOrderDetailInfo5.setUnitPrice(new BigDecimal("9.5"));
        saleOrderDetailInfo5.setSaleOrderQuantity(100000.0);
        saleOrderDetailInfo5.setBasicUnitId("米");
        saleOrderDetailInfo5.setDeliveryDate(new Date("2019/5/10"));
        saleOrderDetailInfo5.setFactoryInfoId("cx5cdd42d8abac563e18d9d5b");
        saleOrderDetailInfo5.setInventoryLocationInfoId("cx5cdd42d8abac563e18d9d515");

        SaleOrderDetailInfo saleOrderDetailInfo6 = new SaleOrderDetailInfo();
        saleOrderDetailInfo6.setId("cx5cdd42d8abac563e18d9d590");
        saleOrderDetailInfo6.setSaleOrderInfoId("cx5cdd42d8abac563e18d9d573");
        saleOrderDetailInfo6.setSaleOrderRowCode("0006");
        saleOrderDetailInfo1.setProductInfoId("cx5cdd42d8abac563e18d9d562");
        saleOrderDetailInfo6.setTaxRateId("J6");
        saleOrderDetailInfo6.setUnitPrice(new BigDecimal("10.5"));
        saleOrderDetailInfo6.setSaleOrderQuantity(100000.0);
        saleOrderDetailInfo6.setBasicUnitId("米");
        saleOrderDetailInfo6.setDeliveryDate(new Date("2019/5/10"));
        saleOrderDetailInfo6.setFactoryInfoId("cx5cdd42d8abac563e18d9d5b");
        saleOrderDetailInfo6.setInventoryLocationInfoId("cx5cdd42d8abac563e18d9d515");

        MongoUtil.insert(saleOrderDetailInfo1);
        MongoUtil.insert(saleOrderDetailInfo2);
        MongoUtil.insert(saleOrderDetailInfo3);
        MongoUtil.insert(saleOrderDetailInfo4);
        MongoUtil.insert(saleOrderDetailInfo5);
        MongoUtil.insert(saleOrderDetailInfo6);
    }




    /**
     * 生产入库列表新增数据
     */
    @Test
    public void productionReceiptInsert(){
        ProductionReceipt productionReceipt1 = new ProductionReceipt();
        productionReceipt1.setProductionReceiptCode("CW10000001");
        productionReceipt1.setDocumentType("生产入库");
        productionReceipt1.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        productionReceipt1.setProductionOrderId("cx5cdd42d8abac563e18d9d57f");
        productionReceipt1.setFactoryInfoId("cx5cdd42d8abac563e18d9d5b");
        productionReceipt1.setProductInfoId("cx5cdd42d8abac563e18d9d55d");
        productionReceipt1.setWarehouseNumber(new BigDecimal("5000"));
        productionReceipt1.setUnstockedNumber(new BigDecimal("0"));
        productionReceipt1.setReceivingFactoryId("cx5cdd42d8abac563e18d9d5b");
        productionReceipt1.setInventoryLocationId("cx5cdd42d8abac563e18d9d515");
        productionReceipt1.setOrderCreateTime(new Date("2019/5/5"));
        productionReceipt1.setReceiptStatus(1);

        ProductionReceipt productionReceipt2 = new ProductionReceipt();
        productionReceipt2.setProductionReceiptCode("CW10000002");
        productionReceipt2.setDocumentType("生产入库");
        productionReceipt2.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        productionReceipt2.setProductionOrderId("cx5cdd42d8abac563e18d9d580");
        productionReceipt2.setFactoryInfoId("cx5cdd42d8abac563e18d9d5b");
        productionReceipt2.setProductInfoId("cx5cdd42d8abac563e18d9d55e");
        productionReceipt2.setWarehouseNumber(new BigDecimal("4000"));
        productionReceipt2.setUnstockedNumber(new BigDecimal("1000"));
        productionReceipt2.setReceivingFactoryId("cx5cdd42d8abac563e18d9d5b");
        productionReceipt2.setInventoryLocationId("cx5cdd42d8abac563e18d9d515");
        productionReceipt2.setOrderCreateTime(new Date("2019/5/5"));
        productionReceipt2.setReceiptStatus(1);

        ProductionReceipt productionReceipt3 = new ProductionReceipt();
        productionReceipt3.setProductionReceiptCode("CW10000003");
        productionReceipt3.setDocumentType("生产入库");
        productionReceipt3.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        productionReceipt3.setProductionOrderId("cx5cdd42d8abac563e18d9d581");
        productionReceipt3.setFactoryInfoId("cx5cdd42d8abac563e18d9d5b");
        productionReceipt3.setProductInfoId("cx5cdd42d8abac563e18d9d55f");
        productionReceipt3.setWarehouseNumber(new BigDecimal("5000"));
        productionReceipt3.setUnstockedNumber(new BigDecimal("0"));
        productionReceipt3.setReceivingFactoryId("cx5cdd42d8abac563e18d9d5b");
        productionReceipt3.setInventoryLocationId("cx5cdd42d8abac563e18d9d515");
        productionReceipt3.setOrderCreateTime(new Date("2019/5/5"));
        productionReceipt3.setReceiptStatus(1);

        ProductionReceipt productionReceipt4 = new ProductionReceipt();
        productionReceipt4.setProductionReceiptCode("CW10000004");
        productionReceipt4.setDocumentType("生产入库");
        productionReceipt4.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        productionReceipt4.setProductionOrderId("cx5cdd42d8abac563e18d9d582");
        productionReceipt4.setFactoryInfoId("cx5cdd42d8abac563e18d9d5c");
        productionReceipt4.setProductInfoId("cx5cdd42d8abac563e18d9d55d");
        productionReceipt4.setWarehouseNumber(new BigDecimal("2000"));
        productionReceipt4.setUnstockedNumber(new BigDecimal("3000"));
        productionReceipt4.setReceivingFactoryId("cx5cdd42d8abac563e18d9d5c");
        productionReceipt4.setInventoryLocationId("cx5cdd42d8abac563e18d9d515");
        productionReceipt4.setOrderCreateTime(new Date("2019/5/10"));
        productionReceipt4.setReceiptStatus(1);

        ProductionReceipt productionReceipt5 = new ProductionReceipt();
        productionReceipt5.setProductionReceiptCode("CW10000005");
        productionReceipt5.setDocumentType("生产入库");
        productionReceipt5.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        productionReceipt5.setProductionOrderId("cx5cdd42d8abac563e18d9d583");
        productionReceipt5.setFactoryInfoId("cx5cdd42d8abac563e18d9d5c");
        productionReceipt5.setProductInfoId("cx5cdd42d8abac563e18d9d55e");
        productionReceipt5.setWarehouseNumber(new BigDecimal("2000"));
        productionReceipt5.setUnstockedNumber(new BigDecimal("0"));
        productionReceipt5.setReceivingFactoryId("cx5cdd42d8abac563e18d9d5c");
        productionReceipt5.setInventoryLocationId("cx5cdd42d8abac563e18d9d515");
        productionReceipt5.setOrderCreateTime(new Date("2019/5/10"));
        productionReceipt5.setReceiptStatus(1);

        ProductionReceipt productionReceipt6 = new ProductionReceipt();
        productionReceipt6.setProductionReceiptCode("CW10000006");
        productionReceipt6.setDocumentType("生产入库");
        productionReceipt6.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        productionReceipt6.setProductionOrderId("cx5cdd42d8abac563e18d9d584");
        productionReceipt6.setFactoryInfoId("cx5cdd42d8abac563e18d9d5c");
        productionReceipt6.setProductInfoId("cx5cdd42d8abac563e18d9d55f");
        productionReceipt6.setWarehouseNumber(new BigDecimal("5000"));
        productionReceipt6.setUnstockedNumber(new BigDecimal("0"));
        productionReceipt6.setReceivingFactoryId("cx5cdd42d8abac563e18d9d5c");
        productionReceipt6.setInventoryLocationId("cx5cdd42d8abac563e18d9d515");
        productionReceipt6.setOrderCreateTime(new Date("2019/5/10"));
        productionReceipt6.setReceiptStatus(2);


        MongoUtil.insert(productionReceipt1);
        MongoUtil.insert(productionReceipt2);
        MongoUtil.insert(productionReceipt3);
        MongoUtil.insert(productionReceipt4);
        MongoUtil.insert(productionReceipt5);
        MongoUtil.insert(productionReceipt6);
    }


    /**
     * 采购入库列表新增数据
     */
    @Test
    public void purchaseReceiptInsert(){
        PurchaseReceipt purchaseReceipt = new PurchaseReceipt();
        purchaseReceipt.setId("cx5cdd42d8abac563e18d9d591");
        purchaseReceipt.setPurchaseReceiptCode("PW10000001");
        purchaseReceipt.setDocumentType("采购入库");
        purchaseReceipt.setSupplierInfoId("cx5cdd42d8abac563e18d9d567");
        purchaseReceipt.setPurchaseOrderInfoId("cx5cdd42d8abac563e18d9d56d");
        purchaseReceipt.setOrderCreateTime(new Date("2019/5/10"));
        purchaseReceipt.setReceiptStatus(1);

        PurchaseReceipt purchaseReceipt2 = new PurchaseReceipt();
        purchaseReceipt2.setId("cx5cdd42d8abac563e18d9d592");
        purchaseReceipt2.setPurchaseReceiptCode("PW10000002");
        purchaseReceipt2.setDocumentType("采购入库");
        purchaseReceipt2.setSupplierInfoId("cx5cdd42d8abac563e18d9d568");
        purchaseReceipt2.setPurchaseOrderInfoId("cx5cdd42d8abac563e18d9d56e");
        purchaseReceipt2.setOrderCreateTime(new Date("2019/5/10"));
        purchaseReceipt2.setReceiptStatus(1);

        PurchaseReceipt purchaseReceipt3 = new PurchaseReceipt();
        purchaseReceipt3.setId("cx5cdd42d8abac563e18d9d593");
        purchaseReceipt3.setPurchaseReceiptCode("PW10000003");
        purchaseReceipt3.setDocumentType("采购入库");
        purchaseReceipt3.setSupplierInfoId("cx5cdd42d8abac563e18d9d569");
        purchaseReceipt3.setPurchaseOrderInfoId("cx5cdd42d8abac563e18d9d56f");
        purchaseReceipt3.setOrderCreateTime(new Date("2019/5/10"));
        purchaseReceipt3.setReceiptStatus(1);

        PurchaseReceipt purchaseReceipt4 = new PurchaseReceipt();
        purchaseReceipt4.setId("cx5cdd42d8abac563e18d9d594");
        purchaseReceipt4.setPurchaseReceiptCode("PW10000004");
        purchaseReceipt4.setDocumentType("采购入库");
        purchaseReceipt4.setSupplierInfoId("cx5cdd42d8abac563e18d9d56a");
        purchaseReceipt4.setPurchaseOrderInfoId("cx5cdd42d8abac563e18d9d570");
        purchaseReceipt4.setOrderCreateTime(new Date("2019/5/10"));
        purchaseReceipt4.setReceiptStatus(1);

        PurchaseReceipt purchaseReceipt5 = new PurchaseReceipt();
        purchaseReceipt5.setId("cx5cdd42d8abac563e18d9d595");
        purchaseReceipt5.setPurchaseReceiptCode("PW10000005");
        purchaseReceipt5.setDocumentType("采购入库");
        purchaseReceipt5.setSupplierInfoId("cx5cdd42d8abac563e18d9d56b");
        purchaseReceipt5.setPurchaseOrderInfoId("cx5cdd42d8abac563e18d9d571");
        purchaseReceipt5.setOrderCreateTime(new Date("2019/5/10"));
        purchaseReceipt5.setReceiptStatus(1);

        PurchaseReceipt purchaseReceipt6 = new PurchaseReceipt();
        purchaseReceipt6.setId("cx5cdd42d8abac563e18d9d596");
        purchaseReceipt6.setPurchaseReceiptCode("PW10000006");
        purchaseReceipt6.setDocumentType("采购入库");
        purchaseReceipt6.setSupplierInfoId("cx5cdd42d8abac563e18d9d56c");
        purchaseReceipt6.setPurchaseOrderInfoId("cx5cdd42d8abac563e18d9d572");
        purchaseReceipt6.setOrderCreateTime(new Date("2019/5/10"));
        purchaseReceipt6.setReceiptStatus(1);



        MongoUtil.insert(purchaseReceipt);
        MongoUtil.insert(purchaseReceipt2);
        MongoUtil.insert(purchaseReceipt3);
        MongoUtil.insert(purchaseReceipt4);
        MongoUtil.insert(purchaseReceipt5);
        MongoUtil.insert(purchaseReceipt6);
    }


    /**
     * 采购入库单行项目新增数据
     */
    @Test
    public void purchaseReceiptDetailInsert(){
        PurchaseReceiptDetail purchaseReceiptDetail = new PurchaseReceiptDetail();
        purchaseReceiptDetail.setPurchaseReceiptId("cx5cdd42d8abac563e18d9d591");
        purchaseReceiptDetail.setPurchaseOrderDetailInfoId("cx5cdd42d8abac563e18d9d597");
        purchaseReceiptDetail.setReceivingFactoryId("cx5cdd42d8abac563e18d9d5b");
        purchaseReceiptDetail.setInventoryLocationId("cx5cdd42d8abac563e18d9d515");
        purchaseReceiptDetail.setUnstockedNumber(new BigDecimal("5000"));
        purchaseReceiptDetail.setWarehouseNumber(new BigDecimal("5000"));

        PurchaseReceiptDetail purchaseReceiptDetail2 = new PurchaseReceiptDetail();
        purchaseReceiptDetail2.setPurchaseReceiptId("cx5cdd42d8abac563e18d9d591");
        purchaseReceiptDetail2.setPurchaseOrderDetailInfoId("cx5cdd42d8abac563e18d9d598");
        purchaseReceiptDetail2.setReceivingFactoryId("cx5cdd42d8abac563e18d9d5c");
        purchaseReceiptDetail2.setInventoryLocationId("cx5cdd42d8abac563e18d9d515");
        purchaseReceiptDetail2.setUnstockedNumber(new BigDecimal("5000"));
        purchaseReceiptDetail2.setWarehouseNumber(new BigDecimal("5000"));

        PurchaseReceiptDetail purchaseReceiptDetail3 = new PurchaseReceiptDetail();
        purchaseReceiptDetail3.setPurchaseReceiptId("cx5cdd42d8abac563e18d9d591");
        purchaseReceiptDetail3.setPurchaseOrderDetailInfoId("cx5cdd42d8abac563e18d9d599");
        purchaseReceiptDetail3.setReceivingFactoryId("cx5cdd42d8abac563e18d9d5c");
        purchaseReceiptDetail3.setInventoryLocationId("cx5cdd42d8abac563e18d9d515");
        purchaseReceiptDetail3.setUnstockedNumber(new BigDecimal("5000"));
        purchaseReceiptDetail3.setWarehouseNumber(new BigDecimal("5000"));

        PurchaseReceiptDetail purchaseReceiptDetail4 = new PurchaseReceiptDetail();
        purchaseReceiptDetail4.setPurchaseReceiptId("cx5cdd42d8abac563e18d9d591");
        purchaseReceiptDetail4.setPurchaseOrderDetailInfoId("cx5cdd42d8abac563e18d9d59a");
        purchaseReceiptDetail4.setReceivingFactoryId("cx5cdd42d8abac563e18d9d5b");
        purchaseReceiptDetail4.setInventoryLocationId("cx5cdd42d8abac563e18d9d515");
        purchaseReceiptDetail4.setUnstockedNumber(new BigDecimal("5000"));
        purchaseReceiptDetail4.setWarehouseNumber(new BigDecimal("5000"));

        PurchaseReceiptDetail purchaseReceiptDetail5 = new PurchaseReceiptDetail();
        purchaseReceiptDetail5.setPurchaseReceiptId("cx5cdd42d8abac563e18d9d591");
        purchaseReceiptDetail5.setPurchaseOrderDetailInfoId("cx5cdd42d8abac563e18d9d59b");
        purchaseReceiptDetail5.setReceivingFactoryId("cx5cdd42d8abac563e18d9d5b");
        purchaseReceiptDetail5.setInventoryLocationId("cx5cdd42d8abac563e18d9d515");
        purchaseReceiptDetail5.setUnstockedNumber(new BigDecimal("5000"));
        purchaseReceiptDetail5.setWarehouseNumber(new BigDecimal("5000"));

        PurchaseReceiptDetail purchaseReceiptDetail6 = new PurchaseReceiptDetail();
        purchaseReceiptDetail6.setPurchaseReceiptId("cx5cdd42d8abac563e18d9d591");
        purchaseReceiptDetail6.setPurchaseOrderDetailInfoId("cx5cdd42d8abac563e18d9d59c");
        purchaseReceiptDetail6.setReceivingFactoryId("cx5cdd42d8abac563e18d9d5b");
        purchaseReceiptDetail6.setInventoryLocationId("cx5cdd42d8abac563e18d9d515");
        purchaseReceiptDetail6.setUnstockedNumber(new BigDecimal("5000"));
        purchaseReceiptDetail6.setWarehouseNumber(new BigDecimal("5000"));


        MongoUtil.insert(purchaseReceiptDetail);
        MongoUtil.insert(purchaseReceiptDetail2);
        MongoUtil.insert(purchaseReceiptDetail3);
        MongoUtil.insert(purchaseReceiptDetail4);
        MongoUtil.insert(purchaseReceiptDetail5);
        MongoUtil.insert(purchaseReceiptDetail6);
    }


    /**
     * 销售出库新增数据
     */
    @Test
    public void salesOutboundInsert(){
        SalesOutbound salesOutbound = new SalesOutbound();
        salesOutbound.setId("cx5cdd42d8abac563e18d9d5a3");
        salesOutbound.setSalesOutbountCode("SS10000001");
        salesOutbound.setOutboundTypeId("销售出库");
        salesOutbound.setSalesDeliveryId("cx5cdd42d8abac563e18d9d59d");
        salesOutbound.setOutboundStatus(1);

        SalesOutbound salesOutbound2 = new SalesOutbound();
        salesOutbound2.setId("cx5cdd42d8abac563e18d9d5a4");
        salesOutbound2.setSalesOutbountCode("SS10000002");
        salesOutbound2.setOutboundTypeId("销售出库");
        salesOutbound2.setSalesDeliveryId("cx5cdd42d8abac563e18d9d59e");
        salesOutbound2.setOutboundStatus(1);

        SalesOutbound salesOutbound3 = new SalesOutbound();
        salesOutbound3.setId("cx5cdd42d8abac563e18d9d5a5");
        salesOutbound3.setSalesOutbountCode("SS10000003");
        salesOutbound3.setOutboundTypeId("销售出库");
        salesOutbound3.setSalesDeliveryId("cx5cdd42d8abac563e18d9d59f");
        salesOutbound3.setOutboundStatus(1);

        SalesOutbound salesOutbound4 = new SalesOutbound();
        salesOutbound4.setId("cx5cdd42d8abac563e18d9d5a6");
        salesOutbound4.setSalesOutbountCode("SS10000004");
        salesOutbound4.setOutboundTypeId("销售出库");
        salesOutbound4.setSalesDeliveryId("cx5cdd42d8abac563ecx5cdd42d8abac563e18d9d5a018d9d59d");
        salesOutbound4.setOutboundStatus(1);

        SalesOutbound salesOutbound5 = new SalesOutbound();
        salesOutbound5.setId("cx5cdd42d8abac563e18d9d5a7");
        salesOutbound5.setSalesOutbountCode("SS10000005");
        salesOutbound5.setOutboundTypeId("销售出库");
        salesOutbound5.setSalesDeliveryId("cx5cdd42d8abac563e18d9d5a1");
        salesOutbound5.setOutboundStatus(1);

        SalesOutbound salesOutbound6 = new SalesOutbound();
        salesOutbound6.setId("cx5cdd42d8abac563e18d9d5a8");
        salesOutbound6.setSalesOutbountCode("SS10000006");
        salesOutbound6.setOutboundTypeId("销售出库");
        salesOutbound6.setSalesDeliveryId("cx5cdd42d8abac563e18d9d5a2");
        salesOutbound6.setOutboundStatus(1);


        MongoUtil.insert(salesOutbound);
        MongoUtil.insert(salesOutbound2);
        MongoUtil.insert(salesOutbound3);
        MongoUtil.insert(salesOutbound4);
        MongoUtil.insert(salesOutbound5);
        MongoUtil.insert(salesOutbound6);
    }


    /**
     * @author: 汪明月
     * date: 2019-5-22 10:56
     * @since: JDK 1.8
     *
     * @description: 销售发货单新增数据
     * @param: []
     * @return: void
     */
    @Test
    public void salesDeliveryInsert(){
        SalesDelivery salesDelivery = new SalesDelivery();
        salesDelivery.setId("cx5cdd42d8abac563e18d9d59d");
        salesDelivery.setSalesDeliveryCode("SD10000001");
        salesDelivery.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        salesDelivery.setCustomerInfoId("cx5cdd42d8abac563e18d9d561");
        salesDelivery.setDocumentTime(new Date("2019/5/10"));

        SalesDelivery salesDelivery2 = new SalesDelivery();
        salesDelivery2.setId("cx5cdd42d8abac563e18d9d59e");
        salesDelivery2.setSalesDeliveryCode("SD10000002");
        salesDelivery2.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        salesDelivery2.setCustomerInfoId("cx5cdd42d8abac563e18d9d562");
        salesDelivery2.setDocumentTime(new Date("2019/5/10"));

        SalesDelivery salesDelivery3 = new SalesDelivery();
        salesDelivery3.setId("cx5cdd42d8abac563e18d9d59f");
        salesDelivery3.setSalesDeliveryCode("SD10000003");
        salesDelivery3.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        salesDelivery3.setCustomerInfoId("cx5cdd42d8abac563e18d9d563");
        salesDelivery3.setDocumentTime(new Date("2019/5/10"));

        SalesDelivery salesDelivery4 = new SalesDelivery();
        salesDelivery4.setId("cx5cdd42d8abac563e18d9d5a0");
        salesDelivery4.setSalesDeliveryCode("SD10000004");
        salesDelivery4.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        salesDelivery4.setCustomerInfoId("cx5cdd42d8abac563e18d9d564");
        salesDelivery4.setDocumentTime(new Date("2019/5/10"));

        SalesDelivery salesDelivery5 = new SalesDelivery();
        salesDelivery5.setId("cx5cdd42d8abac563e18d9d5a1");
        salesDelivery5.setSalesDeliveryCode("SD10000005");
        salesDelivery5.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        salesDelivery5.setCustomerInfoId("cx5cdd42d8abac563e18d9d565");
        salesDelivery5.setDocumentTime(new Date("2019/5/10"));

        SalesDelivery salesDelivery6 = new SalesDelivery();
        salesDelivery6.setId("cx5cdd42d8abac563e18d9d5a2");
        salesDelivery6.setSalesDeliveryCode("SD10000006");
        salesDelivery6.setCompanyInfoId("cx5cdd42d8abac563e18d9d4e8");
        salesDelivery6.setCustomerInfoId("cx5cdd42d8abac563e18d9d566");
        salesDelivery6.setDocumentTime(new Date("2019/5/10"));

        MongoUtil.insert(salesDelivery);
        MongoUtil.insert(salesDelivery2);
        MongoUtil.insert(salesDelivery3);
        MongoUtil.insert(salesDelivery4);
        MongoUtil.insert(salesDelivery5);
        MongoUtil.insert(salesDelivery6);
    }

    /**
     * @author: 汪明月
     * date: 2019-5-22 11:05
     * @since: JDK 1.8
     *
     * @description: 销售发货单行项目增加数据
     * @param: []
     * @return: void
     */
    @Test
    public void salesDeliveryDetailInsert(){
        SalesDeliveryDetail salesDeliveryDetail = new SalesDeliveryDetail();
        salesDeliveryDetail.setId("cx5cdd42d8abac563e18d9d58b");
        salesDeliveryDetail.setSalesDeliveryDetailCode("0001");
        salesDeliveryDetail.setSalesDeliverId("cx5cdd42d8abac563e18d9d59d");
        salesDeliveryDetail.setSaleOrderInfoId("cx5cdd42d8abac563e18d9d573");
        salesDeliveryDetail.setDeliveryNumber(new BigDecimal("100000"));
        salesDeliveryDetail.setDeliveryFactoryId("cx5cdd42d8abac563e18d9d5b");
        salesDeliveryDetail.setInventoryLocationId("cx5cdd42d8abac563e18d9d515");


        SalesDeliveryDetail salesDeliveryDetail2 = new SalesDeliveryDetail();
        salesDeliveryDetail2.setId("cx5cdd42d8abac563e18d9d5aa");
        salesDeliveryDetail2.setSalesDeliveryDetailCode("0002");
        salesDeliveryDetail2.setSalesDeliverId("cx5cdd42d8abac563e18d9d59d");
        salesDeliveryDetail2.setSaleOrderInfoId("cx5cdd42d8abac563e18d9d573");
        salesDeliveryDetail2.setDeliveryNumber(new BigDecimal("100000"));
        salesDeliveryDetail2.setDeliveryFactoryId("cx5cdd42d8abac563e18d9d5c");
        salesDeliveryDetail2.setInventoryLocationId("cx5cdd42d8abac563e18d9d515");

        SalesDeliveryDetail salesDeliveryDetail3 = new SalesDeliveryDetail();
        salesDeliveryDetail3.setId("cx5cdd42d8abac563e18d9d5ab");
        salesDeliveryDetail3.setSalesDeliveryDetailCode("0003");
        salesDeliveryDetail3.setSalesDeliverId("cx5cdd42d8abac563e18d9d59d");
        salesDeliveryDetail3.setSaleOrderInfoId("cx5cdd42d8abac563e18d9d573");
        salesDeliveryDetail3.setDeliveryNumber(new BigDecimal("100000"));
        salesDeliveryDetail3.setDeliveryFactoryId("cx5cdd42d8abac563e18d9d5c");
        salesDeliveryDetail3.setInventoryLocationId("cx5cdd42d8abac563e18d9d515");

        SalesDeliveryDetail salesDeliveryDetail4 = new SalesDeliveryDetail();
        salesDeliveryDetail4.setId("cx5cdd42d8abac563e18d9d5ac");
        salesDeliveryDetail4.setSalesDeliveryDetailCode("0004");
        salesDeliveryDetail4.setSalesDeliverId("cx5cdd42d8abac563e18d9d59d");
        salesDeliveryDetail4.setSaleOrderInfoId("cx5cdd42d8abac563e18d9d573");
        salesDeliveryDetail4.setDeliveryNumber(new BigDecimal("100000"));
        salesDeliveryDetail4.setDeliveryFactoryId("cx5cdd42d8abac563e18d9d5b");
        salesDeliveryDetail4.setInventoryLocationId("cx5cdd42d8abac563e18d9d515");

        SalesDeliveryDetail salesDeliveryDetail5 = new SalesDeliveryDetail();
        salesDeliveryDetail5.setId("cx5cdd42d8abac563e18d9d5ad");
        salesDeliveryDetail5.setSalesDeliveryDetailCode("0005");
        salesDeliveryDetail5.setSalesDeliverId("cx5cdd42d8abac563e18d9d59d");
        salesDeliveryDetail5.setSaleOrderInfoId("cx5cdd42d8abac563e18d9d573");
        salesDeliveryDetail5.setDeliveryNumber(new BigDecimal("100000"));
        salesDeliveryDetail5.setDeliveryFactoryId("cx5cdd42d8abac563e18d9d5b");
        salesDeliveryDetail5.setInventoryLocationId("cx5cdd42d8abac563e18d9d515");

        SalesDeliveryDetail salesDeliveryDetail6 = new SalesDeliveryDetail();
        salesDeliveryDetail6.setId("cx5cdd42d8abac563e18d9d5ae");
        salesDeliveryDetail6.setSalesDeliveryDetailCode("0006");
        salesDeliveryDetail6.setSalesDeliverId("cx5cdd42d8abac563e18d9d59d");
        salesDeliveryDetail6.setSaleOrderInfoId("cx5cdd42d8abac563e18d9d573");
        salesDeliveryDetail6.setDeliveryNumber(new BigDecimal("100000"));
        salesDeliveryDetail6.setDeliveryFactoryId("cx5cdd42d8abac563e18d9d5b");
        salesDeliveryDetail6.setInventoryLocationId("cx5cdd42d8abac563e18d9d515");


        MongoUtil.insert(salesDeliveryDetail);
        MongoUtil.insert(salesDeliveryDetail2);
        MongoUtil.insert(salesDeliveryDetail3);
        MongoUtil.insert(salesDeliveryDetail4);
        MongoUtil.insert(salesDeliveryDetail5);
        MongoUtil.insert(salesDeliveryDetail6);
    }

    /**
     * 其他出库列表新增数据
     */
    @Test
    public void otherOutboundInsert(){
        OtherOutbound otherOutbound = new OtherOutbound();
        otherOutbound.setOtherOutboundCode("OO10000001");
        otherOutbound.setDocumentType("其他出库");
        otherOutbound.setProductInfoId("cx5cdd42d8abac563e18d9d55d");
        otherOutbound.setOutboundNumber(new BigDecimal("5000"));
        otherOutbound.setFactoryInfoId("cx5cdd42d8abac563e18d9d5b");
        otherOutbound.setInventoryLocationId("cx5cdd42d8abac563e18d9d515");
        otherOutbound.setDocumentTime(DateUtil.stringToDate("2019-5-15","yyyy-MM-dd"));
        otherOutbound.setReceiptStatus(1);

        OtherOutbound otherOutbound2 = new OtherOutbound();
        otherOutbound2.setOtherOutboundCode("OO10000002");
        otherOutbound2.setDocumentType("其他出库");
        otherOutbound2.setProductInfoId("cx5cdd42d8abac563e18d9d55e");
        otherOutbound2.setOutboundNumber(new BigDecimal("5000"));
        otherOutbound2.setFactoryInfoId("cx5cdd42d8abac563e18d9d5b");
        otherOutbound2.setInventoryLocationId("cx5cdd42d8abac563e18d9d515");
        otherOutbound.setDocumentTime(DateUtil.stringToDate("2019-5-15","yyyy-MM-dd"));
        otherOutbound2.setReceiptStatus(1);

        OtherOutbound otherOutbound3 = new OtherOutbound();
        otherOutbound3.setOtherOutboundCode("OO10000003");
        otherOutbound3.setDocumentType("其他出库");
        otherOutbound3.setProductInfoId("cx5cdd42d8abac563e18d9d55f");
        otherOutbound3.setOutboundNumber(new BigDecimal("5000"));
        otherOutbound3.setFactoryInfoId("cx5cdd42d8abac563e18d9d5b");
        otherOutbound3.setInventoryLocationId("cx5cdd42d8abac563e18d9d515");
        otherOutbound.setDocumentTime(DateUtil.stringToDate("2019-5-15","yyyy-MM-dd"));
        otherOutbound3.setReceiptStatus(1);

        OtherOutbound otherOutbound4 = new OtherOutbound();
        otherOutbound4.setOtherOutboundCode("OO10000004");
        otherOutbound4.setDocumentType("其他出库");
        otherOutbound4.setProductInfoId("cx5cdd42d8abac563e18d9d560");
        otherOutbound4.setOutboundNumber(new BigDecimal("5000"));
        otherOutbound4.setFactoryInfoId("cx5cdd42d8abac563e18d9d5b");
        otherOutbound4.setInventoryLocationId("cx5cdd42d8abac563e18d9d515");
        otherOutbound.setDocumentTime(DateUtil.stringToDate("2019-5-15","yyyy-MM-dd"));
        otherOutbound4.setReceiptStatus(1);

        OtherOutbound otherOutbound5 = new OtherOutbound();
        otherOutbound5.setOtherOutboundCode("OO10000005");
        otherOutbound5.setDocumentType("其他出库");
        otherOutbound5.setProductInfoId("cx5cdd42d8abac563e18d9d561");
        otherOutbound5.setOutboundNumber(new BigDecimal("5000"));
        otherOutbound5.setFactoryInfoId("cx5cdd42d8abac563e18d9d5b");
        otherOutbound5.setInventoryLocationId("cx5cdd42d8abac563e18d9d515");
        otherOutbound.setDocumentTime(DateUtil.stringToDate("2019-5-15","yyyy-MM-dd"));
        otherOutbound5.setReceiptStatus(1);

        OtherOutbound otherOutbound6 = new OtherOutbound();
        otherOutbound6.setOtherOutboundCode("OO10000006");
        otherOutbound6.setDocumentType("其他出库");
        otherOutbound6.setProductInfoId("cx5cdd42d8abac563e18d9d562");
        otherOutbound6.setOutboundNumber(new BigDecimal("5000"));
        otherOutbound6.setFactoryInfoId("cx5cdd42d8abac563e18d9d5b");
        otherOutbound6.setInventoryLocationId("cx5cdd42d8abac563e18d9d515");
        otherOutbound.setDocumentTime(DateUtil.stringToDate("2019-5-15","yyyy-MM-dd"));
        otherOutbound6.setReceiptStatus(1);

        MongoUtil.insert(otherOutbound);
        MongoUtil.insert(otherOutbound2);
        MongoUtil.insert(otherOutbound3);
        MongoUtil.insert(otherOutbound4);
        MongoUtil.insert(otherOutbound5);
        MongoUtil.insert(otherOutbound6);
    }














}
