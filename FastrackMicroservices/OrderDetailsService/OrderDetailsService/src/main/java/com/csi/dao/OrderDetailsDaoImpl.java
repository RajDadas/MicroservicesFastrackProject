package com.csi.dao;

import com.csi.model.OrderDetails;
import com.csi.repo.OrderDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class OrderDetailsDaoImpl {

   @Autowired
    OrderDetailsRepo orderDetailsRepoImpl;
    public OrderDetails saveData(OrderDetails orderDetails) {

        return orderDetailsRepoImpl.save(orderDetails);
    }

    public Optional<OrderDetails> getDataById(int orderDetailsId) {

      return   orderDetailsRepoImpl.findById(orderDetailsId);
    }
}
