package com.fmgcompany.mike.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;

@Getter
public class RelatorioOcorrencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_relatorio_ocorrencia")
    private String idRelatorioOcorrencia;

    //pegar direto do id
    @Column(name = "responsavel_bo")
    private Policial responsavelBo;
    
    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;
    
    @Column(name = "justificativa_bo_nao_realizado")
    private String justificativaBoNaoRealizado;
    
    @Column(name = "tipo_ocorrencia")
    private String tipoOcorrencia;
    
    private String descricao;
    private String endereco;
    
    @OneToOne
    private Ocorrencia ocorrencia;

    @OneToOne
    private Vitima vitima;
    
    @OneToOne
    private Suspeito suspeito;

    public RelatorioOcorrencia() {
        
    }

    public void fazerBo() {
        
    }
}
