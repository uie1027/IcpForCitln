package icp.icpForCitln.stock.service;

import icp.icpForCitln.common.enetity.MongoResult;
import icp.icpForCitln.stock.dto.*;
import icp.icpForCitln.stock.view.OtherOutboundView;
import icp.icpForCitln.stock.view.ProductionReceiptInfoView;
import icp.icpForCitln.stock.view.PurchaseReceiptUpdateView;

import java.util.List;

public interface StockService {
    MongoResult productionReceiptListFind(Integer pageIndex, Integer pageSize, ProductionReceiptFindDTO productionReceiptFindDTO);
    void productionReceiptSave(ProductionReceiptInfoDTO productionReceiptInfoDTO);
    boolean purchaseReceiptSave(PurchaseReceiptSaveDTO purchaseReceiptSaveDTO);
    MongoResult purchaseReceiptListFind(Integer pageIndex, Integer pageSize, PurchaseReceiptFindDTO purchaseReceiptFindDTO);
    MongoResult OtherOutboundListFind(Integer pageIndex, Integer pageSize,OtherOutboundFindDTO otherOutboundFindDTO);
    boolean salesDeliverySave(SalesDeliverySaveDTO salesDeliverySaveDTO);
    MongoResult salesDeliveryListFind(Integer pageIndex, Integer pageSize, SalesDeliveryFindDTO salesDeliveryFindDTO);
    MongoResult salesOutboundListFind(Integer pageIndex,Integer pageSize,SalesOutboundFindDTO salesOutboundFindDTO);
    PurchaseReceiptUpdateView purchaseReceiptInfo(PurchaseReceiptFindDTO purchaseReceiptFindDTO);
    void purchaseReceiptUpdate(PurchaseReceiptUpdateDTO purchaseReceiptUpdateDTO, List<PurchaseReceiptDetailUpdateDTO> purchaseReceiptDetailUpdateDTOList);
    OtherOutboundView otherOutboundInfo(OtherOutboundFindDTO otherOutboundFindDTO);
    void otherOutboundUpdate(OtherOutboundUpdateDTO otherOutboundUpdateDTO);
    ProductionReceiptInfoView productionReceiptInfo(ProductionReceiptUpdateDTO productionReceiptUpdateDTO);
    void productionReceiptUpdate(ProductionReceiptUpdateDTO productionReceiptUpdateDTO);
}
