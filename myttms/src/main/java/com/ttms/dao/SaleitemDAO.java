package com.ttms.dao;

import com.ttms.entity.Sale_item;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hacker on 17-6-1.
 */

@Repository("SaleitemDAO")
public interface SaleitemDAO {
    public void insertSaleitem(Sale_item sale_item);
    public void deleteSaleitem(int Sale_item_id);
    public void updateSaleitem(Sale_item sale_item);

    public Sale_item selectSale_itemBySale_item_id(int Sale_item_id);
    public List<Sale_item> selectSale_itemByTicket_id(int ticket_id);
    public List<Sale_item> selectSale_itemBySale_ID(int Sale_id);
    public List<Sale_item> selectSale_item();

}


