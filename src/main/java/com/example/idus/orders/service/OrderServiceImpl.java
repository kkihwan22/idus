package com.example.idus.orders.service;

import com.example.idus.orders.service.dto.OrderResult;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {
    private final Logger log = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Override
    public List<OrderResult> findMemberOrders(Long memberId) {
        return Collections.emptyList();
    }
}