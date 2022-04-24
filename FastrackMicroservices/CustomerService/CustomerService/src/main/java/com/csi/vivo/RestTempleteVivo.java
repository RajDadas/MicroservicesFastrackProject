package com.csi.vivo;

import com.csi.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RestTempleteVivo {

    private Customer customer;

    private  OrderDetails orderDetails;

    private Product product;



}
