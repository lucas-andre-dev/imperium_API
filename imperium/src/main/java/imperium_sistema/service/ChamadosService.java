package imperium_sistema.service;

import imperium_sistema.model.entity.ChamadoEntity;
import imperium_sistema.repository.ChamadosRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ChamadosService {
    // INJEÇÃO DE DEPENDENCIA VIA CONSTRUTOR
    private ChamadosRepository chamadosRepository ;


    public ChamadosService(ChamadosRepository chamadosRepository){
        this.chamadosRepository = chamadosRepository ;
    }

    // CRUD
    // LISTAR
    public List<ChamadoEntity>listarTudo(){
        return chamadosRepository.findAll() ;

    }
    // CRIAR
    public void criar(ChamadoEntity chamadoEntity){
        chamadosRepository.save(chamadoEntity) ;
    }

    //ALTERAR
    public void alterar(ChamadoEntity chamadoEntity){
        chamadosRepository.save(chamadoEntity) ;
    }

    //DELETAR
    public void deletar(Long id){
        chamadosRepository.deleteById(id) ;
    }
    // ENCONTRAR PELO ID E ALTERAR
    public ChamadoEntity alterarPorId(Long id,ChamadoEntity chamadoEntity){
        String assunto = chamadoEntity.getAssunto() ;
        String setor = chamadoEntity.getSetor() ;
        String descricao = chamadoEntity.getDescricao() ;
        ChamadoEntity chamados = chamadosRepository.findById(id).get() ;
        chamados.setAssunto(assunto);
        chamados.setSetor(setor);
        chamados.setData(LocalDateTime.now());
        chamados.setDescricao(descricao);
        return chamadosRepository.save(chamados) ;
    }
    public List<ChamadoEntity>listarPorIdUser(Long id){
        return chamadosRepository.findAllByUserEntityId(id) ;
    }

}
