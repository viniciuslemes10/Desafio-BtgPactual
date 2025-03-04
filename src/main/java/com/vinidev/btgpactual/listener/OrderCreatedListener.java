package com.vinidev.btgpactual.listener;

import com.vinidev.btgpactual.config.RabbitMQConfig;
import com.vinidev.btgpactual.listener.dto.OrderCreatedEvent;
import com.vinidev.btgpactual.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class OrderCreatedListener {

    private final Logger logger = LoggerFactory.getLogger(OrderCreatedListener.class);

    private final OrderService orderService;

    public OrderCreatedListener(OrderService orderService) {
        this.orderService = orderService;
    }

    @RabbitListener(queues = RabbitMQConfig.ORDER_CREATE_QUEUE)
    public void listener(Message<OrderCreatedEvent> message) {
        logger.info("Starting queue consumption in RabbitMQ!");
        logger.info("Message consumed: {}", message);

        orderService.save(message.getPayload());
    }
}
