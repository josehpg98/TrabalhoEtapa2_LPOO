/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.lpoo.cs.projetoetapa1.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author joseh
 */
public class PerssistenciaJPA implements InterfacePerssistencia{
    ///classe responsável pela conexão ao BD via JPA
    
    public  EntityManagerFactory factory;
    ///factory: fabrica de gerênciadores de entidades
    
    public EntityManager entity;
    
    ///Construtor da Classe
    public PerssistenciaJPA(){
        factory = Persistence.createEntityManagerFactory("pu_CounterStrike");
        entity = factory.createEntityManager();
    }

    @Override
    public Boolean conexaoAberta() {
       return entity.isOpen();///se a conexão estiver aberta retorna verdadeiro.
    }

    @Override
    public void fecharConexao() {
       entity.close();///fecha a conexão com o BD.
    }

    @Override
    public Object find(Class c, Object id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void persist(Object o) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Object o) throws Exception {
        throw new UnsupportedOperationException("Not supported yet./não suportado ainda"); //To change body of generated methods, choose Tools | Templates.
    }
            
}
