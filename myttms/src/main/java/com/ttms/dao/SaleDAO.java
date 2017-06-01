package com.ttms.dao;
import com.ttms.entity.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hacker on 17-6-1.
 */

@Repository("SaleDAO")

public interface SaleDAO {
    public void insertSale(Sale sale);
    public void deleteSale(int slae_id);
    public void updateSale(Sale sale);

    public Sale selectPlayBySale_id(int sale_id);
    public List<Sale> selectSaleByEmp_id(int emp_id);
    public List<Sale> selectSaleBySale_time(String sale_time);

    public List<Sale> selectSaleBySale_status(int sale_status);
    public List<Sale> selectSaleBySale_type(int sale_type);

    public List<Sale> selectSale();
}
