package com.vinidev.btgpactual.repository;

import com.vinidev.btgpactual.entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {
}
