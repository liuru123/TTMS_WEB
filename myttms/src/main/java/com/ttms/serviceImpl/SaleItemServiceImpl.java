package com.ttms.serviceImpl;

import com.ttms.dao.SaleitemDAO;
import com.ttms.entity.Sale_item;
import com.ttms.service.SaleItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hacker on 17-6-1.
 */
@Service("saleItemServiceImpl")
public class SaleItemServiceImpl  implements SaleItemService{

    @Autowired
    SaleitemDAO saleitemDAO;
    @Override
    public void insertSaleItem(Sale_item sale_item) {
    saleitemDAO.insertSaleitem(sale_item);
    }
}
