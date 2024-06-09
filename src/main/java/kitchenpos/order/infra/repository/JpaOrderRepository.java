package kitchenpos.order.infra.repository;

import kitchenpos.order.domain.entity.Order;
import kitchenpos.order.domain.repository.OrderRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaOrderRepository extends OrderRepository, JpaRepository<Order, UUID> {
}