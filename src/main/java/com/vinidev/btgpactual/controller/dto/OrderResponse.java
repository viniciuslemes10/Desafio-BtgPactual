package com.vinidev.btgpactual.controller.dto;

import com.vinidev.btgpactual.entity.OrderEntity;
import com.vinidev.btgpactual.entity.OrderItem;

import java.math.BigDecimal;

public record OrderResponse(Long orderId,
                            Long customerId,
                            BigDecimal total) {

    public static OrderResponse fromEntity(OrderEntity order) {
        return new OrderResponse(order.getOrderId(), order.getCustomerId(), order.getTotal());
    }

}
