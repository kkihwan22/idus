package com.example.idus.orders.service;

import com.example.idus.orders.service.dto.OrderResult;

import java.util.List;

public interface OrderService {

    List<OrderResult> findMemberOrders(Long memberId);
}
