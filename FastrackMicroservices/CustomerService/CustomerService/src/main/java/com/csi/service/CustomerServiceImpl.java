package com.csi.service;

import com.csi.dao.CustomerDaoImpl;
import com.csi.model.Customer;
import com.csi.vivo.RestTempleteVivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl {

    @Autowired
    CustomerDaoImpl customerDaoImpl;

    public Customer saveData(Customer customer) {
        return  customerDaoImpl.saveData(customer);
    }

    public RestTempleteVivo getDataById(int custId) {

        return customerDaoImpl.getDataByid(custId);
    }
}
