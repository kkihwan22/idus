package com.example.idus.orders.service.dto;

import com.example.idus.orders.domain.Order;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter @ToString
public class OrderResult {
    private Long id;
    private String productName;
    private Long memberId;
    private LocalDateTime orderedAt;

    public OrderResult(Order order) {
        this.id = order.getId();
        this.productName = order.getProductName();
        this.memberId = order.getMemberId();
        this.orderedAt = order.getOrderedAt();
    }
}
