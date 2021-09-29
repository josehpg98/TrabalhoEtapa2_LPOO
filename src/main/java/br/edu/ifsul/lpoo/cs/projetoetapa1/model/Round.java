/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.lpoo.cs.projetoetapa1.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author joseh
 */
@Entity
@Table(name = "tb_round")
public class Round implements Serializable{
    ///atributos da classe
    @Id
    @SequenceGenerator(name = "seq_round", sequenceName = "seq_round_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_round", strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar data_inicio;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar data_fim;
    
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "tb_Objetivos_round", joinColumns = {@JoinColumn(name = "round_id")}, 
                                       inverseJoinColumns = {@JoinColumn(name = "objetivo_id")})
    private List<Objetivo> objetivo;
    
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Modo modo;///ver modo jogo
    
    
    ///agregação por composição
    @ManyToOne
    @JoinColumn(name = "partida_id", nullable = false) 
    private Partida partida;
    ///Construtor da classe
    public Round(){
        
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
     * @return the data_inicio
     */
    public Calendar getData_inicio() {
        return data_inicio;
    }

    /**
     * @param data_inicio the data_inicio to set
     */
    public void setData_inicio(Calendar data_inicio) {
        this.data_inicio = data_inicio;
    }

    /**
     * @return the data_fim
     */
    public Calendar getData_fim() {
        return data_fim;
    }

    /**
     * @param data_fim the data_fim to set
     */
    public void setData_fim(Calendar data_fim) {
        this.data_fim = data_fim;
    }

    /**
     * @return the objetivo
     */
    public List<Objetivo> getObjetivo() {
        return objetivo;
    }

    /**
     * @param objetivo the objetivo to set
     */
    public void setObjetivo(List<Objetivo> objetivo) {
        this.objetivo = objetivo;
    }

    /**
     * @return the modo
     */
    public Modo getModo() {
        return modo;
    }

    /**
     * @param modo the modo to set
     */
    public void setModo(Modo modo) {
        this.modo = modo;
    }

    /**

    /**
     * @return the partida
     */
    public Partida getPartida() {
        return partida;
    }

    /**
     * @param partida the partida to set
     */
    public void setPartida(Partida partida) {
        this.partida = partida;
    }
    
}
