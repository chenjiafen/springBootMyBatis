package com.chenjiafeng.entity;

import javax.persistence.*;

/**
 * @ClassName Customer
 * @Description: TODO
 * @Author chenjiafeng
 * @Date 2020/3/17
 * @Version V1.0
 **/

@Entity
@Table(name = "cst_customer")
public class Customer {

//    cust_id、cust_name、cust_source、cust_industry、cust_level、cust_address、cust_phone

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cust_id")
    private long custId;

    @Column(name ="cust_name")
    private String custName;
    @Column(name = "cust_source")
    private String custSource;
    @Column(name="cust_industry")
    private String custIndustry;
    @Column(name = "cust_level")
    private String custlevel;
    @Column(name="cust_address")
    private String custAddress;
    @Column(name = "cust_phone")
    private String custPhone;

    public long getCustId() {
        return custId;
    }

    public void setCustId(long custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    public String getCustlevel() {
        return custlevel;
    }

    public void setCustlevel(String custlevel) {
        this.custlevel = custlevel;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }
}

