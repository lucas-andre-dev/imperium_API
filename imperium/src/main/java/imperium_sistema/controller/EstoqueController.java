package imperium_sistema.controller;

import imperium_sistema.model.entity.EstoqueEntity;
import imperium_sistema.repository.EstoqueRepository;
import imperium_sistema.service.EstoqueService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("estoque")
public class EstoqueController {

    //injeção de dependencia
    private EstoqueService estoqueService ;

    public EstoqueController(EstoqueService estoqueService){
        this.estoqueService = estoqueService ;
    }
    // LISTAR
    @GetMapping
    public List<EstoqueEntity> listarTudo(){
        return estoqueService.listarTudo() ;
    }

    // ALTERAR
    @PutMapping
    public void alterarProd(EstoqueEntity estoqueEntity){
        estoqueService.alterarProd(estoqueEntity) ;
    }

    // CRIAR
    @PostMapping
    public void criarProd(EstoqueEntity estoqueEntity){
        estoqueService.adicionarProd(estoqueEntity);
    }

    // DELETAR
    @DeleteMapping("excluir/{id}")
    public void deletarProd(Long id){
        estoqueService.deletarProd(id);

    }
}
