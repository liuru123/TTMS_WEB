package com.ttms.entity;

/**
 * Created by hacker on 17-6-1.
 */
public class Sale {
    private int  sale_ID       ;
    private int  emp_id        ;
    private String sale_time   ;
    private double sale_payment;
    private double sale_change ;
    private int   sale_type    ;
    private int   sale_status  ;

    public int getSale_ID() {
        return sale_ID;
    }

    public void setSale_ID(int sale_ID) {
        this.sale_ID = sale_ID;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getSale_time() {
        return sale_time;
    }

    public void setSale_time(String sale_time) {
        this.sale_time = sale_time;
    }

    public double getSale_payment() {
        return sale_payment;
    }

    public void setSale_payment(double sale_payment) {
        this.sale_payment = sale_payment;
    }

    public double getSale_change() {
        return sale_change;
    }

    public void setSale_change(double sale_change) {
        this.sale_change = sale_change;
    }

    public int getSale_type() {
        return sale_type;
    }

    public void setSale_type(int sale_type) {
        this.sale_type = sale_type;
    }

    public int getSale_status() {
        return sale_status;
    }

    public void setSale_status(int sale_status) {
        this.sale_status = sale_status;
    }
}
