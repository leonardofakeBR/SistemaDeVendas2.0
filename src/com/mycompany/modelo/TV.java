/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author leonardo.35903
 */
public class TV extends Produto{
    private Double polegadas;
    private String tela;

    public TV() {
    }

    public Double getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(Double polegadas) {
        this.polegadas = polegadas;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() + 
                " | Preço: " + super.getPreco() +
                "| Polegadas: " + this.polegadas + 
                "| Tela: " + this.tela;
    }
    
    
}
