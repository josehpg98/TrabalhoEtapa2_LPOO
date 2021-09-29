/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.lpoo.cs.projetoetapa1.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

/**
 *
 * @author joseh
 */
@Entity
@Table(name = "tb_municao")
@DiscriminatorValue("municao")
public class Municao extends Artefato{
    ///extends: herda as caracteristicas da classe artefato
    ///Atributos da classe
    @Column(nullable = false, length = 100)
    private String descricao;
    
    @Column(nullable = false)
    private Integer qtdePente;
    
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Calibre calibre;
    
    ///Construtor da classe
    public Municao(){
        
    }
    ///métodos get e set

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the qtdePente
     */
    public Integer getQtdePente() {
        return qtdePente;
    }

    /**
     * @param qtdePente the qtdePente to set
     */
    public void setQtdePente(Integer qtdePente) {
        this.qtdePente = qtdePente;
    }

    /**
     * @return the calibre
     */
    public Calibre getCalibre() {
        return calibre;
    }

    /**
     * @param calibre the calibre to set
     */
    public void setCalibre(Calibre calibre) {
        this.calibre = calibre;
    }
    
}
