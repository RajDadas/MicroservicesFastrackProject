package com.csi.service;

import com.csi.dao.OrderDetailsDaoImpl;
import com.csi.model.OrderDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderDetailsServiceImpl {

    @Autowired
    OrderDetailsDaoImpl orderDetailsDaoImpl;

    public OrderDetails saveData(OrderDetails orderDetails) {

        return orderDetailsDaoImpl.saveData(orderDetails);
    }

    public Optional<OrderDetails> getDataById(int orderDetailsId) {
        return orderDetailsDaoImpl.getDataById(orderDetailsId);
    }
}
