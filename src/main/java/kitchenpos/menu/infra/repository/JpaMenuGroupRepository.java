package kitchenpos.menu.infra.repository;

import kitchenpos.menu.domain.entity.MenuGroup;
import kitchenpos.menu.domain.repository.MenuGroupRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaMenuGroupRepository extends MenuGroupRepository, JpaRepository<MenuGroup, UUID> {
}
