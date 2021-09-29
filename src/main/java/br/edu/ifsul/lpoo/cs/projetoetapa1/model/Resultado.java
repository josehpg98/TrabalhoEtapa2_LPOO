/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.lpoo.cs.projetoetapa1.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author joseh
 */
@Entity
@Table(name = "tb_resultado")
public class Resultado implements Serializable{
    ///atributos de classe
    @EmbeddedId
    ///anotação para id composto
    private RoundObjetivo_ID id;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data;
    
    @ManyToOne
    @JoinColumn(name = "round_id", nullable = false)
    private Round round;
    
    @ManyToOne
    @JoinColumn(name = "objetivo_id", nullable = false)
    private Objetivo objetivo;
    
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;
    ///construtor da classe
    public Resultado(){
        
    }
    ///métodos get e set

   
    /**
     * @return the data
     */
    public Calendar getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Calendar data) {
        this.data = data;
    }

    /**
     * @return the round
     */
    public Round getRound() {
        return round;
    }

    /**
     * @param round the round to set
     */
    public void setRound(Round round) {
        this.round = round;
    }

    /**
     * @return the objetivo
     */
    public Objetivo getObjetivo() {
        return objetivo;
    }

    /**
     * @param objetivo the objetivo to set
     */
    public void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo;
    }

    /**
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * @return the id
     */
    public RoundObjetivo_ID getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(RoundObjetivo_ID id) {
        this.id = id;
    }
    
}
