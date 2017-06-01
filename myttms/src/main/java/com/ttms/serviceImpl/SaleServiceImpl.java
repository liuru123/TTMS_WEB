package com.ttms.serviceImpl;

import com.ttms.dao.SaleDAO;
import com.ttms.entity.Sale;
import com.ttms.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hacker on 17-6-1.
 */
@Service("SaleServiceImpl")
public class SaleServiceImpl implements SaleService{

    @Autowired
    SaleDAO saleDAO;
    @Override
    public void insertSale(Sale sale) {
        saleDAO.insertSale(sale);
    }
}
