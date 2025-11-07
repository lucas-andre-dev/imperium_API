package imperium_sistema.repository;

import imperium_sistema.model.entity.ChamadoEntity;
import imperium_sistema.model.entity.SugestoesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Repository
public interface ChamadosRepository extends JpaRepository<ChamadoEntity,Long> {
    List<ChamadoEntity> findAllByUserEntityId(Long userId);
}
