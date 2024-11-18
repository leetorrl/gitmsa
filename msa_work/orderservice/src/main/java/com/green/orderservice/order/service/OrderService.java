package com.green.orderservice.order.service;

import com.green.orderservice.order.vo.OrderRespones;
import com.green.orderservice.order.vo.OrderRequest;


public interface OrderService {


    OrderResponse join(OrderRequest orderRequest);


    OrderRespones login(String email, String password);

}
