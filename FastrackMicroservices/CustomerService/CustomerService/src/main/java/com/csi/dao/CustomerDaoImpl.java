package com.csi.dao;

import com.csi.model.Customer;
import com.csi.repo.CustomerRepo;
import com.csi.vivo.OrderDetails;
import com.csi.vivo.Product;
import com.csi.vivo.RestTempleteVivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CustomerDaoImpl {

    @Autowired
    CustomerRepo customerRepoImpl;

    @Autowired
    RestTemplate restTemplate;

    public Customer saveData(Customer customer) {

        return  customerRepoImpl.save(customer);
    }

    public RestTempleteVivo getDataByid(int custId) {

        RestTempleteVivo restTempleteVivo=new RestTempleteVivo();

        Customer customer=customerRepoImpl.findByCustId(custId);

         Product product=restTemplate.getForObject("http://ProductService/product/"+customer.getProductId(),Product.class);

       OrderDetails orderDetails=restTemplate.getForObject("http://OrderDetailsService/orderdetails/"+customer.getOrderDetailsId(),OrderDetails.class);

        restTempleteVivo.setCustomer(customer);
        restTempleteVivo.setProduct(product);
        restTempleteVivo.setOrderDetails(orderDetails);

        return restTempleteVivo;


    }



}
