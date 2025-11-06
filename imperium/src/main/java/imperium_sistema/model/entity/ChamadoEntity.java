package imperium_sistema.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Table(name = "tb_chamados")
@Entity
public class ChamadoEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(name = "setor", nullable = false)
private String setor ;
@Column(name = "assunto",nullable = false)
private String assunto ;
@Column(name = "status", nullable = false)
private String status ;
@Column(name = "descricao",nullable = false)
private String descricao ;
@Column(name = "data",nullable = false)
private LocalDateTime data ;
@ManyToOne
@JoinColumn(name = "fk_user",nullable = false)
private UserEntity userEntity;
// CONTRUTOR VAZIO PARA O HIBERNATE
    public ChamadoEntity(){

    }
// CONTRUTOR COMPLETO SEM ID, ID É AUTO INCREMENTADO
    public ChamadoEntity(String setor, String assunto, String status, String descricao,LocalDate data, UserEntity user) {
        this.setor = setor;
        this.assunto = assunto;
        this.status = status;
        this.data = LocalDateTime.now();
        this.userEntity = user;
    }
// GETTERS E SETTERS APÉNAS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public UserEntity getUser() {
        return userEntity;
    }

    public void setUser(UserEntity user) {
        this.userEntity = user;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
