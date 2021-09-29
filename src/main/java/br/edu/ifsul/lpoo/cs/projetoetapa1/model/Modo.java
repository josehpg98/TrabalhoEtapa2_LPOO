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
public enum Modo {
    //enum para modo
    TERRORISTA, CONTRATERRORISTA;
    public static Modo getModo(String nameEnum) {
        if (nameEnum.equals(Modo.TERRORISTA.toString())){
            return Modo.TERRORISTA;
        } else if (nameEnum.equals(Modo.CONTRATERRORISTA.toString())){
            return Modo.CONTRATERRORISTA;
        }else{
            return null;
        }
    }
}
