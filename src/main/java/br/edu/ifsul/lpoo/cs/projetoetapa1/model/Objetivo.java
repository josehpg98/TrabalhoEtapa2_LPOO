/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.lpoo.cs.projetoetapa1.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author joseh
 */
@Entity
@Table(name = "tb_objetivo")
public class Objetivo implements Serializable{
    ///atributos da classe
    @Id
    @SequenceGenerator(name = "seq_objetivo", sequenceName = "seq_objetivo_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_objetivo", strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(nullable = false, length = 100)
    private String descricao;
    
    @Column(nullable = false)
    private Integer pontos;
    
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "tb_objetivoslocais", joinColumns = {@JoinColumn(name = "objetivo_id")}, 
                                       inverseJoinColumns = {@JoinColumn(name = "local_id")})
    private List<Local> locais;
    
    ///construtor da classe
    public Objetivo(){
        
    }
    ///métodos get e set

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

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
     * @return the pontos
     */
    public Integer getPontos() {
        return pontos;
    }

    /**
     * @param pontos the pontos to set
     */
    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    /**
     * @return the locais
     */
    public List<Local> getLocais() {
        return locais;
    }

    /**
     * @param locais the locais to set
     */
    public void setLocais(List<Local> locais) {
        this.locais = locais;
    }
    
}
