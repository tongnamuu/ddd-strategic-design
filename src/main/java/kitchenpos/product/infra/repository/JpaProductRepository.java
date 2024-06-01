package kitchenpos.product.infra.repository;

import kitchenpos.product.domain.entity.Product;
import kitchenpos.product.domain.repository.ProductRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaProductRepository extends ProductRepository, JpaRepository<Product, UUID> {
}
