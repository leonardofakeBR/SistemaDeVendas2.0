/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controle;

import com.mycompany.modelo.Computador;
import com.mycompany.modelo.TV;
import com.mycompany.modelo.VideoGame;
import com.mycompany.outros.Constantes;
import com.mycompany.visao.VisaoComputador;
import com.mycompany.visao.VisaoTV;
import com.mycompany.visao.VisaoMenu;
import com.mycompany.visao.VisaoVideoGame;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 10156
 */
public class ControleSistema {
    public static ArrayList<Object> produtos = new ArrayList<>();

    public static void cadastar(){
        int opcaoProduto = VisaoMenu.menuEscolhaProduto();

        if(opcaoProduto == 1){
            produtos.add(VisaoVideoGame.menuCadastroVideoGame());
        }else if(opcaoProduto == 2){
            produtos.add(VisaoComputador.menuCadastroComputador());
        }else if(opcaoProduto == 3){
            produtos.add(VisaoTV.menuCadastroTV());
        }
    }

    public static void alterar(int indiceProduto){
        indiceProduto = indiceProduto - 1;

        Object object = produtos.get(indiceProduto);

        if(object instanceof VideoGame){
            VideoGame videoGame = new VideoGame();
            videoGame = (VideoGame) object;

            System.out.println("Alterando o produto: " + videoGame.toString());

            videoGame = (VideoGame) VisaoMenu.menuAlteracaoProdutoInformacoes(videoGame);
            ControleSistema.produtos.set(indiceProduto, videoGame);
        }else if(object instanceof Computador){
            Computador computador = new Computador();
            computador = (Computador) object;

            System.out.println("Alterando o produto: " + computador.toString());

            computador = (Computador) VisaoMenu.menuAlteracaoProdutoInformacoes(computador);
            ControleSistema.produtos.set(indiceProduto, computador);
        }else if(object instanceof TV){
            TV tv = new TV();
            tv = (TV) object;
            
            System.out.println("Alterando o produto: " + tv.toString());
            
            tv = (TV) VisaoMenu.menuAlteracaoProdutoInformacoes(tv);
            ControleSistema.produtos.set(indiceProduto, tv);
        }
    }

    public static void listar(ArrayList<Object> produtos){
        for(int i = 0; i < produtos.size(); i++){
            Object object = produtos.get(i);

            if(object instanceof VideoGame){
                VideoGame videoGame = (VideoGame) object;
                System.out.println(videoGame.toString());
            }else if(object instanceof Computador){
                Computador computador = (Computador) object;
                System.out.println(computador.toString());
            }else if(object instanceof TV){
                TV tv = (TV) object;
                System.out.println(tv.toString());
            }
        }
    }

    public static void remover(int indiceProduto){
        indiceProduto = indiceProduto - 1;

        Object object = produtos.get(indiceProduto);

        if(object instanceof VideoGame){
            VideoGame videoGame = new VideoGame();
            videoGame = (VideoGame) object;
            System.out.println("Deseja realmente remover o produto " + videoGame.getNome() + "? (S/N)");
        }if(object instanceof Computador){
            Computador computador = new Computador();
            computador = (Computador) object;
            System.out.println("Deseja realmente remover o produto " + computador.getNome() + "? (S/N)");
        }if(object instanceof TV){
            TV tv = new TV();
            tv = (TV) object;
            System.out.println("Deseja realmente remover o produto " + tv.getNome() + "? (S/N)");
        }

        String sn = new Scanner(System.in).next().toLowerCase();

        if(sn.equals(Constantes.REMOVER_SIM)){
            try{
                produtos.remove(indiceProduto);
                System.out.println("Produto removido com sucesso!");
            }catch(Exception e){
                System.out.println("Produto inexistente!");
            }
        }
        

    }
    public static void vender(int indiceProduto){
        indiceProduto = indiceProduto - 1;

        Object object = produtos.get(indiceProduto);

        if(object instanceof VideoGame){
            VideoGame videoGame = new VideoGame();
            videoGame = (VideoGame) object;
            System.out.println("Qual a quantidade do produto " + videoGame.getNome() + "?");
            int quantidade = new Scanner(System.in).nextInt();
        
            Double preco = videoGame.getPreco() * quantidade;
        
            System.out.println(quantidade + " Unidades de " + videoGame.getNome() + " é igual a R$" + preco);
        }if(object instanceof Computador){
            Computador computador = new Computador();
            computador = (Computador) object;
            System.out.println("Qual a quantidade do produto " + computador.getNome() + "?");
            int quantidade = new Scanner(System.in).nextInt();
        
            Double preco = computador.getPreco() * quantidade;
        
            System.out.println(quantidade + " Unidades de " + computador.getNome() + " é igual a R$" + preco);
            
        }if(object instanceof TV){
            TV tv = new TV();
            tv = (TV) object;
            System.out.println("Qual a quantidade do produto " + tv.getNome() + "?");
            int quantidade = new Scanner(System.in).nextInt();
        
            Double preco = tv.getPreco() * quantidade;
        
            System.out.println(quantidade + " Unidades de " + tv.getNome() + " é igual a R$" + preco);
        }
    }
}