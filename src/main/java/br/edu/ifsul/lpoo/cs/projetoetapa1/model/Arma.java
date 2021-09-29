/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.lpoo.cs.projetoetapa1.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author joseh
 */
@Entity
@Table(name = "tb_arma")
@DiscriminatorValue("arma")
public class Arma extends Artefato{
     ///extends: herda as caracteristicas da classe artefato
    //atributos da classe
    
    @Column(nullable = false, length = 100)
    private String Descricao;
    
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "tb_municoes", joinColumns = {@JoinColumn(name = "arma_id")}, 
                                       inverseJoinColumns = {@JoinColumn(name = "municao_id")})
    private List<Municao> municoes;///agregação
    
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Tipo tipo;

    ///Construtor da Classe
    public Arma() {

    }
    ///métodos get e set

    /**
     * @return the Descricao
     */
    public String getDescricao() {
        return Descricao;
    }

    /**
     * @param Descricao the Descricao to set
     */
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    /**
     * @return the municoes
     */
    public List<Municao> getMunicoes() {
        ///passa uma lista de municoes.
        return municoes;
    }

    /**
     * @param municoes the municoes to set
     */
    public void setMunicoes(List<Municao> municao) {
        ///inicializa a lista caso esteja nula.
        if (this.municoes == null) {
            this.municoes = new ArrayList();
        } else {
            this.municoes.add((Municao)municao);
        }
    }
   

    /**
     * @return the tipo
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

}
