/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.lpoo.cs.projetoetapa1.model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author joseh
 */
@Embeddable///notação que difine como classe embarcada
public class RoundObjetivo_ID implements Serializable{
    ///classe representando chave primaria composta (round/objetivo)
    ///para a classe resultado
    
    ///atributos da classe
    @ManyToOne
    @JoinColumn(name = "round_id", nullable = false)
    private Round round;
    
    @ManyToOne
    @JoinColumn(name = "objetivo_id", nullable = false)
    private Objetivo  objetivo;
    ///construtor da classe
    public RoundObjetivo_ID(){
        
    }
    ///MÉTODOS GET E SET

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
    
}
