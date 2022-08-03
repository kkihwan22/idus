package com.example.idus.orders.domain;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter @ToString
public class Order {
    private Long id;
    private String productName;
    private Long memberId;
    private LocalDateTime orderedAt;
}
