package com.fmgcompany.mike.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;

@Getter
public class RelatorioOcorrencia {
    
    @Id
    @Generated(strategy = )
    @Column
    private String id;

    //pegar direto do id
    @Column
    private Policial responsavelBo;
    
    @Column
    private Date horarioRelatorioConcluido;

    @Column
    private Date horarioRelatorioConcluidoAtualizado;
    
    @Column
    private String justificativaBoNaoRealizado;
    
    @Column
    private String tipoOcorrencia;
    
    @Column
    private String descricao;
    
    @Column
    private String endereco;
    
    @OneToOne
    private Vitima vitima;
    
    @OneToOne
    private Suspeito suspeito;

    public RelatorioOcorrencia() {

    }

    public void fazerBo() {
        
    }
}
