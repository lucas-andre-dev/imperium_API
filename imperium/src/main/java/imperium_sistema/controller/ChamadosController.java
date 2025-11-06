package imperium_sistema.controller;

import imperium_sistema.model.entity.ChamadoEntity;
import imperium_sistema.service.ChamadosService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/chamados")
public class ChamadosController {
    // INJEÇÃO DE DEPENDENCIA VIA CONTRUTOR
    private ChamadosService chamadosService ;

    public ChamadosController(ChamadosService chamadosService){
        this.chamadosService = chamadosService ;
    }

    // CRUD

    //  LISTAR CHAMADOS QUE POSSUEM ID DO USUARIO - SELECT * FROM tb_chamados WHERE fk_user = id_user ;
    @GetMapping("/{id}")
    public List<ChamadoEntity>listarTudo(@PathVariable Long id){
        return chamadosService.listarPorIdUser(id) ;
    }

    //  LISTAR TUDO SEM MIMI, QUEREMOS TUDO!!
    @GetMapping
    public List<ChamadoEntity>listarTudo(){
        return chamadosService.listarTudo() ;
    }

    // CRIAR
    @PostMapping
    public void criar(@RequestBody ChamadoEntity chamado){
        chamado.setData(LocalDateTime.now());
        chamadosService.criar(chamado) ;
    }
    // ALTERAR
    @PutMapping("/{id}")
    public void alterar(@PathVariable Long id,@RequestBody ChamadoEntity chamadoEntity){
        chamadosService.alterarPorId(id,chamadoEntity) ;
    }
    // DELETAR
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
         chamadosService.deletar(id);
    }
}
