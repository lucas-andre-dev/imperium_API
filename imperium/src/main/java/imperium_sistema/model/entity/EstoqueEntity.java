package imperium_sistema.model.entity;
import jakarta.persistence.*;

import java.math.BigDecimal;
@Table(name = "tb_estoque")
@Entity
public class EstoqueEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(name = "nome",nullable = false)
    private String nome ;
    @Column(name = "quantidade",nullable = false)
    private Integer quantidade ;
    @Column(name = "valor_unit",nullable = false)
    private BigDecimal valor ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }



}
