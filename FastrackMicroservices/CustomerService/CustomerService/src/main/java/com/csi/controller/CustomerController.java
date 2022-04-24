package com.csi.controller;

import com.csi.model.Customer;
import com.csi.service.CustomerServiceImpl;
import com.csi.vivo.RestTempleteVivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerServiceImpl;

    @PostMapping("/")
    public Customer saveData(@RequestBody Customer customer){
        return customerServiceImpl.saveData(customer);

    }

    @GetMapping("/{custId}")

    public RestTempleteVivo getDataById(@PathVariable int custId){

       return customerServiceImpl.getDataById(custId);
    }
}
