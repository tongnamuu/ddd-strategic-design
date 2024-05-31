package kitchenpos.infra.repository;

import kitchenpos.order.domain.entity.OrderTable;
import kitchenpos.order.domain.repository.OrderTableRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaOrderTableRepository extends OrderTableRepository, JpaRepository<OrderTable, UUID> {
}
