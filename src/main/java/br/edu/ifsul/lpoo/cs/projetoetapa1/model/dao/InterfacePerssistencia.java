/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.lpoo.cs.projetoetapa1.model.dao;

/**
 *
 * @author joseh
 */
public interface InterfacePerssistencia {
    
    public Boolean conexaoAberta();///retorna verdadeiro ou falso caso a conexão com o banco de dados estiver aberta.
    
    public void fecharConexao();///fecha a conexão com o banco de dados.
    
    public Object find(Class c, Object id) throws Exception;
    ///método de busca de um registro
    ///throws: tratamento de exceção pelo método que o chamou
    
    public void persist(Object o) throws Exception;
    ///método genérico para inserção ou edição em qualquer tabela
    
    public void remover(Object o) throws Exception;
    ///método para remover 
}
