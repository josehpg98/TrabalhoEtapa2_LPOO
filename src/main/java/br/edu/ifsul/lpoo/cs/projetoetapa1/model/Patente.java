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
///anotação em JPA que indica que a classe se tornará perssistivel no banco de dados
@Table(name = "tb_patente")
///indica que os objetos da classe serão perssistidos em uma tabela
public class Patente implements Serializable{
    ///Atributos da Classe
    
     ///reprasenta chave primária da referida tabela
    @Id
    ///anotações para geração automática de sequência do id
    @SequenceGenerator(name = "seq_patente", sequenceName = "seq_patente_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_patente", strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(nullable = false, length = 100)
    ///representa uma coluna na tabela
    ///nullable = false: define que o campo é obrigatório
    ///length: tamanho de carateres suportados pelo campo
    private String nome;
    
    @Column(nullable = false, length = 50)
    private String cor;
    ///Contrutor Público da Classe 
    public Patente(){
        
    }
    ///Métodos de Get e Set

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
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
    
}
