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
import icp.icpForCitln.customer.entity.CustomerInfo;
import icp.icpForCitln.order.entity.PurchaseOrderInfo;
import icp.icpForCitln.order.entity.SaleOrderInfo;
import icp.icpForCitln.platform.entity.PlantformDirectoryAttribute;
import icp.icpForCitln.platform.entity.PlantformDirectoryAttributeValue;
import icp.icpForCitln.platform.entity.PlantformDirectoryInfo;
import icp.icpForCitln.platform.entity.PlantformMailDisplay;
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
     * 采购入库单增加数据
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







}
