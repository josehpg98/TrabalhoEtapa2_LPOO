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
public enum Calibre {
    //enumeration para calibre
    CALIBRE_03, CALIBRE_05, CALIBRE_08;

    public static Calibre getCalibre(String nameEnum) {
        if (nameEnum.equals(Calibre.CALIBRE_03.toString())){
            return Calibre.CALIBRE_03;
        } else if (nameEnum.equals(Calibre.CALIBRE_05.toString())){
            return Calibre.CALIBRE_05;
        }else if (nameEnum.equals(Calibre.CALIBRE_08.toString())){
            return Calibre.CALIBRE_08;
        }else{
            return null;
        }
    }
}