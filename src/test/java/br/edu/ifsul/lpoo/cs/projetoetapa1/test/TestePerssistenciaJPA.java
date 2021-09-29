/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.lpoo.cs.projetoetapa1.test;

import br.edu.ifsul.lpoo.cs.projetoetapa1.model.dao.PerssistenciaJPA;
import org.junit.Test;

/**
 *
 * @author joseh
 */
public class TestePerssistenciaJPA {
    
    @Test
    public void testarconexao() throws Exception{
        PerssistenciaJPA perssistencia = new PerssistenciaJPA();
        ///cria um novo objeto
        if(perssistencia.conexaoAberta()){
            System.out.println("Conexão aberta com o banco de dados via JPA!");
            perssistencia.fecharConexao();
        }else{
            System.out.println("Não abriu conexão via JPA!");
        }
    }
    
}
