/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.lpoo.cs.projetoetapa1.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author joseh
 */
@Entity
@Table(name = "tb_itenscompra")
public class ItensCompra implements Serializable{
    ///atributos da classe
    @Id
    @SequenceGenerator(name = "seq_itenscompra", sequenceName = "seq_itenscompra_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_itenscompra", strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(nullable = false)
    private Integer quantidade;
    
    @Column(nullable = false, precision = 2)
    private Float valor;
    
    @ManyToOne
    @JoinColumn(name = "artefato_id", nullable = false)
    private Artefato artefato;
    
    ///agregação por composição
    @ManyToOne
    @JoinColumn(name = "compra", nullable = false) 
    ///referência para entidade forte, no caso compra.
    private Compra compra;
    ///construtor da classe
    public ItensCompra(){
        
    }
    ///Métodos get e set

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
     * @return the quantidade
     */
    public Integer getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the valor
     */
    public Float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Float valor) {
        this.valor = valor;
    }

    /**
     * @return the artefato
     */
    public Artefato getArtefato() {
        return artefato;
    }

    /**
     * @param artefato the artefato to set
     */
    public void setArtefato(Artefato artefato) {
        this.artefato = artefato;
    }

    /**
     * @return the compra
     */
    public Compra getCompra() {
        return compra;
    }

    /**
     * @param compra the compra to set
     */
    public void setCompra(Compra compra) {
        this.compra = compra;
    }
    
}
