/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author leonardo.35903
 */
public class VideoGame extends Produto{
    String plataforma;

    public VideoGame() {
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return  "nome: " + super.getNome() +
                " | Preço: " + super.getPreco() +
                " | Plataforma: " + this.plataforma;
    }
    
    
}
