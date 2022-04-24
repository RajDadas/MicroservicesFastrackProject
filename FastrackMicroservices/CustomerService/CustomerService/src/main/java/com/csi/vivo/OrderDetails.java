package com.csi.vivo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails {

    private int orderDetailsId;

    private String orderDetailsCode;

    private double orderDetailsPrice;

}
