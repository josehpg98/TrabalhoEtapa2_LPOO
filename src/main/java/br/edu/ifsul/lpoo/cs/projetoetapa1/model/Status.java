/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.lpoo.cs.projetoetapa1.model;

/**
 *
 * @author joseh
 */
public enum Status {
    ///enum status para resultado
    SIM, NAO;
    public static Status getStatus(String nameEnum) {
        if (nameEnum.equals(Status.SIM.toString())){
            return Status.SIM;
        } else if (nameEnum.equals(Status.NAO.toString())){
            return Status.NAO;
        }else{
            return null;
        }
    }
}
