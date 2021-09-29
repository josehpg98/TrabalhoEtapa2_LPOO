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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author joseh
 */
@Entity
@Table(name = "tb_local")
public class Local implements Serializable{
    ///Atributos da classe
    @Id
    @SequenceGenerator(name = "seq_local", sequenceName = "seq_local_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_local", strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(nullable = false, length = 100)
    private String nome;
    
    @Column(nullable = false, length = 100)
    private String latitute;
    
    @Column(nullable = false, length = 100)
    private String longitude;
    
    ///Construtor da Classe
    public Local(){
        
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
     * @return the latitute
     */
    public String getLatitute() {
        return latitute;
    }

    /**
     * @param latitute the latitute to set
     */
    public void setLatitute(String latitute) {
        this.latitute = latitute;
    }

    /**
     * @return the longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    
}
