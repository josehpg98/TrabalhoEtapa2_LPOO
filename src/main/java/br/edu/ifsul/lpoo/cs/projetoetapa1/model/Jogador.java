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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author joseh
 */
@Entity
@Table(name = "tb_jogador")
public class Jogador implements Serializable {
    ///Atributos da Classe
    @Id
    @Column(nullable = false,length = 100)
    private String nickname;
    
    @Column(nullable = false, length = 100)
    private String senha;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar data_cadastro;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data_ultimo_login;
    
    @Column(nullable = false)
    private Integer pontos;
    
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "tb_artefatos", joinColumns = {@JoinColumn(name = "jogador_nickname")}, 
                                       inverseJoinColumns = {@JoinColumn(name = "artefato_id")})
    private List<Artefato> artefatos;
    
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "tb_patentes", joinColumns = {@JoinColumn(name = "jogador_nikname")}, 
                                       inverseJoinColumns = {@JoinColumn(name = "patente_id")})
    private List<Patente> patente;
    
    @OneToMany(mappedBy = "compra")
    private List<Compra> compra;
    ///Construtor da Classe
    public Jogador(){
        
    }
    ///métodos get e set

    /**
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname the nickname to set
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the data_cadastro
     */
    public Calendar getData_cadastro() {
        return data_cadastro;
    }

    /**
     * @param data_cadastro the data_cadastro to set
     */
    public void setData_cadastro(Calendar data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    /**
     * @return the data_ultimo_login
     */
    public Calendar getData_ultimo_login() {
        return data_ultimo_login;
    }

    /**
     * @param data_ultimo_login the data_ultimo_login to set
     */
    public void setData_ultimo_login(Calendar data_ultimo_login) {
        this.data_ultimo_login = data_ultimo_login;
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
     * @return the artefatos
     */
    public List<Artefato> getArtefatos() {
        return artefatos;
    }

    /**
     * @param artefatos the artefatos to set
     */
    public void setArtefatos(List<Artefato> artefatos) {
        this.artefatos = artefatos;
    }

    /**
     * @return the patente
     */
    public List<Patente> getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(List<Patente> patente) {
        this.patente = patente;
    }

    /**
     * @return the compras
     */
    public List<Compra> getCompras() {
        return compra;
    }

    /**
     * @param compras the compras to set
     */
    public void setCompras(List<Compra> compras) {
        this.compra = compras;
    }
    
}
