/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.lpoo.cs.projetoetapa1.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author joseh
 */
@Entity
@Table(name = "tb_artefato")
@Inheritance(strategy = InheritanceType.JOINED)//alterar a estratÃ©gia para JOINED
@DiscriminatorColumn(name = "tipoartefato")
public class Artefato implements Serializable {

    ///atributos da classe
    @Id
    @SequenceGenerator(name = "seq_artefato", sequenceName = "seq_artefato_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_artefato", strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(nullable = false, length = 100)
    private String nome;
    
    @Column(nullable = false, precision = 2)
    private Float valor;
    
 
    ///Construtor da classe

    public Artefato() {

    }
    ///métodos get e set

    /**
     * @return the id
     */
    public Integer getId() {
        if (id >= 0){///teste se o id for maior igual que zero.
            return id;
        }else{
            System.out.println("Erro no atributo id!");
             return null;
        }     
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
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

}
