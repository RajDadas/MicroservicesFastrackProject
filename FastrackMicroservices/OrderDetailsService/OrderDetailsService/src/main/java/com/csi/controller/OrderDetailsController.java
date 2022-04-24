package com.csi.controller;


import com.csi.model.OrderDetails;
import com.csi.service.OrderDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/orderdetails")
public class OrderDetailsController {

    @Autowired
    OrderDetailsServiceImpl orderDetailsServiceImpl;

    @PostMapping("/")
    public OrderDetails saveData(@RequestBody OrderDetails orderDetails){

       return  orderDetailsServiceImpl.saveData(orderDetails);
    }


    @GetMapping("/{orderDetailsId}")
    public Optional<OrderDetails> getDataById(@PathVariable int orderDetailsId){

     return    orderDetailsServiceImpl.getDataById(orderDetailsId);

    }


}
