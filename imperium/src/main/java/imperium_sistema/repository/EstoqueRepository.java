package imperium_sistema.repository;

import imperium_sistema.model.entity.EstoqueEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository extends JpaRepository<EstoqueEntity,Long> {
}
