/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao;

import com.mycompany.modelo.TV;
import java.util.Scanner;

/**
 *
 * @author leonardo.35903
 */
public class VisaoTV {
    public static TV menuCadastroTV(){
        TV tv = new TV();
        
        System.out.println("Nome: ");
        tv.setNome(new Scanner(System.in).nextLine());
        System.out.println("Preço: ");
        tv.setPreco(new Scanner(System.in).nextDouble());
        System.out.println("Polegadas: ");
        tv.setPolegadas(new Scanner(System.in).nextDouble());
        System.out.println("Tela: ");
        tv.setTela(new Scanner(System.in).nextLine());
        System.out.println("=========================================================================================================");
       
        return tv;
    }
}