package com.csi.repo;

import com.csi.model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRepo  extends JpaRepository<OrderDetails,Integer> {

}
