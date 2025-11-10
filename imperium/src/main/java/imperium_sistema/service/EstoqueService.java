package imperium_sistema.service;

import imperium_sistema.model.entity.EstoqueEntity;
import imperium_sistema.repository.EstoqueRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstoqueService {

    //INJEÇÃO DE DEPENDENCIA
    private EstoqueRepository estoqueRepository ;

    public EstoqueService(EstoqueRepository estoqueRepository){
        this.estoqueRepository = estoqueRepository ;

    }
    //CRUD
// LISTAR - READER
    public List<EstoqueEntity>listarTudo(){

        return estoqueRepository.findAll() ;
    }
    // CRIAR - CREATE
    public void adicionarProd(EstoqueEntity estoqueEntity){
        estoqueRepository.save(estoqueEntity) ;
    }
    //ALTERAR - UPDATE
    public void alterarProd(EstoqueEntity estoqueEntity){
        estoqueRepository.save(estoqueEntity) ;
    }

    //DELETE
    public void deletarProd(Long id){
        EstoqueEntity produto = estoqueRepository.findById(id).get() ;
        estoqueRepository.delete(produto);
    }

}
