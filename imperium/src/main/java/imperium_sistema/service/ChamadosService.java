package imperium_sistema.service;

import imperium_sistema.model.entity.ChamadoEntity;
import imperium_sistema.repository.ChamadosRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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
        String status = "pendente" ;
        ChamadoEntity chamados = chamadosRepository.findById(id).get() ;
        chamados.setStatus(status);
        chamados.setAssunto(assunto);
        chamados.setSetor(setor);
        chamados.setData(LocalDateTime.now());
        chamados.setDescricao(descricao);
        return chamadosRepository.save(chamados) ;
    }
    public List<ChamadoEntity>listarPorIdUser(Long id){
        return chamadosRepository.findAllByUserEntityId(id) ;
    }
    // ALTERAR STATUS
    public ChamadoEntity alterarStatus(Long id){
        ChamadoEntity chamado = chamadosRepository.findById(id).get() ;
        chamado.setStatus("resolvido");
        return chamadosRepository.save(chamado) ;

    }
}
