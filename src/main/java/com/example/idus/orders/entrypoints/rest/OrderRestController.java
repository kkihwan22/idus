package com.example.idus.orders.entrypoints.rest;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class OrderRestController {
    private final Logger log = LoggerFactory.getLogger(OrderRestController.class);

    @GetMapping("/members/{id}/orders")
    public void findMemberOrders(@PathVariable Long id) {

    }
}
